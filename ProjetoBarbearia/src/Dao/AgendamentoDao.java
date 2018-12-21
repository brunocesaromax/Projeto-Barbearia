/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Configuration.ConeccaoMySql;
import Model.Agendamento;
import Model.EnumServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author brunocesar
 */
public class AgendamentoDao {

    public boolean insert(Agendamento agendamento) {

        boolean resultado = false;
        java.sql.Timestamp date;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "INSERT INTO Agendamento (nomeCliente, valor, data, servico, observacao, fk_barbeiro_id) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, agendamento.getNomeCliente());
            statement.setString(2, String.valueOf(agendamento.getValor()));
            date = new java.sql.Timestamp(agendamento.getData().getTime());// Uso de timestamp para persistir também hora e minuto
            statement.setTimestamp(3, date);
            statement.setInt(4, agendamento.getServico().ordinal());
            statement.setString(5, agendamento.getObservacao());
            statement.setLong(6, agendamento.getBarbeiro().getId());

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

    public ArrayList<Agendamento> findAllByIdBarbeiro(Long idBarbeiro) {

        boolean resultado = false;
        ArrayList<Agendamento> agendamentos = new ArrayList<>();

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "SELECT * FROM Agendamento WHERE fk_barbeiro_id =" + idBarbeiro + " ORDER BY data";

            Statement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setId(result.getLong("id"));
                agendamento.setNomeCliente(result.getString("nomeCliente"));
                agendamento.setValor(result.getFloat("valor"));
                agendamento.setData(result.getTimestamp("data"));
                agendamento.setServico(EnumServico.valueOf(result.getInt("servico")));
                agendamento.setObservacao(result.getString("observacao"));
                agendamentos.add(agendamento);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return agendamentos;
    }

    public Agendamento findById(Long id) {

        boolean resultado = false;
        Agendamento agendamento = null;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "SELECT * FROM Agendamento WHERE id ="+id;

            Statement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                agendamento = new Agendamento();
                agendamento.setId(result.getLong("id"));
                agendamento.setNomeCliente(result.getString("nomeCliente"));
                agendamento.setValor(result.getFloat("valor"));
                agendamento.setData(result.getTimestamp("data"));
                agendamento.setServico(EnumServico.valueOf(result.getInt("servico")));
                agendamento.setObservacao(result.getString("observacao"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return agendamento;
    }

    public boolean delete(Long id) {

        boolean resultado = false;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "DELETE FROM Agendamento WHERE id=?";

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

    public boolean update(Agendamento agendamento) {

        boolean resultado = false;

        //A instrução try -with-resources, que fechará a conexão automaticamente
        try (Connection conn = ConeccaoMySql.getConexaoMySQL()) {

            String sql = "UPDATE Agendamento SET nomeCliente=?, valor=?, data=?, servico=?, "
                    + " observacao=?, barbeiro.id=?  WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, agendamento.getNomeCliente());
            statement.setFloat(2, agendamento.getValor());
            statement.setDate(3, (java.sql.Date) agendamento.getData());
            statement.setString(4, agendamento.getObservacao());
            statement.setObject(5, agendamento.getBarbeiro());

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
