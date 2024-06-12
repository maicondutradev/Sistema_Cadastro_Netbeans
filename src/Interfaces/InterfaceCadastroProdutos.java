package Interfaces;

import javax.swing.JOptionPane;

public class InterfaceCadastroProdutos extends javax.swing.JFrame {

    public InterfaceCadastroProdutos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGenero = new javax.swing.ButtonGroup();
        btngRacaCor = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        lbCodigoProduto = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lbCodigoBarra = new javax.swing.JLabel();
        btnCadastrarProduto = new javax.swing.JButton();
        txtCodigoBarra = new javax.swing.JTextField();
        lbMarca = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        lbQuantidade = new javax.swing.JLabel();
        spQuantidade = new javax.swing.JSpinner();
        lbPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lbFornecedor = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        setTitle("CADASTRO DE PRODUTO");
        setPreferredSize(new java.awt.Dimension(900, 536));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("CADASTRO DE PRODUTOS NO ESTOQUE");

        lbCodigoProduto.setText("Código do produto:");

        lbDescricao.setText("Descrição:");

        lbNome.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lbCategoria.setText("Categoria:");

        lbCodigoBarra.setText("Código de barra:");

        btnCadastrarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrarProduto.setText("CADASTRAR PRODUTO");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        lbMarca.setText("Marca:");

        lbPreco.setText("Preço:");

        lbQuantidade.setText("Quantidade:");

        lbPeso.setText("Peso:");

        lbFornecedor.setText("Fornecedor:");

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("LIMPAR DADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(262, 262, 262))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDescricao)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCategoria)
                    .addComponent(lbCodigoProduto)
                    .addComponent(lbCodigoBarra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoBarra, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFornecedor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbQuantidade)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(txtPreco)
                    .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso)
                    .addComponent(txtFornecedor))
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarProduto)
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnVoltar)
                .addGap(74, 74, 74)
                .addComponent(lbTitulo)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoProduto)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome)
                    .addComponent(lbPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDescricao)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbQuantidade)
                        .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigoBarra)
                    .addComponent(lbFornecedor)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarProduto)
                    .addComponent(jButton1))
                .addContainerGap(92, Short.MAX_VALUE))
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
        InterfaceCadastroProdutos telaCadastroUsario = new InterfaceCadastroProdutos();
        telaCadastroUsario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miCriarContaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        if (txtCodigoProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"O campo Código do produto é obrigatório!","Validação", JOptionPane.ERROR_MESSAGE);
            txtCodigoProduto.requestFocus();
        }
        else if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtNome.requestFocus();
        }
        else if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Descrição é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtDescricao.requestFocus();
        }
        else if (txtCategoria.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Categoria é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtCategoria.requestFocus();
        }
        else if (txtCodigoBarra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Código de barra é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtCodigoBarra.requestFocus();
        }
        else if (txtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Marca é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtMarca.requestFocus();
        }
        else if (txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Preco é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtPreco.requestFocus();
        }
        else if (spQuantidade.getValue() == null || ((Integer) spQuantidade.getValue()) <= 0) {
            JOptionPane.showMessageDialog(null, "O campo Quantidade deve ser um número positivo!", "Validação", JOptionPane.ERROR_MESSAGE);
            spQuantidade.requestFocus();
        }

        else if (txtPeso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Peso é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtPeso.requestFocus();
        }
        else if (txtFornecedor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Fornecedor é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
            txtFornecedor.requestFocus();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            txtCodigoProduto.setText("");
            txtNome.setText("");
            txtDescricao.setText("");
            txtCategoria.setText("");
            txtCodigoBarra.setText("");
            txtMarca.setText("");
            txtPreco.setText("");
            spQuantidade.setValue(0);
            txtPeso.setText("");
            txtFornecedor.setText("");
        } 
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        InterfaceConectada telaConectada = new InterfaceConectada();
        telaConectada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(null, "Dados limpados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            txtCodigoProduto.setText("");
            txtNome.setText("");
            txtDescricao.setText("");
            txtCategoria.setText("");
            txtCodigoBarra.setText("");
            txtMarca.setText("");
            txtPreco.setText("");
            spQuantidade.setValue(0);
            txtPeso.setText("");
            txtFornecedor.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new InterfaceCadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup btngGenero;
    private javax.swing.ButtonGroup btngRacaCor;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodigoBarra;
    private javax.swing.JLabel lbCodigoProduto;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbNome;
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
    private javax.swing.JSpinner spQuantidade;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
