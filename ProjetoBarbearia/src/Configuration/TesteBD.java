/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

import java.sql.Connection;

/**
 *
 * @author brunocesar
 */
public class TesteBD {
    
    public static void main(String args[]){
        
        Connection connection = ConeccaoMySql.getConexaoMySQL();
        
        System.out.println(ConeccaoMySql.status);
        
    }
    
}
