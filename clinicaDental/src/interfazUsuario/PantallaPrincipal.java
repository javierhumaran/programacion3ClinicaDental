/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

/**
 *
 * @author JHumaran
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        botonClientes = new javax.swing.JButton();
        botonConsultas = new javax.swing.JButton();
        botonIngresos = new javax.swing.JButton();
        botonMateriales = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();
        labelClientes = new javax.swing.JLabel();
        labelConsultas = new javax.swing.JLabel();
        labelIngresos = new javax.swing.JLabel();
        labelMateriales = new javax.swing.JLabel();
        labelReportes = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Clinica Dental");
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Clientes.png"))); // NOI18N
        botonClientes.setPreferredSize(new java.awt.Dimension(73, 73));
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Consultas.png"))); // NOI18N
        botonConsultas.setPreferredSize(new java.awt.Dimension(73, 73));
        botonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultasActionPerformed(evt);
            }
        });

        botonIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Ingresos.png"))); // NOI18N
        botonIngresos.setPreferredSize(new java.awt.Dimension(73, 73));
        botonIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresosActionPerformed(evt);
            }
        });

        botonMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Materiales.png"))); // NOI18N
        botonMateriales.setPreferredSize(new java.awt.Dimension(73, 73));
        botonMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMaterialesActionPerformed(evt);
            }
        });

        botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazUsuario/img/Reportes.png"))); // NOI18N
        botonReportes.setPreferredSize(new java.awt.Dimension(73, 73));
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        labelClientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelClientes.setForeground(new java.awt.Color(102, 102, 102));
        labelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClientes.setText("Clientes");

        labelConsultas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelConsultas.setForeground(new java.awt.Color(102, 102, 102));
        labelConsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsultas.setText("Consultas");
        labelConsultas.setToolTipText("");

        labelIngresos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelIngresos.setForeground(new java.awt.Color(102, 102, 102));
        labelIngresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngresos.setText("Ingresos");
        labelIngresos.setToolTipText("");

        labelMateriales.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelMateriales.setForeground(new java.awt.Color(102, 102, 102));
        labelMateriales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMateriales.setText("Materiales");
        labelMateriales.setToolTipText("");

        labelReportes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelReportes.setForeground(new java.awt.Color(102, 102, 102));
        labelReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReportes.setText("Reportes");
        labelReportes.setToolTipText("");

        botonSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonCerrarSesion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonCerrarSesion.setForeground(new java.awt.Color(102, 102, 102));
        botonCerrarSesion.setText("Cerrar Sesión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClientes)
                    .addComponent(labelConsultas)
                    .addComponent(labelIngresos)
                    .addComponent(labelMateriales)
                    .addComponent(labelReportes))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(botonCerrarSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        AdministrarClientes abrirClientes = new AdministrarClientes();
        abrirClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultasActionPerformed
        AdministrarConsultas abrirConsultas = new AdministrarConsultas();
        abrirConsultas.setVisible(true);
    }//GEN-LAST:event_botonConsultasActionPerformed

    private void botonIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresosActionPerformed
        AdministrarIngresos abrirIngresos = new AdministrarIngresos();
        abrirIngresos.setVisible(true);
    }//GEN-LAST:event_botonIngresosActionPerformed

    private void botonMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMaterialesActionPerformed
        AdministrarMateriales abrirMateriales = new AdministrarMateriales();
        abrirMateriales.setVisible(true);
    }//GEN-LAST:event_botonMaterialesActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        AdministrarReportes abrirReportes = new AdministrarReportes();
        abrirReportes.setVisible(true);
    }//GEN-LAST:event_botonReportesActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonConsultas;
    private javax.swing.JButton botonIngresos;
    private javax.swing.JButton botonMateriales;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel labelClientes;
    private javax.swing.JLabel labelConsultas;
    private javax.swing.JLabel labelIngresos;
    private javax.swing.JLabel labelMateriales;
    private javax.swing.JLabel labelReportes;
    // End of variables declaration//GEN-END:variables
}