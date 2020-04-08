/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Archivo;
import javax.swing.ImageIcon;

import Modelo.Usuario;
import Control.UsuarioTrs;

/**
 *
 * @author Pablo Caiza
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private boolean mostrar = true;
    private String password = "";
    private Usuario usuarioActual;
    private Archivo file = new Archivo();
    private int intento = 0;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.jpeg")).getImage());
        setTitle("Ventana Login");
        ///
        jTextFieldClave.setVisible(false);
        formatear();
        ///
        //order de desplazamiento

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldClave = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jButtonVer = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelContro1 = new javax.swing.JLabel();
        jLabelContro2 = new javax.swing.JLabel();
        jLabelContro3 = new javax.swing.JLabel();
        jLabelContro4 = new javax.swing.JLabel();
        jLabelControl5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, 110));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText(" Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jButtonRegistrar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Siguiente");
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 110, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Correo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Crear Cuenta");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 40));
        getContentPane().add(jTextFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, 30));
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, 30));

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojoOculto.png"))); // NOI18N
        jButtonVer.setBorder(null);
        jButtonVer.setContentAreaFilled(false);
        jButtonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 60, 60));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, 30));

        jLabelContro1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro1.setText("Ingresa tu correo");
        getContentPane().add(jLabelContro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 110, 30));

        jLabelContro2.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro2.setText("Ingresa tu contraseña");
        getContentPane().add(jLabelContro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, 30));

        jLabelContro3.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro3.setText("Verifique el correo");
        getContentPane().add(jLabelContro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 110, 30));

        jLabelContro4.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro4.setText("Verifique la contraseña");
        getContentPane().add(jLabelContro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, 30));

        jLabelControl5.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl5.setText("Intento");
        getContentPane().add(jLabelControl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        // TODO add your handling code here:

        if (mostrar) {
            jTextFieldClave.setText(jPasswordField1.getText());
            jTextFieldClave.setVisible(true);
            jPasswordField1.setVisible(false);
            ImageIcon imagen = new ImageIcon(getClass().getResource("/images/ojo1.png"));
            jButtonVer.setIcon(imagen);
            mostrar = false;
        } else {
            jPasswordField1.setText(jTextFieldClave.getText());
            jTextFieldClave.setVisible(false);
            jPasswordField1.setVisible(true);
            ImageIcon imagen = new ImageIcon(getClass().getResource("/images/ojoOculto.png"));
            jButtonVer.setIcon(imagen);

            mostrar = true;

        }
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        formatear();

        if (camposVacios()) {
            //verificamos su existe el correo
            UsuarioTrs usuarioTrs = new UsuarioTrs();
            if (!usuarioTrs.disponibilidad(jTextFieldCorreo.getText().toLowerCase())) {
                //si existe
                Usuario auxiliar = usuarioTrs.ingresar(jTextFieldCorreo.getText().toLowerCase(), password);
                if (auxiliar != null) {//ingresa

                    String direccion = "Usuarios\\" + auxiliar.getCorreo() + ".dat";
                    System.out.println(direccion);

                    //descomentra despues
                    Menu menu = new Menu(direccion);
                    menu.setVisible(true);
                    this.dispose();
//                    Prueba1 prueba = new Prueba1(auxiliar);
//                    prueba.setVisible(true);
//                    this.dispose();

                } else {//no ingresa
                    intento++;
                    jLabelControl5.setText("Intento numero: " + intento);
                    jLabelControl5.setVisible(true);
                    jLabelContro4.setVisible(true);
                    if (intento == 3) {
                        System.exit(0);
                    }

                }
            } else {//no existe
                jLabelContro3.setVisible(true);

            }
        } else {
            encontrarCampos();
        }

    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Registro registro = new Registro();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void encontrarCampos() {
        if (password.equals("") && jTextFieldCorreo.getText().equals("")) {
            jLabelContro1.setVisible(true);
            jLabelContro2.setVisible(true);
        } else if (password.equals("")) {
            jLabelContro2.setVisible(true);
        } else if (jTextFieldCorreo.getText().equals("")) {
            jLabelContro1.setVisible(true);
        }
    }

    public boolean camposVacios() {
        if (!password.equals("") && !jTextFieldCorreo.getText().equals("")) {
            return true;
        }
        return false;
    }

    public void formatear() {
        jLabelControl5.setVisible(false);
        jLabelContro3.setVisible(false);
        jLabelContro4.setVisible(false);
        jLabelContro1.setVisible(false);
        jLabelContro2.setVisible(false);
        if (mostrar == false) {
            password = jTextFieldClave.getText();

        } else {
            password = jPasswordField1.getText();

        }

    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelContro1;
    private javax.swing.JLabel jLabelContro2;
    private javax.swing.JLabel jLabelContro3;
    private javax.swing.JLabel jLabelContro4;
    private javax.swing.JLabel jLabelControl5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
