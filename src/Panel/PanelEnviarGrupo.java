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
import Modelo.Grupo;
import Modelo.Mensaje;
import Modelo.Usuario;
import Vista.Menu;
import java.util.ArrayList;

public class PanelEnviarGrupo extends javax.swing.JPanel {

    UsuarioTrs usuarioTrs = new UsuarioTrs();
    Usuario UsuarioActual;
    ArrayList<Mensaje> listaEnviados;
    ArrayList<Mensaje> listaRecibidos;
    String correoUsu;
    Grupo grupo;
    String direccion;
    Archivo file = new Archivo();

    public PanelEnviarGrupo(Grupo gp, Usuario usu) {
        initComponents();
        grupo = gp;
        jTextFieldDestinatario.setText(grupo.getNombre());
        UsuarioActual = usu;
        direccion = "Usuarios\\" + UsuarioActual.getCorreo() + ".dat";
        new CambiaPanel(jPanelProcesador, new PanelProcesadorTexto());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDestinatario = new javax.swing.JTextField();
        jTextFieldAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMensaje = new javax.swing.JTextArea();
        jButtonEnviar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelProcesador = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Destinatario:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Asunto:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jTextFieldDestinatario.setEditable(false);
        add(jTextFieldDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 190, -1));
        add(jTextFieldAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, -1));

        jTextAreaMensaje.setColumns(20);
        jTextAreaMensaje.setLineWrap(true);
        jTextAreaMensaje.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMensaje);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, 30));

        jButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.png"))); // NOI18N
        jButtonEnviar.setBorder(null);
        jButtonEnviar.setContentAreaFilled(false);
        jButtonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        jPanelProcesador.setLayout(new java.awt.BorderLayout());
        add(jPanelProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 590, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed

        enviarGrupo();

    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        new CambiaPanel(Menu.pnlPrincipal, new PanelGrupo(UsuarioActual, direccion));
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    /*metodo para enviar a todo el gupo*/

    private void enviarGrupo() {
//obtner todos los destinatarios
        String destinatario = "";

        for (int i = 0; i < grupo.getListaGrupo().size(); i++) {
            destinatario += grupo.getListaGrupo().get(i).getCorreo() + ";";

        }
        Mensaje mensaje = new Mensaje(UsuarioActual.getCorreo(), destinatario, jTextFieldAsunto.getText(), PanelProcesadorTexto.jTextPane1.getText(), false);
        //guardar en la lista enviados
        UsuarioActual.getListaEnviados().add(mensaje);
        Usuario usuarioModificado = new Usuario(UsuarioActual.getNombre(), UsuarioActual.getCorreo(), UsuarioActual.getClave(),
                UsuarioActual.getImagen(), UsuarioActual.getListaAmigo(), UsuarioActual.getListaEnviados(), UsuarioActual.getListaRecibidos(),
                UsuarioActual.getListaGrupos(),UsuarioActual.getListaBorrador());
        //modificar en su archivo individual
        file.modificar(usuarioModificado, direccion);

        for (int i = 0; i < grupo.getListaGrupo().size(); i++) {
            //error 
            String direccion = "";
            if (grupo.getListaGrupo().get(i).getCorreo().endsWith(",")) {
                direccion = "Usuarios\\" + UsuarioActual.getCorreo() + ".dat";

            } else {
                //scamos la direccion del archivo de cada miembro del grupo
                direccion = "Usuarios\\" + grupo.getListaGrupo().get(i).getCorreo() + ".dat";

            }
            //listar el objeto
            Usuario individual = file.listar(direccion);
            //agregar mensaje a la bandeja de entrada
            individual.getListaRecibidos().add(mensaje);
            //usuaio modificado
            Usuario usuarioModificado1 = new Usuario(individual.getNombre(), individual.getCorreo(), individual.getClave(),
                    individual.getImagen(), individual.getListaAmigo(), individual.getListaEnviados(), individual.getListaRecibidos(), individual.getListaGrupos(),
            individual.getListaBorrador());
            //modificar en su archivo individual
            file.modificar(usuarioModificado1, direccion);

        }
        //mostar tu lista de enviados
        new CambiaPanel(Menu.pnlPrincipal, new PanelEnviado(UsuarioActual));
    }

    public boolean llenarCampos() {
        if (!jTextAreaMensaje.getText().equals("") && !jTextFieldAsunto.getText().equals("") && !jTextFieldDestinatario.getText().equals("")) {
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelProcesador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMensaje;
    private javax.swing.JTextField jTextFieldAsunto;
    private javax.swing.JTextField jTextFieldDestinatario;
    // End of variables declaration//GEN-END:variables
}
