/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AgendamentoDao;
import Model.Agendamento;
import View.Login;
import View.Relatorio;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author brunocesar
 */
public class RelatorioController {

    private final Relatorio view;
    private final AgendamentoDao agendamentoDao;

    public RelatorioController(Relatorio view) {
        this.view = view;
        //this.helper = new AgendamentoHelper(view);
        this.agendamentoDao = new AgendamentoDao();
    }

    public StringBuilder gerarRelatorio(int qtdDias) {

        ArrayList<Agendamento> agendamentos;
        agendamentos = agendamentoDao.findAllByIdBarbeiro(Login.barbeiroSecao.getId(), qtdDias);
        float lucroNoPeriodo = 0;

        StringBuilder sb = new StringBuilder("Nome do Cliente, Valor em R$, Data, Serviço\n");

        for (Agendamento agendamento : agendamentos) {

            sb.append(agendamento.getNomeCliente());
            sb.append(',');

            //Tratando vírgula em valor de agendamento com ""
            sb.append('"');
            sb.append(Utilitarios.Util.formatarFloatDuasCasasDecimais(agendamento.getValor()));
            sb.append('"');
            sb.append(',');

            sb.append(Utilitarios.Util.dfDate.format(agendamento.getData()));
            sb.append(',');
            sb.append(agendamento.getServico().getDescricao());
            sb.append("\n");

            lucroNoPeriodo += agendamento.getValor();
        }

        sb.append("\n\n");
        sb.append("Lucro do período: R$");
        sb.append(",");
        sb.append('"');
        sb.append(Utilitarios.Util.formatarFloatDuasCasasDecimais(lucroNoPeriodo));
        sb.append('"');

        return sb;
    }

    public StringBuilder gerarRelatorioPorIntervalo(Date dataInicio, Date dataFim) {

        ArrayList<Agendamento> agendamentos;
        agendamentos = agendamentoDao.findAllByIdBarbeiroAndInterval(Login.barbeiroSecao.getId(), dataInicio, dataFim);
        float lucroNoPeriodo = 0;

        StringBuilder sb = new StringBuilder("Nome do Cliente, Valor em R$, Data, Serviço\n");

        for (Agendamento agendamento : agendamentos) {

            sb.append(agendamento.getNomeCliente());
            sb.append(',');

            //Tratando vírgula em valor de agendamento com ""
            sb.append('"');
            sb.append(Utilitarios.Util.formatarFloatDuasCasasDecimais(agendamento.getValor()));
            sb.append('"');
            sb.append(',');

            sb.append(Utilitarios.Util.dfDate.format(agendamento.getData()));
            sb.append(',');
            sb.append(agendamento.getServico().getDescricao());
            sb.append("\n");

            lucroNoPeriodo += agendamento.getValor();
        }

        sb.append("\n\n");
        sb.append("Lucro do período: R$");
        sb.append(",");
        sb.append('"');
        sb.append(Utilitarios.Util.formatarFloatDuasCasasDecimais(lucroNoPeriodo));
        sb.append('"');

        return sb;

    }

}
