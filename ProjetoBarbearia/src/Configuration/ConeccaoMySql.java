/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

//Classes necessárias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Início da classe de conexão//
public class ConeccaoMySql {

    public static String status = "Não conectou...";

    //Método Construtor da Classe//
    public ConeccaoMySql() {

    }

    //Método de Conexão//
    public static java.sql.Connection getConexaoMySQL() {

        Connection connection = null; //atributo do tipo Connection
        try {

            // Carregando o JDBC Driver padrão
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
//jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false

            // Configurando a nossa conexão com um banco de dados//
            String serverName = "localhost:3306";    //caminho do servidor do BD
            String mydatabase = "barbearia?autoReconnect=true&useSSL=false";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";        //nome de um usuário de seu BD      
            String password = "root";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);
            //Testa sua conexão//  
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado

            System.out.println("O driver expecificado nao foi encontrado.");
            return null;

        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }

    //Método que retorna o status da sua conexão//
    public static String statusConection() {
        return status;
    }

    //Método que fecha sua conexão//
    public static boolean fecharConexao() {

        try {
            ConeccaoMySql.getConexaoMySQL().close();
            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {

        fecharConexao();
        return ConeccaoMySql.getConexaoMySQL();

    }

}
