/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Helper.LoginHelper;
import Model.Barbeiro;
import View.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author brunocesar
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void logar(){
        
        Barbeiro barbeiro = helper.getModelo();
        JOptionPane.showMessageDialog(null, "Usuario "+barbeiro.getUsername());
        
    }
    
    
}
