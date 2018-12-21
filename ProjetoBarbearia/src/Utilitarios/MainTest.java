/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brunocesar
 */
public class MainTest {

    public static void main(String args[]) {

        float v = (float) 15.456456;
        System.out.println("R$" + Util.formatarFloat(v));

    }

}
