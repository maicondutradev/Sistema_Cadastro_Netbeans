package Interfaces;

import javax.swing.JOptionPane;

public class InterfaceListaProdutos extends javax.swing.JFrame {

    public InterfaceListaProdutos() {
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
        lbNomeProduto1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnDetalhes1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        lbNomeProduto2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnDetalhes2 = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();
        btnExcluir2 = new javax.swing.JButton();
        lbNomeProduto3 = new javax.swing.JLabel();
        btnDetalhes3 = new javax.swing.JButton();
        btnEditar3 = new javax.swing.JButton();
        btnExcluir3 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        lbNomeProduto4 = new javax.swing.JLabel();
        btnDetalhes4 = new javax.swing.JButton();
        btnEditar4 = new javax.swing.JButton();
        btnExcluir4 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        lbNomeProduto5 = new javax.swing.JLabel();
        btnDetalhes5 = new javax.swing.JButton();
        btnEditar5 = new javax.swing.JButton();
        btnExcluir5 = new javax.swing.JButton();
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
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        miFornecedores = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        miHistoricoCadastro = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTA DE PRODUTOS");
        setPreferredSize(new java.awt.Dimension(901, 536));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("LISTA DE PRODUTOS");

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbNomeProduto1.setBackground(new java.awt.Color(204, 204, 204));
        lbNomeProduto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto1.setText("Notebook Dell Inspiron 15");

        btnDetalhes1.setText("DETALHES");
        btnDetalhes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhes1ActionPerformed(evt);
            }
        });

        btnEditar1.setText("EDITAR");
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        btnExcluir1.setText("EXCLUIR");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        lbNomeProduto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto2.setText("Notebook Dell Inspiron 10");

        btnDetalhes2.setText("DETALHES");
        btnDetalhes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhes2ActionPerformed(evt);
            }
        });

        btnEditar2.setText("EDITAR");
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
            }
        });

        btnExcluir2.setText("EXCLUIR");
        btnExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir2ActionPerformed(evt);
            }
        });

        lbNomeProduto3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto3.setText("Notebook Dell Inspiron 10");

        btnDetalhes3.setText("DETALHES");
        btnDetalhes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhes3ActionPerformed(evt);
            }
        });

        btnEditar3.setText("EDITAR");
        btnEditar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar3ActionPerformed(evt);
            }
        });

        btnExcluir3.setText("EXCLUIR");
        btnExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir3ActionPerformed(evt);
            }
        });

        lbNomeProduto4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto4.setText("Notebook Dell Inspiron 10");

        btnDetalhes4.setText("DETALHES");
        btnDetalhes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhes4ActionPerformed(evt);
            }
        });

        btnEditar4.setText("EDITAR");
        btnEditar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar4ActionPerformed(evt);
            }
        });

        btnExcluir4.setText("EXCLUIR");
        btnExcluir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir4ActionPerformed(evt);
            }
        });

        lbNomeProduto5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeProduto5.setText("Notebook Dell Inspiron 10");

        btnDetalhes5.setText("DETALHES");
        btnDetalhes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhes5ActionPerformed(evt);
            }
        });

        btnEditar5.setText("EDITAR");
        btnEditar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar5ActionPerformed(evt);
            }
        });

        btnExcluir5.setText("EXCLUIR");
        btnExcluir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeProduto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalhes1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeProduto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalhes2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir2)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalhes3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir3)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(btnDetalhes4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeProduto5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalhes5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir5)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetalhes1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeProduto1)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeProduto2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnExcluir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDetalhes2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeProduto3)
                        .addComponent(btnDetalhes3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeProduto4)
                        .addComponent(btnDetalhes4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeProduto5)
                        .addComponent(btnDetalhes5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        mnEstoque.add(jSeparator8);

        miFornecedores.setText("FORNECEDORES");
        miFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedoresActionPerformed(evt);
            }
        });
        mnEstoque.add(miFornecedores);
        mnEstoque.add(jSeparator9);

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
                .addGap(31, 31, 31)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPaginacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRight)
                        .addGap(355, 355, 355))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnVoltar)
                .addGap(26, 26, 26)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPaginacao)
                    .addComponent(btnLeft)
                    .addComponent(btnRight))
                .addContainerGap(89, Short.MAX_VALUE))
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
        InterfaceListaProdutos telaListaProdutos = new InterfaceListaProdutos();
        telaListaProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miCriarContaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        InterfaceConectada telaConectada = new InterfaceConectada();
        telaConectada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnDetalhes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhes1ActionPerformed
        // TODO add your handling code here:
        InterfaceDetalhesProdutos telaDetalhesProdutos = new InterfaceDetalhesProdutos();
        telaDetalhesProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDetalhes1ActionPerformed

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
        // TODO add your handling code here:
        InterfaceEditarProdutos telaEditarProdutos = new InterfaceEditarProdutos();
        telaEditarProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void btnDetalhes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhes2ActionPerformed
        // TODO add your handling code here:
        InterfaceDetalhesProdutos telaDetalhesProdutos = new InterfaceDetalhesProdutos();
        telaDetalhesProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDetalhes2ActionPerformed

    private void btnDetalhes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhes3ActionPerformed
        // TODO add your handling code here:
        InterfaceDetalhesProdutos telaDetalhesProdutos = new InterfaceDetalhesProdutos();
        telaDetalhesProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDetalhes3ActionPerformed

    private void btnDetalhes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhes4ActionPerformed
        // TODO add your handling code here:
        InterfaceDetalhesProdutos telaDetalhesProdutos = new InterfaceDetalhesProdutos();
        telaDetalhesProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDetalhes4ActionPerformed

    private void btnDetalhes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhes5ActionPerformed
        // TODO add your handling code here:
        InterfaceDetalhesProdutos telaDetalhesProdutos = new InterfaceDetalhesProdutos();
        telaDetalhesProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDetalhes5ActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        // TODO add your handling code here:
        InterfaceEditarProdutos telaEditarProdutos = new InterfaceEditarProdutos();
        telaEditarProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnEditar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar3ActionPerformed
        // TODO add your handling code here:
        InterfaceEditarProdutos telaEditarProdutos = new InterfaceEditarProdutos();
        telaEditarProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditar3ActionPerformed

    private void btnEditar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar4ActionPerformed
        // TODO add your handling code here:
        InterfaceEditarProdutos telaEditarProdutos = new InterfaceEditarProdutos();
        telaEditarProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditar4ActionPerformed

    private void btnEditar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar5ActionPerformed
        // TODO add your handling code here:
        InterfaceEditarProdutos telaEditarProdutos = new InterfaceEditarProdutos();
        telaEditarProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditar5ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        // TODO add your handling code here:
        InterfaceExcluirProduto telaExcluirProdutos = new InterfaceExcluirProduto();
        telaExcluirProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir2ActionPerformed
        // TODO add your handling code here:
        InterfaceExcluirProduto telaExcluirProdutos = new InterfaceExcluirProduto();
        telaExcluirProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExcluir2ActionPerformed

    private void btnExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir3ActionPerformed
        // TODO add your handling code here:
        InterfaceExcluirProduto telaExcluirProdutos = new InterfaceExcluirProduto();
        telaExcluirProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExcluir3ActionPerformed

    private void btnExcluir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir4ActionPerformed
        // TODO add your handling code here:
        InterfaceExcluirProduto telaExcluirProdutos = new InterfaceExcluirProduto();
        telaExcluirProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExcluir4ActionPerformed

    private void btnExcluir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir5ActionPerformed
        // TODO add your handling code here:
        InterfaceExcluirProduto telaExcluirProdutos = new InterfaceExcluirProduto();
        telaExcluirProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExcluir5ActionPerformed

    private void miFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedoresActionPerformed
        // TODO add your handling code here:
        InterfaceFornecedores telaFornecedores = new InterfaceFornecedores();
        telaFornecedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miFornecedoresActionPerformed

    private void miListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListaProdutosActionPerformed
        // TODO add your handling code here:
        InterfaceListaProdutos telaListaProdutos = new InterfaceListaProdutos();
        telaListaProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miListaProdutosActionPerformed

    private void miHistoricoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHistoricoCadastroActionPerformed
        // TODO add your handling code here:
        InterfaceHistoricoProdutos telaHistoricoProdutos = new InterfaceHistoricoProdutos();
        telaHistoricoProdutos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miHistoricoCadastroActionPerformed

    private void miCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarProdutosActionPerformed
        // TODO add your handling code here:
        InterfaceCadastroProdutos telaCadastroProdutos = new InterfaceCadastroProdutos();
        telaCadastroProdutos.setVisible(true);
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
            java.util.logging.Logger.getLogger(InterfaceListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceListaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes1;
    private javax.swing.JButton btnDetalhes2;
    private javax.swing.JButton btnDetalhes3;
    private javax.swing.JButton btnDetalhes4;
    private javax.swing.JButton btnDetalhes5;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEditar3;
    private javax.swing.JButton btnEditar4;
    private javax.swing.JButton btnEditar5;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnExcluir2;
    private javax.swing.JButton btnExcluir3;
    private javax.swing.JButton btnExcluir4;
    private javax.swing.JButton btnExcluir5;
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
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel lbNomeProduto1;
    private javax.swing.JLabel lbNomeProduto2;
    private javax.swing.JLabel lbNomeProduto3;
    private javax.swing.JLabel lbNomeProduto4;
    private javax.swing.JLabel lbNomeProduto5;
    private javax.swing.JLabel lbPaginacao;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuBar mbMenuSuperior;
    private javax.swing.JMenuItem miCadastrarProdutos;
    private javax.swing.JMenuItem miCriarConta;
    private javax.swing.JMenuItem miFornecedores;
    private javax.swing.JMenuItem miHistoricoCadastro;
    private javax.swing.JMenuItem miListaProdutos;
    private javax.swing.JMenuItem miLogin;
    private javax.swing.JMenuItem miTelaPrincipal;
    private javax.swing.JMenu mnEstoque;
    private javax.swing.JMenu mnLoginCriarConta;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}
