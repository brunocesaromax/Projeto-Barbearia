/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AgendamentoDao;
import Helper.AgendamentoHelper;
import Model.Agendamento;
import View.Agenda;
import javax.swing.JOptionPane;

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
    
    public void salvarNovaAgenda(){
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
    
}
