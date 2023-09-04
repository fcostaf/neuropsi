/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuropsi.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import neuropsi.controller.CitacaoController;
import neuropsi.controller.SintomaController;
import neuropsi.dao.ExceptionDAO;
import neuropsi.model.Citacao;

/**
 *
 * @author 771000343
 */
public class Telatranstornos extends javax.swing.JFrame {

    /**
     * Creates new form telasintomas
     */
    public Telatranstornos() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFonte = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCitacao = new javax.swing.JTextArea();
        jButtonCadastrar1 = new javax.swing.JButton();
        jButtonLimpar1 = new javax.swing.JButton();
        jButtonBuscarCitacao = new javax.swing.JButton();
        jButtonAlterar1 = new javax.swing.JButton();
        jButtonExcluir1 = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jComboBoxTags = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNovaTag = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jLabelTags = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO SINTOMAS");

        jLabel2.setText("Sintoma:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

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

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonAlterar))
                        .addGap(67, 67, 67)))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(403, 403, 403))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)
                        .addContainerGap(170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonAlterar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(262, 262, 262))))
        );

        jTabbedPane1.addTab("Cadastro sintomas", jPanel1);

        jLabel4.setText("CITAÇÕES");

        jLabel5.setText("Fonte:");

        jLabel6.setText("Tags:");

        jLabel7.setText("Citação:");

        jTextAreaCitacao.setColumns(20);
        jTextAreaCitacao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCitacao);

        jButtonCadastrar1.setText("Cadastrar");
        jButtonCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar1ActionPerformed(evt);
            }
        });

        jButtonLimpar1.setText("Limpar");
        jButtonLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpar1ActionPerformed(evt);
            }
        });

        jButtonBuscarCitacao.setText("Buscar");
        jButtonBuscarCitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCitacaoActionPerformed(evt);
            }
        });

        jButtonAlterar1.setText("Alterar");
        jButtonAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterar1ActionPerformed(evt);
            }
        });

        jButtonExcluir1.setForeground(new java.awt.Color(204, 0, 51));
        jButtonExcluir1.setText("Excluir");
        jButtonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir1ActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabel8.setText("Nova tag:");

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonFechar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonLimpar1)
                                        .addGap(70, 70, 70)
                                        .addComponent(jButtonExcluir1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                        .addComponent(jButtonAlterar1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonCadastrar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonBuscarCitacao))
                                    .addComponent(jScrollPane2)
                                    .addComponent(jTextFieldFonte))))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(31, 31, 31)
                                        .addComponent(jComboBoxTags, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNovaTag)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAdicionar)
                                    .addComponent(jButtonIncluir)
                                    .addComponent(jButtonRemover)))
                            .addComponent(jLabelTags))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNovaTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButtonIncluir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTags)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar1)
                    .addComponent(jButtonBuscarCitacao))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpar1)
                    .addComponent(jButtonAlterar1)
                    .addComponent(jButtonExcluir1))
                .addGap(52, 52, 52)
                .addComponent(jButtonFechar)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Citações", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        SintomaController sc=new SintomaController();
        String nome=jTextFieldNome.getText();
        String descricao=jTextAreaDescricao.getText();
        try {
            sc.cadastrarSintoma(nome,descricao);
            JOptionPane.showMessageDialog(this, "Cadastrado!");
        } catch (ExceptionDAO ex) {
            Logger.getLogger(Telatranstornos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Telaconsultasintoma t=new Telaconsultasintoma();
        t.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        SintomaController sc=new SintomaController();
        int certeza=JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja alterar?","Confirmação",JOptionPane.YES_NO_OPTION);
        if(certeza==0){
            String idsintoma=neuropsi.Neuropsi.idsintoma;
            String nome=jTextFieldNome.getText();
            String descricao=jTextAreaDescricao.getText();
            try {
                sc.alterarSintoma(idsintoma,nome,descricao);
                JOptionPane.showMessageDialog(this, "Alterado!");
            } catch (ExceptionDAO ex) {
                Logger.getLogger(Telatranstornos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        SintomaController sc=new SintomaController();
        int certeza=JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja excluir?","Confirmação",JOptionPane.YES_NO_OPTION);
        if(certeza==0){
            try {
                sc.excluirSintoma(neuropsi.Neuropsi.idsintoma);
                JOptionPane.showMessageDialog(this, jTextFieldNome+" excluído!");
            } catch (ExceptionDAO ex) {
                Logger.getLogger(Telatranstornos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextAreaDescricao.setText("");

        jButtonCadastrar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar1ActionPerformed
        CitacaoController cc=new CitacaoController();
        String fonte=jTextFieldFonte.getText();
        ArrayList<String> listaTags=new ArrayList();
        for(String tag:jLabelTags.getText().split(",")){
            listaTags.add(tag);
        }
        //String filhos=String.valueOf(jComboBoxFilhos.getSelectedItem());
        String descricao=jTextAreaCitacao.getText();
        try {
            cc.cadastrarCitacao(fonte,descricao,listaTags);
            JOptionPane.showMessageDialog(this, "Cadastrado!");
        } catch (ExceptionDAO ex) {
            Logger.getLogger(Telatranstornos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Telatranstornos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCadastrar1ActionPerformed

    private void jButtonLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpar1ActionPerformed

    private void jButtonBuscarCitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCitacaoActionPerformed
        Telaconsultacitacao t=new Telaconsultacitacao();
        t.setVisible(true);
        CitacaoController cc=new CitacaoController();
        ArrayList<String> tags = null;
        try {
            tags = cc.listarTags();
        } catch (ExceptionDAO ex) {
            Logger.getLogger(Telatranstornos.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(String tag:tags){
            t.getjComboBoxTagConsulta().addItem(tag);
        }
        
        try{
            DefaultTableModel tableModel=(DefaultTableModel)t.getjTableConsultaCitacao().getModel();
            
            //CitacaoController cc=new CitacaoController();
            ArrayList<Citacao> listaCitacao=cc.listarCitacao();
            
            Iterator<Citacao> iterator=listaCitacao.iterator();
            while(iterator.hasNext()){
                Citacao c=iterator.next();
                tableModel.addRow(new Object[]{c.getIdcitacao(),c.getFonte(),c.getDescricao()});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }
    }//GEN-LAST:event_jButtonBuscarCitacaoActionPerformed

    private void jButtonAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterar1ActionPerformed

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFecharActionPerformed
    Collection <String> tags=new ArrayList();
    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        if(tags.contains(jTextFieldNovaTag.getText())){
            JOptionPane.showMessageDialog(rootPane, "Tag já cadastrada");
        }else{
            tags.add(jTextFieldNovaTag.getText());
            jComboBoxTags.addItem(jTextFieldNovaTag.getText());
            jTextFieldNovaTag.setText("");
            String listaTags="";
            for(String tag:tags){
                listaTags+=tag+",";
            }
            if(tags.size()>=1){
                jLabelTags.setText(listaTags.substring(0, listaTags.length()-1));
            }else{
                jLabelTags.setText("");
            }
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed
    
    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        if(tags.contains((String)jComboBoxTags.getSelectedItem())){
            JOptionPane.showMessageDialog(rootPane, "Tag já cadastrada");
        }else{
            tags.add((String)jComboBoxTags.getSelectedItem());
            String listaTags="";
            for(String tag:tags){
                listaTags+=tag+",";
            }
            if(tags.size()>=1){
                jLabelTags.setText(listaTags.substring(0, listaTags.length()-1));
            }else{
                jLabelTags.setText("");
            }
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        if(tags.contains((String)jComboBoxTags.getSelectedItem())){
            tags.remove((String)jComboBoxTags.getSelectedItem());
            String listaTags="";
            for(String tag:tags){
                listaTags+=tag+",";
            }
            if(tags.size()>=1){
                jLabelTags.setText(listaTags.substring(0, listaTags.length()-1));
            }else{
                jLabelTags.setText("");
            }
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(Telatranstornos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telatranstornos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telatranstornos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telatranstornos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telatranstornos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAlterar1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarCitacao;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCadastrar1;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonExcluir1;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLimpar1;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<String> jComboBoxTags;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTags;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaCitacao;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldFonte;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNovaTag;
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

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
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

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTextArea getjTextAreaDescricao() {
        return jTextAreaDescricao;
    }

    public void setjTextAreaDescricao(JTextArea jTextAreaDescricao) {
        this.jTextAreaDescricao = jTextAreaDescricao;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButtonFechar;
    }

    public void setjButton2(JButton jButton2) {
        this.jButtonFechar = jButton2;
    }

    public JButton getjButtonAdicionar() {
        return jButtonAdicionar;
    }

    public void setjButtonAdicionar(JButton jButtonAdicionar) {
        this.jButtonAdicionar = jButtonAdicionar;
    }

    public JButton getjButtonAlterar1() {
        return jButtonAlterar1;
    }

    public void setjButtonAlterar1(JButton jButtonAlterar1) {
        this.jButtonAlterar1 = jButtonAlterar1;
    }

    public JButton getjButtonBuscar1() {
        return jButtonBuscarCitacao;
    }

    public void setjButtonBuscar1(JButton jButtonBuscar1) {
        this.jButtonBuscarCitacao = jButtonBuscar1;
    }

    public JButton getjButtonCadastrar1() {
        return jButtonCadastrar1;
    }

    public void setjButtonCadastrar1(JButton jButtonCadastrar1) {
        this.jButtonCadastrar1 = jButtonCadastrar1;
    }

    public JButton getjButtonExcluir1() {
        return jButtonExcluir1;
    }

    public void setjButtonExcluir1(JButton jButtonExcluir1) {
        this.jButtonExcluir1 = jButtonExcluir1;
    }

    public JButton getjButtonLimpar1() {
        return jButtonLimpar1;
    }

    public void setjButtonLimpar1(JButton jButtonLimpar1) {
        this.jButtonLimpar1 = jButtonLimpar1;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBoxTags;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBoxTags = jComboBox1;
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

    public JLabel getjLabelTags() {
        return jLabelTags;
    }

    public void setjLabelTags(JLabel jLabelTags) {
        this.jLabelTags = jLabelTags;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextArea getjTextAreaCitacao() {
        return jTextAreaCitacao;
    }

    public void setjTextAreaCitacao(JTextArea jTextAreaCitacao) {
        this.jTextAreaCitacao = jTextAreaCitacao;
    }

    public JTextField getjTextFieldFonte() {
        return jTextFieldFonte;
    }

    public void setjTextFieldFonte(JTextField jTextFieldFonte) {
        this.jTextFieldFonte = jTextFieldFonte;
    }

    public JTextField getjTextFieldNovaTag() {
        return jTextFieldNovaTag;
    }

    public void setjTextFieldNovaTag(JTextField jTextFieldNovaTag) {
        this.jTextFieldNovaTag = jTextFieldNovaTag;
    }
    
    public void selecionaDadosSintomas(){
        getjTextFieldNome().setText(neuropsi.Neuropsi.nome);
        getjTextAreaDescricao().setText(neuropsi.Neuropsi.descricao);
    }


}
