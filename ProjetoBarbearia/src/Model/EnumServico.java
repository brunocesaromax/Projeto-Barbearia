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

    CORTE ("Corte"), BARBA ("Barba"), QUIMICA ("Química"), PIGMENTACAO ("Pigmentação"), 
    BARBACORTE ("Barba + Corte"), SOBRANCELHA ("Sobrancelha"), DESCOLORAÇÃO ("Descoloração"), 
    DEPILAÇÃO ("Depilação"), UNHA ("Unha"), OUTROS ("Outros");
    
    private String descricao;
 
    EnumServico(String descricao) {
        this.descricao = descricao;
    }

    private EnumServico() {
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public static EnumServico valueOf(int valor) {
        
        switch(valor){
            case 0: return EnumServico.CORTE;
            case 1: return EnumServico.BARBA;
            case 2: return EnumServico.QUIMICA;
            case 3: return EnumServico.PIGMENTACAO;
            case 4: return EnumServico.BARBACORTE;
            case 5: return EnumServico.SOBRANCELHA;
            case 6: return EnumServico.DESCOLORAÇÃO;
            case 7: return EnumServico.DEPILAÇÃO;
            case 8: return EnumServico.UNHA;
            case 9: return EnumServico.OUTROS;
            default: return null;  
        }
    }
    
    // Retornar enum de acordo com a descrição
    public static EnumServico valor(String desc) {
         
        switch(desc){
            case "Corte": return EnumServico.CORTE;
            case "Barba": return EnumServico.BARBA;
            case "Química": return EnumServico.QUIMICA;
            case "Pigmentação": return EnumServico.PIGMENTACAO;
            case "Barba + Corte": return EnumServico.BARBACORTE;
            case "Sobrancelha": return EnumServico.SOBRANCELHA;
            case "Descoloração": return EnumServico.DESCOLORAÇÃO;
            case "Depilação": return EnumServico.DEPILAÇÃO;
            case "Unha": return EnumServico.UNHA;
            case "Outros": return EnumServico.OUTROS;
            default: return null;  
        }
    }
    
}
