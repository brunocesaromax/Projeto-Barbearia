/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Configuration.ConeccaoMySql;
import Model.Barbeiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author brunocesar
 */
public class BarbeiroDao {
    
    public boolean insert(Barbeiro barbeiro) {

        boolean resultado = false;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "INSERT INTO Barbeiro (nome, username, senha) VALUES (?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, barbeiro.getNome());
            statement.setString(2, barbeiro.getUsername());
            statement.setString(3, barbeiro.getSenha());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                //System.out.println("A new user was inserted successfully!");
                resultado = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    public Barbeiro findByUsername(String username) {

        boolean resultado = false;
        Barbeiro barbeiro = null;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "SELECT * FROM Barbeiro WHERE username = ?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                barbeiro.setId(result.getLong("id"));
                //String output = "User #%d: %s - %s - %s - %s";
                //System.out.println(String.format(output, ++count, name, pass, fullname, email));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return barbeiro;
    }

    public boolean delete(Long id) {

        boolean resultado = false;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "DELETE FROM Barbeiro WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(id));

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                resultado = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;

    }

    public boolean update(Barbeiro barbeiro) {

        boolean resultado = false;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "UPDATE Barbeiro SET nome=?, username=?, senha=? WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, barbeiro.getNome());
            statement.setString(2, barbeiro.getUsername());
            statement.setString(3, barbeiro.getSenha());
            statement.setString(4, String.valueOf(barbeiro.getId()));

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                resultado = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;

    }

}
