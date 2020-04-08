/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import Panel.PanelEnviado;
import Control.Archivo;
import Control.CambiaPanel;
import Control.UsuarioTrs;
import Modelo.Usuario;
import Vista.Menu;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Caiza
 */
public class PanelModificar extends javax.swing.JPanel {

    String password1 = "", password2 = "";
    boolean mostrar = true, editar = false;
    Usuario usuActual;
    String direccion;
    File archivo;
    ImageIcon imagen;
    Archivo file = new Archivo();
    UsuarioTrs usuarioTrs = new UsuarioTrs();
    ArrayList<Usuario> listaAmigo = new ArrayList<>();
    JFileChooser selecionado = new JFileChooser();//selecionar una imagen de mis carpetas
    byte[] imagenUsuario;

    public PanelModificar(Usuario usu,String direccionO) {
        initComponents();
              initComponents();
        //--------------
        formatear();

        //----------------
   
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
       //se ajuste al size of jlabrl component
       ImageIcon imagen1=imagen;
  
       Icon icono=new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
       jLabelImagen.setIcon(icono);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEditarNombre = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelContro5 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonEditarClave = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabelContro1 = new javax.swing.JLabel();
        jLabelContro7 = new javax.swing.JLabel();
        jLabelContro3 = new javax.swing.JLabel();
        jLabelContro4 = new javax.swing.JLabel();
        jButtonVer = new javax.swing.JButton();
        jButtonCambiarImagen = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldclave1 = new javax.swing.JTextField();
        jTextFieldClave2 = new javax.swing.JTextField();
        jLabelImagen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Correo:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Contraseña:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Confirmacion:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 30));

        jButtonEditarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lapiz.png"))); // NOI18N
        jButtonEditarNombre.setBorder(null);
        jButtonEditarNombre.setContentAreaFilled(false);
        jButtonEditarNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarNombreActionPerformed(evt);
            }
        });
        add(jButtonEditarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 40, 40));
        add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 140, 30));

        jLabelContro5.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro5.setText("Ingresa su nombre");
        add(jLabelContro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, 30));
        add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, 30));
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 30));

        jButtonEditarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lapiz.png"))); // NOI18N
        jButtonEditarClave.setBorder(null);
        jButtonEditarClave.setContentAreaFilled(false);
        jButtonEditarClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClaveActionPerformed(evt);
            }
        });
        add(jButtonEditarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 40, 40));
        add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 140, 30));

        jLabelContro1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro1.setText("Usa 8 caracteres o más ");
        add(jLabelContro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, 20));

        jLabelContro7.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro7.setText("Ingrese una contraseña");
        add(jLabelContro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 40));

        jLabelContro3.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro3.setText("Las contraseñas no coinciden. ");
        add(jLabelContro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 180, 30));

        jLabelContro4.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro4.setText("Vuelve a intentarlo");
        add(jLabelContro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, 30));

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojoOculto.png"))); // NOI18N
        jButtonVer.setBorder(null);
        jButtonVer.setContentAreaFilled(false);
        jButtonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 60, 40));

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
        add(jButtonCambiarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, 40));

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
        add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 110, 40));
        add(jTextFieldclave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 30));
        add(jTextFieldClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 140, 30));
        add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 100, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarNombreActionPerformed
        // TODO add your handling code here:

        jTextFieldNombre.setEditable(true);
        editar = true;
    }//GEN-LAST:event_jButtonEditarNombreActionPerformed

    private void jButtonEditarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClaveActionPerformed
        // TODO add your handling code here:
        editar = true;
        jPasswordField2.setText("");
        jTextFieldClave2.setText("");
        jTextFieldClave2.setText("");
        jPasswordField1.setText("");
        jTextFieldClave2.setEditable(true);
        jTextFieldclave1.setEditable(true);
        jPasswordField1.setEditable(true);
        jPasswordField2.setEditable(true);

    }//GEN-LAST:event_jButtonEditarClaveActionPerformed

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

    private void jButtonCambiarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarImagenActionPerformed
        // TODO add your handling code here:

        if (selecionado.showDialog(null, "Selecionar Imagen") == JFileChooser.APPROVE_OPTION) {//seleciono un archivo correctamente
            archivo = selecionado.getSelectedFile();//guardamos el archivo selecionado en archivo
            if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {//verificar que la extencion del archivo sea correcta         
              
                imagenUsuario = file.leerImagen(archivo);
                imagen = new ImageIcon(imagenUsuario);
                ImageIcon imagen1=imagen;
                Icon icono=new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                jLabelImagen.setIcon(icono);
                editar = true;
            } else {
                JOptionPane.showConfirmDialog(null, "Selecione un archivo con forfato png,jpg,gif");
            }

        }
    }//GEN-LAST:event_jButtonCambiarImagenActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:\
        formatear();
        if (camposVacios()) {

            if (password1.length() < 8) {
                jLabelContro1.setVisible(true);

            } else {
                if (editar) {
                    if (coincidirClaves()) {

                        //creamos el usuario  general
                        //creamo el usuario modificar general
                        Usuario usuarioModificar = new Usuario(jTextFieldNombre.getText(), usuActual.getCorreo(), password1);
                        //modificamos en el archivo
                        file.modificarGeneral(usuarioTrs.encontrarUsuario1(usuActual.getCorreo()), usuarioModificar, "registros.dat", Usuario.listaUsuarios);
                        //modificamos el archhivo individual
                        Usuario modificado = new Usuario(jTextFieldNombre.getText(), usuActual.getCorreo(), password1, imagen, usuActual.getListaAmigo(), usuActual.getListaEnviados(), usuActual.getListaRecibidos(),
                        usuActual.getListaGrupos(),usuActual.getListaBorrador());
                        //guardamos en su archivo individual
                        file.modificar(modificado, direccion);
                        System.out.println("modificado");
                        Icon fondo=new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                        Menu.jLabelImagenMenu.setIcon(fondo);
                        new CambiaPanel(Menu.pnlPrincipal, new PanelEnviado(modificado));

                    } else {
                        jLabelContro3.setVisible(true);
                        jLabelContro4.setVisible(true);
                        jTextFieldClave2.setText("");
                        jPasswordField2.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "debe editar sus datos");
                }

            }
        } else {
            encontrarVacio();
        }

    }//GEN-LAST:event_jButtonRegistrarActionPerformed
 

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
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContro1;
    private javax.swing.JLabel jLabelContro3;
    private javax.swing.JLabel jLabelContro4;
    private javax.swing.JLabel jLabelContro5;
    private javax.swing.JLabel jLabelContro7;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldClave2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldclave1;
    // End of variables declaration//GEN-END:variables
}
