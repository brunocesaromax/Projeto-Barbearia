/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.RelatorioController;
import Utilitarios.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author brunocesar
 */
public class Relatorio extends javax.swing.JFrame {

    private final RelatorioController relatorioController;

    public Relatorio() {
        relatorioController = new RelatorioController(this);
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MesjButton1 = new javax.swing.JButton();
        DataIniciojFormattedTextField1 = new javax.swing.JFormattedTextField();
        DataFimjFormattedTextField2 = new javax.swing.JFormattedTextField();
        GerarjButton5 = new javax.swing.JButton();
        TresMesesjButton2 = new javax.swing.JButton();
        SeisMesesjButton3 = new javax.swing.JButton();
        AnojButton4 = new javax.swing.JButton();
        SemanajButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FundojLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatórios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Relatório por intervalo de escolha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Relatórios prontos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Data fim:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Data ínicio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        MesjButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        MesjButton1.setText("Últimos 30 dias");
        MesjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesjButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(MesjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 160, -1));

        try {
            DataIniciojFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(DataIniciojFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 170, 40));

        try {
            DataFimjFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(DataFimjFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 170, 40));

        GerarjButton5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        GerarjButton5.setText("Gerar Relatório");
        GerarjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarjButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(GerarjButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 170, 40));

        TresMesesjButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TresMesesjButton2.setText("Últimos 3 meses");
        TresMesesjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresMesesjButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(TresMesesjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 160, -1));

        SeisMesesjButton3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        SeisMesesjButton3.setText("Últimos 6 meses");
        SeisMesesjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisMesesjButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(SeisMesesjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 160, -1));

        AnojButton4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        AnojButton4.setText("Último ano");
        AnojButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnojButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(AnojButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 160, -1));

        SemanajButton5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        SemanajButton5.setText("Últimos 7 dias");
        SemanajButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemanajButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(SemanajButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 160, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -130, 1320, 1140));

        FundojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Relatório.png"))); // NOI18N
        getContentPane().add(FundojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 1353, 716));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SemanajButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemanajButton5ActionPerformed

        StringBuilder dados = relatorioController.gerarRelatorio(7);

        try {
            gerarRelatorio(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SemanajButton5ActionPerformed

    private void MesjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesjButton1ActionPerformed
        StringBuilder dados = relatorioController.gerarRelatorio(30);

        try {
            gerarRelatorio(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MesjButton1ActionPerformed

    private void TresMesesjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresMesesjButton2ActionPerformed
        StringBuilder dados = relatorioController.gerarRelatorio(90);

        try {
            gerarRelatorio(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TresMesesjButton2ActionPerformed

    private void SeisMesesjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisMesesjButton3ActionPerformed
        StringBuilder dados = relatorioController.gerarRelatorio(180);

        try {
            gerarRelatorio(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SeisMesesjButton3ActionPerformed

    private void AnojButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnojButton4ActionPerformed
        StringBuilder dados = relatorioController.gerarRelatorio(365);

        try {
            gerarRelatorio(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AnojButton4ActionPerformed

    private void GerarjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarjButton5ActionPerformed

        //agendamento.setData(Util.getDataFormatada(view.getDatajFormattedTextField2().getText().concat(" " + view.getHorajFormattedTextField3().getText())));
        StringBuilder dados = null;
        dados = relatorioController.gerarRelatorioPorIntervalo(Util.getDataFormatada(this.DataIniciojFormattedTextField1.getText().concat(" 00:00")),
                Util.getDataFormatada(this.DataFimjFormattedTextField2.getText().concat(" 00:00")));

        try {
            gerarRelatorio(dados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_GerarjButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnojButton4;
    private javax.swing.JFormattedTextField DataFimjFormattedTextField2;
    private javax.swing.JFormattedTextField DataIniciojFormattedTextField1;
    private javax.swing.JLabel FundojLabel1;
    private javax.swing.JButton GerarjButton5;
    private javax.swing.JButton MesjButton1;
    private javax.swing.JButton SeisMesesjButton3;
    private javax.swing.JButton SemanajButton5;
    private javax.swing.JButton TresMesesjButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    public void gerarRelatorio(StringBuilder dados) throws FileNotFoundException {
        
        FileSystemView system = FileSystemView.getFileSystemView();
        //Salvando relatório no diretório raíz do sistema operacional
        String path = system.getHomeDirectory().getPath() + File.separator + "relatório.csv";
        
        PrintWriter pw = new PrintWriter(new File(path));
        pw.write(dados.toString());
        pw.close();
        JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!");

    }

    public JFormattedTextField getDataFimjFormattedTextField2() {
        return DataFimjFormattedTextField2;
    }

    public void setDataFimjFormattedTextField2(JFormattedTextField DataFimjFormattedTextField2) {
        this.DataFimjFormattedTextField2 = DataFimjFormattedTextField2;
    }

    public JFormattedTextField getDataIniciojFormattedTextField1() {
        return DataIniciojFormattedTextField1;
    }

    public void setDataIniciojFormattedTextField1(JFormattedTextField DataIniciojFormattedTextField1) {
        this.DataIniciojFormattedTextField1 = DataIniciojFormattedTextField1;
    }

}
