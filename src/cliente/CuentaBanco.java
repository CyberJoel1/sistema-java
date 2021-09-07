
package cliente;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistem.Conectar;
import sistem.frm_InicioSesion;

public final class CuentaBanco extends javax.swing.JInternalFrame {
    frm_InicioSesion fis = new frm_InicioSesion();
    
    int id_cuenta;
    
    public CuentaBanco() throws SQLException {
        initComponents();
//        String id = fis.sesion_id.getText();
//        id.trim();
//        int id_cliente= Integer.parseInt(id);
        this.cargarDatos(52);
        this.cargarTarjetas(id_cuenta);
    }

    public void cargarDatos(int id) throws SQLException{
        try{
            Statement sql = Conectar.getConexion().createStatement();
            ResultSet rs = sql.executeQuery("SELECT cb.IDCUENTA,cb.NUMEROCUENTA,cb.TITULAR FROM CLIENTE c, dbo.CUENTA_BANCO cb WHERE c.IDCLIENTE="+id+" AND c.IDCUENTA=cb.IDCUENTA");
            if(rs.next()){
                this.id_cuenta = rs.getInt(1);
                this.tf_numCuenta.setText(rs.getString(2));
                this.tf_nomTitular.setText(rs.getString(3));
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar ",e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    public void cargarTarjetas(int id_cuenta){
        try{
            Statement sql = Conectar.getConexion().createStatement();
            ResultSet resultado = sql.executeQuery("SELECT * FROM dbo.TARJETA WHERE IDCUENTA="+id_cuenta+"");
            int columna=4;
            List<String> nom= new ArrayList<>();
            while(resultado.next()){
                for(int i=0;i<columna;i++){
                 nom.add(resultado.getString(i+1));
                System.out.println(resultado.getString(i+1));
                }
            }
            int contador=0;
            String nombre_array[][] = new String[nom.size()/columna][columna];
            for(int j=0;j<(nom.size()/columna);j++){
                for(int k=0;k<(columna);k++){
                nombre_array[j][k] =nom.get(contador);
                    contador++;
                }
            }
            resultado.close();
            sql.close();
            table_tarjetas.setModel(new javax.swing.table.DefaultTableModel(
                nombre_array,
                new String[]{"ID TARJETA", "ID CUENTA","NUMERO TARJETA", "CVV"}
            ));
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        
        
        
        
        try{
            Statement sql = Conectar.getConexion().createStatement();
            ResultSet rs = sql.executeQuery("SELECT * FROM dbo.TARJETA WHERE IDCUENTA="+id_cuenta+"");
            if(rs.next()){
                
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar ",e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nomTitular = new javax.swing.JTextField();
        tf_numCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_tarjetas = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TARJETAS REGISTRADAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 270, -1));

        jLabel2.setText("Nombre Titular");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("Numero de Cuenta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        tf_nomTitular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_nomTitular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tf_nomTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 220, -1));

        tf_numCuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_numCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(tf_numCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DATOS CUENTA BANCARIA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 270, -1));

        table_tarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_tarjetas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 400, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 450, 370));
        jPanel1.getAccessibleContext().setAccessibleName("Cuenta de Banco");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_tarjetas;
    private javax.swing.JTextField tf_nomTitular;
    private javax.swing.JTextField tf_numCuenta;
    // End of variables declaration//GEN-END:variables
}
