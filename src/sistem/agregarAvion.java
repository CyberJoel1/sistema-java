/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;
import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author Katherine
 */
public class agregarAvion extends javax.swing.JInternalFrame {

    public agregarAvion() {
        initComponents();
        cargarCheckBox();
    }

    public void cargarCheckBox() {
        //Se cargarán todas las aerolineas
        try{
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT RUCAEROLINEA FROM AEROLINEA";
            ResultSet resultado = sql.executeQuery(consulta);   
            
            while(resultado.next()){
                rucDisponibleCbox.addItem(resultado.getString(1));
            }
          
            resultado.close();
            sql.close();

        }catch(SQLException e){
            System.out.println(e.toString());
        }
            estadoAvionCbox.addItem("DISPONIBLE");
            estadoAvionCbox.addItem("NO DISPONIBLE");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCategoría = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        fabricanteAviontxt = new javax.swing.JTextField();
        tipoAviontxt = new javax.swing.JTextField();
        capacidadAviontxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rucDisponibleCbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        estadoAvionCbox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        añadirAvionButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Añadir avion");
        setPreferredSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Añadir Avion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fabricanteAviontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, -1));

        tipoAviontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAviontxtActionPerformed(evt);
            }
        });
        jPanel1.add(tipoAviontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, -1));

        capacidadAviontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadAviontxtActionPerformed(evt);
            }
        });
        jPanel1.add(capacidadAviontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        jLabel3.setText("TIPO AVION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setText("CAPACIDAD AVION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setText("FABRICANTE AVION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        rucDisponibleCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rucDisponibleCboxActionPerformed(evt);
            }
        });
        jPanel1.add(rucDisponibleCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 140, -1));

        jLabel6.setText("RUC DISPONIBLES DE AEROLINEAS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        estadoAvionCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoAvionCboxActionPerformed(evt);
            }
        });
        jPanel1.add(estadoAvionCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 120, -1));

        jLabel9.setText("ESTADO DEL AVION");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 580, 350);

        añadirAvionButton.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        añadirAvionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuario.png"))); // NOI18N
        añadirAvionButton.setText("AÑADIR");
        añadirAvionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirAvionButtonMouseClicked(evt);
            }
        });
        añadirAvionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirAvionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(añadirAvionButton);
        añadirAvionButton.setBounds(450, 360, 130, 41);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String buscar(String ruc){
        String id_aerolinea="";
        try {
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT TOP 1 IDAEROLINEA FROM AEROLINEA"
                    + " WHERE RUCAEROLINEA="+ruc;
            ResultSet resultado = sql.executeQuery(consulta);
            while(resultado.next()){
            id_aerolinea=resultado.getString(1);
            }
            resultado.close();
            sql.close();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id_aerolinea;
    }
    private void añadirAvionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirAvionButtonActionPerformed
        String id_aerolinea= buscar(rucDisponibleCbox.getSelectedItem().toString());
        String fabricanteAvion=fabricanteAviontxt.getText();
        String capacidadAvion=capacidadAviontxt.getText();
        String tipoAvion=tipoAviontxt.getText();
        String estadoAvion= estadoAvionCbox.getSelectedItem().toString();
        int aerolinea=Integer.parseInt(id_aerolinea);
        int capacidad=Integer.parseInt(capacidadAvion);
        try {
            Connection con = Conectar.getConexion();

            String consulta = "INSERT INTO AVION (FABRICANTEAVION"
                    + ",IDAEROLINEA, TIPOAVION, CAPACIDADAVION, ESTADOAVION) "
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, fabricanteAvion);
            ps.setInt(2, aerolinea);
            ps.setString(3, tipoAvion);
            ps.setInt(4, capacidad);
            if (estadoAvion.equalsIgnoreCase("DISPONIBLE")) {
                ps.setBoolean(5, true);
            } else {
                ps.setBoolean(5, false);
            }
            ps.executeUpdate();

            con.close();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        

    }//GEN-LAST:event_añadirAvionButtonActionPerformed

    private void rucDisponibleCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rucDisponibleCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rucDisponibleCboxActionPerformed

    private void estadoAvionCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoAvionCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoAvionCboxActionPerformed

    private void capacidadAviontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadAviontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadAviontxtActionPerformed

    private void tipoAviontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAviontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoAviontxtActionPerformed

    private void añadirAvionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirAvionButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirAvionButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirAvionButton;
    private javax.swing.JTextField capacidadAviontxt;
    private javax.swing.JComboBox<String> estadoAvionCbox;
    private javax.swing.JTextField fabricanteAviontxt;
    private javax.swing.ButtonGroup grupoCategoría;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> rucDisponibleCbox;
    private javax.swing.JTextField tipoAviontxt;
    // End of variables declaration//GEN-END:variables
}
