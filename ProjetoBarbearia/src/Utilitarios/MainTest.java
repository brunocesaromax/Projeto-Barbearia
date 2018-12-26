/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author brunocesar
 */
public class MainTest {

    public static void main(String args[]) {
        
        String data = "88/03/2001";
        
      boolean res =   Utilitarios.Validacao.validaData(data);
        
        System.out.println(res);

    }

}
