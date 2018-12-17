/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utilitarios.Utilitario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brunocesar
 */
public class Agendamento {
    
    private Long id;
    private String nomeCliente;
    private float valor;
    private Date data;
    private EnumServico servico;
    private String observacao;
    private Barbeiro barbeiro;

    public Agendamento(Long id, String nomeCliente, float valor, String data, EnumServico servico, String observacao, Barbeiro barbeiro) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.data = Utilitario.getDataFormatada(data);
        /*try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        this.servico = servico;
        this.observacao = observacao;
        this.barbeiro = barbeiro;
    }

    public Agendamento(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public EnumServico getServico() {
        return servico;
    }

    public void setServico(EnumServico servico) {
        this.servico = servico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }

        
}
