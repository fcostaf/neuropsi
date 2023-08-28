/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.view;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import neuropsi.controller.PacienteController;
import neuropsi.model.Paciente;

/**
 *
 * @author 771000343
 */
public class telaconsulta extends javax.swing.JFrame {

    /**
     * Creates new form telainicio
     */
    public telaconsulta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaPaciente = new javax.swing.JTable();
        btBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableConsultaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idpaciente", "Nome", "Sexo", "Lateralidade", "DN", "LN", "Escolaridade", "Curso", "Profissao", "Estado_Civil", "Filhos", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaPaciente);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String nome=jTextFieldBuscar.getText();
        try{
            DefaultTableModel tableModel=(DefaultTableModel)jTableConsultaPaciente.getModel();
            
            PacienteController pc=new PacienteController();
            ArrayList<Paciente> listaPaciente=pc.listarPaciente(nome);
            
            Iterator<Paciente> iterator=listaPaciente.iterator();
            while(iterator.hasNext()){
                Paciente p=iterator.next();
                tableModel.addRow(new Object[]{p.getIdpaciente(),p.getNome(),p.getSexo(),p.getLateralidade(),p.getDn(),p.getLn(),p.getEscolaridade(),p.getCurso(),p.getProfissao(),p.getEstado_civil(),p.getFilhos(),p.getComentario()});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jTableConsultaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaPacienteMouseClicked
        if(evt.getClickCount()==2){
            String idpaciente=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),0);
            String nome=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),1);
            String sexo=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),2);
            String lateralidade=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),3);
            String dn=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),4);
            String ln=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),5);
            String escolaridade=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),6);
            String curso=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),7);
            String profissao=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),8);
            String estado_civil=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),9);
            String filhos=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),10);
            String comentario=(String)jTableConsultaPaciente.getModel().getValueAt(jTableConsultaPaciente.getSelectedRow(),11);
            
            telacadastropacientes t=new telacadastropacientes();
            
            t.setVisible(true);
        }
    }//GEN-LAST:event_jTableConsultaPacienteMouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(telaconsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaconsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaconsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaconsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaconsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaPaciente;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
