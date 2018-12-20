/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utilitarios.Util;

import java.util.Date;

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

    public Agendamento(String nomeCliente, float valor, String data, EnumServico servico, String observacao, Barbeiro barbeiro) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.data = Util.getDataFormatada(data);
        this.servico = servico;
        this.observacao = observacao;
        this.barbeiro = barbeiro;
    }

    public Agendamento(Long id) {
        this.id = id;
    }

    public Agendamento() {
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
