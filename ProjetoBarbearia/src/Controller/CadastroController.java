/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.BarbeiroDao;
import Helper.CadastroHelper;
import Model.Barbeiro;
import View.Cadastro;
import javax.swing.JOptionPane;

/**
 *
 * @author brunocesar
 */
public class CadastroController {
    
    private final Cadastro view;
    private CadastroHelper helper;
    private BarbeiroDao barbeiroDao;

    public CadastroController(Cadastro view) {
        this.view = view;
        this.helper = new CadastroHelper(view);
        this.barbeiroDao = new BarbeiroDao();
    }
    
    public void salvarNovoBarbeiro(){
        Barbeiro barbeiro = helper.getModelo();
        String mensagem;
        int flag = 0;
        
        if(barbeiroDao.numberOfUsername(barbeiro.getNomeUsuario()) == 0){
            barbeiroDao.insert(barbeiro);
            mensagem = "Barbeiro cadastrado com sucesso!\nClique em VOLTAR para entrar no sistema.";
            flag++;
        }else{
            mensagem = "Já existe barbeiro com esse nome de usuário, tente outro nome de usuário.";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        if(flag > 0){
            helper.clearTela();
        }
    }
    
}
