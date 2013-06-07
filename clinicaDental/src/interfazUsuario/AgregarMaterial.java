/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

/**
 *
 * @author JHumaran
 */
public class AgregarMaterial extends javax.swing.JFrame {

    /**
     * Creates new form AgregarCliente
     */
    public AgregarMaterial() {
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

        labelNombres = new javax.swing.JLabel();
        labelApellidoMaterno = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelClave = new javax.swing.JLabel();
        campoTextoClave = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox();
        campoTextoNombres = new javax.swing.JTextField();
        labelDomicilio = new javax.swing.JLabel();
        botonNuevoCliente = new javax.swing.JButton();
        botonGuardarCliente = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        campoTextoNombres1 = new javax.swing.JTextField();
        comboGenero1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Material");
        setResizable(false);

        labelNombres.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNombres.setForeground(new java.awt.Color(102, 102, 102));
        labelNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombres.setText("Nombre:");

        labelApellidoMaterno.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelApellidoMaterno.setForeground(new java.awt.Color(102, 102, 102));
        labelApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApellidoMaterno.setText("Descripción:");

        labelGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelGenero.setForeground(new java.awt.Color(102, 102, 102));
        labelGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGenero.setText("Categoría:");

        labelClave.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelClave.setForeground(new java.awt.Color(102, 102, 102));
        labelClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClave.setText("Clave:");

        campoTextoClave.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoTextoClave.setForeground(new java.awt.Color(102, 102, 102));
        campoTextoClave.setEnabled(false);

        comboGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        comboGenero.setForeground(new java.awt.Color(102, 102, 102));
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pz.", "Kg.", "Ml.", " " }));

        campoTextoNombres.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoTextoNombres.setForeground(new java.awt.Color(102, 102, 102));

        labelDomicilio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelDomicilio.setForeground(new java.awt.Color(102, 102, 102));
        labelDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDomicilio.setText("Cantidad:");

        botonNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/AgregarMaterial.png"))); // NOI18N
        botonNuevoCliente.setPreferredSize(new java.awt.Dimension(73, 73));
        botonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoClienteActionPerformed(evt);
            }
        });

        botonGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Guardar.png"))); // NOI18N
        botonGuardarCliente.setPreferredSize(new java.awt.Dimension(73, 73));
        botonGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarClienteActionPerformed(evt);
            }
        });

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Salir (1).png"))); // NOI18N
        botonSalir.setPreferredSize(new java.awt.Dimension(73, 73));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        campoTextoNombres1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoTextoNombres1.setForeground(new java.awt.Color(102, 102, 102));

        comboGenero1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        comboGenero1.setForeground(new java.awt.Color(102, 102, 102));
        comboGenero1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoria1", "Categoria2", "Categoria3", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelApellidoMaterno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelClave)
                                    .addComponent(labelNombres))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTextoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDomicilio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboGenero1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClave)
                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombres))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelApellidoMaterno)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDomicilio)
                    .addComponent(campoTextoNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarClienteActionPerformed
        dispose();
    }//GEN-LAST:event_botonGuardarClienteActionPerformed

    private void botonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonNuevoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMaterial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarCliente;
    private javax.swing.JButton botonNuevoCliente;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoTextoClave;
    private javax.swing.JTextField campoTextoNombres;
    private javax.swing.JTextField campoTextoNombres1;
    private javax.swing.JComboBox comboGenero;
    private javax.swing.JComboBox comboGenero1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelApellidoMaterno;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelDomicilio;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelNombres;
    // End of variables declaration//GEN-END:variables
}