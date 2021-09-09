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
public class editarVuelo extends javax.swing.JInternalFrame {

    public int id_user;
    public editarVuelo(int id) {
        initComponents();
        cargarCheckBox();
        this.id_user=id;
    }
        public editarVuelo() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        añadirDOcenteButton = new javax.swing.JButton();
        nboleto = new javax.swing.JTextField();
        nvuelo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Añadir Vuelo");
        setPreferredSize(new java.awt.Dimension(620, 400));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Informacion Vuelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Id vuelo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setText("Numero de boleto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        añadirDOcenteButton.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        añadirDOcenteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuario.png"))); // NOI18N
        añadirDOcenteButton.setText("EDITAR");
        añadirDOcenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDOcenteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(añadirDOcenteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 40));
        jPanel1.add(nboleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, -1));
        jPanel1.add(nvuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, -1));

        jTabbedPane1.addTab("Informacion Viaje", jPanel1);
        jPanel1.getAccessibleContext().setAccessibleDescription("f");

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 10, 280, 330);

        getAccessibleContext().setAccessibleName("Comprar Vuelo");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String buscar(String name) {
        String id_aeropuerto = "";
        try {
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT TOP 1 IDAEROPUERTO FROM [agencia_vuelos].[dbo].AEROPUERTO WHERE NOMBREAEROPUERTO = '"+name+"'";
           // JOptionPane.showMessageDialog(null, consulta);
            ResultSet resultado = sql.executeQuery(consulta);
            while (resultado.next()) {
                id_aeropuerto = resultado.getString(1);
            }
            resultado.close();
            sql.close();
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id_aeropuerto;
    }
    
    private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    
    private void añadirDOcenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirDOcenteButtonActionPerformed
        String boleto= nboleto.getText();
        int boleto1=Integer.parseInt(boleto);
        String vuelo= nvuelo.getText();
        int vuelo1= Integer.parseInt(vuelo);
        try {
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "UPDATE [dbo].[CHECKIN]\n"
                    + "   SET [IDVUELO] = " +vuelo1+ " \n"
                    + " WHERE [IDBOLETO]= " +boleto1 ;
            sql.executeUpdate(consulta);
            sql.close();
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_añadirDOcenteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirDOcenteButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nboleto;
    private javax.swing.JTextField nvuelo;
    // End of variables declaration//GEN-END:variables
}
