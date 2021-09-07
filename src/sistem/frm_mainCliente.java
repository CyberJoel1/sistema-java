/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;

import cliente.CuentaBanco;
import cliente.Vuelos;
import cliente.datosGenerales;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author iAmPocho
 */
public class frm_mainCliente extends javax.swing.JFrame {

    frm_InicioSesion fis = new frm_InicioSesion();

    public frm_mainCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        String id = fis.sesion_id.getText();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        datosGenerales = new javax.swing.JMenu();
        cuentaBanco = new javax.swing.JMenu();
        vuelos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jMenuBar2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar2.setMargin(new java.awt.Insets(5, 0, 5, 0));

        datosGenerales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datosGenerales.setText("Datos Generales");
        datosGenerales.setBorderPainted(true);
        datosGenerales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        datosGenerales.setMargin(new java.awt.Insets(0, 5, 0, 5));
        datosGenerales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosGeneralesMouseClicked(evt);
            }
        });
        jMenuBar2.add(datosGenerales);

        cuentaBanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuentaBanco.setText("Cuenta Bancaria");
        cuentaBanco.setBorderPainted(true);
        cuentaBanco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cuentaBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuentaBancoMouseClicked(evt);
            }
        });
        jMenuBar2.add(cuentaBanco);

        vuelos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vuelos.setText("Vuelos Registrado");
        vuelos.setBorderPainted(true);
        vuelos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vuelosMouseClicked(evt);
            }
        });
        jMenuBar2.add(vuelos);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Cerrar Sesion");
        jMenu1.setBorderPainted(true);
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuentaBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentaBancoMouseClicked
        try {
            CuentaBanco cb = new CuentaBanco();
            Contenedor.add(cb);
            cb.show();
        } catch (SQLException ex) {
            Logger.getLogger(frm_mainCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cuentaBancoMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        fis.id_sesion=0;
        fis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void datosGeneralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosGeneralesMouseClicked
        try {
            datosGenerales dg = new datosGenerales();
            Contenedor.add(dg);
            dg.show();
        } catch (SQLException ex) {
            Logger.getLogger(frm_mainCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datosGeneralesMouseClicked

    private void vuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vuelosMouseClicked
        Vuelos v = new Vuelos();
        Contenedor.add(v);
        v.show();
    }//GEN-LAST:event_vuelosMouseClicked

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
            java.util.logging.Logger.getLogger(frm_mainCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_mainCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_mainCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_mainCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_mainCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Contenedor;
    private javax.swing.JMenu cuentaBanco;
    private javax.swing.JMenu datosGenerales;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu vuelos;
    // End of variables declaration//GEN-END:variables
}
