package Utilitarios;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aluno on 17/12/18.
 */
public class Util {

    public static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static DateFormat dfDate = new SimpleDateFormat("dd/MM/yyyy");
    public static DateFormat dfTime = new SimpleDateFormat("HH:mm");

    public static Date getDataFormatada(String data) {

        Date date = null;

        try {
            date = dataFormatada.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static float getFloatFormatado(String valor) {

        if (valor.contains(",")) {
            valor = valor.replace(',', '.');
        }

        return Float.valueOf(valor);
    }

    public static String formatarFloat(float numero) {
        String retorno = "";
        DecimalFormat formatter = new DecimalFormat("#.00");
        try {
            retorno = formatter.format(numero);
        } catch (Exception ex) {
            System.err.println("Erro ao formatar numero: " + ex);
        }
        return retorno;
    }
}
