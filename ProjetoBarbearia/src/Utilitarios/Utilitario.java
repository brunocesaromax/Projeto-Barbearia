package Utilitarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aluno on 17/12/18.
 */
public class Utilitario {

    public static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static Date getDataFormatada(String data){

        Date date = null;

        try {
            date = dataFormatada.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }


}
