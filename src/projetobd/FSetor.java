/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetobd.Model.Setor_RN;
import projetobd.Model.Setor_VO;

/**
 *
 * @author uliss
 */
public class FSetor extends javax.swing.JFrame {

    Setor_RN setorRN;
    Setor_VO setorVO;
    
    /**
     * Creates new form FSetor
     */
    public FSetor() {
        setorRN = new Setor_RN();
        setorVO = new Setor_VO();
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
        jLabel5 = new javax.swing.JLabel();
        jTFPkIdSetor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFFkUni = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFPkIdSetorEdit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFNewPkIdSetorEdit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFNomeEdit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFFkUniEdit = new javax.swing.JTextField();
        jBEditar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTFPkIdSetorBuscar = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTABuscar = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTFPkIdSetorExcluir = new javax.swing.JTextField();
        jBExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAExcluir = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Setor");

        jLabel5.setText("ID");

        jLabel7.setText("Nome");

        jLabel8.setText("ID da universidade");

        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTFPkIdSetor)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(430, 430, 430))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBInserir, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTFFkUni, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTFNome, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(341, 341, 341)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPkIdSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFFkUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBInserir)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inserir", jPanel1);

        jLabel1.setText("ID");

        jLabel2.setText("New ID");

        jLabel3.setText("Nome");

        jLabel4.setText("ID da universidade");

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBEditar)
                    .addComponent(jTFFkUniEdit)
                    .addComponent(jTFNomeEdit)
                    .addComponent(jTFNewPkIdSetorEdit))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTFPkIdSetorEdit)
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(351, 351, 351))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPkIdSetorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNewPkIdSetorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFFkUniEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBEditar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar", jPanel2);

        jLabel6.setText("ID");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTABuscar.setColumns(20);
        jTABuscar.setRows(5);
        jScrollPane1.setViewportView(jTABuscar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jBbuscar)
                            .addComponent(jTFPkIdSetorBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPkIdSetorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel3);

        jLabel9.setText("ID");

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jTAExcluir.setColumns(20);
        jTAExcluir.setRows(5);
        jScrollPane2.setViewportView(jTAExcluir);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jBExcluir)
                            .addComponent(jTFPkIdSetorExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPkIdSetorExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Excluir", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        try {
            setorVO.setPKIdSetor(jTFPkIdSetor.getText());
            setorVO.setNome(jTFNome.getText());
            setorVO.setFkUni(jTFFkUni.getText());
            
            if (setorRN.inserirSetor(setorVO)) {
                
                jTFPkIdSetorEdit.setText(setorVO.getPKIdSetor());
                jTFNomeEdit.setText(setorVO.getNome());
                jTFFkUniEdit.setText(setorVO.getFkUni());
                jTFPkIdSetorBuscar.setText(setorVO.getPKIdSetor());
                jTFPkIdSetorExcluir.setText(setorVO.getPKIdSetor());
                
                JOptionPane.showMessageDialog(null, "setor Inserido");
            }
        } catch (ParseException ex) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        try {
            setorVO.setPKIdSetor(jTFPkIdSetorEdit.getText());
            setorVO.setNewPkIdSetor(jTFNewPkIdSetorEdit.getText());
            setorVO.setNome(jTFNomeEdit.getText());
            setorVO.setFkUni(jTFFkUniEdit.getText());
            
            if (setorRN.editarSetor(setorVO)) {
                
                jTFPkIdSetor.setText(setorVO.getPKIdSetor());
                jTFNome.setText(setorVO.getNome());
                jTFFkUni.setText(setorVO.getFkUni());
                jTFPkIdSetorBuscar.setText(setorVO.getPKIdSetor());
                jTFPkIdSetorExcluir.setText(setorVO.getPKIdSetor());
                
                JOptionPane.showMessageDialog(null, "Setor editado");
            }
        } catch (ParseException ex) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        try {
            setorVO.setPKIdSetor(jTFPkIdSetorBuscar.getText());
            
            if (setorRN.selectSetor(setorVO)) {
                
                jTABuscar.setText("ID: " + setorVO.getPKIdSetor()
                + "\nNome: " + setorVO.getNome()
                + "\nID da universidade: " + setorVO.getFkUni()); 
                
                jTFPkIdSetorEdit.setText(setorVO.getPKIdSetor());
                jTFNomeEdit.setText(setorVO.getNome());
                jTFFkUniEdit.setText(setorVO.getFkUni());
                jTFPkIdSetor.setText(setorVO.getPKIdSetor());
                jTFNome.setText(setorVO.getNome());
                jTFFkUni.setText(setorVO.getFkUni());
                jTFPkIdSetorExcluir.setText(setorVO.getPKIdSetor());
            }
        } catch (ParseException ex) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            setorVO.setPKIdSetor(jTFPkIdSetorExcluir.getText());
            
            if (setorRN.excluirSetor(setorVO)) {
                
                jTAExcluir.setText("Setor excluido: \nID: " + setorVO.getPKIdSetor()
                + "\nNome: " + setorVO.getNome()
                + "\nID da universidade: " + setorVO.getFkUni()); 
                
                jTFPkIdSetorEdit.setText(setorVO.getPKIdSetor());
                jTFNomeEdit.setText(setorVO.getNome());
                jTFFkUniEdit.setText(setorVO.getFkUni());
                jTFPkIdSetor.setText(setorVO.getPKIdSetor());
                jTFNome.setText(setorVO.getNome());
                jTFFkUni.setText(setorVO.getFkUni());
                jTFPkIdSetorBuscar.setText(setorVO.getPKIdSetor());
            }
        } catch (ParseException ex) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FSetor.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FSetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTABuscar;
    private javax.swing.JTextArea jTAExcluir;
    private javax.swing.JTextField jTFFkUni;
    private javax.swing.JTextField jTFFkUniEdit;
    private javax.swing.JTextField jTFNewPkIdSetorEdit;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNomeEdit;
    private javax.swing.JTextField jTFPkIdSetor;
    private javax.swing.JTextField jTFPkIdSetorBuscar;
    private javax.swing.JTextField jTFPkIdSetorEdit;
    private javax.swing.JTextField jTFPkIdSetorExcluir;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
