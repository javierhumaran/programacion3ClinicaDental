/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

/**
 *
 * @author JHumaran
 */
public class InformacionConsulta extends javax.swing.JFrame {

    /**
     * Creates new form InformacionConsulta
     */
    public InformacionConsulta() {
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

        labelCliente = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox();
        panelTrabajos = new javax.swing.JPanel();
        tablaTrabajos = new javax.swing.JScrollPane();
        tablaTrabajos1 = new javax.swing.JTable();
        botonAgregarTrabajo = new javax.swing.JButton();
        botonEliminarTrabajo = new javax.swing.JButton();
        botonEditarTrabajo = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        labelFecha = new javax.swing.JLabel();
        campoTextoFecha = new javax.swing.JTextField();
        labelFolio = new javax.swing.JLabel();
        campoTextoFolio = new javax.swing.JTextField();
        panelTotal = new javax.swing.JPanel();
        labelTotal = new javax.swing.JLabel();
        campoTextoTotal = new javax.swing.JTextField();
        botonEditarConsulta = new javax.swing.JButton();
        botonGuardarConsulta = new javax.swing.JButton();
        botonEliminarConsulta = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonAgregarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consulta");

        labelCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(102, 102, 102));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("Cliente:");

        comboCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        comboCliente.setForeground(new java.awt.Color(102, 102, 102));
        comboCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Javier Antonio Humarán Peñuñuri", "José Ángel Solano Kirk", "Víctor Manuel Martínez Torres", " " }));
        comboCliente.setEnabled(false);
        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });

        panelTrabajos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaTrabajos1.setAutoCreateRowSorter(true);
        tablaTrabajos1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tablaTrabajos1.setForeground(new java.awt.Color(102, 102, 102));
        tablaTrabajos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Extraccion", "Material1, Material2, Material3, Material 4",  new Double(233.2),  new Double(400.2)},
                {"Limpieza", "Material1, Material2, Material3, Material4",  new Double(12.2),  new Double(200.5)},
                {"Endodoncia", "Material1, Material2, Material3, Material4",  new Double(122.45),  new Double(400.5)},
                {"Brakets", "Material1, Material2, Material3, Material4",  new Double(344.3),  new Double(600.0)},
                {"Trabajo", "Material1, Material2, Material3, Material4",  new Double(122.2),  new Double(199.0)},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Trabajo Realizado", "Materiales", "Costo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaTrabajos1.setGridColor(new java.awt.Color(153, 153, 153));
        tablaTrabajos1.setRowHeight(20);
        tablaTrabajos1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tablaTrabajos.setViewportView(tablaTrabajos1);

        botonAgregarTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Nuevo.png"))); // NOI18N
        botonAgregarTrabajo.setEnabled(false);
        botonAgregarTrabajo.setPreferredSize(new java.awt.Dimension(73, 73));
        botonAgregarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTrabajoActionPerformed(evt);
            }
        });

        botonEliminarTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Salir (1).png"))); // NOI18N
        botonEliminarTrabajo.setEnabled(false);
        botonEliminarTrabajo.setPreferredSize(new java.awt.Dimension(73, 73));

        botonEditarTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Editar.png"))); // NOI18N
        botonEditarTrabajo.setEnabled(false);
        botonEditarTrabajo.setPreferredSize(new java.awt.Dimension(73, 73));
        botonEditarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarTrabajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTrabajosLayout = new javax.swing.GroupLayout(panelTrabajos);
        panelTrabajos.setLayout(panelTrabajosLayout);
        panelTrabajosLayout.setHorizontalGroup(
            panelTrabajosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaTrabajos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTrabajosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrabajosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonAgregarTrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEliminarTrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonEditarTrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelTrabajosLayout.setVerticalGroup(
            panelTrabajosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrabajosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablaTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTrabajosLayout.createSequentialGroup()
                        .addComponent(botonAgregarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(102, 102, 102));
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("Fecha:");

        campoTextoFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoTextoFecha.setForeground(new java.awt.Color(102, 102, 102));
        campoTextoFecha.setEnabled(false);

        labelFolio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelFolio.setForeground(new java.awt.Color(102, 102, 102));
        labelFolio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFolio.setText("Folio:");

        campoTextoFolio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campoTextoFolio.setForeground(new java.awt.Color(102, 102, 102));
        campoTextoFolio.setEnabled(false);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelFolio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(campoTextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFolio)
                    .addComponent(campoTextoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTotal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(102, 102, 102));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotal.setText("Total de la Consulta:");

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

        botonEditarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Editar.png"))); // NOI18N
        botonEditarConsulta.setPreferredSize(new java.awt.Dimension(73, 73));
        botonEditarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarConsultaActionPerformed(evt);
            }
        });

        botonGuardarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Guardar.png"))); // NOI18N
        botonGuardarConsulta.setEnabled(false);
        botonGuardarConsulta.setPreferredSize(new java.awt.Dimension(73, 73));
        botonGuardarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarConsultaActionPerformed(evt);
            }
        });

        botonEliminarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Eliminar.png"))); // NOI18N
        botonEliminarConsulta.setPreferredSize(new java.awt.Dimension(73, 73));
        botonEliminarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarConsultaActionPerformed(evt);
            }
        });

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

        botonAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/AgregarCliente.png"))); // NOI18N
        botonAgregarCliente.setEnabled(false);
        botonAgregarCliente.setPreferredSize(new java.awt.Dimension(73, 73));
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTrabajos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCliente)
                        .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botonEliminarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteActionPerformed

    private void botonEditarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarConsultaActionPerformed
        comboCliente.setEnabled(true);
        botonAgregarTrabajo.setEnabled(true);
        botonEditarTrabajo.setEnabled(true);
        botonEliminarTrabajo.setEnabled(true);
        botonGuardarConsulta.setEnabled(true);
        botonAgregarCliente.setEnabled(true);
        botonEditarConsulta.setEnabled(false);
    }//GEN-LAST:event_botonEditarConsultaActionPerformed

    private void botonGuardarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarConsultaActionPerformed
        comboCliente.setEnabled(false);
        botonAgregarTrabajo.setEnabled(false);
        botonEditarTrabajo.setEnabled(false);
        botonEliminarTrabajo.setEnabled(false);
        botonGuardarConsulta.setEnabled(false);
        botonAgregarCliente.setEnabled(false);
        botonEditarConsulta.setEnabled(true);
    }//GEN-LAST:event_botonGuardarConsultaActionPerformed

    private void botonEliminarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarConsultaActionPerformed
        dispose();
    }//GEN-LAST:event_botonEliminarConsultaActionPerformed

    private void botonAgregarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTrabajoActionPerformed
        AgregarTrabajo nuevoTrabajo = new AgregarTrabajo();
        nuevoTrabajo.setVisible(true);
    }//GEN-LAST:event_botonAgregarTrabajoActionPerformed

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        AgregarCliente nuevoCliente = new AgregarCliente();
        nuevoCliente.setVisible(true);
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEditarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarTrabajoActionPerformed
        AgregarTrabajo nuevoTrabajo = new AgregarTrabajo();
        nuevoTrabajo.setVisible(true);
    }//GEN-LAST:event_botonEditarTrabajoActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionConsulta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonAgregarTrabajo;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditarConsulta;
    private javax.swing.JButton botonEditarTrabajo;
    private javax.swing.JButton botonEliminarConsulta;
    private javax.swing.JButton botonEliminarTrabajo;
    private javax.swing.JButton botonGuardarConsulta;
    private javax.swing.JTextField campoTextoFecha;
    private javax.swing.JTextField campoTextoFolio;
    private javax.swing.JTextField campoTextoTotal;
    private javax.swing.JComboBox comboCliente;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFolio;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JPanel panelTrabajos;
    private javax.swing.JScrollPane tablaTrabajos;
    private javax.swing.JTable tablaTrabajos1;
    // End of variables declaration//GEN-END:variables
}
