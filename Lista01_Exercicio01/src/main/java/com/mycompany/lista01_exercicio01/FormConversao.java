/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lista01_exercicio01;

/**
 *
 * @author edwar
 */
public class FormConversao extends javax.swing.JFrame {

    private ConversaoDeTemperaturas convTemp;
    private final String CELSIUS = "Celsius";
    private final String KELVINS = "Kelvins";
    private final String FAHRENHEIT = "Fahrenheit";

    /**
     * Creates new form FormConversao
     */
    public FormConversao() {
        initComponents();
        convTemp = new ConversaoDeTemperaturas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbllTituloPrincipal = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lblEntreComValor = new javax.swing.JLabel();
        btnCelsiusParaFahrenheit = new javax.swing.JButton();
        btnCelsiusParaKelvins = new javax.swing.JButton();
        btnKelvinsParaFahrenheit = new javax.swing.JButton();
        btnFahrenheitParaKelvins = new javax.swing.JButton();
        btnFahrenheitParaCelsius = new javax.swing.JButton();
        btnKelvinsParaCelsius = new javax.swing.JButton();
        lblTituloConvertidoDe = new javax.swing.JLabel();
        lblTituloConvertidoPara = new javax.swing.JLabel();
        lblConvertidoDe = new javax.swing.JLabel();
        lblConvertidoPara = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversão de Temperaturas");

        lbllTituloPrincipal.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lbllTituloPrincipal.setText("Conversão de Temperaturas");

        lblEntreComValor.setText("Entre com o valor a ser convertido:");

        btnCelsiusParaFahrenheit.setText("Celsius para Fahrenheit");
        btnCelsiusParaFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelsiusParaFahrenheitActionPerformed(evt);
            }
        });

        btnCelsiusParaKelvins.setText("Celsius para Kelvins");
        btnCelsiusParaKelvins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelsiusParaKelvinsActionPerformed(evt);
            }
        });

        btnKelvinsParaFahrenheit.setText("Kelvins para Fahrenheit");
        btnKelvinsParaFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelvinsParaFahrenheitActionPerformed(evt);
            }
        });

        btnFahrenheitParaKelvins.setText("Fahrenheit para Kelvins");
        btnFahrenheitParaKelvins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitParaKelvinsActionPerformed(evt);
            }
        });

        btnFahrenheitParaCelsius.setText("Fahrenheit para Celsius");
        btnFahrenheitParaCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitParaCelsiusActionPerformed(evt);
            }
        });

        btnKelvinsParaCelsius.setText("Kelvins para Celsius");
        btnKelvinsParaCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelvinsParaCelsiusActionPerformed(evt);
            }
        });

        lblTituloConvertidoDe.setText("Convertido de:");

        lblTituloConvertidoPara.setText("Convertido para:");

        lblConvertidoDe.setForeground(new java.awt.Color(0, 0, 255));

        lblConvertidoPara.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblEntreComValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCelsiusParaFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFahrenheitParaKelvins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTituloConvertidoDe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblConvertidoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTituloConvertidoPara)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblConvertidoPara, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnCelsiusParaKelvins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKelvinsParaFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFahrenheitParaCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKelvinsParaCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lbllTituloPrincipal)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllTituloPrincipal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntreComValor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCelsiusParaFahrenheit)
                    .addComponent(btnFahrenheitParaCelsius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCelsiusParaKelvins)
                    .addComponent(btnKelvinsParaFahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKelvinsParaCelsius)
                    .addComponent(btnFahrenheitParaKelvins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloConvertidoDe)
                    .addComponent(lblConvertidoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloConvertidoPara)
                    .addComponent(lblConvertidoPara))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelsiusParaFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelsiusParaFahrenheitActionPerformed
        float valor = Float.parseFloat(tfValor.getText().trim());
        String valorConvertido;
        
        convTemp.setValorOriginal(valor);
        convTemp.celsiusParaFahrenheit();
        
        valorConvertido = String.valueOf(convTemp.getValorConvertido());
        
        lblConvertidoDe.setText(valor + " - " + CELSIUS);
        lblConvertidoPara.setText(valorConvertido + " - " + FAHRENHEIT);
        tfValor.setText(null);
        tfValor.requestFocus();
    }//GEN-LAST:event_btnCelsiusParaFahrenheitActionPerformed

    private void btnCelsiusParaKelvinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelsiusParaKelvinsActionPerformed
        float valor = Float.parseFloat(tfValor.getText().trim());
        String valorConvertido;
        
        convTemp.setValorOriginal(valor);
        convTemp.celsiusParaKelvins();
        
        valorConvertido = String.valueOf(convTemp.getValorConvertido());
        
        lblConvertidoDe.setText(valor + " - " + CELSIUS);
        lblConvertidoPara.setText(valorConvertido + " - " + KELVINS);
        tfValor.setText(null);
        tfValor.requestFocus();
    }//GEN-LAST:event_btnCelsiusParaKelvinsActionPerformed

    private void btnFahrenheitParaKelvinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitParaKelvinsActionPerformed
        float valor = Float.parseFloat(tfValor.getText().trim());
        String valorConvertido;
        
        convTemp.setValorOriginal(valor);
        convTemp.fahrenheitParaKelvins();
        
        valorConvertido = String.valueOf(convTemp.getValorConvertido());
        
        lblConvertidoDe.setText(valor + " - " + FAHRENHEIT);
        lblConvertidoPara.setText(valorConvertido + " - " + KELVINS);
        tfValor.setText(null);
        tfValor.requestFocus();
    }//GEN-LAST:event_btnFahrenheitParaKelvinsActionPerformed

    private void btnFahrenheitParaCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitParaCelsiusActionPerformed
        float valor = Float.parseFloat(tfValor.getText().trim());
        String valorConvertido;
        
        convTemp.setValorOriginal(valor);
        convTemp.fahrenheitParaCelsius();
        
        valorConvertido = String.valueOf(convTemp.getValorConvertido());
        
        lblConvertidoDe.setText(valor + " - " + FAHRENHEIT);
        lblConvertidoPara.setText(valorConvertido + " - " + CELSIUS);
        tfValor.setText(null);
        tfValor.requestFocus();
    }//GEN-LAST:event_btnFahrenheitParaCelsiusActionPerformed

    private void btnKelvinsParaFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelvinsParaFahrenheitActionPerformed
        float valor = Float.parseFloat(tfValor.getText().trim());
        String valorConvertido;
        
        convTemp.setValorOriginal(valor);
        convTemp.kelvinsParaFahrenheit();
        
        valorConvertido = String.valueOf(convTemp.getValorConvertido());
        
        lblConvertidoDe.setText(valor + " - " + KELVINS);
        lblConvertidoPara.setText(valorConvertido + " - " + FAHRENHEIT);
        tfValor.setText(null);
        tfValor.requestFocus();
    }//GEN-LAST:event_btnKelvinsParaFahrenheitActionPerformed

    private void btnKelvinsParaCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelvinsParaCelsiusActionPerformed
        float valor = Float.parseFloat(tfValor.getText().trim());
        String valorConvertido;
        
        convTemp.setValorOriginal(valor);
        convTemp.kelvinsParaCelsius();
        
        valorConvertido = String.valueOf(convTemp.getValorConvertido());
        
        lblConvertidoDe.setText(valor + " - " + KELVINS);
        lblConvertidoPara.setText(valorConvertido + " - " + CELSIUS);
        tfValor.setText(null);
        tfValor.requestFocus();
    }//GEN-LAST:event_btnKelvinsParaCelsiusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelsiusParaFahrenheit;
    private javax.swing.JButton btnCelsiusParaKelvins;
    private javax.swing.JButton btnFahrenheitParaCelsius;
    private javax.swing.JButton btnFahrenheitParaKelvins;
    private javax.swing.JButton btnKelvinsParaCelsius;
    private javax.swing.JButton btnKelvinsParaFahrenheit;
    private javax.swing.JLabel lblConvertidoDe;
    private javax.swing.JLabel lblConvertidoPara;
    private javax.swing.JLabel lblEntreComValor;
    private javax.swing.JLabel lblTituloConvertidoDe;
    private javax.swing.JLabel lblTituloConvertidoPara;
    private javax.swing.JLabel lbllTituloPrincipal;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
