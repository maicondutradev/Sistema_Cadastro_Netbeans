package Interfaces;

import javax.swing.JOptionPane;

public class InterfaceDetalhesProdutos extends javax.swing.JFrame {

    public InterfaceDetalhesProdutos() {
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
        pnPainel = new javax.swing.JPanel();
        lbCodigoProduto = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbNome = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbDescricao = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lbCategoria = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbCodigoBarra = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lbMarca = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lbPreco = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lbQuantidade = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        lbPeso = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        lbFornecedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbPaginacao = new javax.swing.JLabel();
        btnLeft = new javax.swing.JButton();
        btnRigth = new javax.swing.JButton();
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
        setTitle("DESCRIÇÃO DO PRODUTO");

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("DESCRIÇÃO DO PRODUTO");

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        pnPainel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCodigoProduto.setBackground(new java.awt.Color(204, 204, 204));
        lbCodigoProduto.setText("Código do produto:");

        lbNome.setText("Nome:");

        lbDescricao.setText("Descrição:");

        lbCategoria.setText("Categoria:");

        lbCodigoBarra.setText("Código de barra:");

        lbMarca.setText("Marca:");

        lbPreco.setText("Preço:");

        lbQuantidade.setText("Quantidade:");

        lbPeso.setText("Peso:");

        lbFornecedor.setText("Fornecedor:");

        jLabel1.setText("12345");

        jLabel2.setText("Notebook");

        jLabel3.setText("Notebook de escritorio");

        jLabel4.setText("Informática");

        jLabel5.setText("32453261241");

        jLabel6.setText("Dell");

        jLabel7.setText("2.200");

        jLabel8.setText("10");

        jLabel9.setText("2");

        jLabel10.setText("Dell Informática");

        javax.swing.GroupLayout pnPainelLayout = new javax.swing.GroupLayout(pnPainel);
        pnPainel.setLayout(pnPainelLayout);
        pnPainelLayout.setHorizontalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
            .addComponent(jSeparator8)
            .addComponent(jSeparator9)
            .addComponent(jSeparator10)
            .addComponent(jSeparator11)
            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPainelLayout.createSequentialGroup()
                        .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbCodigoProduto)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addGap(170, 170, 170)
                                .addComponent(jLabel2))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbCodigoBarra)
                                .addGap(119, 119, 119)
                                .addComponent(jLabel5)))
                        .addGap(32, 282, Short.MAX_VALUE))
                    .addGroup(pnPainelLayout.createSequentialGroup()
                        .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbQuantidade)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPainelLayout.createSequentialGroup()
                                .addComponent(lbFornecedor)
                                .addGap(145, 145, 145)
                                .addComponent(jLabel10)))
                        .addGap(0, 318, Short.MAX_VALUE))))
        );
        pnPainelLayout.setVerticalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoProduto)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoBarra)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarca)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidade)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPeso)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFornecedor)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbPaginacao.setText("Página 1 de 100");

        btnLeft.setText("<");

        btnRigth.setText(">");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnVoltar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(lbTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnPainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(btnLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPaginacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRigth)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(pnPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPaginacao)
                    .addComponent(btnLeft)
                    .addComponent(btnRigth))
                .addContainerGap(71, Short.MAX_VALUE))
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
        InterfaceDetalhesProdutos telaListaProdutos = new InterfaceDetalhesProdutos();
        telaListaProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miCriarContaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        InterfaceListaProdutos telaListaProdutos = new InterfaceListaProdutos();
        telaListaProdutos.setVisible(true);
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
            java.util.logging.Logger.getLogger(InterfaceDetalhesProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceDetalhesProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceDetalhesProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceDetalhesProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InterfaceDetalhesProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRigth;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup btngGenero;
    private javax.swing.ButtonGroup btngRacaCor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodigoBarra;
    private javax.swing.JLabel lbCodigoProduto;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPaginacao;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTitulo;
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
    private javax.swing.JPanel pnPainel;
    // End of variables declaration//GEN-END:variables
}
