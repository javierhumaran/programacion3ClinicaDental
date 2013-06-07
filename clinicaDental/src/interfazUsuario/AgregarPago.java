/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

/**
 *
 * @author JHumaran
 */
public class AgregarPago extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPago
     */
    public AgregarPago() {
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

        panelPagos = new javax.swing.JPanel();
        tablaPagos = new javax.swing.JScrollPane();
        tablaPagos1 = new javax.swing.JTable();
        botonAgregarPago = new javax.swing.JButton();
        botonEliminarPago = new javax.swing.JButton();
        botonEditarPago = new javax.swing.JButton();
        panelTotal = new javax.swing.JPanel();
        labelTotal = new javax.swing.JLabel();
        campoTextoTotal = new javax.swing.JTextField();
        campoTextoFecha = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        labelFolio = new javax.swing.JLabel();
        campoTextoFolio = new javax.swing.JTextField();
        comboCliente = new javax.swing.JComboBox();
        labelCliente = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar Pago");

        panelPagos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaPagos1.setAutoCreateRowSorter(true);
        tablaPagos1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tablaPagos1.setForeground(new java.awt.Color(102, 102, 102));
        tablaPagos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Double(233.2), null},
                { new Double(12.2), null},
                { new Double(122.45), null},
                { new Double(344.3), null},
                { new Double(122.2), null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cantidad", "Concepto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaPagos1.setGridColor(new java.awt.Color(153, 153, 153));
        tablaPagos1.setRowHeight(20);
        tablaPagos1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tablaPagos.setViewportView(tablaPagos1);

        botonAgregarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Nuevo.png"))); // NOI18N
        botonAgregarPago.setPreferredSize(new java.awt.Dimension(73, 73));
        botonAgregarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPagoActionPerformed(evt);
            }
        });

        botonEliminarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Salir (1).png"))); // NOI18N
        botonEliminarPago.setPreferredSize(new java.awt.Dimension(73, 73));

        botonEditarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Editar.png"))); // NOI18N
        botonEditarPago.setPreferredSize(new java.awt.Dimension(73, 73));
        botonEditarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPagosLayout = new javax.swing.GroupLayout(panelPagos);
        panelPagos.setLayout(panelPagosLayout);
        panelPagosLayout.setHorizontalGroup(
            panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditarPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelPagosLayout.setVerticalGroup(
            panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablaPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelPagosLayout.createSequentialGroup()
                        .addComponent(botonAgregarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTotal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(102, 102, 102));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotal.setText("Total a Pagar:");

        campoTextoTotal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        campoTextoTotal.setForeground(new java.awt.Color(102, 102, 102));
        campoTextoTotal.setEnabled(false);

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(campoTextoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        campoTextoFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoTextoFecha.setForeground(new java.awt.Color(102, 102, 102));
        campoTextoFecha.setEnabled(false);

        labelFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(102, 102, 102));
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("Fecha:");

        labelFolio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelFolio.setForeground(new java.awt.Color(102, 102, 102));
        labelFolio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFolio.setText("Folio:");

        campoTextoFolio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoTextoFolio.setForeground(new java.awt.Color(102, 102, 102));
        campoTextoFolio.setEnabled(false);

        comboCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        comboCliente.setForeground(new java.awt.Color(102, 102, 102));
        comboCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Javier Antonio Humarán Peñuñuri", "José Ángel Solano Kirk", "Víctor Manuel Martínez Torres", " " }));
        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });

        labelCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(102, 102, 102));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("Cliente:");

        botonAceptar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(102, 102, 102));
        botonAceptar.setText("Aceptar");
        botonAceptar.setPreferredSize(new java.awt.Dimension(73, 73));
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(102, 102, 102));
        botonCancelar.setText("Cancelar");
        botonCancelar.setPreferredSize(new java.awt.Dimension(73, 73));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
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
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelFolio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTextoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFecha)
                            .addComponent(campoTextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFolio)
                            .addComponent(campoTextoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCliente)
                            .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAgregarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPagoActionPerformed
        NuevoPago agregarPago = new NuevoPago();
        agregarPago.setVisible(true);
    }//GEN-LAST:event_botonAgregarPagoActionPerformed

    private void botonEditarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarPagoActionPerformed
        NuevoPago agregarPago = new NuevoPago();
        agregarPago.setVisible(true);
    }//GEN-LAST:event_botonEditarPagoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPago().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAgregarPago;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditarPago;
    private javax.swing.JButton botonEliminarPago;
    private javax.swing.JTextField campoTextoFecha;
    private javax.swing.JTextField campoTextoFolio;
    private javax.swing.JTextField campoTextoTotal;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFolio;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelPagos;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JScrollPane tablaPagos;
    private javax.swing.JTable tablaPagos1;
    // End of variables declaration//GEN-END:variables
}
