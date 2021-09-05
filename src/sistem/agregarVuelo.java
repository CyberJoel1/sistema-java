/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Katherine
 */
public class agregarVuelo extends javax.swing.JInternalFrame {

    public agregarVuelo() {
        initComponents();
        cargarCheckBox();
    }

    public void cargarCheckBox(){
        //Se cargarán todos los años desde el 1920 al 2021 en los combobox de los años xd
        for (int i = 2099; i > 1920; i--) {
            añoPartidaCbox.addItem(String.valueOf(i));
            
        }
        for (int i = 30; i > 0; i--) {
            diaPartidaCbox.addItem(String.valueOf(i));
         
        }
        for (int i = 12; i > 0; i--) {
            mesPartidaCbox.addItem(String.valueOf(i));
            
        }
            try{
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT IDAVION, TIPOAVION FROM AVION";
            ResultSet resultado = sql.executeQuery(consulta);   
            
            while(resultado.next()){
                avionCbox.addItem(resultado.getString(1)+" - "+resultado.getString(2));
            }
            consulta = "SELECT NOMBREAEROPUERTO FROM AEROPUERTO";
            resultado = sql.executeQuery(consulta);   
            
            while(resultado.next()){
                AeropuertoCbox.addItem(resultado.getString(1));
            }
            resultado.close();
            sql.close();

        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        origenText = new javax.swing.JTextField();
        destinoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        añoPartidaCbox = new javax.swing.JComboBox<>();
        mesPartidaCbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        AeropuertoCbox = new javax.swing.JComboBox<>();
        diaPartidaCbox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        avionCbox = new javax.swing.JComboBox<>();
        añadirDOcenteButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Añadir Vuelo");
        setPreferredSize(new java.awt.Dimension(620, 400));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Añadir Vuelos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(origenText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, -1));
        jPanel1.add(destinoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 130, -1));

        jLabel2.setText("Aeropuerto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel3.setText("Destino");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel5.setText("Origen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.add(añoPartidaCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 80, -1));

        jPanel1.add(mesPartidaCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 60, -1));

        jLabel6.setText("Fecha de partida");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        AeropuertoCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AeropuertoCboxActionPerformed(evt);
            }
        });
        jPanel1.add(AeropuertoCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

        jPanel1.add(diaPartidaCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 60, -1));

        jLabel15.setText("Avion");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        avionCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionCboxActionPerformed(evt);
            }
        });
        jPanel1.add(avionCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 520, 310);
        jPanel1.getAccessibleContext().setAccessibleDescription("f");

        añadirDOcenteButton.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        añadirDOcenteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuario.png"))); // NOI18N
        añadirDOcenteButton.setText("AÑADIR");
        añadirDOcenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDOcenteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(añadirDOcenteButton);
        añadirDOcenteButton.setBounds(340, 320, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AeropuertoCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AeropuertoCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AeropuertoCboxActionPerformed
    public String buscar(String name) {
        String id_aeropuerto = "";
        try {
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT TOP 1 IDAEROPUERTO FROM AEROPUERTO WHERE NOMBREAEROPUERTO = '"+name+"'";
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
    private void añadirDOcenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirDOcenteButtonActionPerformed
        String Origen= origenText.getText();
        String Destino= destinoText.getText();
        String añoPartida=añoPartidaCbox.getSelectedItem().toString();
        String mesPartida=mesPartidaCbox.getSelectedItem().toString();
        String diaPartida=diaPartidaCbox.getSelectedItem().toString();
        String avion= avionCbox.getSelectedItem().toString();
        String aeropuerto=buscar(AeropuertoCbox.getSelectedItem().toString());
        //JOptionPane.showMessageDialog(null, AeropuertoCbox.getSelectedItem().toString());
        String id_avion="";
        boolean isnumber=true;
        int posicion1=0;
         int posicion2=1;       
        String altern_id="";
        do {

            id_avion = avion.substring(posicion1, posicion2);
            altern_id = avion.substring(posicion1 + 2, posicion2 + 2);
            if ((altern_id == "1" || altern_id == "2" || altern_id == "3" || altern_id == "4"
                    || altern_id == "5" || altern_id == "6" || altern_id == "7"
                    || altern_id == "8" || altern_id == "9") == false) {
                isnumber = false;
            }
            posicion1 += 2;
            posicion2 += 2;
        } while (isnumber);
        JOptionPane.showMessageDialog(null, id_avion);
        JOptionPane.showMessageDialog(null, aeropuerto);
        JOptionPane.showMessageDialog(null, Destino);
        JOptionPane.showMessageDialog(null, añoPartida);
       
        try {
            Connection con = Conectar.getConexion();

            String consulta = "INSERT INTO VUELO (IDAEROPUERTO"
                    + ",IDAVION, FECHAPARTIDAVUELO, DESTINOVUELO, ORIGENVUELO) "
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(aeropuerto));
            ps.setInt(2, Integer.parseInt(id_avion));
            ps.setDate(3, new Date(Integer.parseInt(añoPartida), Integer.parseInt(mesPartida), Integer.parseInt(diaPartida)));
            ps.setString(4, Destino);
            ps.setString(5, Origen);
            ps.executeUpdate();

            con.close();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_añadirDOcenteButtonActionPerformed

    private void avionCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avionCboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AeropuertoCbox;
    private javax.swing.JComboBox<String> avionCbox;
    private javax.swing.JButton añadirDOcenteButton;
    private javax.swing.JComboBox<String> añoPartidaCbox;
    private javax.swing.JTextField destinoText;
    private javax.swing.JComboBox<String> diaPartidaCbox;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mesPartidaCbox;
    private javax.swing.JTextField origenText;
    // End of variables declaration//GEN-END:variables
}
