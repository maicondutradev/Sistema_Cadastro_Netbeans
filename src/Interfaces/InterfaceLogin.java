package Interfaces;

import javax.swing.JOptionPane;

public class InterfaceLogin extends javax.swing.JFrame {

    public InterfaceLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbLoginCriarConta = new javax.swing.JLabel();
        lbSuporte = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lbNaoPossuiConta = new javax.swing.JLabel();
        btnCriarConta = new javax.swing.JButton();
        lbEsqueceuSenha = new javax.swing.JLabel();
        btnRecuperar = new javax.swing.JButton();
        pwSenha = new javax.swing.JPasswordField();
        mbMenuSuperior = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        miTelaPrincipal = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnLoginCriarConta = new javax.swing.JMenu();
        miLogin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miCriarConta = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("LOGIN");

        lbLoginCriarConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbLoginCriarConta.setText("Email:");

        lbSuporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSuporte.setText("Senha:");

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lbNaoPossuiConta.setText("Não possuir conta?");

        btnCriarConta.setText("Criar conta");
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });

        lbEsqueceuSenha.setText("Esqueceu a senha?");

        btnRecuperar.setText("Recuperar");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
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
                        .addGap(309, 309, 309)
                        .addComponent(btnEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbLoginCriarConta)
                            .addComponent(lbSuporte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwSenha)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCriarConta))
                            .addComponent(lbNaoPossuiConta))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnRecuperar))
                            .addComponent(lbEsqueceuSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(lbTitulo)))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lbTitulo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoginCriarConta)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSuporte)
                    .addComponent(pwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNaoPossuiConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCriarConta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEsqueceuSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecuperar)))
                .addContainerGap(99, Short.MAX_VALUE))
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

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        if (txtUsuario.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "O campo Usuário é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
        txtUsuario.requestFocus();
    } else if (new String(pwSenha.getPassword()).trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "O campo Senha é obrigatório!", "Validação", JOptionPane.ERROR_MESSAGE);
        pwSenha.requestFocus();
    } else {
        String emailUsuario = "teste@gmail.com";
        String senhaUsuario = "12345";

        String usuarioInserido = txtUsuario.getText().trim();
        String senhaInserida = new String(pwSenha.getPassword()).trim();

        if (usuarioInserido.equals(emailUsuario) && senhaInserida.equals(senhaUsuario)) {
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            InterfaceConectada telaConectada = new InterfaceConectada();
            telaConectada.setVisible(true);
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtUsuario.requestFocus();
        }
    }
    }//GEN-LAST:event_btnEntrarActionPerformed

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

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        // TODO add your handling code here:
        InterfaceRecuperarSenha telaRecuperarSenha = new InterfaceRecuperarSenha();
        telaRecuperarSenha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        // TODO add your handling code here:
        InterfaceCadastroUsuario telaCadastroUsuario = new InterfaceCadastroUsuario();
        telaCadastroUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCriarContaActionPerformed

    private void miCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarContaActionPerformed
        // TODO add your handling code here:
        InterfaceCadastroUsuario telaCadastroUsario = new InterfaceCadastroUsuario();
        telaCadastroUsario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miCriarContaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        InterfaceSair telaSair = new InterfaceSair();
        telaSair.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lbEsqueceuSenha;
    private javax.swing.JLabel lbLoginCriarConta;
    private javax.swing.JLabel lbNaoPossuiConta;
    private javax.swing.JLabel lbSuporte;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuBar mbMenuSuperior;
    private javax.swing.JMenuItem miCriarConta;
    private javax.swing.JMenuItem miLogin;
    private javax.swing.JMenuItem miTelaPrincipal;
    private javax.swing.JMenu mnLoginCriarConta;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JMenu mnSair;
    private javax.swing.JPasswordField pwSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
