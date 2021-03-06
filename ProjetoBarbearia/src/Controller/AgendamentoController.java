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
public class AgendamentoController {

    private final Agenda view;
    private AgendamentoHelper helper;
    private final AgendamentoDao agendamentoDao;

    public AgendamentoController(Agenda view) {
        this.view = view;
        this.helper = new AgendamentoHelper(view);
        this.agendamentoDao = new AgendamentoDao();
    }

    public void salvarOuAtualizarAgendamento() {

        Agendamento agendamento = helper.getModelo();
        String mensagem;

        if (agendamento.getId() == null) {
            agendamentoDao.insert(agendamento);
            mensagem = "Agendamento cadastrado com sucesso.";
        } else {
            agendamentoDao.update(agendamento);
            mensagem = "Agendamento atualizado com sucesso.";
        }

        JOptionPane.showMessageDialog(null, mensagem);
        helper.clearTela();
    }

    public void atualizarTabelaDeAgendamentos() {

        ArrayList<Agendamento> agendamentos;
        String manipuladorValor;
        //agendamentoDao.inativarAgendamentosAutomatico(); // Excluindo agendamentos de forma automática, no intervalo de 7 dias
        agendamentos = agendamentoDao.findAllByIdBarbeiro(Login.barbeiroSecao.getId(),0);
        DefaultTableModel dtm = (DefaultTableModel) view.getTabelaAgendamentosjTable().getModel();
        dtm.setNumRows(0);

        //ForEach + lambda java 8
        for (Agendamento agendamento : agendamentos) {

            //Tratando valor do agendamento para exibição
            if (agendamento.getValor() < 1) {
                manipuladorValor = "R$000" + Util.formatarFloatDuasCasasDecimais(agendamento.getValor());
            } else if (agendamento.getValor() < 10) {
                manipuladorValor = "R$00" + Util.formatarFloatDuasCasasDecimais(agendamento.getValor());
            } else if (agendamento.getValor() < 100) {
                manipuladorValor = "R$0" + Util.formatarFloatDuasCasasDecimais(agendamento.getValor());
            } else {
                manipuladorValor = "R$" + Util.formatarFloatDuasCasasDecimais(agendamento.getValor());
            }

            dtm.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getNomeCliente(),
                agendamento.getServico().getDescricao(),
                manipuladorValor,
                Util.dfDate.format(agendamento.getData()),
                Util.dfTime.format(agendamento.getData()),
                agendamento.getObservacao()
            });

        }
    }

    public void setFields(long idAgendamento) {
        Agendamento agendamento = agendamentoDao.findById(idAgendamento);
        helper.setModelo(agendamento);
    }

    public void limparCampos() {
        helper.clearTela();
    }

    public void deletar(Long id) {
        agendamentoDao.delete(id);
    }
    
    public int isValidDateAndTime(){
        
        Agendamento agendamento = helper.getModelo();
        return agendamentoDao.numeroAgendamentosEmAtrito(Login.barbeiroSecao.getId(), agendamento.getData());
    }

}
