
package sistem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frm_nUsuario extends javax.swing.JFrame {

    public frm_nUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpContenedor = new javax.swing.JTabbedPane();
        jp_personales = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jp_online = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_pass1 = new javax.swing.JPasswordField();
        txt_pass2 = new javax.swing.JPasswordField();
        jp_banco = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_nombreTitular = new javax.swing.JTextField();
        txt_numCuenta = new javax.swing.JTextField();
        txt_numTarjeta = new javax.swing.JTextField();
        txt_codigoCVV = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese Datos Solicitados");

        jpContenedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jp_personales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_personales.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 58, 235, -1));

        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_personales.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 105, 235, -1));

        txt_cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_personales.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 155, 235, -1));

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_personales.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 231, 235, -1));

        txt_date.setDateFormatString("dd/MM/yyyy");
        jp_personales.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 193, 235, -1));

        jLabel7.setText("Nombre");
        jp_personales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 61, -1, -1));

        jLabel8.setText("Apellido");
        jp_personales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 108, -1, -1));

        jLabel9.setText("Cedula");
        jp_personales.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 161, -1, -1));

        jLabel10.setText("Fecha Nacimiento");
        jp_personales.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 199, -1, -1));

        jLabel11.setText("Telefono");
        jp_personales.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 234, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ingrese Datos Personales");
        jp_personales.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 20, -1, -1));

        jpContenedor.addTab("Datos Personales", jp_personales);

        jp_online.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Seleccione su usuario y contraseña para realizar transacciones");
        jp_online.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, -1));

        jLabel2.setText("USUARIO");
        jp_online.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 84, -1, -1));

        jLabel3.setText("CONTRASEÑA");
        jp_online.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 139, -1, -1));

        jLabel4.setText("CONFIRMACION DE CONTRASEÑA");
        jp_online.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 195, -1, -1));

        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_online.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 81, 160, -1));

        txt_pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_online.add(txt_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 136, 160, -1));

        txt_pass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_online.add(txt_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 192, 160, -1));

        jpContenedor.addTab("Cuenta Online", jp_online);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingreso de datos de la cuenta bancaria");

        jLabel6.setText("Numero de Cuenta");

        jLabel14.setText("Nombre Titular");

        jLabel15.setText("Numero Tarjeta");

        jLabel16.setText("Codigo CVV");

        txt_nombreTitular.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_numCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_numTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_codigoCVV.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jp_bancoLayout = new javax.swing.GroupLayout(jp_banco);
        jp_banco.setLayout(jp_bancoLayout);
        jp_bancoLayout.setHorizontalGroup(
            jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_bancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(87, 87, 87))
            .addGroup(jp_bancoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigoCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jp_bancoLayout.setVerticalGroup(
            jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bancoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_nombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_numTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_codigoCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jpContenedor.addTab("Cuenta Banco", jp_banco);

        btn_registrar.setBackground(new java.awt.Color(0, 153, 255));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registrar.setFocusCycleRoot(true);
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarMouseClicked(evt);
            }
        });
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_regresar.setBackground(new java.awt.Color(0, 204, 0));
        btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("Regresar a Iniciar Sesion");
        btn_regresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpContenedor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseClicked
        String user = txt_usuario.getText();
        String pass1 = txt_pass1.getText();
        String pass2 = txt_pass1.getText();
        String numCuenta = txt_numCuenta.getText();
        String titular = txt_nombreTitular.getText();
        String numTarjeta = txt_numTarjeta.getText();
        String cvv = txt_codigoCVV.getText();
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String cedula = txt_cedula.getText();
        Date fNacimiento = txt_date.getDate();
        java.sql.Date sqlfNacimiento = convert(fNacimiento);
        String telefono = txt_telefono.getText();
        if(pass1.equals(pass2)){
            try {
            Connection con = Conectar.getConexion();
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "INSERT INTO dbo.USUARIOWEB(NOMBREUSER,PASSUSER,ESTADO)VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(consulta); ps.setString(1, user); ps.setString(2, pass1); ps.setInt(3, 1);
            ps.executeUpdate();
            
            String consulta_id_userWeb = "SELECT * FROM USUARIOWEB WHERE NOMBREUSER='"+user+"' AND PASSUSER='"+pass1+"' AND ESTADO = 1";
            ResultSet rs1 = sql.executeQuery(consulta_id_userWeb);
            int id_user_web=0;
            while(rs1.next()){ id_user_web=rs1.getInt(1);}
            
            String consulta2 = "INSERT INTO [dbo].[CUENTA_BANCO] ([NUMEROCUENTA],[TITULAR])VALUES (?,?)";
            PreparedStatement ps2 = con.prepareStatement(consulta2); ps2.setString(1, numCuenta); ps2.setString(2, titular); 
            ps2.executeUpdate();
            
            String consulta_id_cuenta = "SELECT * FROM dbo.CUENTA_BANCO WHERE NUMEROCUENTA='"+numCuenta+"' AND TITULAR ='"+titular+"';";
            ResultSet rs2 = sql.executeQuery(consulta_id_cuenta);
            int id_cuenta=0;
            while(rs2.next()){ id_cuenta=rs2.getInt(1);}
            
            String consulta3 = "INSERT INTO dbo.TARJETA(IDCUENTA,NUMEROTARJETA, CVVTARJETA)VALUES(?,?,?)";
            PreparedStatement ps3 = con.prepareStatement(consulta3); ps3.setInt(1, id_cuenta); ps3.setString(2, numTarjeta); ps3.setString(3, cvv);
            ps3.executeUpdate();
            
            String consulta4 = "INSERT INTO dbo.CLIENTE(IDCUENTA,IDUSER,NOMBRE,APELLIDO,CEDULA,FECHANACIMIENTO,TELEFONO)\n" +
                                                "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps4 = con.prepareStatement(consulta4); 
            ps4.setInt(1, id_cuenta); 
            ps4.setInt(2, id_user_web); 
            ps4.setString(3,nombre);
            ps4.setString(4,apellido);
            ps4.setString(5,cedula);
            ps4.setDate(6,sqlfNacimiento);
            ps4.setString(7, telefono);
            ps4.executeUpdate();
            con.close();
            ps.close();
            ps2.close();
            ps3.close();
            ps4.close();
            } catch (SQLException ex) {
                Logger.getLogger(frm_nUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Usuario Registrado al sistema Correctamente");
            frm_InicioSesion is = new frm_InicioSesion();
            this.setVisible(false);
            is.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Error de datos ingresados ");
        }
        
           
    }//GEN-LAST:event_btn_registrarMouseClicked

    private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        frm_InicioSesion f = new frm_InicioSesion();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarMouseClicked

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_nUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_nUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_nUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_nUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_nUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jpContenedor;
    private javax.swing.JPanel jp_banco;
    private javax.swing.JPanel jp_online;
    private javax.swing.JPanel jp_personales;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_codigoCVV;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreTitular;
    private javax.swing.JTextField txt_numCuenta;
    private javax.swing.JTextField txt_numTarjeta;
    private javax.swing.JPasswordField txt_pass1;
    private javax.swing.JPasswordField txt_pass2;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
