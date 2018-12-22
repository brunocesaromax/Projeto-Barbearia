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

        Date data = new Date();
        Date data2 = new Date();
        
        if(data.before(data2)){
            System.out.println("ERRO");
        }

    }

}
