/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetobd.Model.Historico_RN;
import projetobd.Model.Historico_VO;

/**
 *
 * @author uliss
 */
public class FHistorico extends javax.swing.JFrame {

    Historico_VO historicoVO;
    Historico_RN historicoRN;
    /**
     * Creates new form FHistorico
     */
    public FHistorico(){
        initComponents();
    }
    
    public FHistorico(Historico_VO vo) {
        initComponents();
        try {
            historicoVO = vo;
            historicoRN = new Historico_RN();
            
            this.jTFDisciplina.setText(historicoVO.getDisciplina());
            this.jTFNtFinal.setText(historicoVO.getNota_final());
            this.jTFSituacao.setText(historicoVO.getSituacao());
            this.jTFSituacao.setText(historicoVO.getSituacao());
            this.jTFGRR.setText(historicoVO.getFK_GRR());
            
        } catch (Exception e) {
            Logger.getLogger(FAluno.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTP = new javax.swing.JTabbedPane();
        jPanelInserir = new javax.swing.JPanel();
        jLDisciplina = new javax.swing.JLabel();
        jTFDisciplina = new javax.swing.JTextField();
        jLNtFinal = new javax.swing.JLabel();
        jTFNtFinal = new javax.swing.JTextField();
        jLSituacao = new javax.swing.JLabel();
        jTFSituacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFVzCursada = new javax.swing.JTextField();
        jLGRR = new javax.swing.JLabel();
        jTFGRR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBInserir = new javax.swing.JButton();
        jPanelEditar = new javax.swing.JPanel();
        jLDisciplina1 = new javax.swing.JLabel();
        jTFDisciplinaEdit = new javax.swing.JTextField();
        jLNtFinal1 = new javax.swing.JLabel();
        jTFNtFinalEdit = new javax.swing.JTextField();
        jLSituacao1 = new javax.swing.JLabel();
        jTFSituacaoEdit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFVzCursadaEdit = new javax.swing.JTextField();
        jLGRR1 = new javax.swing.JLabel();
        jTFGRREdit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBEditar = new javax.swing.JButton();
        jTFPkHistorico = new javax.swing.JTextField();
        jLPkHistorico = new javax.swing.JLabel();
        jPanelBuscar = new javax.swing.JPanel();
        jLPkHistoricoBuscar = new javax.swing.JLabel();
        jTFPkHistoricoBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTABuscar = new javax.swing.JTextArea();
        jPanelDeletar = new javax.swing.JPanel();
        jLPkHistoricoDeletar = new javax.swing.JLabel();
        jTFPkHistoricoDeletar = new javax.swing.JTextField();
        jBDeletar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTADeletar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLDisciplina.setText("Disciplina");

        jLNtFinal.setText("Nota Final");

        jLSituacao.setText("Situacao");

        jLabel4.setText("Vezes Cursada");

        jLGRR.setText("GRR");

        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInserirLayout = new javax.swing.GroupLayout(jPanelInserir);
        jPanelInserir.setLayout(jPanelInserirLayout);
        jPanelInserirLayout.setHorizontalGroup(
            jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBInserir)
                    .addComponent(jTFGRR)
                    .addComponent(jTFVzCursada)
                    .addComponent(jTFSituacao)
                    .addComponent(jTFNtFinal)
                    .addComponent(jTFDisciplina))
                .addContainerGap())
            .addGroup(jPanelInserirLayout.createSequentialGroup()
                .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInserirLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDisciplina)
                            .addComponent(jLNtFinal)
                            .addComponent(jLSituacao)
                            .addComponent(jLabel4)
                            .addComponent(jLGRR)))
                    .addGroup(jPanelInserirLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInserirLayout.setVerticalGroup(
            jPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLNtFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLSituacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFVzCursada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLGRR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFGRR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jBInserir)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTP.addTab("Inserir", jPanelInserir);

        jLDisciplina1.setText("Disciplina");

        jLNtFinal1.setText("Nota Final");

        jLSituacao1.setText("Situacao");

        jLabel5.setText("Vezes Cursada");

        jLGRR1.setText("GRR");

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jLPkHistorico.setText("ID");

        javax.swing.GroupLayout jPanelEditarLayout = new javax.swing.GroupLayout(jPanelEditar);
        jPanelEditar.setLayout(jPanelEditarLayout);
        jPanelEditarLayout.setHorizontalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTFPkHistorico)
                .addGap(10, 10, 10))
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBEditar)
                    .addComponent(jTFGRREdit))
                .addContainerGap())
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanelEditarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPkHistorico)
                            .addComponent(jLDisciplina1)
                            .addComponent(jLNtFinal1)
                            .addComponent(jLabel5)
                            .addComponent(jLSituacao1)
                            .addComponent(jLGRR1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFDisciplinaEdit)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFNtFinalEdit)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFSituacaoEdit)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFVzCursadaEdit)
                .addContainerGap())
        );
        jPanelEditarLayout.setVerticalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPkHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPkHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLDisciplina1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDisciplinaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLNtFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNtFinalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSituacao1)
                .addGap(3, 3, 3)
                .addGroup(jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEditarLayout.createSequentialGroup()
                        .addComponent(jTFSituacaoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVzCursadaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLGRR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFGRREdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEditar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTP.addTab("Editar", jPanelEditar);

        jLPkHistoricoBuscar.setText("ID");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTABuscar.setColumns(20);
        jTABuscar.setRows(5);
        jScrollPane1.setViewportView(jTABuscar);

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jBBuscar)
                            .addComponent(jTFPkHistoricoBuscar)))
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLPkHistoricoBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPkHistoricoBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPkHistoricoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBBuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTP.addTab("Buscar", jPanelBuscar);

        jLPkHistoricoDeletar.setText("ID");

        jBDeletar.setText("Deletar");
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });

        jTADeletar.setColumns(20);
        jTADeletar.setRows(5);
        jScrollPane2.setViewportView(jTADeletar);

        javax.swing.GroupLayout jPanelDeletarLayout = new javax.swing.GroupLayout(jPanelDeletar);
        jPanelDeletar.setLayout(jPanelDeletarLayout);
        jPanelDeletarLayout.setHorizontalGroup(
            jPanelDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeletarLayout.createSequentialGroup()
                .addGroup(jPanelDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDeletarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jBDeletar)
                            .addComponent(jTFPkHistoricoDeletar)))
                    .addGroup(jPanelDeletarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLPkHistoricoDeletar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelDeletarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDeletarLayout.setVerticalGroup(
            jPanelDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeletarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPkHistoricoDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPkHistoricoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBDeletar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTP.addTab("Deletar", jPanelDeletar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTP)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        try {
            historicoVO.setDisciplina(this.jTFDisciplina.getText());
            historicoVO.setNota_final(this.jTFNtFinal.getText());
            historicoVO.setSituacao(this.jTFSituacao.getText());
            historicoVO.setNum_vezes_cursado(this.jTFVzCursada.getText());
            historicoVO.setFK_GRR(this.jTFGRR.getText());
            
            if(historicoRN.inserirHistorico(historicoVO)){
                JOptionPane.showMessageDialog(null, "Historico inserido");
            }
            
        } catch (Exception e) {
            Logger.getLogger(FAluno.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
         try {
            historicoVO.setDisciplina(this.jTFDisciplinaEdit.getText());
            historicoVO.setNota_final(this.jTFNtFinalEdit.getText());
            historicoVO.setSituacao(this.jTFSituacaoEdit.getText());
            historicoVO.setNum_vezes_cursado(this.jTFVzCursadaEdit.getText());
            historicoVO.setFK_GRR(this.jTFGRREdit.getText());
            historicoVO.setPK_historico(this.jTFPkHistorico.getText());
            
            if(historicoRN.editarHistorico(historicoVO)){
                JOptionPane.showMessageDialog(null, "Historico Alterado");
            }
            
        } catch (Exception e) {
            Logger.getLogger(FAluno.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            
            historicoVO.setPK_historico(this.jTFPkHistoricoBuscar.getText());
            
            if(historicoRN.selectHistorico(historicoVO)){
                this.jTABuscar.setText("ID: " + historicoVO.getPK_hsitorico()
                                      +"Disciplina: " + historicoVO.getDisciplina()
                                      +"Nota Final: " + historicoVO.getNota_final()
                                      +"Situacao: " + historicoVO.getSituacao()
                                      +"Vezez Cursada: " + historicoVO.getNum_vezes_cursado()
                                      +"GRR: " + historicoVO.getFK_GRR());
            }
            
        } catch (Exception e) {
            Logger.getLogger(FAluno.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        try {
            
            historicoVO.setPK_historico(this.jTFPkHistoricoDeletar.getText());
            
            if(historicoRN.excluirHistorico(historicoVO)){
                this.jTABuscar.setText("O seguinte Historico foi excluido: \nID: " + historicoVO.getPK_hsitorico()
                                      +"Disciplina: " + historicoVO.getDisciplina()
                                      +"Nota Final: " + historicoVO.getNota_final()
                                      +"Situacao: " + historicoVO.getSituacao()
                                      +"Vezez Cursada: " + historicoVO.getNum_vezes_cursado()
                                      +"GRR: " + historicoVO.getFK_GRR());
            }
            
        } catch (Exception e) {
            Logger.getLogger(FAluno.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(FHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLDisciplina;
    private javax.swing.JLabel jLDisciplina1;
    private javax.swing.JLabel jLGRR;
    private javax.swing.JLabel jLGRR1;
    private javax.swing.JLabel jLNtFinal;
    private javax.swing.JLabel jLNtFinal1;
    private javax.swing.JLabel jLPkHistorico;
    private javax.swing.JLabel jLPkHistoricoBuscar;
    private javax.swing.JLabel jLPkHistoricoDeletar;
    private javax.swing.JLabel jLSituacao;
    private javax.swing.JLabel jLSituacao1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelDeletar;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelInserir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTABuscar;
    private javax.swing.JTextArea jTADeletar;
    private javax.swing.JTextField jTFDisciplina;
    private javax.swing.JTextField jTFDisciplinaEdit;
    private javax.swing.JTextField jTFGRR;
    private javax.swing.JTextField jTFGRREdit;
    private javax.swing.JTextField jTFNtFinal;
    private javax.swing.JTextField jTFNtFinalEdit;
    private javax.swing.JTextField jTFPkHistorico;
    private javax.swing.JTextField jTFPkHistoricoBuscar;
    private javax.swing.JTextField jTFPkHistoricoDeletar;
    private javax.swing.JTextField jTFSituacao;
    private javax.swing.JTextField jTFSituacaoEdit;
    private javax.swing.JTextField jTFVzCursada;
    private javax.swing.JTextField jTFVzCursadaEdit;
    private javax.swing.JTabbedPane jTP;
    // End of variables declaration//GEN-END:variables
}