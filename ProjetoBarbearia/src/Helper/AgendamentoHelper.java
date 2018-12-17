/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.Agendamento;
import Model.EnumServico;
import Utilitarios.Utilitario;
import View.Agenda;

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

        Agendamento agendamento = new Agendamento(Long.valueOf(view.getIDjTextField().getText()));
        agendamento.setNomeCliente((String) view.getClientejComboBox1().getSelectedItem());
        agendamento.setValor(Float.parseFloat(view.getValorjTextField().getText()));
        agendamento.setData(Utilitario.getDataFormatada(view.getDatajTextField5().getText()));
        agendamento.setServico((EnumServico) view.getServicojComboBox2().getSelectedItem());
        agendamento.setObservacao(view.getObservacaojTextArea1().getText());
        //agendamento.setBarbeiro();todo: Fazer apos criar o DAO
        return  agendamento;
    }

    public void setModelo(Agendamento modelo) {

        modelo.setId(Long.valueOf(view.getIDjTextField().getText()));
        modelo.setNomeCliente((String) view.getClientejComboBox1().getSelectedItem());
        modelo.setValor(Float.parseFloat(view.getValorjTextField().getText()));
        modelo.setData(Utilitario.getDataFormatada(view.getDatajTextField5().getText()));
        modelo.setServico((EnumServico) view.getServicojComboBox2().getSelectedItem());
        modelo.setObservacao(view.getObservacaojTextArea1().getText());
    }

    public void clearTela() {
        view.getIDjTextField().setText("");
        //view.getClientejComboBox1().getSelectedItem();
        view.getValorjTextField().setText("");
        view.getDatajTextField5().setText("");
        //view.getServicojComboBox2().getSelectedItem();
        view.getObservacaojTextArea1().setText("");
    }

}
