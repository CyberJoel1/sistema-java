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
public class agregarVuelo extends javax.swing.JInternalFrame {

    public int id_user;
    public agregarVuelo(int id) {
        initComponents();
        cargarCheckBox();
        this.id_user=id;
    }
        public agregarVuelo() {
        initComponents();
        cargarCheckBox();
   
    }

    public void cargarCheckBox(){
        try{
            Statement sql = Conectar.getConexion().createStatement();
            String consulta = "SELECT IDAVION, TIPOAVION FROM [agencia_vuelos].[dbo].AVION";
            ResultSet resultado = sql.executeQuery(consulta);   
            while(resultado.next()){
                avionCbox.addItem(resultado.getString(1)+" - "+resultado.getString(2));
            }

            consulta = "SELECT NOMBREAEROPUERTO FROM [agencia_vuelos].[dbo].AEROPUERTO";
            resultado = sql.executeQuery(consulta);   
            while(resultado.next()){
                AeropuertoCbox.addItem(resultado.getString(1));
            }
            
            cmb_pago.removeAllItems();
            consulta = "SELECT * FROM [agencia_vuelos].[dbo].[TIPO_PAGO]";
            resultado = sql.executeQuery(consulta);   
            while(resultado.next()){
                cmb_pago.addItem(resultado.getString(2));
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        origenText = new javax.swing.JTextField();
        destinoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AeropuertoCbox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        avionCbox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmb_clase = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmb_pago = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmb_tipoCompra = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_abono = new javax.swing.JTextField();
        añadirDOcenteButton = new javax.swing.JButton();
        calendar_fechaVuelo = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Añadir Vuelo");
        setPreferredSize(new java.awt.Dimension(620, 400));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Informacion Vuelo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(origenText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, -1));
        jPanel1.add(destinoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 240, -1));

        jLabel2.setText("TIPO DE PAGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel3.setText("Destino");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel5.setText("Origen");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel6.setText("Fecha de partida");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        AeropuertoCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AeropuertoCboxActionPerformed(evt);
            }
        });
        jPanel1.add(AeropuertoCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

        jLabel15.setText("Avion");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        avionCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionCboxActionPerformed(evt);
            }
        });
        jPanel1.add(avionCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, -1));

        jLabel4.setText("Aeropuerto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        cmb_clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera", "Economica", "Tercera" }));
        jPanel1.add(cmb_clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, -1));

        jLabel7.setText("Clase");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jPanel1.add(cmb_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 230, -1));

        jLabel1.setText("Tipo Compra");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        cmb_tipoCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserva", "Directa" }));
        jPanel1.add(cmb_tipoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 230, -1));

        jLabel8.setText("ABONO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txt_abono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 120, 30));

        añadirDOcenteButton.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        añadirDOcenteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuario.png"))); // NOI18N
        añadirDOcenteButton.setText("COMPRAR");
        añadirDOcenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDOcenteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(añadirDOcenteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 170, 40));
        jPanel1.add(calendar_fechaVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 240, -1));

        jTabbedPane1.addTab("Informacion Viaje", jPanel1);
        jPanel1.getAccessibleContext().setAccessibleDescription("f");

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 10, 520, 400);

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
        String Origen= origenText.getText();
        String Destino= destinoText.getText();
        String avion= avionCbox.getSelectedItem().toString();
        String aeropuerto=buscar(AeropuertoCbox.getSelectedItem().toString());
        String tipo_pago = cmb_pago.getSelectedItem().toString();
        String clase = cmb_clase.getSelectedItem().toString();
        String tipo_compra = cmb_tipoCompra.getSelectedItem().toString();
        float abono = Float.parseFloat(txt_abono.getText());
        java.util.Date fVuelo = calendar_fechaVuelo.getDate();
        java.sql.Date sqlfVuelo = convert(fVuelo);
        
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
//        JOptionPane.showMessageDialog(null, id_avion);
//        JOptionPane.showMessageDialog(null, aeropuerto);
//        JOptionPane.showMessageDialog(null, Destino);
//        JOptionPane.showMessageDialog(null, añoPartida);
       
        try {
            int id_cliente=0,id_boleto=0,id_pago=0;
            Statement sql = Conectar.getConexion().createStatement();
            ResultSet rsCliente = sql.executeQuery("SELECT * FROM [agencia_vuelos].[dbo].CLIENTE WHERE IDUSER="+id_user+"");
            if(rsCliente.next()){
                id_cliente=rsCliente.getInt(1);
            }
                                
            Connection con = Conectar.getConexion();
            String sqlBoleto = "INSERT INTO [agencia_vuelos].[dbo].[BOLETO]\n" +
                                "([ORIGEN],[DESTINO],[CLASE])\n" +
                                "VALUES	(?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(sqlBoleto);
            ps1.setString(1,Origen);
            ps1.setString(2,Destino);
            ps1.setString(3,clase);
            ps1.executeUpdate();
            ResultSet rsBoleto = sql.executeQuery("SELECT TOP(1)* FROM  [agencia_vuelos].[dbo].[BOLETO] ORDER BY IDBOLETO DESC");
            if(rsBoleto.next()){
                id_boleto=rsBoleto.getInt(1);
            }
            
            ResultSet rsPago = sql.executeQuery("SELECT [IDTIPOPAGO]      \n" +
                                                "  FROM [agencia_vuelos].[dbo].[TIPO_PAGO]\n" +
                                                "  WHERE DESCRIPCIONTIPO='"+tipo_pago+"'");
            if(rsPago.next()){
                id_pago=rsPago.getInt(1);
            }
            
            String sqlCompra = "INSERT INTO [agencia_vuelos].[dbo].[COMPRA_RESERVA]\n" +
                                "([IDCLIENTE],[IDBOLETO],[IDPAGO],[FECHA],[TIPOCOMPRA],[VALIDEZ],[ABONO])\n" +
                                "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement psCompra = con.prepareStatement(sqlCompra);
            psCompra.setInt(1,id_cliente);
            psCompra.setInt(2,id_boleto);
            psCompra.setInt(3,id_pago);
            psCompra.setDate(4,sqlfVuelo);
            psCompra.setString(5,tipo_compra);
            psCompra.setInt(6,1);
            psCompra.setFloat(7,abono);
            psCompra.executeUpdate();
            
            String consulta = "INSERT INTO [agencia_vuelos].[dbo].VUELO (IDAEROPUERTO"
                            + ",IDAVION, FECHAPARTIDAVUELO, DESTINOVUELO, ORIGENVUELO) "
                            + "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(aeropuerto));
            ps.setInt(2, Integer.parseInt(id_avion));
            ps.setDate(3,sqlfVuelo);
            ps.setString(4, Destino);
            ps.setString(5, Origen);
            ps.executeUpdate();
            
            con.close();
            ps.close();
            JOptionPane.showMessageDialog(null,"Se ha gurdado su compra \n Correctamente !!!! ");
            this.setVisible(false);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_añadirDOcenteButtonActionPerformed

    private void avionCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avionCboxActionPerformed

    private void AeropuertoCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AeropuertoCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AeropuertoCboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AeropuertoCbox;
    private javax.swing.JComboBox<String> avionCbox;
    private javax.swing.JButton añadirDOcenteButton;
    private com.toedter.calendar.JDateChooser calendar_fechaVuelo;
    private javax.swing.JComboBox<String> cmb_clase;
    private javax.swing.JComboBox<String> cmb_pago;
    private javax.swing.JComboBox<String> cmb_tipoCompra;
    private javax.swing.JTextField destinoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField origenText;
    private javax.swing.JTextField txt_abono;
    // End of variables declaration//GEN-END:variables
}
