/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;

/**
 *
 * @author brunocesar
 */
public class Validacao {

    public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0         
                // (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public static boolean isCNPJ(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

// Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public static String onlyNumbers(String text) {

        if (text != null) {
            return text.replaceAll("[^0123456789]", "");
        }

        return null;
    }

    //Método que valida o Cep
    public static boolean validaCep(String cep) {
        if (cep.length() == 8) {
            cep = cep.substring(0, 5) + "-" + cep.substring(5, 8);
            //txt.Text = cep;
        }
        return cep.matches("[0-9]{5}-[0-9]{3}");
    }

    //Método que valida o Email
    public static boolean validaEmail(String email) {
        return email.matches("(?<user>[^@]+)@(?<host>.+)");
    }

    public static boolean isNullOrEmpty(String text) {

        if (text == null || text.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean validaData(Date data) {

        Date date = new Date();

        if (date.after(data)) {//Data atual é posterior a data de agendamento?
            return false;
        } else {
            return true; // Caso não seja, a data de agendamento é válida
        }

    }
    
    //Validando data em seus à nível de dia, mês e ano, formato dd/MM/yyyy
    public static boolean validaData(String data) {

        String[] parts = data.split("/");
        String parte1 = parts[0];//dia
        String parte2 = parts[1];//mes 
        String parte3 = parts[2];//ano

        int dia = Integer.valueOf(parte1);
        int mes = Integer.valueOf(parte2);
        int ano = Integer.valueOf(parte3);

        boolean resultado = true;

        //Tratando fevereiro
        if (mes == 2) {

            if (new GregorianCalendar().isLeapYear(ano)) {// Verifica se ano é bissexto

                if (dia > 0 && dia <= 29) {
                    resultado = true;
                } else {
                    resultado = false;
                }
            } else {

                if (dia > 0 && dia <= 28) {
                    resultado = true;
                } else {
                    resultado = false;
                }
            }

        } else {

            if ((mes == 1 || mes == 8 || mes % 2 != 0) && mes <= 12) {

                if (dia > 0 && dia <= 31) {
                    resultado = true;
                } else {
                    resultado = false;
                }

            } else {

                if (mes <= 12) {

                    if (dia > 0 && dia <= 30) {
                        resultado = true;
                    } else {
                        resultado = false;
                    }
                }else{
                    resultado = false;
                }
            }
        }

        return resultado;

    }

    //Validando horario no sentido de horas > 23 || horas < 0 e minutos <= 59 || minutos >= 0
    public static boolean validaHorario(String data) {

        String[] parts = data.split(":");
        String parte1 = parts[0];
        String parte2 = parts[1];

        int horas = Integer.valueOf(parte1);
        int minutos = Integer.valueOf(parte2);
        boolean resultado = true;

        if (horas > 23 || horas < 0) {
            resultado = false;
        }
        if (resultado == true && (minutos > 59 || minutos < 0)) {
            resultado = false;
        }

        return resultado;
    }

}
