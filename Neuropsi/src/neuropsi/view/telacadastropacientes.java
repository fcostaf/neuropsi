/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neuropsi.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import neuropsi.controller.PacienteController;
import neuropsi.dao.ExceptionDAO;
import neuropsi.Neuropsi;

/**
 *
 * @author fcost
 */
public class telacadastropacientes extends javax.swing.JFrame {

    public telacadastropacientes() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jComboBoxLateralidade = new javax.swing.JComboBox<>();
        jTextFieldDn = new javax.swing.JTextField();
        jComboBoxEscolaridade1 = new javax.swing.JComboBox<>();
        jTextFieldCurso = new javax.swing.JTextField();
        jTextFieldProfissao = new javax.swing.JTextField();
        jComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxFilhos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldLn = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jComboBoxDiaDn = new javax.swing.JComboBox<>();
        jComboBoxMesDn = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO PACIENTES");

        jLabel2.setText("Nome:");

        jLabel3.setText("Estado civil:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Lateralidade:");

        jLabel6.setText("DN:");

        jLabel7.setText("Escolaridade:");

        jLabel8.setText("Curso:");

        jLabel9.setText("Profissão:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jComboBoxLateralidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destro", "Canhoto", "Ambidestro" }));
        jComboBoxLateralidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLateralidadeActionPerformed(evt);
            }
        });

        jComboBoxEscolaridade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensino Fundamental", "Ensino Médio", "Ensino Técnico", "Ensino Superior", "Mestrado", "Doutorado", "Pós-Doutorado" }));

        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Namorando(a)", "Relacionamento estável", "Casado(a)", "Separado(a)", "Viúvo(a)" }));

        jLabel10.setText("Filhos:");

        jComboBoxFilhos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel11.setText("COMENTÁRIO");

        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setRows(5);
        jScrollPane1.setViewportView(jTextAreaComentario);

        jLabel12.setText("LN:");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setForeground(new java.awt.Color(204, 0, 51));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jComboBoxDiaDn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxMesDn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxDiaDn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jComboBoxMesDn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxLateralidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBoxEscolaridade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(77, 399, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCadastrar)
                                    .addComponent(jButtonLimpar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAlterar)
                                    .addComponent(jButtonBuscar))
                                .addGap(26, 26, 26)
                                .addComponent(jButtonExcluir)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxLateralidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldDn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDiaDn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMesDn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldLn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEscolaridade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscar)
                            .addComponent(jButtonCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonAlterar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButtonExcluir)))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxLateralidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLateralidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLateralidadeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        PacienteController p=new PacienteController();
        String nome=jTextFieldNome.getText();
        String sexo=String.valueOf(jComboBoxSexo.getSelectedItem());
        String lateralidade=String.valueOf(jComboBoxLateralidade.getSelectedItem());
        String dn=jTextFieldDn.getText()+"-"+jComboBoxMesDn.getSelectedItem()+"-"+jComboBoxDiaDn.getSelectedItem();
        String ln=jTextFieldLn.getText();
        String escolaridade=String.valueOf(jComboBoxEscolaridade1.getSelectedItem());//+":"+String.valueOf(jComboBoxEscolaridade2.getSelectedItem());
        String curso=jTextFieldCurso.getText();
        String profissao=jTextFieldProfissao.getText();
        String estado_civil=String.valueOf(jComboBoxEstadoCivil.getSelectedItem());
        String filhos=String.valueOf(jComboBoxFilhos.getSelectedItem());
        String comentario=jTextAreaComentario.getText();
        try {
            p.cadastrarPaciente(nome, sexo, lateralidade, dn, ln, escolaridade, curso, profissao, estado_civil, filhos,comentario);
            JOptionPane.showMessageDialog(this, "Cadastrado!");
        } catch (ExceptionDAO ex) {
            Logger.getLogger(telacadastropacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        telaconsulta t=new telaconsulta();
        t.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        PacienteController p=new PacienteController();
        String idpaciente=neuropsi.Neuropsi.idpaciente;
        String nome=jTextFieldNome.getText();
        String sexo=String.valueOf(jComboBoxSexo.getSelectedItem());
        String lateralidade=String.valueOf(jComboBoxLateralidade.getSelectedItem());
        String dn=jTextFieldDn.getText()+"-"+jComboBoxMesDn.getSelectedItem()+"-"+jComboBoxDiaDn.getSelectedItem();
        String ln=jTextFieldLn.getText();
        String escolaridade=String.valueOf(jComboBoxEscolaridade1.getSelectedItem());//+":"+String.valueOf(jComboBoxEscolaridade2.getSelectedItem());
        String curso=jTextFieldCurso.getText();
        String profissao=jTextFieldProfissao.getText();
        String estado_civil=String.valueOf(jComboBoxEstadoCivil.getSelectedItem());
        String filhos=String.valueOf(jComboBoxFilhos.getSelectedItem());
        String comentario=jTextAreaComentario.getText();
        try {
            p.alterarPaciente(idpaciente,nome, sexo, lateralidade, dn, ln, escolaridade, curso, profissao, estado_civil, filhos,comentario);
            JOptionPane.showMessageDialog(this, "Alterado!");
        } catch (ExceptionDAO ex) {
            Logger.getLogger(telacadastropacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        PacienteController p=new PacienteController();
        try {
            p.excluirPaciente(neuropsi.Neuropsi.idpaciente);
            JOptionPane.showMessageDialog(this, jTextFieldNome+" excluído!");
        } catch (ExceptionDAO ex) {
            Logger.getLogger(telacadastropacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextAreaComentario.setText("");
        jTextFieldCurso.setText("");
        jTextFieldDn.setText("");
        jTextFieldLn.setText("");
        jTextFieldProfissao.setText("");
        
        jComboBoxEscolaridade1.setSelectedIndex(0);
        jComboBoxEstadoCivil.setSelectedIndex(0);
        jComboBoxFilhos.setSelectedIndex(0);
        jComboBoxLateralidade.setSelectedIndex(0);
        jComboBoxSexo.setSelectedIndex(0);
        jComboBoxDiaDn.setSelectedIndex(0);
        jComboBoxMesDn.setSelectedIndex(0);
        
        jButtonCadastrar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(telacadastropacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telacadastropacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telacadastropacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telacadastropacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telacadastropacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboBoxDiaDn;
    private javax.swing.JComboBox<String> jComboBoxEscolaridade1;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> jComboBoxFilhos;
    private javax.swing.JComboBox<String> jComboBoxLateralidade;
    private javax.swing.JComboBox<String> jComboBoxMesDn;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaComentario;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldDn;
    private javax.swing.JTextField jTextFieldLn;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldProfissao;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonAlterar() {
        return jButtonAlterar;
    }

    public void setjButtonAlterar(JButton jButtonAlterar) {
        this.jButtonAlterar = jButtonAlterar;
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
    }

    public JButton getjButtonCadastrar() {
        return jButtonCadastrar;
    }

    public void setjButtonCadastrar(JButton jButtonCadastrar) {
        this.jButtonCadastrar = jButtonCadastrar;
    }

    public JButton getjButtonExcluir() {
        return jButtonExcluir;
    }

    public void setjButtonExcluir(JButton jButtonExcluir) {
        this.jButtonExcluir = jButtonExcluir;
    }

    public JButton getjButtonLimpar() {
        return jButtonLimpar;
    }

    public void setjButtonLimpar(JButton jButtonLimpar) {
        this.jButtonLimpar = jButtonLimpar;
    }

    public JComboBox<String> getjComboBoxDiaDn() {
        return jComboBoxDiaDn;
    }

    public void setjComboBoxDiaDn(JComboBox<String> jComboBoxDiaDn) {
        this.jComboBoxDiaDn = jComboBoxDiaDn;
    }

    public JComboBox<String> getjComboBoxEscolaridade1() {
        return jComboBoxEscolaridade1;
    }

    public void setjComboBoxEscolaridade1(JComboBox<String> jComboBoxEscolaridade1) {
        this.jComboBoxEscolaridade1 = jComboBoxEscolaridade1;
    }

    public JComboBox<String> getjComboBoxEstadoCivil() {
        return jComboBoxEstadoCivil;
    }

    public void setjComboBoxEstadoCivil(JComboBox<String> jComboBoxEstadoCivil) {
        this.jComboBoxEstadoCivil = jComboBoxEstadoCivil;
    }

    public JComboBox<String> getjComboBoxFilhos() {
        return jComboBoxFilhos;
    }

    public void setjComboBoxFilhos(JComboBox<String> jComboBoxFilhos) {
        this.jComboBoxFilhos = jComboBoxFilhos;
    }

    public JComboBox<String> getjComboBoxLateralidade() {
        return jComboBoxLateralidade;
    }

    public void setjComboBoxLateralidade(JComboBox<String> jComboBoxLateralidade) {
        this.jComboBoxLateralidade = jComboBoxLateralidade;
    }

    public JComboBox<String> getjComboBoxMesDn() {
        return jComboBoxMesDn;
    }

    public void setjComboBoxMesDn(JComboBox<String> jComboBoxMesDn) {
        this.jComboBoxMesDn = jComboBoxMesDn;
    }

    public JComboBox<String> getjComboBoxSexo() {
        return jComboBoxSexo;
    }

    public void setjComboBoxSexo(JComboBox<String> jComboBoxSexo) {
        this.jComboBoxSexo = jComboBoxSexo;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextAreaComentario() {
        return jTextAreaComentario;
    }

    public void setjTextAreaComentario(JTextArea jTextAreaComentario) {
        this.jTextAreaComentario = jTextAreaComentario;
    }

    public JTextField getjTextFieldCurso() {
        return jTextFieldCurso;
    }

    public void setjTextFieldCurso(JTextField jTextFieldCurso) {
        this.jTextFieldCurso = jTextFieldCurso;
    }

    public JTextField getjTextFieldDn() {
        return jTextFieldDn;
    }

    public void setjTextFieldDn(JTextField jTextFieldDn) {
        this.jTextFieldDn = jTextFieldDn;
    }

    public JTextField getjTextFieldLn() {
        return jTextFieldLn;
    }

    public void setjTextFieldLn(JTextField jTextFieldLn) {
        this.jTextFieldLn = jTextFieldLn;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldProfissao() {
        return jTextFieldProfissao;
    }

    public void setjTextFieldProfissao(JTextField jTextFieldProfissao) {
        this.jTextFieldProfissao = jTextFieldProfissao;
    }
    
    public void selecionaDados(){
        getjTextFieldNome().setText(neuropsi.Neuropsi.nome);
        getjTextAreaComentario().setText(neuropsi.Neuropsi.comentario);
        getjTextFieldCurso().setText(neuropsi.Neuropsi.curso);
        getjTextFieldDn().setText(neuropsi.Neuropsi.dn.substring(0,4));
        getjTextFieldLn().setText(neuropsi.Neuropsi.ln);
        getjTextFieldProfissao().setText(neuropsi.Neuropsi.profissao);
        
        getjComboBoxEscolaridade1().setSelectedItem(neuropsi.Neuropsi.escolaridade);
        getjComboBoxEstadoCivil().setSelectedItem(neuropsi.Neuropsi.estado_civil);
        getjComboBoxFilhos().setSelectedItem(neuropsi.Neuropsi.filhos);
        getjComboBoxLateralidade().setSelectedItem(neuropsi.Neuropsi.lateralidade);
        getjComboBoxSexo().setSelectedItem(neuropsi.Neuropsi.sexo);
        getjComboBoxMesDn().setSelectedItem(neuropsi.Neuropsi.dn.substring(5,7));
        getjComboBoxDiaDn().setSelectedItem(neuropsi.Neuropsi.dn.substring(8,10));
    }
}
