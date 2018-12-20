/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.Agendamento;
import Model.EnumServico;
import Utilitarios.Util;
import View.Agenda;
import View.Login;

/**
 *
 * @author brunocesar
 */
public class AgendamentoHelper {

    private final Agenda view;

    public AgendamentoHelper(Agenda view) {
        this.view = view;
    }

    public Agendamento getModelo() {

        Agendamento agendamento = new Agendamento();
        agendamento.setNomeCliente(view.getNomeClientejTextField1().getText());
        agendamento.setValor(Util.getFloatFormatado(view.getValorjFormattedTextField1().getText()));
        agendamento.setData(Util.getDataFormatada(view.getDatajFormattedTextField2().getText().concat(" "+view.getHorajFormattedTextField3().getText())));
        agendamento.setServico(EnumServico.valor(String.valueOf(view.getServicojComboBox2().getSelectedItem())));
        agendamento.setObservacao(view.getObservacaojTextArea1().getText());
        agendamento.setBarbeiro(Login.barbeiroSecao);
        return  agendamento;
    }

    public void setModelo(Agendamento modelo) {

        modelo.setId(Long.valueOf(view.getIDjTextField().getText()));
        modelo.setNomeCliente(view.getNomeClientejTextField1().getText());
        modelo.setValor(Float.parseFloat(view.getValorjFormattedTextField1().getText()));
        modelo.setData(Util.getDataFormatada(view.getDatajFormattedTextField2().getText()));
        modelo.setServico((EnumServico) view.getServicojComboBox2().getSelectedItem());
        modelo.setObservacao(view.getObservacaojTextArea1().getText());
    }

    public void clearTela() {
        view.getIDjTextField().setText("");
        view.getNomeClientejTextField1().setText("");
        view.getValorjFormattedTextField1().setText("");
        view.getDatajFormattedTextField2().setText("");
        view.getHorajFormattedTextField3().setText("");
        view.getObservacaojTextArea1().setText("");
    }

}
