package Interfaces;

public class InterfaceConectada extends javax.swing.JFrame {

    public InterfaceConectada() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btnListaProdutos = new javax.swing.JButton();
        btnCadastrarProdutos = new javax.swing.JButton();
        btnHistoricoCadastro = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        mbMenuSuperior = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        miTelaPrincipal = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnLoginCriarConta = new javax.swing.JMenu();
        miCriarConta = new javax.swing.JMenuItem();
        mnEstoque = new javax.swing.JMenu();
        miListaProdutos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miCadastrarProdutos = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        miFornecedores = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        miHistoricoCadastro = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTA CONECTADA");

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("CONTROLE DE ESTOQUE");

        btnListaProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-box-32.png"))); // NOI18N
        btnListaProdutos.setText("LISTA DE PRODUTOS");
        btnListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProdutosActionPerformed(evt);
            }
        });

        btnCadastrarProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/estoque32.png"))); // NOI18N
        btnCadastrarProdutos.setText("CADASTRAR PRODUTOS");
        btnCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutosActionPerformed(evt);
            }
        });

        btnHistoricoCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHistoricoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-data-transfer-32.png"))); // NOI18N
        btnHistoricoCadastro.setText("HISTÓRIO DE CADASTRO");
        btnHistoricoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoCadastroActionPerformed(evt);
            }
        });

        btnFornecedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-group-of-companies-32.png"))); // NOI18N
        btnFornecedores.setText("FORNECEDORES");
        btnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedoresActionPerformed(evt);
            }
        });

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
        miListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListaProdutosActionPerformed(evt);
            }
        });
        mnEstoque.add(miListaProdutos);
        mnEstoque.add(jSeparator2);

        miCadastrarProdutos.setText("CADASTRAR PRODUTOS");
        miCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarProdutosActionPerformed(evt);
            }
        });
        mnEstoque.add(miCadastrarProdutos);
        mnEstoque.add(jSeparator4);

        miFornecedores.setText("FORNECEDORES");
        miFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedoresActionPerformed(evt);
            }
        });
        mnEstoque.add(miFornecedores);
        mnEstoque.add(jSeparator5);

        miHistoricoCadastro.setText("HISTORICO CADASTRO");
        miHistoricoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHistoricoCadastroActionPerformed(evt);
            }
        });
        mnEstoque.add(miHistoricoCadastro);

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
                .addGap(103, 103, 103)
                .addComponent(btnHistoricoCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(btnCadastrarProdutos)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnListaProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFornecedores)
                .addGap(145, 145, 145))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(343, 343, 343))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lbTitulo)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaProdutos)
                    .addComponent(btnFornecedores))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHistoricoCadastro)
                    .addComponent(btnCadastrarProdutos))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTelaPrincipalActionPerformed
        // TODO add your handling code here:
        InterfaceMenu telaMenu = new InterfaceMenu();
        telaMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miTelaPrincipalActionPerformed

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
        InterfaceCadastroUsuario telaCadastroUsario = new InterfaceCadastroUsuario();
        telaCadastroUsario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miCriarContaActionPerformed

    private void btnCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutosActionPerformed
        // TODO add your handling code here:
        InterfaceCadastroProdutos telaCadastroProduto = new InterfaceCadastroProdutos();
        telaCadastroProduto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarProdutosActionPerformed

    private void btnListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProdutosActionPerformed
        // TODO add your handling code here:
        InterfaceListaProdutos telaListaProdutos = new InterfaceListaProdutos();
        telaListaProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaProdutosActionPerformed

    private void btnHistoricoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoCadastroActionPerformed
        // TODO add your handling code here:
        InterfaceHistoricoProdutos telaHistoricoProdutos = new InterfaceHistoricoProdutos();
        telaHistoricoProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistoricoCadastroActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        // TODO add your handling code here:
        InterfaceFornecedores telaFornecedores = new InterfaceFornecedores();
        telaFornecedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFornecedoresActionPerformed

    private void miListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListaProdutosActionPerformed
        // TODO add your handling code here:
        InterfaceListaProdutos telaListaProdutos = new InterfaceListaProdutos();
        telaListaProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miListaProdutosActionPerformed

    private void miCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarProdutosActionPerformed
        // TODO add your handling code here:
        InterfaceCadastroProdutos telaCadastroProduto = new InterfaceCadastroProdutos();
        telaCadastroProduto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miCadastrarProdutosActionPerformed

    private void miFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedoresActionPerformed
        // TODO add your handling code here:
        InterfaceFornecedores telaFornecedores = new InterfaceFornecedores();
        telaFornecedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miFornecedoresActionPerformed

    private void miHistoricoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHistoricoCadastroActionPerformed
        // TODO add your handling code here:
        InterfaceHistoricoProdutos telaFornecedores = new InterfaceHistoricoProdutos();
        telaFornecedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miHistoricoCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceConectada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceConectada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceConectada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceConectada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceConectada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProdutos;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnHistoricoCadastro;
    private javax.swing.JButton btnListaProdutos;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuBar mbMenuSuperior;
    private javax.swing.JMenuItem miCadastrarProdutos;
    private javax.swing.JMenuItem miCriarConta;
    private javax.swing.JMenuItem miFornecedores;
    private javax.swing.JMenuItem miHistoricoCadastro;
    private javax.swing.JMenuItem miListaProdutos;
    private javax.swing.JMenuItem miTelaPrincipal;
    private javax.swing.JMenu mnEstoque;
    private javax.swing.JMenu mnLoginCriarConta;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}
