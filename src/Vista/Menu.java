/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Panel.PanelRecibido;
import Panel.PanelModificar;
import Panel.PanelGrupo;
import Panel.PanelEnviar;
import Panel.PanelEnviado;
import Panel.PanelContacto;
import Panel.PanelBorrador;
import Control.Archivo;
import Control.CambiaPanel;
import Modelo.Amigo;
import Modelo.Mensaje;
import Modelo.Usuario;
import Panel.PanelProcesadorTexto;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.border.DropShadowBorder;
import rsscalelabel.RSScaleLabel;

/**
 *
 * @author Pablo Caiza
 */
public class Menu extends javax.swing.JFrame {

    Usuario usuarioActual;
    String direccionActual;
    Archivo file = new Archivo();
    //atributos para autoguarfar automaticamente en borrador
    public static boolean borrador = false;
    public static String asunto = "";
    public static String contenido = "";
    public static String des = "";
    public static ArrayList<Usuario> listAmigosAux = new ArrayList<>();

    public Menu() {
        initComponents();

        this.setLocationRelativeTo(null);
        System.out.println("height" + this.getHeight());
        System.out.println("width" + this.getWidth());
        //cargar imagen
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/images/profile1.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        jLabelImagenMenu.setIcon(fondo1);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.jpeg")).getImage());

    }

    public Menu(String direccion) {
        initComponents();
        System.out.println(asunto);
        System.out.println(borrador);
        this.setLocationRelativeTo(null);
        direccionActual = direccion;
        usuarioActual = file.listar(direccionActual);
        //cargar imagen
        ImageIcon imagen1 = usuarioActual.getImagen();
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        jLabelImagenMenu.setIcon(fondo1);
        //   this.repaint();
        new CambiaPanel(this.pnlPrincipal, new PanelRecibido(usuarioActual));
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.jpeg")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jButtonRecibido1 = new javax.swing.JButton();
        jButtonEnviados1 = new javax.swing.JButton();
        jButtonEnviar1 = new javax.swing.JButton();
        jButtonContacto1 = new javax.swing.JButton();
        jButtonGrupo1 = new javax.swing.JButton();
        jButtonBorrador1 = new javax.swing.JButton();
        jButtonGestionar1 = new javax.swing.JButton();
        jButtonCerrar1 = new javax.swing.JButton();
        jLabelImagenMenu = new javax.swing.JLabel();
        jLabelfondo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowBottomShadow(false);
        pnlMenu.setBorder(dropShadowBorder1);
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRecibido1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonRecibido1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRecibido1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRecibido1.setText("Recibidos");
        jButtonRecibido1.setBorder(null);
        jButtonRecibido1.setContentAreaFilled(false);
        jButtonRecibido1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRecibido1.setOpaque(true);
        jButtonRecibido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecibido1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonRecibido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 134, 214, 41));

        jButtonEnviados1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonEnviados1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEnviados1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnviados1.setText("Enviados");
        jButtonEnviados1.setBorder(null);
        jButtonEnviados1.setContentAreaFilled(false);
        jButtonEnviados1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviados1.setOpaque(true);
        jButtonEnviados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviados1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonEnviados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 182, 214, 41));

        jButtonEnviar1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonEnviar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEnviar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnviar1.setText("Enviar");
        jButtonEnviar1.setBorder(null);
        jButtonEnviar1.setContentAreaFilled(false);
        jButtonEnviar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviar1.setOpaque(true);
        jButtonEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviar1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonEnviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 230, 214, 41));

        jButtonContacto1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonContacto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonContacto1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonContacto1.setText("Contactos");
        jButtonContacto1.setBorder(null);
        jButtonContacto1.setContentAreaFilled(false);
        jButtonContacto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonContacto1.setOpaque(true);
        jButtonContacto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContacto1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonContacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 278, 214, 41));

        jButtonGrupo1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonGrupo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonGrupo1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGrupo1.setText("Grupos");
        jButtonGrupo1.setBorder(null);
        jButtonGrupo1.setContentAreaFilled(false);
        jButtonGrupo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGrupo1.setOpaque(true);
        jButtonGrupo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrupo1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonGrupo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 326, 214, 41));

        jButtonBorrador1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonBorrador1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBorrador1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrador1.setText("Borradores");
        jButtonBorrador1.setBorder(null);
        jButtonBorrador1.setContentAreaFilled(false);
        jButtonBorrador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBorrador1.setOpaque(true);
        jButtonBorrador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrador1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonBorrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 374, 214, 41));

        jButtonGestionar1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonGestionar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonGestionar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGestionar1.setText("Gestionar Cuenta");
        jButtonGestionar1.setBorder(null);
        jButtonGestionar1.setContentAreaFilled(false);
        jButtonGestionar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGestionar1.setOpaque(true);
        jButtonGestionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionar1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonGestionar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 422, 214, 41));

        jButtonCerrar1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonCerrar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrar1.setText("Cerrar Sesion");
        jButtonCerrar1.setBorder(null);
        jButtonCerrar1.setContentAreaFilled(false);
        jButtonCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar1.setOpaque(true);
        jButtonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar1ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButtonCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 470, 214, 33));

        jLabelImagenMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.add(jLabelImagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 14, 110, 113));

        jLabelfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo6.jpg"))); // NOI18N
        pnlMenu.add(jLabelfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 226, 510));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-menu1.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white.png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setContentAreaFilled(false);
        btnMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-menu1.png"))); // NOI18N
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 30, 30));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 590, 510));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo6.jpg"))); // NOI18N
        jPanel1.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        //codigo para la animacion del menu
        int posicion = btnMenu.getX();//nos da la posicion actual del boton en el eje x
        if (posicion > 0) {//el menu no esta en oculto
            System.out.println("mostrar");
            Animacion.Animacion.mover_izquierda(230, 0, 2, 2, btnMenu);
            Animacion.Animacion.mover_izquierda(0, -230, 2, 2, pnlMenu);
            Animacion.Animacion.mover_izquierda(230, 9, 2, 2, btnMenu1);

        } else {//el menu esta en oculto
            System.out.println("oculto");
            Animacion.Animacion.mover_derecha(0, 230, 2, 2, btnMenu);
            Animacion.Animacion.mover_derecha(-230, 0, 2, 2, pnlMenu);
            Animacion.Animacion.mover_derecha(9, 239, 2, 2, btnMenu1);

        }

    }//GEN-LAST:event_btnMenuActionPerformed

    private void jButtonRecibido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecibido1ActionPerformed
        guardarBorrador();
        usuarioActual = file.listar(direccionActual);
        new CambiaPanel(pnlPrincipal, new PanelRecibido(usuarioActual));

    }//GEN-LAST:event_jButtonRecibido1ActionPerformed

    private void jButtonEnviados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviados1ActionPerformed
        guardarBorrador();
        usuarioActual = file.listar(direccionActual);
        new CambiaPanel(pnlPrincipal, new PanelEnviado(usuarioActual));
    }//GEN-LAST:event_jButtonEnviados1ActionPerformed

    private void jButtonEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviar1ActionPerformed
        guardarBorrador();
        usuarioActual = file.listar(direccionActual);
        new CambiaPanel(pnlPrincipal, new PanelEnviar(usuarioActual));
    }//GEN-LAST:event_jButtonEnviar1ActionPerformed

    private void jButtonContacto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContacto1ActionPerformed
        guardarBorrador();
        usuarioActual = file.listar(direccionActual);
        new CambiaPanel(pnlPrincipal, new PanelContacto(usuarioActual, direccionActual));
    }//GEN-LAST:event_jButtonContacto1ActionPerformed

    private void jButtonGrupo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrupo1ActionPerformed
        guardarBorrador();
        usuarioActual = file.listar(direccionActual);
        new CambiaPanel(pnlPrincipal, new PanelGrupo(usuarioActual, direccionActual));

    }//GEN-LAST:event_jButtonGrupo1ActionPerformed

    private void jButtonBorrador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrador1ActionPerformed
        guardarBorrador();
        usuarioActual = file.listar(direccionActual);
        new CambiaPanel(pnlPrincipal, new PanelBorrador(usuarioActual));
    }//GEN-LAST:event_jButtonBorrador1ActionPerformed

    private void jButtonGestionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionar1ActionPerformed
        guardarBorrador();
        usuarioActual = file.listar(direccionActual);
        new CambiaPanel(pnlPrincipal, new PanelModificar(usuarioActual, direccionActual));
    }//GEN-LAST:event_jButtonGestionar1ActionPerformed

    private void jButtonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar1ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCerrar1ActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenu1ActionPerformed

    public void guardarBorrador() {
        if (Menu.borrador == true) {//entor al paner de enviados
            //verificamos que haya echco algo el usuario

            if (!Menu.asunto.equals("") || !Menu.contenido.equals("") || Menu.listAmigosAux.size() > 0) {
                System.out.println("entro");
                Mensaje borrador = new Mensaje(usuarioActual.getCorreo(), des, asunto, contenido);
                usuarioActual.getListaBorrador().add(borrador);
                Usuario usuarioModificado = new Usuario(usuarioActual.getNombre(), usuarioActual.getCorreo(), usuarioActual.getClave(),
                        usuarioActual.getImagen(), usuarioActual.getListaAmigo(), usuarioActual.getListaEnviados(), usuarioActual.getListaRecibidos(), usuarioActual.getListaGrupos(), usuarioActual.getListaBorrador());
                //guardar en el archivo
                file.modificar(usuarioModificado, direccionActual);
                //limpiar todo
                asunto = "";
                contenido = "";
                des = "";
                listAmigosAux.clear();
            }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton jButtonBorrador1;
    private javax.swing.JButton jButtonCerrar1;
    private javax.swing.JButton jButtonContacto1;
    private javax.swing.JButton jButtonEnviados1;
    private javax.swing.JButton jButtonEnviar1;
    private javax.swing.JButton jButtonGestionar1;
    private javax.swing.JButton jButtonGrupo1;
    private javax.swing.JButton jButtonRecibido1;
    public static javax.swing.JLabel jLabelImagenMenu;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JLabel jLabelfondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlMenu;
    public static javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
