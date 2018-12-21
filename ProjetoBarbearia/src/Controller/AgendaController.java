/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AgendamentoDao;
import Helper.AgendamentoHelper;
import Model.Agendamento;
import Utilitarios.Util;
import View.Agenda;
import View.Login;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brunocesar
 */
public class AgendaController {

    private final Agenda view;
    private AgendamentoHelper helper;
    private AgendamentoDao agendamentoDao;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendamentoHelper(view);
        this.agendamentoDao = new AgendamentoDao();
    }

    public void salvarNovaAgenda() {
        Agendamento agendamento = helper.getModelo();
        String mensagem;
        int flag = 0;

//        if(agendamentoDao.numberOfUsername(barbeiro.getNomeUsuario()) == 0){
//            agendamentoDao.insert(barbeiro);
//            mensagem = "Barbeiro cadastrado com sucesso!\nClique em VOLTAR para entrar no sistema.";
//            flag++;
//        }else{
//            mensagem = "Já existe barbeiro com esse nome de usuário, tente outro nome de usuário.";
//        }
        agendamentoDao.insert(agendamento);
        JOptionPane.showMessageDialog(null, "Agenda cadastrada com sucesso.");
        //if(flag > 0){
        helper.clearTela();
        //}
    }

    public void atualizarTabelaDeAgendamentos() {

        ArrayList<Agendamento> agendamentos;
        agendamentos = agendamentoDao.findAllByIdBarbeiro(Login.barbeiroSecao.getId());
        DefaultTableModel dtm = (DefaultTableModel) view.getTabelaAgendamentosjTable().getModel();
        dtm.setNumRows(0);

        //ForEach + lambda java 8
        agendamentos.forEach(agendamento -> {

            dtm.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getNomeCliente(),
                agendamento.getServico().getDescricao(),
                "R$" + Util.formatarFloat(agendamento.getValor()),
                Util.dfDate.format(agendamento.getData()),
                Util.dfTime.format(agendamento.getData()),
                agendamento.getObservacao()
            });

        });
    }

    public void setFields(long idAgendamento) {
        Agendamento agendamento = agendamentoDao.findById(idAgendamento);
        helper.setModelo(agendamento);
    }

}
