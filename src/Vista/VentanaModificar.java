/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Archivo;
import Control.UsuarioTrs;
import Modelo.Usuario;
import Vista.Login;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

/**
 *
 * @author Pablo Caiza
 */
public class VentanaModificar extends javax.swing.JFrame {

    String password1 = "", password2 = "";
    boolean mostrar = true,editar=false;
    Usuario usuActual;
    String direccion;
    File archivo;
    ImageIcon imagen;
    Archivo file=new  Archivo();
    UsuarioTrs usuarioTrs=new UsuarioTrs();
    ArrayList<Usuario> listaAmigo = new ArrayList<>();
    JFileChooser selecionado=new JFileChooser();//selecionar una imagen de mis carpetas
    byte[]imagenUsuario;
    

    /**
     *
     */
    public VentanaModificar() {

        initComponents();
        //--------------
        formatear();

        //----------------
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jTextFieldclave1.setVisible(false);
        jTextFieldClave2.setVisible(false);
        jTextFieldCorreo.setEditable(false);

    }

    public VentanaModificar(Usuario usu,String direccionO) {

        initComponents();
        //--------------
        formatear();

        //----------------
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jTextFieldclave1.setVisible(false);
        jTextFieldClave2.setVisible(false);
        jTextFieldCorreo.setEditable(false);
        jPasswordField1.setEditable(false);
        jPasswordField2.setEditable(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldclave1.setEditable(false);
        jTextFieldClave2.setEditable(false);
        usuActual = usu;
        jTextFieldCorreo.setText(usu.getCorreo());
        jTextFieldNombre.setText(usu.getNombre());
        jPasswordField1.setText(usu.getClave());
       jPasswordField2.setText(usu.getClave());
     //  direccion = "Usuarios\\" + usuActual.getCorreo() + ".dat";
       direccion=direccionO;
       imagen=usu.getImagen();//se cargue la imagen actual del usuario
       lb1.setIcon(imagen);
        
        

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonVer = new javax.swing.JButton();
        jTextFieldclave1 = new javax.swing.JTextField();
        jTextFieldClave2 = new javax.swing.JTextField();
        jButtonCambiarImagen = new javax.swing.JButton();
        jLabelContro1 = new javax.swing.JLabel();
        jLabelContro4 = new javax.swing.JLabel();
        jLabelContro3 = new javax.swing.JLabel();
        jLabelContro5 = new javax.swing.JLabel();
        jLabelContro7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonEditarNombre = new javax.swing.JButton();
        jButtonEditarClave = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        lbImagen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Correo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Confirmacion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, 30));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 140, 30));

        jButtonRegistrar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Modificar");
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 110, 40));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, 30));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojoOculto.png"))); // NOI18N
        jButtonVer.setBorder(null);
        jButtonVer.setContentAreaFilled(false);
        jButtonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 60, 40));
        getContentPane().add(jTextFieldclave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));
        getContentPane().add(jTextFieldClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 140, 30));

        jButtonCambiarImagen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonCambiarImagen.setForeground(new java.awt.Color(0, 153, 255));
        jButtonCambiarImagen.setText("Agregar una imagen");
        jButtonCambiarImagen.setBorder(null);
        jButtonCambiarImagen.setContentAreaFilled(false);
        jButtonCambiarImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCambiarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCambiarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 40));

        jLabelContro1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro1.setText("Usa 8 caracteres o más ");
        getContentPane().add(jLabelContro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 30));

        jLabelContro4.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro4.setText("Vuelve a intentarlo");
        getContentPane().add(jLabelContro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, 30));

        jLabelContro3.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro3.setText("Las contraseñas no coinciden. ");
        getContentPane().add(jLabelContro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, 30));

        jLabelContro5.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro5.setText("Ingresa su nombre");
        getContentPane().add(jLabelContro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 140, 30));

        jLabelContro7.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro7.setText("Ingrese una contraseña");
        getContentPane().add(jLabelContro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jButtonEditarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lapiz.png"))); // NOI18N
        jButtonEditarNombre.setBorder(null);
        jButtonEditarNombre.setContentAreaFilled(false);
        jButtonEditarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 40, 40));

        jButtonEditarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lapiz.png"))); // NOI18N
        jButtonEditarClave.setBorder(null);
        jButtonEditarClave.setContentAreaFilled(false);
        jButtonEditarClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 40, 40));

        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 170, 140));

        jButtonRegresar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(0, 153, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 40));

        lbImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 170, 140));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 90, 80));

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

            if (password1.length() < 8) {
                jLabelContro1.setVisible(true);

            } else {
                if(editar){
                if (coincidirClaves()) {
                    
                    //creamos el usuario  general
                   
                    //creamo el usuario modificar general
                    Usuario usuarioModificar=new Usuario(jTextFieldNombre.getText(),usuActual.getCorreo(),password1);
                    //modificamos en el archivo
                    file.modificarGeneral(usuarioTrs.encontrarUsuario1(usuActual.getCorreo()), usuarioModificar, "registros.dat",Usuario.listaUsuarios);
                    //modificamos el archhivo individual
                    Usuario modificado=new Usuario(jTextFieldNombre.getText(),usuActual.getCorreo(),password1,imagen,usuActual.getListaAmigo(),usuActual.getListaEnviados(),usuActual.getListaRecibidos());
                    //guardamos en su archivo individual
                    file.modificar(modificado, direccion);
                    System.out.println("modificado");
                    
                    
                    
                    

                } else {
                    jLabelContro3.setVisible(true);
                    jLabelContro4.setVisible(true);
                    jTextFieldClave2.setText("");
                    jPasswordField2.setText("");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "debe editar sus datos");
                }
                
            }
        } else {
            encontrarVacio();
        }


    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonCambiarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarImagenActionPerformed
        // TODO add your handling code here:
        
       if(selecionado.showDialog(null,"Selecionar Imagen")==JFileChooser.APPROVE_OPTION){//seleciono un archivo correctamente
           archivo=selecionado.getSelectedFile();//guardamos el archivo selecionado en archivo
           if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif")){//verificar que la extencion del archivo sea correcta
             
              rsscalelabel.RSScaleLabel.setScaleLabel(lb1, archivo.getAbsolutePath());
               rsscalelabel.RSScaleLabel.setScaleLabel(lbImagen, archivo.getAbsolutePath());
               rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, archivo.getAbsolutePath());
              imagenUsuario=file.leerImagen(archivo);
              imagen=new ImageIcon(imagenUsuario);
              lb1.setIcon(imagen);
              editar=true;
              
               
           }else{
               JOptionPane.showConfirmDialog(null, "Selecione un archivo con forfato png,jpg,gif");
           }
           
       }
    }//GEN-LAST:event_jButtonCambiarImagenActionPerformed

    private void jButtonEditarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarNombreActionPerformed
        // TODO add your handling code here:
        
        jTextFieldNombre.setEditable(true);
        editar=true;
    }//GEN-LAST:event_jButtonEditarNombreActionPerformed

    private void jButtonEditarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClaveActionPerformed
        // TODO add your handling code here:
        editar=true;
        jPasswordField2.setText("");
        jTextFieldClave2.setText("");
        jTextFieldClave2.setText("");
        jPasswordField1.setText("");
        jTextFieldClave2.setEditable(true);
        jTextFieldclave1.setEditable(true);
        jPasswordField1.setEditable(true);
        jPasswordField2.setEditable(true);
        
    }//GEN-LAST:event_jButtonEditarClaveActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificar().setVisible(true);
            }
        });
    }
    //metodos
    
    
 

    //formatear labels
    public void formatear() {
       
        jLabelContro7.setVisible(false);
        jLabelContro1.setVisible(false);
        
        jLabelContro4.setVisible(false);
        jLabelContro5.setVisible(false);
        jLabelContro3.setVisible(false);

        jLabelContro7.setVisible(false);

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
        System.out.println(password1);
        if(jTextFieldNombre.getText().equals("")&&password1.equals("")){
        
        jLabelContro5.setVisible(true);
        jLabelContro7.setVisible(true);
        }else if(jTextFieldNombre.getText().equals("")){
            jLabelContro5.setVisible(true);
            
        }else if(password1.equals("")){
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

        if (!jTextFieldNombre.getText().equals("") && !password1.equals("")) {
            return true;
        }

        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiarImagen;
    private javax.swing.JButton jButtonEditarClave;
    private javax.swing.JButton jButtonEditarNombre;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContro1;
    private javax.swing.JLabel jLabelContro3;
    private javax.swing.JLabel jLabelContro4;
    private javax.swing.JLabel jLabelContro5;
    private javax.swing.JLabel jLabelContro7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldClave2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldclave1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbImagen;
    // End of variables declaration//GEN-END:variables

}
