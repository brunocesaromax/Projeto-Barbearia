/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author brunocesar
 */
public class MainTest {

    public static void main(String args[]) {

        FileSystemView system = FileSystemView.getFileSystemView();
        System.out.println(system.getHomeDirectory().getPath());

    }

}
