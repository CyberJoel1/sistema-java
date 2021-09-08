package sistem;

import cliente.agregarVuelo;
import cliente.CuentaBanco;
import cliente.Vuelos;
import cliente.datosGenerales;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;


public class frm_mainCliente extends javax.swing.JFrame {

    frm_InicioSesion fis = new frm_InicioSesion();
    public String id_user;
    public frm_mainCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txt_id_sesion.setVisible(false);
        this.txt_test_id.setVisible(false);
    }
    
    
    public int capturaID(){
        int id=0;
        String id_aux = this.txt_id_sesion.getText();
        id = Integer.parseInt(id_aux);
        return id;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JDesktopPane();
        txt_id_sesion = new javax.swing.JTextField();
        txt_test_id = new java.awt.TextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        datosGenerales = new javax.swing.JMenu();
        cuentaBanco = new javax.swing.JMenu();
        vuelos = new javax.swing.JMenu();
        comprar = new javax.swing.JMenu();
        transferencias = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_sesion.setText("0");
        txt_id_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_sesionActionPerformed(evt);
            }
        });

        txt_test_id.setText("textField1");

        Contenedor.setLayer(txt_id_sesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(txt_test_id, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(txt_id_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(txt_test_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txt_id_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txt_test_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

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

        comprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comprar.setText("Comprar");
        comprar.setBorderPainted(true);
        comprar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarMouseClicked(evt);
            }
        });
        jMenuBar2.add(comprar);

        transferencias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transferencias.setText("Transferencias");
        transferencias.setBorderPainted(true);
        transferencias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        transferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferenciasMouseClicked(evt);
            }
        });
        jMenuBar2.add(transferencias);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuentaBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentaBancoMouseClicked
        int id_user = this.capturaID();
        System.out.println(""+id_user);
        try {
            System.out.println(""+this.txt_test_id.getText());
            CuentaBanco cb = new CuentaBanco(id_user);
            Contenedor.add(cb);
            cb.show();
        } catch (SQLException ex) {
            Logger.getLogger(frm_mainCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cuentaBancoMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        fis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void datosGeneralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosGeneralesMouseClicked
        int id_user = this.capturaID();
        System.out.println(""+id_user);
        try {
            datosGenerales dg = new datosGenerales(id_user);
            Contenedor.add(dg);
            dg.show();
        } catch (SQLException ex) {
            Logger.getLogger(frm_mainCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datosGeneralesMouseClicked

    private void vuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vuelosMouseClicked
        int id_user = this.capturaID();
        System.out.println(""+id_user);
        Vuelos v = new Vuelos(id_user);
        Contenedor.add(v);
        v.show();
    }//GEN-LAST:event_vuelosMouseClicked

    private void txt_id_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_sesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_sesionActionPerformed

    private void comprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseClicked
        int id_user = this.capturaID();
        System.out.println(""+id_user);
        agregarVuelo av = new agregarVuelo(id_user);
        Contenedor.add(av);
        av.show();
    }//GEN-LAST:event_comprarMouseClicked

    private void transferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferenciasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_transferenciasMouseClicked

    public static void main(String args[]) {
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
    private javax.swing.JMenu comprar;
    private javax.swing.JMenu cuentaBanco;
    private javax.swing.JMenu datosGenerales;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu transferencias;
    public javax.swing.JTextField txt_id_sesion;
    public java.awt.TextField txt_test_id;
    private javax.swing.JMenu vuelos;
    // End of variables declaration//GEN-END:variables
}
