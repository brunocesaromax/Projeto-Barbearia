/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.Barbeiro;
import View.Cadastro;

/**
 *
 * @author brunocesar
 */
public class CadastroHelper {

    private final Cadastro view;

    public CadastroHelper(Cadastro view) {
        this.view = view;
    }

    public Barbeiro getModelo() {
        Barbeiro barbeiro = new Barbeiro(view.getNomeBarbeirojTextField1().getText(),view.getUsernameBarbeirojTextField2().getText(), view.getSenhaBarbeirojPasswordField1().getText());
        return barbeiro;
    }

    public void clearTela() {
        view.getNomeBarbeirojTextField1().setText("");
        view.getUsernameBarbeirojTextField2().setText("");
        view.getSenhaBarbeirojPasswordField1().setText("");
    }

}
