
package sistem;

import cliente.CuentaBanco;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class frm_InicioSesion extends javax.swing.JFrame {
    
    public int id_sesion;
    String userADM;
    String passADM;
    
    public frm_InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton1 = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelos.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIO DE SESION ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 11, 246, 75));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 124, -1, 24));

        txt_user.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(153, 153, 153));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setToolTipText("Ingrese Usuario");
        txt_user.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        txt_user.setName("txt_user"); // NOI18N
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 104, 248, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 194, -1, -1));

        btn_iniciar.setBackground(new java.awt.Color(0, 204, 0));
        btn_iniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciar.setText("Iniciar Sesion");
        btn_iniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_iniciar.setFocusCycleRoot(true);
        btn_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarMouseClicked(evt);
            }
        });
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 274, 440, 39));
        btn_iniciar.getAccessibleContext().setAccessibleName("btn_sesion");
        btn_iniciar.getAccessibleContext().setAccessibleDescription("");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avion minimalis.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -19, -1, 480));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 144, 47));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrarme");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 344, 440, 40));

        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 183, 248, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        if((login(txt_user.getText(),txt_pass.getText()))==1){
            String user = this.userADM;
            String txtuser=user.replace(" ", "");
            System.out.println("USER: "+txtuser);
            String pass = this.passADM;
            String txtpass = user.replace(" ", "");
            System.out.println("PASS: "+txtpass);
            if( "admin".equals(txtuser) && "admin".equals(txtpass) ){
                Principal p = new Principal();
                p.setVisible(true);
                this.setVisible(false);               
            }else{
                frm_mainCliente fmc = new frm_mainCliente();
                fmc.txt_id_sesion.setText(""+this.id_sesion);
                fmc.txt_test_id.setText(""+this.id_sesion);
                fmc.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarMouseClicked
        
    }//GEN-LAST:event_btn_iniciarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        frm_nUsuario nu = new frm_nUsuario();
        nu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    public int login(String user,String pass){
        Integer resultado = 0;
        int id=0;
        frm_InicioSesion frm = new frm_InicioSesion();
        try{
            Statement sql = Conectar.getConexion().createStatement();
            ResultSet rs = sql.executeQuery("SELECT * FROM [agencia_vuelos].[dbo].[USUARIOWEB] WHERE NOMBREUSER='"+user+"' AND PASSUSER='"+pass+"' AND ESTADO = 1");
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                resultado = 1;
                this.id_sesion=rs.getInt(1);
                System.out.println(""+this.id_sesion);
                this.userADM=rs.getString(2);
                System.out.println(""+rs.getString(2));
                this.passADM=rs.getString(3);
                System.out.println(""+rs.getString(3));
            }else{
                JOptionPane.showMessageDialog(null, "Datos incorrectos o \n Usuario Inhabilitado ");
                resultado = 0;
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar ",e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_InicioSesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
