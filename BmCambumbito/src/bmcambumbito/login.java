
package bmcambumbito;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Oliver Smit, Camil Agramonte y Luis Feliz <BmCambumbito at gmail.com>
 */
public class login extends javax.swing.JFrame {
String lleva = "";
   
    public login() {
        initComponents();
        setLayout(null);
        this.setLocationRelativeTo(null);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("img/ice.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 146, 320, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 397, 320, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 283, 320, 11));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmcambumbito/img/lock.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 364, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmcambumbito/img/email_mail_4598.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 247, 25, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmcambumbito/img/585e4be1cb11b227491c3398.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 115, 25, -1));

        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmcambumbito/img/gradient.jpg"))); // NOI18N
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        iniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iniciarKeyPressed(evt);
            }
        });
        jPanel2.add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 290, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 330, 181, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 80, 181, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Corbel", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Correo Electronico");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 216, 181, -1));

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Corbel", 2, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setBorder(null);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 127, 320, 20));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Corbel", 2, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 267, 320, 20));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setBorder(null);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 320, -1));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Corbel", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 204));
        jLabel7.setText("©2018-BM CAMBUMBITO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 0, 410, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmcambumbito/img/ice.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 230, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Dekstop\\Progamacion\\Java\\java con willis\\examen final\\BmCambumbito\\src\\bmcambumbito\\img\\Sin título.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 270, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Dekstop\\Progamacion\\Java\\java con willis\\examen final\\BmCambumbito\\src\\bmcambumbito\\img\\bglogin.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false"; 
        
       try{
             Connection conexion = (Connection) DriverManager.getConnection(url, "root", "Chino123");
                     Statement instruccion = conexion.createStatement();
                                 String sql = "select  user,mail,pass,nombre,genero,admin from usuarios";
        ResultSet result = instruccion.executeQuery(sql);
           String user = usuario.getText();
        String pass = password.getText();
        String mail = email.getText();
        while (result.next()) {
       if(user.equals(result.getString(1)) && mail.equals(result.getString(2)) && pass.equals(result.getString(3))){
           if(result.getString(5).equals("Masculino")&& result.getString(6).equals("si")){
               JOptionPane.showMessageDialog(null,"Bienvenido "+result.getString(4));
               lleva = result.getString(4);
           new admin().setVisible(true);
           this.setVisible(false);  
           }else if(result.getString(5).equals("Masculino")&& result.getString(6).equals("no")){
               JOptionPane.showMessageDialog(null,"Bienvenido "+result.getString(4));
               lleva = result.getString(4);
           new app().setVisible(true);
           this.setVisible(false);  
           }
           else if(result.getString(5).equals("Femenino")&& result.getString(6).equals("si")){
           JOptionPane.showMessageDialog(null,"Bienvenida "+result.getString(4));
           lleva = result.getString(4);
           new admin().setVisible(true);
           this.setVisible(false);  
            }else if(result.getString(5).equals("Femenino")&& result.getString(6).equals("no")){
           JOptionPane.showMessageDialog(null,"Bienvenida "+result.getString(4));
           lleva = result.getString(4);
           new app().setVisible(true);
           this.setVisible(false);  
            }
       }
   
        }
        if(mail.equals("") || user.equals("")|| pass.equals(""))JOptionPane.showMessageDialog(null,"Por favor llenar todos los espacios");
       else if(!mail.equals("") || !user.equals("")|| !pass.equals(""))JOptionPane.showMessageDialog(null,"Los datos introduccidos son incorrectos");
       
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
        
        
    }//GEN-LAST:event_iniciarActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void iniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iniciarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
     new login().setResizable(false);
        new login().setLocationRelativeTo(null);
        
   
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

 
}
