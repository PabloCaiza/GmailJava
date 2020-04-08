package Vista;

import Panel.PanelContacto;
import Control.Archivo;
import Control.CambiaPanel;
import Control.UsuarioTrs;
import Modelo.Usuario;
import java.awt.Color;
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
public class VentanaModificarContacto extends javax.swing.JFrame {

    Usuario usuarioActual;
    private PanelContacto panelContacto;
    String direccionActual;
    int pos;
    ImageIcon imagen;
    ImageIcon imagenActual;
    byte[] imagenUsuario;
    UsuarioTrs usuarioTrs = new UsuarioTrs();
    Archivo file = new Archivo();
    ArrayList<Usuario> listaAmigos;
    File archivo;
    JFileChooser selecionado = new JFileChooser();

    public VentanaModificarContacto() {
        initComponents();
    }



    public VentanaModificarContacto(Usuario usu, String direccion, int posicion) {
        initComponents();
        this.setLocationRelativeTo(null);
       
        formatear();
        usuarioActual = usu;
        direccionActual = direccion;

        imagenActual = usu.getImagen();
        pos = posicion;
        imagen = usuarioActual.getListaAmigo().get(pos).getImagen();
        Icon fondo=new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        jTextFieldNombre.setText(usuarioActual.getListaAmigo().get(pos).getNombre());
        jTextFieldCorreo.setText(usuarioActual.getListaAmigo().get(pos).getCorreo());
        jLabelImagenUsuario.setIcon(fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonAgregarFoto = new javax.swing.JButton();
        jLabelImagenUsuario = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabelControl2 = new javax.swing.JLabel();
        jLabelControl1 = new javax.swing.JLabel();
        jLabelControl3 = new javax.swing.JLabel();
        jLabelControl4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Modificar contacto nuevo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Correo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jTextFieldCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, 30));

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 170, 30));

        jButtonAgregarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mas.png"))); // NOI18N
        jButtonAgregarFoto.setBorder(null);
        jButtonAgregarFoto.setContentAreaFilled(false);
        jButtonAgregarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarFotoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 40, -1));

        jLabelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-user.png"))); // NOI18N
        jLabelImagenUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabelImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 100));

        jButtonEliminar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 110, 40));

        jButtonCancelar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 110, 40));

        jButtonModificar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 110, 40));

        jLabelControl2.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl2.setText("Ingresa un nombre");
        getContentPane().add(jLabelControl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 110, 30));

        jLabelControl1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl1.setText("Ingresa un correo valido");
        getContentPane().add(jLabelControl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, 30));

        jLabelControl3.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl3.setText("No existe ese correo");
        getContentPane().add(jLabelControl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, 30));

        jLabelControl4.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl4.setText("No se admite amigos similares");
        getContentPane().add(jLabelControl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 180, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
                //sacamos la lista de amigoen una lista temporal
        listaAmigos = usuarioActual.getListaAmigo();
        //removemos el elemento selecionado
        listaAmigos.remove(pos);
        //creamos un usario modificado
        Usuario usuarioModificado = new Usuario(usuarioActual.getNombre(), usuarioActual.getCorreo(), usuarioActual.getClave(),
                imagenActual, listaAmigos, usuarioActual.getListaEnviados(), usuarioActual.getListaRecibidos(), usuarioActual.getListaGrupos(),
                usuarioActual.getListaBorrador());
        //modificar en su archivo individual
        file.modificar(usuarioModificado, direccionActual);
        System.out.println("eliminado");
        //volver a cargar el panel contacto
        panelContacto = new PanelContacto(usuarioActual, direccionActual);
        new CambiaPanel(Menu.pnlPrincipal, panelContacto);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        jLabelControl3.setVisible(false);
        jLabelControl4.setVisible(false);
        if (!camposVacios()) {
            //buscamos si existe ese correo
            String correo = jTextFieldCorreo.getText().toLowerCase();
            //error cuando se guarda uno 
            if (correo.charAt(correo.length() - 1) == ',') {
                correo = correo.substring(0, correo.length() - 1);
            }
            if (usuarioTrs.encontrarUsuario(correo)) {//lo encontro 
                //validacion error al guardase uno mismo
                if (correo.equals(usuarioActual.getCorreo())) {
                    correo += ",";
                }
                //sacamos la lista de amigos del usaurio Actual
                listaAmigos = usuarioActual.getListaAmigo();
                //verificamos si  existe ese correo

                listaAmigos.set(pos, new Usuario("", ""));
                if (!usuarioTrs.amigosRepetidos(correo, listaAmigos)) {
                    //creamos un contacto
                    Usuario contacto = new Usuario(jTextFieldNombre.getText(), correo, imagen);
                    //modificar  el contacto selecionado lista de amigos
                    listaAmigos.set(pos, contacto);
                    //creamos un usario modificado
                    Usuario usuarioModificado = new Usuario(usuarioActual.getNombre(), usuarioActual.getCorreo(), usuarioActual.getClave(),
                            imagenActual, listaAmigos, usuarioActual.getListaEnviados(), usuarioActual.getListaRecibidos(), usuarioActual.getListaGrupos(),
                     usuarioActual.getListaBorrador());
                    //modificar en su archivo individual
                    file.modificar(usuarioModificado, direccionActual);
                    this.setVisible(false);
                    //volver a cargar el panel contacto
                    panelContacto = new PanelContacto(usuarioActual, direccionActual);
                    new CambiaPanel(Menu.pnlPrincipal, panelContacto);
                    System.out.println("guardado");

                } else {
                    jLabelControl4.setVisible(true);
                }

            } else {
               jLabelControl3.setVisible(true);
            }

        } else {
            hallarControl();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAgregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarFotoActionPerformed
         if (selecionado.showDialog(null, "Imagen") == JFileChooser.APPROVE_OPTION) {//seleciono un archivo
            archivo = selecionado.getSelectedFile();//almacar el archivo selecionado
            //comprobar extension
            if (archivo.getName().endsWith("png") || archivo.getName().endsWith("jpg") || archivo.getName().endsWith("gif")) {
                imagenUsuario = file.leerImagen(archivo);//leemos la imagen en bytes
                imagen = new ImageIcon(imagenUsuario);
                Icon fondo=new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                jLabelImagenUsuario.setIcon(fondo);
            } else {
                JOptionPane.showMessageDialog(null, "formato incorecto");
            }

        }
    }//GEN-LAST:event_jButtonAgregarFotoActionPerformed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
       jLabelControl2.setVisible(false);
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoKeyPressed
        jLabelControl1.setVisible(false);
    }//GEN-LAST:event_jTextFieldCorreoKeyPressed
        private void formatear(){
        jLabelControl1.setVisible(false);
        jLabelControl2.setVisible(false);
        jLabelControl3.setVisible(false);
        jLabelControl4.setVisible(false);
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
    public boolean camposVacios() {
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
            java.util.logging.Logger.getLogger(VentanaModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarFoto;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelControl1;
    private javax.swing.JLabel jLabelControl2;
    private javax.swing.JLabel jLabelControl3;
    private javax.swing.JLabel jLabelControl4;
    private javax.swing.JLabel jLabelImagenUsuario;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
