
package p23;

import javax.swing.JOptionPane;

public class Inicio2 extends javax.swing.JFrame {

    public Inicio2() {
        initComponents();
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCirculo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        lblAreaCirculo = new javax.swing.JLabel();
        btnCalcularCirculo = new javax.swing.JButton();
        lblLado = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        lblAreaRombo = new javax.swing.JLabel();
        btnCalcularRombo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.gif"))); // NOI18N
        lblCirculo.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rombo.jpg"))); // NOI18N

        lblRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRadio.setText("Radio");

        lblAreaCirculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAreaCirculo.setText("Area");

        btnCalcularCirculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcularCirculo.setText("Calcular");
        btnCalcularCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCirculoActionPerformed(evt);
            }
        });

        lblLado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLado.setText("Lado");

        lblAltura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAltura.setText("Altura");

        lblAreaRombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAreaRombo.setText("Area");

        btnCalcularRombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcularRombo.setText("Calcular");
        btnCalcularRombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRomboActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 255, 0));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtras.setText("Return");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(lblLado)
                        .addGap(140, 140, 140)
                        .addComponent(lblAltura))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(lblAreaCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAreaRombo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(txtLado)
                                    .addComponent(txtRadio))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(btnCalcularCirculo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCalcularRombo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(btnAtras))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRadio)
                            .addComponent(lblAreaCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcularCirculo)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLado)
                            .addComponent(lblAltura))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaRombo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcularRombo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnCalcularCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCirculoActionPerformed
        try{
        
        double radio = Double.parseDouble(txtRadio.getText());
        lblAreaCirculo.setText(String.valueOf(Math.PI*radio*radio));
        txtRadio.setText("");
        } catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error, debes ingresar un valor");
        System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnCalcularCirculoActionPerformed

    private void btnCalcularRomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRomboActionPerformed
       try{
       double lado = Double.parseDouble(txtLado.getText());
       double altura = Double.parseDouble(txtAltura.getText());
       lblAreaRombo.setText(String.valueOf(lado*altura));
       txtLado.setText("");
       txtAltura.setText("");
       }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error, debes ingresar un valor");
        System.out.println(ex.toString());
       }
    }//GEN-LAST:event_btnCalcularRomboActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Inicio obj1 = new Inicio ();
        obj1.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    
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
            java.util.logging.Logger.getLogger(Inicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio2().setVisible(true);
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCalcularCirculo;
    private javax.swing.JButton btnCalcularRombo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblAreaCirculo;
    private javax.swing.JLabel lblAreaRombo;
    private javax.swing.JLabel lblCirculo;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
