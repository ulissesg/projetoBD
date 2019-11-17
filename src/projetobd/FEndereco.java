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
import projetobd.Model.Endereco_RN;
import projetobd.Model.Endereco_VO;

/**
 *
 * @author uliss
 */
public class FEndereco extends javax.swing.JFrame {
    
    Endereco_RN enderecoRN;
    Endereco_VO enderecoVO;

    /**
     * Creates new form FEndereco
     */
    public FEndereco() {
        
        enderecoVO = new Endereco_VO();
        enderecoRN = new Endereco_RN();
        initComponents();
    }
    
    public FEndereco(Endereco_VO end){
        initComponents();
        try {
            enderecoVO = end;
            enderecoRN = new Endereco_RN();
            
            this.jTFPKEndereco.setText(enderecoVO.getPKEndereco());
            this.jTFCep.setText(enderecoVO.getCep());
            this.jTFPais.setText(enderecoVO.getPais());
            this.jTFCidade.setText(enderecoVO.getCidade());
            this.jTFRua.setText(enderecoVO.getRua());
            this.jTFNum.setText(enderecoVO.getNumero());
            this.jTFComplemento.setText(enderecoVO.getComplemento());
            this.jTFGrr.setText(enderecoVO.getFKGrr());
            
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTFGrr = new javax.swing.JTextField();
        jTFPais = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTFRua = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTFNum = new javax.swing.JTextField();
        jTFPKEndereco = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTFComplemento = new javax.swing.JTextField();
        jTFCep = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTFGrrEdit = new javax.swing.JTextField();
        jTFPaisEdit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFNewPkEnderecp = new javax.swing.JTextField();
        jTFCidadeEdit = new javax.swing.JTextField();
        jBEditar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTFRuaEdit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFNumEdit = new javax.swing.JTextField();
        jTFPKEnderecoEdit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTFComplementoEdit = new javax.swing.JTextField();
        jTFCepEdit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTFPKEnderecoBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTABuscar = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTFPKEnderecoExcluir = new javax.swing.JTextField();
        jBExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAExcluir = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Endereco");

        jLabel20.setText("Cidade");

        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jLabel21.setText("Rua");

        jLabel22.setText("Numero");

        jLabel23.setText("ID");

        jLabel24.setText("Complemento");

        jLabel25.setText("CEP");

        jLabel26.setText("GRR");

        jLabel27.setText("Pais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23)
                        .addGap(0, 290, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPKEndereco, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFGrr, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jBInserir, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFComplemento, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFNum, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFRua, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFCidade, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFPais, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFCep, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPKEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFGrr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBInserir)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inserir", jPanel1);

        jLabel10.setText("Novo ID (repitir se inalterado)");

        jLabel11.setText("Cidade");

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jLabel12.setText("Rua");

        jLabel13.setText("Numero");

        jLabel14.setText("ID");

        jLabel15.setText("Complemento");

        jLabel16.setText("CEP");

        jLabel17.setText("GRR");

        jLabel18.setText("Pais");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNewPkEnderecp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFPKEnderecoEdit, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFGrrEdit, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jBEditar, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFComplementoEdit, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFNumEdit, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFRuaEdit, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFCidadeEdit, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFPaisEdit, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFCepEdit, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPKEnderecoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNewPkEnderecp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCepEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFPaisEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCidadeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFRuaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNumEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFComplementoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFGrrEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEditar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar", jPanel2);

        jLabel28.setText("ID");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
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
                            .addComponent(jBBuscar)
                            .addComponent(jTFPKEnderecoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel28)
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
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPKEnderecoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel3);

        jLabel29.setText("ID");

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
                            .addComponent(jTFPKEnderecoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel29)
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
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPKEnderecoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
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

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        try {
            enderecoVO.setPKEndereco(this.jTFPKEnderecoEdit.getText());
            enderecoVO.setCep(this.jTFCepEdit.getText());
            enderecoVO.setPais(this.jTFPaisEdit.getText());
            enderecoVO.setCidade(this.jTFCidadeEdit.getText());
            enderecoVO.setRua(this.jTFRuaEdit.getText());
            enderecoVO.setNumero(this.jTFNumEdit.getText());
            enderecoVO.setComplemento(this.jTFComplementoEdit.getText());
            enderecoVO.setFKGrr(this.jTFGrrEdit.getText());
            enderecoVO.setNewPKEndereco(this.jTFNewPkEnderecp.getText());
            
            if(enderecoRN.editarEndereco(enderecoVO)){
                
                this.jTFPKEndereco.setText(enderecoVO.getPKEndereco());
                this.jTFCep.setText(enderecoVO.getCep());
                this.jTFPais.setText(enderecoVO.getPais());
                this.jTFCidade.setText(enderecoVO.getCidade());
                this.jTFRua.setText(enderecoVO.getRua());
                this.jTFNum.setText(enderecoVO.getNumero());
                this.jTFComplemento.setText(enderecoVO.getComplemento());
                this.jTFGrr.setText(enderecoVO.getFKGrr());
                this.jTFPKEnderecoBuscar.setText(enderecoVO.getPKEndereco());
                this.jTFPKEnderecoExcluir.setText(enderecoVO.getPKEndereco());
                
                JOptionPane.showMessageDialog(null, "Endereco editado");
            }
            
        }  catch (ParseException ex) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        try {
            enderecoVO.setPKEndereco(this.jTFPKEndereco.getText());
            enderecoVO.setCep(this.jTFCep.getText());
            enderecoVO.setPais(this.jTFPais.getText());
            enderecoVO.setCidade(this.jTFCidade.getText());
            enderecoVO.setRua(this.jTFRua.getText());
            enderecoVO.setNumero(this.jTFNum.getText());
            enderecoVO.setComplemento(this.jTFComplemento.getText());
            enderecoVO.setFKGrr(this.jTFGrr.getText());
            
            if(enderecoRN.inserirEndereco(enderecoVO)){
                
                this.jTFPKEnderecoEdit.setText(enderecoVO.getPKEndereco());
                this.jTFCepEdit.setText(enderecoVO.getCep());
                this.jTFPaisEdit.setText(enderecoVO.getPais());
                this.jTFCidadeEdit.setText(enderecoVO.getCidade());
                this.jTFRuaEdit.setText(enderecoVO.getRua());
                this.jTFNumEdit.setText(enderecoVO.getNumero());
                this.jTFComplementoEdit.setText(enderecoVO.getComplemento());
                this.jTFGrrEdit.setText(enderecoVO.getFKGrr());
                this.jTFPKEnderecoBuscar.setText(enderecoVO.getPKEndereco());
                this.jTFPKEnderecoExcluir.setText(enderecoVO.getPKEndereco());
                
                JOptionPane.showMessageDialog(null, "Endereco incluido");
            }
            
        }  catch (ParseException ex) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            enderecoVO.setPKEndereco(this.jTFPKEnderecoBuscar.getText());
                      
            if(enderecoRN.buscarEndereco(enderecoVO)){
                
                jTABuscar.setText("ID: " + enderecoVO.getPKEndereco()+
                        "\nCEP: " + enderecoVO.getCep() + 
                        "\nPais: " + enderecoVO.getPais() + 
                        "\nCidade: " + enderecoVO.getCidade() + 
                        "\nRua: " + enderecoVO.getRua() + 
                        "\nNumero: " + enderecoVO.getNumero() + 
                        "\nComplemento: " + enderecoVO.getComplemento() + 
                        "\nGRR: " + enderecoVO.getFKGrr());
                
                this.jTFPKEndereco.setText(enderecoVO.getPKEndereco());
                this.jTFCep.setText(enderecoVO.getCep());
                this.jTFPais.setText(enderecoVO.getPais());
                this.jTFCidade.setText(enderecoVO.getCidade());
                this.jTFRua.setText(enderecoVO.getRua());
                this.jTFNum.setText(enderecoVO.getNumero());
                this.jTFComplemento.setText(enderecoVO.getComplemento());
                this.jTFGrr.setText(enderecoVO.getFKGrr());
                this.jTFPKEnderecoEdit.setText(enderecoVO.getPKEndereco());
                this.jTFCepEdit.setText(enderecoVO.getCep());
                this.jTFPaisEdit.setText(enderecoVO.getPais());
                this.jTFCidadeEdit.setText(enderecoVO.getCidade());
                this.jTFRuaEdit.setText(enderecoVO.getRua());
                this.jTFNumEdit.setText(enderecoVO.getNumero());
                this.jTFComplementoEdit.setText(enderecoVO.getComplemento());
                this.jTFGrrEdit.setText(enderecoVO.getFKGrr());
                this.jTFPKEnderecoExcluir.setText(enderecoVO.getPKEndereco());
                
            }
            
        }  catch (ParseException ex) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            enderecoVO.setPKEndereco(this.jTFPKEnderecoExcluir.getText());
                      
            if(enderecoRN.excluirEndereco(enderecoVO)){
                
                jTAExcluir.setText("O seguinte endereco foi excluido:\nID: " + enderecoVO.getPKEndereco()+
                        "\nCEP: " + enderecoVO.getCep() + 
                        "\nPais: " + enderecoVO.getPais() + 
                        "\nCidade: " + enderecoVO.getCidade() + 
                        "\nRua: " + enderecoVO.getRua() + 
                        "\nNumero: " + enderecoVO.getNumero() + 
                        "\nComplemento: " + enderecoVO.getComplemento() + 
                        "\nGRR: " + enderecoVO.getFKGrr());
                
                this.jTFPKEndereco.setText(enderecoVO.getPKEndereco());
                this.jTFCep.setText(enderecoVO.getCep());
                this.jTFPais.setText(enderecoVO.getPais());
                this.jTFCidade.setText(enderecoVO.getCidade());
                this.jTFRua.setText(enderecoVO.getRua());
                this.jTFNum.setText(enderecoVO.getNumero());
                this.jTFComplemento.setText(enderecoVO.getComplemento());
                this.jTFGrr.setText(enderecoVO.getFKGrr());
                this.jTFPKEnderecoEdit.setText(enderecoVO.getPKEndereco());
                this.jTFCepEdit.setText(enderecoVO.getCep());
                this.jTFPaisEdit.setText(enderecoVO.getPais());
                this.jTFCidadeEdit.setText(enderecoVO.getCidade());
                this.jTFRuaEdit.setText(enderecoVO.getRua());
                this.jTFNumEdit.setText(enderecoVO.getNumero());
                this.jTFComplementoEdit.setText(enderecoVO.getComplemento());
                this.jTFGrrEdit.setText(enderecoVO.getFKGrr());
                this.jTFPKEnderecoBuscar.setText(enderecoVO.getPKEndereco());
                
            }
            
        }  catch (ParseException ex) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FEndereco.class.getName()).log(Level.SEVERE, null, e);
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
            java.util.logging.Logger.getLogger(FEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTABuscar;
    private javax.swing.JTextArea jTAExcluir;
    private javax.swing.JTextField jTFCep;
    private javax.swing.JTextField jTFCepEdit;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCidadeEdit;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFComplementoEdit;
    private javax.swing.JTextField jTFGrr;
    private javax.swing.JTextField jTFGrrEdit;
    private javax.swing.JTextField jTFNewPkEnderecp;
    private javax.swing.JTextField jTFNum;
    private javax.swing.JTextField jTFNumEdit;
    private javax.swing.JTextField jTFPKEndereco;
    private javax.swing.JTextField jTFPKEnderecoBuscar;
    private javax.swing.JTextField jTFPKEnderecoEdit;
    private javax.swing.JTextField jTFPKEnderecoExcluir;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFPaisEdit;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JTextField jTFRuaEdit;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}