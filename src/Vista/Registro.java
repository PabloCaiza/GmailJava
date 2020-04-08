
package Vista;

import Vista.Login;
import Modelo.Mensaje;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Control.Archivo;
import Control.MyOwnFocusTraversalPolicy;
import Modelo.Usuario;
import Control.UsuarioTrs;
import Modelo.Grupo;
import java.awt.Component;
import java.util.Vector;

/**
 *
 * @author Pablo Caiza
 */
public class Registro extends javax.swing.JFrame {

    String password1 = "", password2 = "";
    boolean mostrar = true;
    ArrayList<Usuario> listaAmigo = new ArrayList<>();
    ArrayList<Mensaje> listaEnviados = new ArrayList<>();
    ArrayList<Mensaje> listaRecibidos = new ArrayList<>();
    ArrayList<Mensaje>listaBorrador=new ArrayList<>();
    ArrayList<Grupo> listaGrupos = new ArrayList<>();
    
    
    ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/images/profile1.png"));

    /**
     *
     */
    public Registro() {

        initComponents();
        //--------------
        formatear();

        //----------------
        this.setLocationRelativeTo(null);
        //ordenar el desplazamiento con el tab
        Vector<Component>order=new Vector<Component>(8);
        order.add(jTextFieldNombre);
        order.add(jTextFieldCorreo);
        order.add(jPasswordField1);
        order.add(jPasswordField2);
        order.add(jButtonRegistrar);
        order.add(jButton1);
        MyOwnFocusTraversalPolicy newPolicy=new MyOwnFocusTraversalPolicy(order);
        this.setFocusTraversalPolicy(newPolicy);
        jTextFieldclave1.setVisible(false);
        jTextFieldClave2.setVisible(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.jpeg")).getImage());

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextFieldclave1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextFieldClave2 = new javax.swing.JTextField();
        jButtonVer = new javax.swing.JButton();
        jLabelContro6 = new javax.swing.JLabel();
        jLabelContro8 = new javax.swing.JLabel();
        jLabelContro5 = new javax.swing.JLabel();
        jLabelContro7 = new javax.swing.JLabel();
        jLabelContro4 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelContro1 = new javax.swing.JLabel();
        jLabelContro3 = new javax.swing.JLabel();
        jLabelControl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 110, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Acceder a tu cuenta");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 40));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));
        jPanel1.add(jTextFieldclave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, 30));
        jPanel1.add(jTextFieldClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, 30));

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojoOculto.png"))); // NOI18N
        jButtonVer.setBorder(null);
        jButtonVer.setContentAreaFilled(false);
        jButtonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 60, 40));

        jLabelContro6.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro6.setText("Ingresa un correo valido");
        jPanel1.add(jLabelContro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 140, 30));

        jLabelContro8.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro8.setText("Este correo de usuario ya está en uso, Elige otro");
        jPanel1.add(jLabelContro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 290, 30));

        jLabelContro5.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro5.setText("Ingresa tu nombre");
        jPanel1.add(jLabelContro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 140, 30));

        jLabelContro7.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro7.setText("Ingrese una contraseña");
        jPanel1.add(jLabelContro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 30));

        jLabelContro4.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro4.setText("Vuelve a intentarlo");
        jPanel1.add(jLabelContro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 140, 30));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 30));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Correo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Confirmacion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabelContro1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro1.setText("Usa 8 caracteres o más ");
        jPanel1.add(jLabelContro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 30));

        jLabelContro3.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro3.setText("Las contraseñas no coinciden. ");
        jPanel1.add(jLabelContro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 30));

        jLabelControl2.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl2.setText("para tu contraseña ");
        jPanel1.add(jLabelControl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        // TODO add your handling code here:

        if (mostrar) {
            jTextFieldclave1.setText(jPasswordField1.getText());
            jTextFieldClave2.setText(jPasswordField2.getText());
            jTextFieldclave1.setVisible(true);
            jTextFieldClave2.setVisible(true);
            jPasswordField1.setVisible(false);
            jPasswordField2.setVisible(false);
            //cambiar imagen
            ImageIcon imagen = new ImageIcon(getClass().getResource("/images/ojo1.png"));
            jButtonVer.setIcon(imagen);
            mostrar = false;
        } else {
            jPasswordField1.setText(jTextFieldclave1.getText());
            jPasswordField2.setText(jTextFieldClave2.getText());
            jTextFieldclave1.setVisible(false);
            jTextFieldClave2.setVisible(false);
            jPasswordField1.setVisible(true);
            jPasswordField2.setVisible(true);
            //cambiar imagen
            ImageIcon imagen = new ImageIcon(getClass().getResource("/images/ojoOculto.png"));
            jButtonVer.setIcon(imagen);
            mostrar = true;

        }

    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:\
        formatear();
        if (camposVacios()) {
            System.out.println("esta completo");
            System.out.println("pass1: " + password1);
            System.out.println("pass1: " + password2);
            if (validarCorreo(jTextFieldCorreo.getText())) {
                if (password1.length() < 8) {
                    jLabelContro1.setVisible(true);
                    jLabelControl2.setVisible(true);
                } else {
                    if (coincidirClaves()) {
                        //validar que el correo no exita
                        UsuarioTrs usuarioTrs = new UsuarioTrs();
                        if (usuarioTrs.disponibilidad(jTextFieldCorreo.getText().toLowerCase())) {

                            //crear un usuario general
                            Usuario usuario = new Usuario(jTextFieldNombre.getText(), jTextFieldCorreo.getText().toLowerCase(), password1);
                            //usuario individaul
                            Usuario usuarioIndividual = new Usuario(jTextFieldNombre.getText(), jTextFieldCorreo.getText().toLowerCase(), password1, imagenUsuario, listaAmigo,
                                    listaEnviados, listaRecibidos,listaGrupos,listaBorrador);
                            //crear archivo de todos los usuario
                            Archivo file = new Archivo();
                            try {
                                file.guardar(usuario, "registros.dat", Usuario.listaUsuarios);
                                //crear archivo individual
                                file.guardar(usuarioIndividual, "Usuarios\\" + jTextFieldCorreo.getText() + ".dat");
                            } catch (IOException ex) {

                            }

                            Login login = new Login();
                            login.setVisible(true);
                            this.dispose();
                        } else {//exite ese usuario
                            jLabelContro8.setVisible(true);
                        }
                    } else {
                        System.out.println("no coinciden claves");
                        jLabelContro3.setVisible(true);
                        jLabelContro4.setVisible(true);
                        jTextFieldClave2.setText("");
                        jPasswordField2.setText("");
                    }
                }
            } else {
                jLabelContro6.setVisible(true);
            }

        } else {
            System.out.println(password1);
            encontrarVacio();
        }

    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    //metodos

    //formatear labels
    public void formatear() {
        jLabelContro1.setVisible(false);
        jLabelControl2.setVisible(false);
        jLabelContro3.setVisible(false);
        jLabelContro4.setVisible(false);
        jLabelContro5.setVisible(false);
        jLabelContro6.setVisible(false);
        jLabelContro7.setVisible(false);
        jLabelContro8.setVisible(false);

        if (mostrar == false) {
            password1 = jTextFieldclave1.getText();
            password2 = jTextFieldClave2.getText();

        } else {
            password1 = jPasswordField1.getText();
            password2 = jPasswordField2.getText();

        }

    }

    //validar claves coincidan
    //buscamos que inputs estan vacios para dar una advertencia
    public void encontrarVacio() {

        if (jTextFieldNombre.getText().equals("") && jTextFieldCorreo.getText().equals("") && password1.equals("")) {
            jLabelContro5.setVisible(true);
            jLabelContro6.setVisible(true);
            jLabelContro7.setVisible(true);

        } else if (jTextFieldNombre.getText().equals("") && jTextFieldCorreo.getText().equals("")) {
            jLabelContro5.setVisible(true);
            jLabelContro6.setVisible(true);

        } else if (jTextFieldNombre.getText().equals("") && password1.equals("")) {
            jLabelContro5.setVisible(true);
            jLabelContro7.setVisible(true);

        } else if (jTextFieldCorreo.getText().equals("") && password1.equals("")) {
            jLabelContro6.setVisible(true);
            jLabelContro7.setVisible(true);

        } else if (jTextFieldNombre.getText().equals("")) {
            jLabelContro5.setVisible(true);

        } else if (jTextFieldCorreo.getText().equals("")) {
            jLabelContro6.setVisible(true);

        } else if (password1.equals("")) {
            jLabelContro7.setVisible(true);

        }

    }

    public boolean coincidirClaves() {
        if (password1.equals(password2)) {
            return true;
        }

        return false;

    }

    //validarCamposVacios
    public boolean camposVacios() {

        if (!jTextFieldNombre.getText().equals("") && !jTextFieldCorreo.getText().equals("") && !password1.equals("")) {
            return true;
        }

        return false;

    }

    //validar Correo
    public boolean validarCorreo(String correo) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);

        return mather.find();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelContro1;
    private javax.swing.JLabel jLabelContro3;
    private javax.swing.JLabel jLabelContro4;
    private javax.swing.JLabel jLabelContro5;
    private javax.swing.JLabel jLabelContro6;
    private javax.swing.JLabel jLabelContro7;
    private javax.swing.JLabel jLabelContro8;
    private javax.swing.JLabel jLabelControl2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldClave2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldclave1;
    // End of variables declaration//GEN-END:variables

}
