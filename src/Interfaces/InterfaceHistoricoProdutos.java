package Interfaces;

import javax.swing.JOptionPane;

public class InterfaceHistoricoProdutos extends javax.swing.JFrame {

    public InterfaceHistoricoProdutos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGenero = new javax.swing.ButtonGroup();
        btngRacaCor = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbNomeProduto1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbNomeProduto2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lbNomeProduto3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbNomeProduto4 = new javax.swing.JLabel();
        lbProduto = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbNomeUsuario1 = new javax.swing.JLabel();
        lbNomeUsuario2 = new javax.swing.JLabel();
        lbNomeUsuario3 = new javax.swing.JLabel();
        lbNomeUsuario4 = new javax.swing.JLabel();
        lbData1 = new javax.swing.JLabel();
        lbData2 = new javax.swing.JLabel();
        lbData3 = new javax.swing.JLabel();
        lbData4 = new javax.swing.JLabel();
        lbPaginacao = new javax.swing.JLabel();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        mbMenuSuperior = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        miTelaPrincipal = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnLoginCriarConta = new javax.swing.JMenu();
        miLogin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miCriarConta = new javax.swing.JMenuItem();
        mnEstoque = new javax.swing.JMenu();
        miListaProdutos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miCadastrarProdutos = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HISTORICO DO PRODUTO");

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("HISTÓRICO DE CADASTRO DE PRODUTOS");

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbUsuario.setBackground(new java.awt.Color(204, 204, 204));
        lbUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbUsuario.setText("USUÁRIO");

        lbNomeProduto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto1.setText("Notebook Dell Inspiron 10");

        lbNomeProduto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto2.setText("Notebook Dell Inspiron 10");

        lbNomeProduto3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto3.setText("Notebook Dell Inspiron 10");

        lbNomeProduto4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto4.setText("Notebook Dell Inspiron 10");

        lbProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbProduto.setText("PRODUTO");

        lbData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbData.setText("DATA");

        lbNomeUsuario1.setText("MAICON DUTRA");

        lbNomeUsuario2.setText("MAICON DUTRA");

        lbNomeUsuario3.setText("GABRIEL CANIZA");

        lbNomeUsuario4.setText("GABRIEL CANIZA");

        lbData1.setText("01/06/2024");

        lbData2.setText("31/05/2024");

        lbData3.setText("27/05/2024");

        lbData4.setText("27/05/2024");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lbUsuario)
                .addGap(143, 143, 143)
                .addComponent(lbProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbData)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeUsuario2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNomeProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNomeUsuario3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(lbNomeProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbData2)
                    .addComponent(lbData3))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbNomeUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNomeProduto1)
                .addGap(113, 113, 113)
                .addComponent(lbData1)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbNomeUsuario4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNomeProduto4)
                .addGap(108, 108, 108)
                .addComponent(lbData4)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(lbProduto)
                    .addComponent(lbData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProduto1)
                    .addComponent(lbNomeUsuario1)
                    .addComponent(lbData1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProduto2)
                    .addComponent(lbNomeUsuario2)
                    .addComponent(lbData2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeProduto3)
                            .addComponent(lbNomeUsuario3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbData3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProduto4)
                    .addComponent(lbNomeUsuario4)
                    .addComponent(lbData4))
                .addGap(17, 17, 17))
        );

        lbPaginacao.setText("Página 1 de 100");

        btnLeft.setText("<");

        btnRight.setText(">");

        mbMenuSuperior.setPreferredSize(new java.awt.Dimension(207, 40));

        mnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-menu-32 (1).png"))); // NOI18N
        mnMenu.setText("MENU");

        miTelaPrincipal.setText("TELA PRINCIPAL");
        miTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTelaPrincipalActionPerformed(evt);
            }
        });
        mnMenu.add(miTelaPrincipal);
        mnMenu.add(jSeparator3);

        jMenuItem1.setText("SUPORTE");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnMenu.add(jMenuItem1);

        mbMenuSuperior.add(mnMenu);

        mnLoginCriarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-user-32.png"))); // NOI18N
        mnLoginCriarConta.setText("LOGIN");

        miLogin.setText("LOGIN");
        miLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoginActionPerformed(evt);
            }
        });
        mnLoginCriarConta.add(miLogin);
        mnLoginCriarConta.add(jSeparator1);

        miCriarConta.setText("CRIAR CONTA");
        miCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarContaActionPerformed(evt);
            }
        });
        mnLoginCriarConta.add(miCriarConta);

        mbMenuSuperior.add(mnLoginCriarConta);

        mnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-stock-32.png"))); // NOI18N
        mnEstoque.setText("ESTOQUE");

        miListaProdutos.setText("LISTA DE PRODUTOS");
        mnEstoque.add(miListaProdutos);
        mnEstoque.add(jSeparator2);

        miCadastrarProdutos.setText("CADASTRAR PRODUTOS");
        mnEstoque.add(miCadastrarProdutos);

        mbMenuSuperior.add(mnEstoque);

        mnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sair (2).png"))); // NOI18N
        mnSair.setText("SAIR");

        jMenuItem6.setText("SAIR DO SISTEMA");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnSair.add(jMenuItem6);

        mbMenuSuperior.add(mnSair);

        setJMenuBar(mbMenuSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPaginacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRight)
                                .addGap(241, 241, 241)))
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnVoltar)
                .addGap(32, 32, 32)
                .addComponent(lbTitulo)
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPaginacao)
                    .addComponent(btnLeft)
                    .addComponent(btnRight))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTelaPrincipalActionPerformed
        // TODO add your handling code here:
        InterfaceMenu telaMenu = new InterfaceMenu();
        telaMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miTelaPrincipalActionPerformed

    private void miLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoginActionPerformed
        // TODO add your handling code here:
        InterfaceLogin telaLogin = new InterfaceLogin();
        telaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miLoginActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        InterfaceSair telaSair = new InterfaceSair();
        telaSair.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        InterfaceSuporte telaSuporte = new InterfaceSuporte();
        telaSuporte.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarContaActionPerformed
        // TODO add your handling code here:
        InterfaceHistoricoProdutos telaListaProdutos = new InterfaceHistoricoProdutos();
        telaListaProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miCriarContaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        InterfaceConectada telaConectada = new InterfaceConectada();
        telaConectada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceHistoricoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceHistoricoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceHistoricoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceHistoricoProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceHistoricoProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup btngGenero;
    private javax.swing.ButtonGroup btngRacaCor;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbData1;
    private javax.swing.JLabel lbData2;
    private javax.swing.JLabel lbData3;
    private javax.swing.JLabel lbData4;
    private javax.swing.JLabel lbNomeProduto1;
    private javax.swing.JLabel lbNomeProduto2;
    private javax.swing.JLabel lbNomeProduto3;
    private javax.swing.JLabel lbNomeProduto4;
    private javax.swing.JLabel lbNomeUsuario1;
    private javax.swing.JLabel lbNomeUsuario2;
    private javax.swing.JLabel lbNomeUsuario3;
    private javax.swing.JLabel lbNomeUsuario4;
    private javax.swing.JLabel lbPaginacao;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JMenuBar mbMenuSuperior;
    private javax.swing.JMenuItem miCadastrarProdutos;
    private javax.swing.JMenuItem miCriarConta;
    private javax.swing.JMenuItem miListaProdutos;
    private javax.swing.JMenuItem miLogin;
    private javax.swing.JMenuItem miTelaPrincipal;
    private javax.swing.JMenu mnEstoque;
    private javax.swing.JMenu mnLoginCriarConta;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}
