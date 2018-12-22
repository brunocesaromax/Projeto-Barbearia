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
        if (!Utilitarios.Validacao.isNullOrEmpty(view.getIDjTextField().getText())) {
            agendamento.setId(Long.valueOf(view.getIDjTextField().getText()));
        }
        agendamento.setNomeCliente(view.getNomeClientejTextField1().getText());
        agendamento.setValor(Util.getFloatSemVirgulas(view.getValorjFormattedTextField1().getText()));
        agendamento.setData(Util.getDataFormatada(view.getDatajFormattedTextField2().getText().concat(" " + view.getHorajFormattedTextField3().getText())));
        agendamento.setServico(EnumServico.valor(String.valueOf(view.getServicojComboBox2().getSelectedItem())));
        agendamento.setObservacao(view.getObservacaojTextArea1().getText());
        agendamento.setBarbeiro(Login.barbeiroSecao);
        return agendamento;
    }

    public void setModelo(Agendamento modelo) {
        view.getIDjTextField().setText(String.valueOf(modelo.getId()));
        view.getNomeClientejTextField1().setText(modelo.getNomeCliente());
        view.getServicojComboBox2().setSelectedItem(modelo.getServico().getDescricao());

        //Tratando campo valor em float e com vírgula
        if (modelo.getValor() < 1) {
            view.getValorjFormattedTextField1().setText("000" + Util.formatarFloatDuasCasasDecimais(modelo.getValor()));
        } else if (modelo.getValor() < 10) {
            view.getValorjFormattedTextField1().setText("00" + Util.formatarFloatDuasCasasDecimais(modelo.getValor()));
        } else if (modelo.getValor() < 100) {
            view.getValorjFormattedTextField1().setText("0" + Util.formatarFloatDuasCasasDecimais(modelo.getValor()));
        } else {
            view.getValorjFormattedTextField1().setText(Util.formatarFloatDuasCasasDecimais(modelo.getValor()));
        }

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
