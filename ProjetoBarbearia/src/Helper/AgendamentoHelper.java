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
        view.getIDjTextField().setText(String.valueOf(modelo.getId()));
        view.getNomeClientejTextField1().setText(modelo.getNomeCliente());
        view.getServicojComboBox2().setSelectedItem(modelo.getServico().getDescricao());
        view.getValorjFormattedTextField1().setText(String.valueOf(modelo.getValor()));
        view.getDatajFormattedTextField2().setText(Util.dfDate.format(modelo.getData()));
        view.getHorajFormattedTextField3().setText(Util.dfTime.format(modelo.getData()));
        view.getObservacaojTextArea1().setText(modelo.getObservacao());
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
