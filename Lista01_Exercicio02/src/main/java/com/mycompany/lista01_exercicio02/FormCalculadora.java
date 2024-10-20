package com.mycompany.lista01_exercicio02;

/**
 *
 * @author edwar
 */
public class FormCalculadora extends javax.swing.JFrame {

    private Calculadora calc;
    /**
     * Creates new form FormCalculadora
     */
    public FormCalculadora() {
        initComponents();
        calc = new Calculadora ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbllTituloTela = new javax.swing.JLabel();
        lblDigitePrimeiroValor = new javax.swing.JLabel();
        tfPrimeiroValor = new javax.swing.JTextField();
        lblEscolhaOperacao = new javax.swing.JLabel();
        btnDivisao = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnPotenciacao = new javax.swing.JButton();
        btnRaizQuadrada = new javax.swing.JButton();
        lblDigiteSegundoValor = new javax.swing.JLabel();
        tfSegundoValor = new javax.swing.JTextField();
        lblTituloResultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbllTituloTela.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lbllTituloTela.setText("Calculadora");

        lblDigitePrimeiroValor.setText("Digite o primeiro valor:");

        lblEscolhaOperacao.setText("Escolha a operação:");

        btnDivisao.setText("Divisão");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnAdicao.setText("Adição");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnSubtracao.setText("Subtração");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setText("Multiplicação");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnPotenciacao.setText("x^y");
        btnPotenciacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciacaoActionPerformed(evt);
            }
        });

        btnRaizQuadrada.setText("Raiz Quadrada");
        btnRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQuadradaActionPerformed(evt);
            }
        });

        lblDigiteSegundoValor.setText("Digite o segundo valor:");

        lblTituloResultado.setText("Resultado:");

        lblResultado.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPotenciacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lbllTituloTela))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEscolhaOperacao)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDigitePrimeiroValor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfPrimeiroValor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDigiteSegundoValor)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfSegundoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblTituloResultado)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbllTituloTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDigitePrimeiroValor)
                    .addComponent(tfPrimeiroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDigiteSegundoValor)
                    .addComponent(tfSegundoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscolhaOperacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivisao)
                    .addComponent(btnAdicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubtracao)
                    .addComponent(btnPotenciacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacao)
                    .addComponent(btnRaizQuadrada))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloResultado))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        double v1 = Float.parseFloat(tfPrimeiroValor.getText().trim());
        double v2 = Float.parseFloat(tfSegundoValor.getText().trim());
        
        calc.setValor1(v1);
        calc.setValor2(v2);
        calc.adicao();
        
        lblResultado.setText(calc.getResultado() + "");
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        double v1 = Float.parseFloat(tfPrimeiroValor.getText().trim());
        double v2 = Float.parseFloat(tfSegundoValor.getText().trim());
        
        calc.setValor1(v1);
        calc.setValor2(v2);
        calc.subtracao();
        
        lblResultado.setText(calc.getResultado() + "");
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        double v1 = Float.parseFloat(tfPrimeiroValor.getText().trim());
        double v2 = Float.parseFloat(tfSegundoValor.getText().trim());
        
        calc.setValor1(v1);
        calc.setValor2(v2);
        calc.multiplicacao();
        
        lblResultado.setText(calc.getResultado() + "");
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        double v1 = Float.parseFloat(tfPrimeiroValor.getText().trim());
        double v2 = Float.parseFloat(tfSegundoValor.getText().trim());
        
        calc.setValor1(v1);
        calc.setValor2(v2);
        calc.divisao();
        
        lblResultado.setText(calc.getResultado() + "");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnPotenciacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciacaoActionPerformed
        double v1 = Float.parseFloat(tfPrimeiroValor.getText().trim());
        double v2 = Float.parseFloat(tfSegundoValor.getText().trim());
        
        calc.setValor1(v1);
        calc.setValor2(v2);
        calc.potencia();
        
        lblResultado.setText(calc.getResultado() + "");
    }//GEN-LAST:event_btnPotenciacaoActionPerformed

    private void btnRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQuadradaActionPerformed
        double v1 = Float.parseFloat(tfPrimeiroValor.getText().trim());
        
        calc.setValor1(v1);
        calc.raizQuadrada();
        
        lblResultado.setText(calc.getResultado() + "");
    }//GEN-LAST:event_btnRaizQuadradaActionPerformed

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
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPotenciacao;
    private javax.swing.JButton btnRaizQuadrada;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JLabel lblDigitePrimeiroValor;
    private javax.swing.JLabel lblDigiteSegundoValor;
    private javax.swing.JLabel lblEscolhaOperacao;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTituloResultado;
    private javax.swing.JLabel lbllTituloTela;
    private javax.swing.JTextField tfPrimeiroValor;
    private javax.swing.JTextField tfSegundoValor;
    // End of variables declaration//GEN-END:variables
}
