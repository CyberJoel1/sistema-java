/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.JOptionPane;
import sistem.Conectar;

/**
 *
 * @author Katherine
 */
public class editarCliente extends javax.swing.JInternalFrame {

    public int id_user;

        public editarCliente() {
        initComponents();
        cargarCheckBox();
   
    }

    public void cargarCheckBox(){
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cedulaText = new javax.swing.JTextField();
        apellidoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        buscarVueloButton = new javax.swing.JButton();
        calendar_nacimiento = new com.toedter.calendar.JDateChooser();
        nombreText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        editarVueloButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Añadir Vuelo");
        setPreferredSize(new java.awt.Dimension(620, 400));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Informacion Vuelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(cedulaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, -1));

        apellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextActionPerformed(evt);
            }
        });
        jPanel1.add(apellidoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, -1));

        jLabel5.setText("Cedula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 120, -1));

        buscarVueloButton.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        buscarVueloButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuario.png"))); // NOI18N
        buscarVueloButton.setText("BUSCAR");
        buscarVueloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVueloButtonActionPerformed(evt);
            }
        });
        jPanel1.add(buscarVueloButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, 40));
        jPanel1.add(calendar_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 240, -1));
        jPanel1.add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, -1));

        jLabel9.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel10.setText("Nombre");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        editarVueloButton1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        editarVueloButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuario.png"))); // NOI18N
        editarVueloButton1.setText("EDITAR");
        editarVueloButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarVueloButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(editarVueloButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 170, 40));

        jTabbedPane1.addTab("Informacion Viaje", jPanel1);
        jPanel1.getAccessibleContext().setAccessibleDescription("f");

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 10, 520, 400);

        getAccessibleContext().setAccessibleName("Comprar Vuelo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    
    private void buscarVueloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVueloButtonActionPerformed
            String cedula= cedulaText.getText();
if(!cedula.equalsIgnoreCase("")){
    

        try {
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT [IDCLIENTE]\n" +
"      ,[NOMBRE]\n" +
"      ,[APELLIDO]\n" +
"      ,[CEDULA]\n" +
"      ,[FECHANACIMIENTO]\n" +
"      ,[TELEFONO]\n" +
"  FROM [agencia_vuelos].[dbo].[CLIENTE]\n" +
"  WHERE [CEDULA]= "+cedula+";";
            ResultSet resultado = sql.executeQuery(consulta);
            while (resultado.next()) {
                 nombreText.setText(resultado.getString(2).trim());
                 apellidoText.setText(resultado.getString(3).trim());
                 txt_telefono.setText(resultado.getString(6).trim());
                 calendar_nacimiento.setDate(resultado.getDate(5));
            }



            resultado.close();
            sql.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
}else{
    JOptionPane.showMessageDialog(null, "Porfavor ingrese una cedula");
}
       
    
    }//GEN-LAST:event_buscarVueloButtonActionPerformed

    private void editarVueloButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarVueloButton1ActionPerformed
              String cedula= cedulaText.getText();
        String apellido= apellidoText.getText();
        String nombre= nombreText.getText();
        String telefono=txt_telefono.getText();

        java.util.Date fVuelo = calendar_nacimiento.getDate();
        java.sql.Date sqlfVuelo = convert(fVuelo);
        Date sa = sqlfVuelo;
        JOptionPane.showMessageDialog(null,sa );
        if(!cedula.equalsIgnoreCase("")){
       // Date sa= sqlfVuelo;

        try {
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "UPDATE [dbo].[CLIENTE]\n" +
"   SET [NOMBRE] = '"+nombre+"'\n" +
"      ,[APELLIDO] = '"+apellido+"'\n" +
"      ,[FECHANACIMIENTO] = "+sa+" \n" +
"      ,[TELEFONO] = "+telefono+"\n" +
" WHERE [CEDULA] = "+cedula;
            sql.executeUpdate(consulta);
            sql.close();
            JOptionPane.showMessageDialog(null, "Cliente actualizado");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
}else{
    JOptionPane.showMessageDialog(null, "Porfavor ingrese una cedula");
}
        
        
    }//GEN-LAST:event_editarVueloButton1ActionPerformed

    private void apellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTextActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoText;
    private javax.swing.JButton buscarVueloButton;
    private com.toedter.calendar.JDateChooser calendar_nacimiento;
    private javax.swing.JTextField cedulaText;
    private javax.swing.JButton editarVueloButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
