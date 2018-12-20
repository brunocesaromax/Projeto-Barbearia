/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.BarbeiroDao;
import Helper.LoginHelper;
import Model.Barbeiro;
import View.Login;
import View.MenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author brunocesar
 */
public class LoginController {

    private final Login view;
    private final LoginHelper helper;
    private final BarbeiroDao barbeiroDao; 

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        this.barbeiroDao = new BarbeiroDao();
    }

    public void logar() {
        
        Barbeiro barbeiro = helper.getModelo();
        Barbeiro barbeiroBD = barbeiroDao.findByUsername(barbeiro.getNomeUsuario(), barbeiro.getSenha());
        
        if(barbeiroBD == null){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!\nTente novamente.");
            return;
        }else{
            
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            Login.barbeiroSecao = barbeiroBD;
            view.dispose();
        }
        
    }

}
