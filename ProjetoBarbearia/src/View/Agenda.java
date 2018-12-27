/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AgendamentoController;
import Model.EnumServico;
import Utilitarios.Util;
import java.util.ArrayList;

import javax.swing.*;

/**
 *
 * @author brunocesar
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendamentoController agendaController;

    public Agenda() {
        initComponents();
        this.AtualizarAgendamentojButton1.setEnabled(false);
        this.ExcluirjButton2.setEnabled(false);
        iniciarServicos();
        agendaController = new AgendamentoController(this);
        agendaController.atualizarTabelaDeAgendamentos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDjTextField = new javax.swing.JTextField();
        ServicojComboBox2 = new javax.swing.JComboBox<>();
        AgendarjButton1 = new javax.swing.JButton();
        NomeClientejTextField1 = new javax.swing.JTextField();
        ValorjFormattedTextField1 = new javax.swing.JFormattedTextField();
        DatajFormattedTextField2 = new javax.swing.JFormattedTextField();
        HorajFormattedTextField3 = new javax.swing.JFormattedTextField();
        ExcluirjButton2 = new javax.swing.JButton();
        AtualizarAgendamentojButton1 = new javax.swing.JButton();
        LimparCamposjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAgendamentosjTable = new javax.swing.JTable();
        ObservacaojScrollPane1 = new javax.swing.JScrollPane();
        ObservacaojTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDjTextField.setEditable(false);
        IDjTextField.setBackground(new java.awt.Color(163, 163, 163));
        IDjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(IDjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, -1));

        getContentPane().add(ServicojComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 270, 30));

        AgendarjButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        AgendarjButton1.setForeground(new java.awt.Color(15, 255, 0));
        AgendarjButton1.setText("Agendar");
        AgendarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarjButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(AgendarjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 140, 30));
        getContentPane().add(NomeClientejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 270, 30));

        try {
            ValorjFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(ValorjFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 30));

        try {
            DatajFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(DatajFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 150, 30));

        try {
            HorajFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(HorajFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 150, 30));

        ExcluirjButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        ExcluirjButton2.setForeground(new java.awt.Color(255, 0, 18));
        ExcluirjButton2.setText("Excluir");
        ExcluirjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirjButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(ExcluirjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 140, 30));

        AtualizarAgendamentojButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        AtualizarAgendamentojButton1.setText("Atualizar");
        AtualizarAgendamentojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarAgendamentojButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(AtualizarAgendamentojButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 140, 30));

        LimparCamposjButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        LimparCamposjButton.setText("Limpar");
        LimparCamposjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCamposjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LimparCamposjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 140, 30));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createCompoundBorder());

        TabelaAgendamentosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Cliente", "Serviço", "Valor", "Data", "Horario", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAgendamentosjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaAgendamentosjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaAgendamentosjTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 970, 270));

        ObservacaojTextArea1.setColumns(20);
        ObservacaojTextArea1.setRows(5);
        ObservacaojScrollPane1.setViewportView(ObservacaojTextArea1);

        getContentPane().add(ObservacaojScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 480, 240));

        jLabel3.setBackground(new java.awt.Color(254, 254, 254));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 130, 30, -1));

        jLabel4.setBackground(new java.awt.Color(254, 254, 254));
        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cliente:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(254, 254, 254));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Serviço:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel6.setBackground(new java.awt.Color(254, 254, 254));
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Valor R$:");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel7.setBackground(new java.awt.Color(254, 254, 254));
        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Data:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel8.setBackground(new java.awt.Color(254, 254, 254));
        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hora:");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jLabel9.setBackground(new java.awt.Color(254, 254, 254));
        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Observação:");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDjTextFieldActionPerformed

    private void AgendarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarjButton1ActionPerformed

        String mensagem = this.validarCamposObrigatórios();

        if (!Utilitarios.Validacao.isNullOrEmpty(mensagem)) {
            JOptionPane.showMessageDialog(null, mensagem);
        } else {

            if (agendaController.isValidDateAndTime() > 0) {
                mensagem = "Data e horário já está ocupado por outro cliente";
                JOptionPane.showMessageDialog(null, mensagem);
            } else {

                agendaController.salvarOuAtualizarAgendamento();
                agendaController.atualizarTabelaDeAgendamentos();
            }
        }

    }//GEN-LAST:event_AgendarjButton1ActionPerformed

    private void LimparCamposjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposjButtonActionPerformed
        agendaController.limparCampos();
        this.AgendarjButton1.setEnabled(true);
        this.AtualizarAgendamentojButton1.setEnabled(false);
        this.ExcluirjButton2.setEnabled(false);
    }//GEN-LAST:event_LimparCamposjButtonActionPerformed

    private void AtualizarAgendamentojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarAgendamentojButton1ActionPerformed

        String mensagem = this.validarCamposObrigatórios();

        if (!Utilitarios.Validacao.isNullOrEmpty(mensagem)) {
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            agendaController.salvarOuAtualizarAgendamento();
            agendaController.atualizarTabelaDeAgendamentos();
            agendaController.limparCampos();
            this.AgendarjButton1.setEnabled(true);
            this.AtualizarAgendamentojButton1.setEnabled(false);
        }
    }//GEN-LAST:event_AtualizarAgendamentojButton1ActionPerformed

    private void TabelaAgendamentosjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaAgendamentosjTableMouseClicked
        long idAgendamento = (long) TabelaAgendamentosjTable.getValueAt(TabelaAgendamentosjTable.getSelectedRow(), 0);
        agendaController.setFields(idAgendamento);
        this.AgendarjButton1.setEnabled(false);
        this.AtualizarAgendamentojButton1.setEnabled(true);
        this.ExcluirjButton2.setEnabled(true);
    }//GEN-LAST:event_TabelaAgendamentosjTableMouseClicked

    private void ExcluirjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirjButton2ActionPerformed

        agendaController.deletar((Long.valueOf(IDjTextField.getText())));
        agendaController.limparCampos();
        agendaController.atualizarTabelaDeAgendamentos();
        this.AgendarjButton1.setEnabled(true);
        this.AtualizarAgendamentojButton1.setEnabled(false);
        this.ExcluirjButton2.setEnabled(false);

    }//GEN-LAST:event_ExcluirjButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgendarjButton1;
    private javax.swing.JButton AtualizarAgendamentojButton1;
    private javax.swing.JFormattedTextField DatajFormattedTextField2;
    private javax.swing.JButton ExcluirjButton2;
    private javax.swing.JFormattedTextField HorajFormattedTextField3;
    private javax.swing.JTextField IDjTextField;
    private javax.swing.JButton LimparCamposjButton;
    private javax.swing.JTextField NomeClientejTextField1;
    private javax.swing.JScrollPane ObservacaojScrollPane1;
    private javax.swing.JTextArea ObservacaojTextArea1;
    private javax.swing.JComboBox<String> ServicojComboBox2;
    private javax.swing.JTable TabelaAgendamentosjTable;
    private javax.swing.JFormattedTextField ValorjFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JTextField getIDjTextField() {
        return IDjTextField;
    }

    public void setIDjTextField(JTextField IDjTextField) {
        this.IDjTextField = IDjTextField;
    }

    public JScrollPane getObservacaojScrollPane1() {
        return ObservacaojScrollPane1;
    }

    public void setObservacaojScrollPane1(JScrollPane observacaojScrollPane1) {
        ObservacaojScrollPane1 = observacaojScrollPane1;
    }

    public JTextArea getObservacaojTextArea1() {
        return ObservacaojTextArea1;
    }

    public void setObservacaojTextArea1(JTextArea observacaojTextArea1) {
        ObservacaojTextArea1 = observacaojTextArea1;
    }

    public JComboBox<String> getServicojComboBox2() {
        return ServicojComboBox2;
    }

    public void setServicojComboBox2(JComboBox<String> servicojComboBox2) {
        ServicojComboBox2 = servicojComboBox2;
    }

    public JTextField getNomeClientejTextField1() {
        return NomeClientejTextField1;
    }

    public void setNomeClientejTextField1(JTextField NomeClientejTextField1) {
        this.NomeClientejTextField1 = NomeClientejTextField1;
    }

    private void iniciarServicos() {

        ArrayList<String> servicos = new ArrayList<>();

        for (EnumServico servico : EnumServico.values()) {
            servicos.add(servico.getDescricao());
        }

        for (String servico : servicos) {
            ServicojComboBox2.addItem(servico);
        }
    }

    public javax.swing.JFormattedTextField getDatajFormattedTextField2() {
        return DatajFormattedTextField2;
    }

    public void setDatajFormattedTextField2(javax.swing.JFormattedTextField DatajFormattedTextField2) {
        this.DatajFormattedTextField2 = DatajFormattedTextField2;
    }

    public javax.swing.JFormattedTextField getHorajFormattedTextField3() {
        return HorajFormattedTextField3;
    }

    public void setHorajFormattedTextField3(javax.swing.JFormattedTextField HorajFormattedTextField3) {
        this.HorajFormattedTextField3 = HorajFormattedTextField3;
    }

    public javax.swing.JFormattedTextField getValorjFormattedTextField1() {
        return ValorjFormattedTextField1;
    }

    public void setValorjFormattedTextField1(javax.swing.JFormattedTextField ValorjFormattedTextField1) {
        this.ValorjFormattedTextField1 = ValorjFormattedTextField1;
    }

    public JTable getTabelaAgendamentosjTable() {
        return TabelaAgendamentosjTable;
    }

    private String validarCamposObrigatórios() {

        String mensagem = null;

        if (Utilitarios.Validacao.isNullOrEmpty(this.NomeClientejTextField1.getText())) {
            mensagem = "Campo de nome do Cliente é obrigatório";
        } else if (Utilitarios.Validacao.onlyNumbers(this.ValorjFormattedTextField1.getText()).isEmpty()) {
            mensagem = "Campo de valor do serviço é obrigatório";
        } else if (Utilitarios.Validacao.onlyNumbers(this.DatajFormattedTextField2.getText()).isEmpty()) {
            mensagem = "Campo de data é obrigatório";
        } else if (Utilitarios.Validacao.onlyNumbers(this.HorajFormattedTextField3.getText()).isEmpty()) {
            mensagem = "Campo de horário é obrigatório";
        } else if (!Utilitarios.Validacao.validaData(Util.getDataFormatada(this.DatajFormattedTextField2.getText() + " " + this.HorajFormattedTextField3.getText()))) {
            mensagem = "Data inválida!";
        } else if (!Utilitarios.Validacao.validaData(this.DatajFormattedTextField2.getText())) {
            mensagem = "Data inválida!";
        } else if (!Utilitarios.Validacao.validaHorario(this.HorajFormattedTextField3.getText())) {
            mensagem = "Horário inválido!";
        }

        if (Utilitarios.Validacao.isNullOrEmpty(mensagem)) {
            return null;
        } else {
            return mensagem;
        }

    }

}
