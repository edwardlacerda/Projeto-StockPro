package view;

public class TelaInicio extends javax.swing.JFrame {

    public TelaInicio() {
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

        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        Tittle = new javax.swing.JLabel();
        subTittle = new javax.swing.JLabel();
        selector = new javax.swing.JPanel();
        btnProdutos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StockPro - Início");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1024, 768));

        header.setBackground(new java.awt.Color(255, 80, 49));

        Tittle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Tittle.setForeground(new java.awt.Color(255, 255, 255));
        Tittle.setText("StockPro");
        Tittle.setToolTipText("Tela Inicial");
        Tittle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TittleMouseClicked(evt);
            }
        });

        subTittle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        subTittle.setForeground(new java.awt.Color(255, 255, 255));
        subTittle.setText("Seu gerenciador de estoques");

        selector.setBackground(new java.awt.Color(0, 77, 97));

        btnProdutos.setBackground(new java.awt.Color(255, 255, 255));
        btnProdutos.setForeground(new java.awt.Color(0, 0, 0));
        btnProdutos.setText("Produtos");
        btnProdutos.setBorder(null);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnVenda.setForeground(new java.awt.Color(0, 0, 0));
        btnVenda.setText("Venda");
        btnVenda.setBorder(null);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnFuncionarios.setBackground(new java.awt.Color(255, 255, 255));
        btnFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
        btnFuncionarios.setText("Funcionários");
        btnFuncionarios.setBorder(null);
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectorLayout = new javax.swing.GroupLayout(selector);
        selector.setLayout(selectorLayout);
        selectorLayout.setHorizontalGroup(
            selectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        selectorLayout.setVerticalGroup(
            selectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(selectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTittle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(selector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(subTittle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 622, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        TelaProdutos telaProd = new TelaProdutos();
        telaProd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        TelaClientes tc = new TelaClientes();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        TelaVenda telaVenda = new TelaVenda();
        telaVenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        TelaFuncionarios tf = new TelaFuncionarios();
        tf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void TittleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TittleMouseClicked
        // TODO add your handling code here:
        TelaInicio tI = new TelaInicio();
        tI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TittleMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tittle;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVenda;
    private javax.swing.JPanel header;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel selector;
    private javax.swing.JLabel subTittle;
    // End of variables declaration//GEN-END:variables
}
