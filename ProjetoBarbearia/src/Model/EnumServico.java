/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author brunocesar
 */
public enum EnumServico {

    CORTE ("Corte"), BARBA ("Barba"), QUIMICA ("Química"), PIGMENTACAO ("Pigmentação");
    
    private String descricao;
 
    EnumServico(String descricao) {
        this.descricao = descricao;
    }

    private EnumServico() {
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public static EnumServico valueOf(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Retornar enum de acordo com a descrição
    public static EnumServico valor(String desc) {
         
        switch(desc){
            case "Corte": return EnumServico.CORTE;
            case "Barba": return EnumServico.BARBA;
            case "Química": return EnumServico.QUIMICA;
            case "Pigmentação": return EnumServico.PIGMENTACAO;
            default: return null;  
        }
    }
    
}
