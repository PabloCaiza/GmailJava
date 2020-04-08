package Vista;

import Panel.PanelContacto;
import Control.Archivo;
import Control.CambiaPanel;
import Control.UsuarioTrs;
import Modelo.Usuario;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

/**
 *
 * @author Pablo Caiza
 */
public class VentanaGuardarContacto extends javax.swing.JFrame {

    Usuario usuarioActual;
    String direccionActual;
    ImageIcon imagen;
    ImageIcon imagenActual;
    byte[] imagenUsuario;
    UsuarioTrs usuarioTrs = new UsuarioTrs();
    Archivo file = new Archivo();
    ArrayList<Usuario> listaAmigos;
    File archivo;
    JFileChooser selecionado = new JFileChooser();

    public VentanaGuardarContacto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public VentanaGuardarContacto(Usuario usu, String direccion) {
        initComponents();
        this.setLocationRelativeTo(null);
       
        formatear();
        usuarioActual = usu;
        direccionActual = direccion;
        imagen = new ImageIcon(getClass().getResource("/images/icono-user.png"));
        imagenActual = usu.getImagen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAgregarFoto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelImagenUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jLabelControl1 = new javax.swing.JLabel();
        jLabelControl2 = new javax.swing.JLabel();
        jLabelControl3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAgregarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mas.png"))); // NOI18N
        jButtonAgregarFoto.setBorder(null);
        jButtonAgregarFoto.setContentAreaFilled(false);
        jButtonAgregarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 133, 40, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Crear contacto nuevo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-user.png"))); // NOI18N
        jLabelImagenUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelImagenUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagenUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 110));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Correo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jTextFieldCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, 30));

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 170, 30));

        jButtonCancel.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 110, 40));

        jButtonSave.setBackground(new java.awt.Color(0, 153, 255));
        jButtonSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("Guardar");
        jButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 110, 40));

        jLabelControl1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl1.setText("Ingresa un correo valido");
        getContentPane().add(jLabelControl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 30));

        jLabelControl2.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl2.setText("Ingresa un nombre");
        getContentPane().add(jLabelControl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 110, 30));

        jLabelControl3.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl3.setText("No existe ese correo");
        getContentPane().add(jLabelControl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelImagenUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagenUsuarioMouseClicked
        if (selecionado.showDialog(null, "Imagen") == JFileChooser.APPROVE_OPTION) {//seleciono un archivo
            archivo = selecionado.getSelectedFile();//almacar el archivo selecionado
            //comprobar extension
            if (archivo.getName().endsWith("png") || archivo.getName().endsWith("jpg") || archivo.getName().endsWith("gif")) {
                imagenUsuario = file.leerImagen(archivo);//leemos la imagen en bytes
                imagen = new ImageIcon(imagenUsuario);
                jLabelImagenUsuario.setIcon(imagen);
            } else {
                JOptionPane.showMessageDialog(null, "formato incorecto");
            }

        }
    }//GEN-LAST:event_jLabelImagenUsuarioMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        jLabelControl3.setVisible(false);
        if (!camposVacios()) {
            //buscamos si existe ese correo
            String correo = jTextFieldCorreo.getText().toLowerCase();

            if (usuarioTrs.encontrarUsuario(correo)) {//lo encontro 
                //validacion error al guardase uno mismo
                if (correo.equals(usuarioActual.getCorreo())) {
                    correo += ",";
                }
                //sacamos la lista de amigos del usaurio Actual
                listaAmigos = usuarioActual.getListaAmigo();
                //verificamos si ya existe ese correo
                if (!usuarioTrs.amigosRepetidos(correo, listaAmigos)) {
                    //creamos un contacto
                    Usuario contacto = new Usuario(jTextFieldNombre.getText(), correo, imagen);
                    //agregamos el contacto a nuestra lista de amigos
                    listaAmigos.add(contacto);
                    //creamos un usario modificado
                    Usuario usuarioModificado = new Usuario(usuarioActual.getNombre(), usuarioActual.getCorreo(), usuarioActual.getClave(),
                            imagenActual, listaAmigos, usuarioActual.getListaEnviados(), usuarioActual.getListaRecibidos());
                    //modificar en su archivo individual
                    file.modificar(usuarioModificado, direccionActual);
                    System.out.println("guardado");
                    this.setVisible(false);
                    PanelContacto contact=new PanelContacto(usuarioActual,direccionActual);
                   new CambiaPanel(Menu.pnlPrincipal, contact);
                } else {
                    JOptionPane.showMessageDialog(null, "ya existe ese amigo");
                }

            } else {
               jLabelControl3.setVisible(true);
            }

        } else {
            hallarControl();
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
       jLabelControl2.setVisible(false);
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoKeyPressed
        jLabelControl1.setVisible(false);
    }//GEN-LAST:event_jTextFieldCorreoKeyPressed

    private void jButtonAgregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarFotoActionPerformed
          if (selecionado.showDialog(null, "Imagen") == JFileChooser.APPROVE_OPTION) {//seleciono un archivo
            archivo = selecionado.getSelectedFile();//almacar el archivo selecionado
            //comprobar extension
            if (archivo.getName().endsWith("png") || archivo.getName().endsWith("jpg") || archivo.getName().endsWith("gif")) {
                imagenUsuario = file.leerImagen(archivo);//leemos la imagen en bytes
                imagen = new ImageIcon(imagenUsuario);
                Icon fondo=new ImageIcon(imagen.getImage().getScaledInstance(100, 110, Image.SCALE_DEFAULT));
                jLabelImagenUsuario.setIcon(fondo);
            } else {
                JOptionPane.showMessageDialog(null, "formato incorecto");
            }

        }
    }//GEN-LAST:event_jButtonAgregarFotoActionPerformed

    private void formatear(){
        jLabelControl1.setVisible(false);
        jLabelControl2.setVisible(false);
        jLabelControl3.setVisible(false);
    }
    private void hallarControl(){
        if(jTextFieldCorreo.getText().equals("")&&jTextFieldNombre.getText().equals("")){
            jLabelControl1.setVisible(true);
            jLabelControl2.setVisible(true);
        }else if(jTextFieldCorreo.getText().equals("")){
            jLabelControl1.setVisible(true);
        }else if(jTextFieldNombre.getText().equals("")){
            jLabelControl2.setVisible(true);
        }
    }
    private boolean camposVacios() {
        if (!jTextFieldCorreo.getText().equals("") && !jTextFieldNombre.getText().equals("")) {
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(VentanaGuardarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGuardarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGuardarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGuardarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGuardarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarFoto;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelControl1;
    private javax.swing.JLabel jLabelControl2;
    private javax.swing.JLabel jLabelControl3;
    private javax.swing.JLabel jLabelImagenUsuario;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
