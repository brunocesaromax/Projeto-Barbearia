/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.Barbeiro;
import View.Login;

/**
 *
 * @author brunocesar
 */
public class LoginHelper {

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Barbeiro getModelo() {
        Barbeiro barbeiro = new Barbeiro(null, view.getUsuariojTextField1().getText(), view.getSenhajPasswordField1().getText());
        return barbeiro;
    }

    public void setModelo(Barbeiro modelo) {
        view.getUsuariojTextField1().setText(modelo.getUsername());
        view.getSenhajPasswordField1().setText(modelo.getSenha());
    }

    public void clearTela() {
        view.getUsuariojTextField1().setText("");
        view.getSenhajPasswordField1().setText("");
    }

}
