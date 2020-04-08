/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import Panel.PanelEnviado;
import Panel.PanelBorrador;
import Control.Archivo;
import Control.CambiaPanel;
import Control.UsuarioTrs;
import Modelo.Grupo;
import Modelo.Mensaje;
import Modelo.Usuario;
import Vista.Menu;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Caiza
 */
public class PanelEnviar extends javax.swing.JPanel {

    UsuarioTrs usuarioTrs = new UsuarioTrs();
    Usuario UsuarioActual;
    ArrayList<Usuario> listaAmigosAuxiliar = new ArrayList<>();
    ArrayList<Mensaje> listaEnviados;
    ArrayList<Mensaje> listaRecibidos;
    String correoUsu;
    int pos;
    int position;
    Grupo grupo;
    int imas = 0;
    String direccion;
    Archivo file = new Archivo();

    public PanelEnviar() {
        initComponents();
        jPanelProcesador.setLayout(new BorderLayout());
        jPanelProcesador.add(jMenuBarProcesador, BorderLayout.NORTH);
    }

    //contructor para remviar correos
    public PanelEnviar(Usuario usu, Mensaje men) {
       
        
        
        initComponents();
        UsuarioActual = usu;
        direccion = "Usuarios\\" + UsuarioActual.getCorreo() + ".dat";
    
        cargarCombio();
        jPanelProcesador.setVisible(true);
        new CambiaPanel(jPanelProcesador, new PanelProcesadorTexto());
        //cargar el contenido a renviar
        jTextFieldAsunto.setEditable(false);

        PanelProcesadorTexto.jTextPane1.setEditable(false);
        jTextFieldAsunto.setText(men.getAsunto());
        PanelProcesadorTexto.jTextPane1.setText(men.getContenido());

        //hacer un salto de linea automatico
        jTextAreaDes.setLineWrap(true);
        jLabelContro2.setVisible(false);
        jLabelContro3.setVisible(false);
        jLabelContro4.setVisible(false);
        jButtonBorrar.setVisible(false);
        jButtonGuardar.setVisible(false);

    }

    //constructor para enviar
    public PanelEnviar(Usuario usu) {
         //inicia el panel colocamos la bandera en true
        Menu.borrador=true;
        Menu.listAmigosAux.clear();
        
        initComponents();
        UsuarioActual = usu;
        
        direccion = "Usuarios\\" + UsuarioActual.getCorreo() + ".dat";
        jComboBoxAmigos.removeAllItems();
        cargarCombio();
        //hacer un salto de linea automatico
        jTextAreaDes.setVisible(true);

        jPanelProcesador.setLayout(new BorderLayout());
        jLabelContro2.setVisible(false);
        jLabelContro3.setVisible(false);
        jLabelContro4.setVisible(false);
        jButtonBorrar.setVisible(false);
        jButtonGuardar.setVisible(false);
        new CambiaPanel(jPanelProcesador, new PanelProcesadorTexto());

    }

    public PanelEnviar(Usuario usu, int posicion) {
        initComponents();
        UsuarioActual = usu;
        direccion = "Usuarios\\" + UsuarioActual.getCorreo() + ".dat";
        jComboBoxAmigos.removeAllItems();
        cargarCombio();
        position = posicion;
        //hacer un salto de linea automatico
        jTextAreaDes.setVisible(true);

        jPanelProcesador.setLayout(new BorderLayout());
        //controles
        jLabelContro2.setVisible(false);
        jLabelContro3.setVisible(false);
        jLabelContro4.setVisible(false);
        jButtonDescartar.setVisible(false);
        jButtonBorador.setVisible(false);
        new CambiaPanel(jPanelProcesador, new PanelProcesadorTexto());

        //cargar que esta guardado en el borrador
        PanelProcesadorTexto.jTextPane1.setText(UsuarioActual.getListaBorrador().get(posicion).getContenido());
        jTextAreaDes.setText(UsuarioActual.getListaBorrador().get(posicion).getDestinatario());
        jTextFieldAsunto.setText(UsuarioActual.getListaBorrador().get(posicion).getAsunto());
        cargarListaAuxiliar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarProcesador = new javax.swing.JMenuBar();
        jMenusize = new javax.swing.JMenu();
        jMenuSize12 = new javax.swing.JMenuItem();
        jMenuSize16 = new javax.swing.JMenuItem();
        jMenuSize20 = new javax.swing.JMenuItem();
        jMenuSize24 = new javax.swing.JMenuItem();
        jMenuEstilo = new javax.swing.JMenu();
        jMenuNegrita = new javax.swing.JMenuItem();
        jMenuCursiva = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuArial = new javax.swing.JMenuItem();
        jMenuCourier = new javax.swing.JMenuItem();
        jMenuVerdana = new javax.swing.JMenuItem();
        jMenuAlinear = new javax.swing.JMenu();
        jMenuIz = new javax.swing.JMenuItem();
        jMenuCe = new javax.swing.JMenuItem();
        jMenuDe = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSubrayar = new javax.swing.JMenu();
        jMenuSub = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAzul = new javax.swing.JMenuItem();
        jMenuVerde = new javax.swing.JMenuItem();
        jMenuAmarillo = new javax.swing.JMenuItem();
        jMenuRojo = new javax.swing.JMenuItem();
        jMenuNegro = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDes = new javax.swing.JTextArea();
        jComboBoxAmigos = new javax.swing.JComboBox();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAsunto = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jPanelProcesador = new javax.swing.JPanel();
        jButtonDescartar = new javax.swing.JButton();
        jLabelContro2 = new javax.swing.JLabel();
        jButtonBorador = new javax.swing.JButton();
        jLabelContro3 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jLabelContro4 = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        jMenuBarProcesador.setAutoscrolls(true);

        jMenusize.setText("Tamaño");

        jMenuSize12.setText("12");
        jMenusize.add(jMenuSize12);

        jMenuSize16.setText("16");
        jMenusize.add(jMenuSize16);

        jMenuSize20.setText("20");
        jMenusize.add(jMenuSize20);

        jMenuSize24.setText("24");
        jMenusize.add(jMenuSize24);

        jMenuBarProcesador.add(jMenusize);

        jMenuEstilo.setText("Estilo");

        jMenuNegrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negrita.png"))); // NOI18N
        jMenuNegrita.setText("Negrita");
        jMenuEstilo.add(jMenuNegrita);

        jMenuCursiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cursiva.png"))); // NOI18N
        jMenuCursiva.setText("Cursiva");
        jMenuEstilo.add(jMenuCursiva);

        jMenuBarProcesador.add(jMenuEstilo);

        jMenu1.setText("Fuente");

        jMenuArial.setText("Arial");
        jMenu1.add(jMenuArial);

        jMenuCourier.setText("Courier");
        jMenu1.add(jMenuCourier);

        jMenuVerdana.setText("Verdana");
        jMenu1.add(jMenuVerdana);

        jMenuBarProcesador.add(jMenu1);

        jMenuAlinear.setText("Alinear");

        jMenuIz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iz.png"))); // NOI18N
        jMenuAlinear.add(jMenuIz);

        jMenuCe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ce.png"))); // NOI18N
        jMenuCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCeActionPerformed(evt);
            }
        });
        jMenuAlinear.add(jMenuCe);

        jMenuDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/der.png"))); // NOI18N
        jMenuAlinear.add(jMenuDe);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/just.png"))); // NOI18N
        jMenuAlinear.add(jMenuItem1);

        jMenuBarProcesador.add(jMenuAlinear);

        jMenuSubrayar.setText("Subrayar");

        jMenuSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/underline.png"))); // NOI18N
        jMenuSub.setText("Subrayar");
        jMenuSubrayar.add(jMenuSub);

        jMenuBarProcesador.add(jMenuSubrayar);

        jMenu2.setText("Colores");

        jMenuAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/azul.png"))); // NOI18N
        jMenu2.add(jMenuAzul);

        jMenuVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verde (1).png"))); // NOI18N
        jMenu2.add(jMenuVerde);

        jMenuAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/amarillo.png"))); // NOI18N
        jMenu2.add(jMenuAmarillo);

        jMenuRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rojo (1).png"))); // NOI18N
        jMenu2.add(jMenuRojo);

        jMenuNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro.png"))); // NOI18N
        jMenuNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNegroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNegro);

        jMenuBarProcesador.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Selecione Destinario:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextAreaDes.setEditable(false);
        jTextAreaDes.setColumns(20);
        jTextAreaDes.setLineWrap(true);
        jTextAreaDes.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDes);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 280, 60));

        add(jComboBoxAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 190, -1));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Asunto:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jTextFieldAsunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAsuntoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldAsuntoKeyReleased(evt);
            }
        });
        add(jTextFieldAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 190, -1));

        jButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.png"))); // NOI18N
        jButtonEnviar.setBorder(null);
        jButtonEnviar.setContentAreaFilled(false);
        jButtonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, 40));

        jPanelProcesador.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProcesador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanelProcesadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanelProcesadorKeyReleased(evt);
            }
        });
        jPanelProcesador.setLayout(new java.awt.BorderLayout());
        add(jPanelProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 590, 280));

        jButtonDescartar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        jButtonDescartar.setBorder(null);
        jButtonDescartar.setContentAreaFilled(false);
        jButtonDescartar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescartarActionPerformed(evt);
            }
        });
        add(jButtonDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 40));

        jLabelContro2.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro2.setText("Ingrese un asunto");
        add(jLabelContro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 110, 20));

        jButtonBorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonBorador.setBorder(null);
        jButtonBorador.setContentAreaFilled(false);
        jButtonBorador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBoradorActionPerformed(evt);
            }
        });
        add(jButtonBorador, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 193, 30, 40));

        jLabelContro3.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro3.setText("Especifica al menos un destinatario.");
        add(jLabelContro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, 20));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar-usuario.png"))); // NOI18N
        jButtonAgregar.setBorder(null);
        jButtonAgregar.setContentAreaFilled(false);
        jButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabelContro4.setForeground(new java.awt.Color(255, 51, 51));
        jLabelContro4.setText("No se permite correos  similares.");
        add(jLabelContro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, 20));

        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        jButtonBorrar.setBorder(null);
        jButtonBorrar.setContentAreaFilled(false);
        jButtonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });
        add(jButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 40));

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setContentAreaFilled(false);
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 193, 30, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        pos = jComboBoxAmigos.getSelectedIndex()-1;
        if(pos>=0){
        String correoAmigo = UsuarioActual.getListaAmigo().get(pos).getCorreo();
        //validacion erroe
        if (correoAmigo.endsWith(",")) {
            correoAmigo = UsuarioActual.getCorreo();
        }
        //remueve de la lista auxiliar
        listaAmigosAuxiliar.remove(buscarAmigo(correoAmigo));
        
        Menu.listAmigosAux=listaAmigosAuxiliar;
            for (Usuario am : Menu.listAmigosAux) {
                System.out.println(am.getCorreo());   
            }
        mostarDestino();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        Menu.borrador=false;
       
        Usuario UsuarioDestinoMofificado;
        if (!jTextFieldAsunto.getText().equals("") && !jTextAreaDes.getText().equals("")) {

            //creamos un mensaje
            Mensaje mensaje = new Mensaje(UsuarioActual.getCorreo(), hallarDestinatario(), jTextFieldAsunto.getText(), PanelProcesadorTexto.jTextPane1.getText(), false);
            //obtenemos nuestra lista de enviados
            listaEnviados = UsuarioActual.getListaEnviados();
            //agregamos el mensaje aa nuestra lista de enviados
            listaEnviados.add(mensaje);
            //modificamos la lista de enviados
            UsuarioDestinoMofificado = new Usuario(UsuarioActual.getNombre(), UsuarioActual.getCorreo(), UsuarioActual.getClave(),
                    UsuarioActual.getImagen(), UsuarioActual.getListaAmigo(), listaEnviados, UsuarioActual.getListaRecibidos(),
                    UsuarioActual.getListaGrupos(), UsuarioActual.getListaBorrador());
            //modificamos en archivo
            file.modificar(UsuarioDestinoMofificado, direccion);

            //modificamos la lista de recibidos a cada usuario de la lista
            for (Usuario amigo : listaAmigosAuxiliar) {
                String direccionDestino = "Usuarios\\" + amigo.getCorreo() + ".dat";
                Usuario usuarioDestino = file.listar(direccionDestino);//obtenemos el registro de cada amigo
                listaRecibidos = usuarioDestino.getListaRecibidos();//obtenemos la lista de recibidos
                listaRecibidos.add(mensaje);//agreagamos el mensaje
                UsuarioDestinoMofificado = new Usuario(usuarioDestino.getNombre(), usuarioDestino.getCorreo(), usuarioDestino.getClave(),
                        usuarioDestino.getImagen(), usuarioDestino.getListaAmigo(), usuarioDestino.getListaEnviados(), listaRecibidos, usuarioDestino.getListaGrupos(),
                        usuarioDestino.getListaBorrador());
                //guardar en el archivo
                file.modificar(UsuarioDestinoMofificado, direccionDestino);

                System.out.println("se modifico");
            }
            new CambiaPanel(Menu.pnlPrincipal, new PanelEnviado(UsuarioActual));
        } else {
            hallarControl();
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jMenuCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCeActionPerformed

    private void jMenuNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuNegroActionPerformed

    private void jButtonDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescartarActionPerformed
        Menu.borrador=false;
        new CambiaPanel(Menu.pnlPrincipal, new PanelEnviado(UsuarioActual));
    }//GEN-LAST:event_jButtonDescartarActionPerformed

    private void jTextFieldAsuntoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAsuntoKeyPressed
        jLabelContro2.setVisible(false);
    }//GEN-LAST:event_jTextFieldAsuntoKeyPressed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        jLabelContro3.setVisible(false);
        jLabelContro4.setVisible(false);
        pos = jComboBoxAmigos.getSelectedIndex()-1;
        if(pos>=0){
        String correoAmigo = UsuarioActual.getListaAmigo().get(pos).getCorreo();
        //validacion error 0202
        if (correoAmigo.endsWith(",")) {
            correoAmigo = UsuarioActual.getCorreo();
        }
        //verificamos que se envie a correos iguales
        if (disponibilidad(correoAmigo)) {
            //creamos un amigoAuxiliar
            Usuario amigoAuxiliar = new Usuario(UsuarioActual.getListaAmigo().get(pos).getNombre(), correoAmigo);
            //lo agregamos a lista auxiliar
            listaAmigosAuxiliar.add(amigoAuxiliar);
            Menu.listAmigosAux.add(amigoAuxiliar);
            mostarDestino();
            Menu.des=jTextAreaDes.getText();
        } else {
            jLabelContro4.setVisible(true);
        }
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        Mensaje modificado = new Mensaje(UsuarioActual.getCorreo(), jTextAreaDes.getText(), jTextFieldAsunto.getText(),
                PanelProcesadorTexto.jTextPane1.getText());
        UsuarioActual.getListaBorrador().remove(position);
        Usuario usuarioModificado = new Usuario(UsuarioActual.getNombre(), UsuarioActual.getCorreo(), UsuarioActual.getClave(),
                UsuarioActual.getImagen(), UsuarioActual.getListaAmigo(), UsuarioActual.getListaEnviados(), UsuarioActual.getListaRecibidos(), UsuarioActual.getListaGrupos(), UsuarioActual.getListaBorrador());
        //guardar en el archivo
        file.modificar(usuarioModificado, direccion);
        UsuarioActual = file.listar(direccion);
        new CambiaPanel(Menu.pnlPrincipal, new PanelBorrador(UsuarioActual));

    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jTextFieldAsuntoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAsuntoKeyReleased
       Menu.asunto=jTextFieldAsunto.getText();
    }//GEN-LAST:event_jTextFieldAsuntoKeyReleased

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Mensaje modificado = new Mensaje(UsuarioActual.getCorreo(), jTextAreaDes.getText(), jTextFieldAsunto.getText(),
            PanelProcesadorTexto.jTextPane1.getText());
        UsuarioActual.getListaBorrador().set(position, modificado);
        Usuario usuarioModificado = new Usuario(UsuarioActual.getNombre(), UsuarioActual.getCorreo(), UsuarioActual.getClave(),
            UsuarioActual.getImagen(), UsuarioActual.getListaAmigo(), UsuarioActual.getListaEnviados(), UsuarioActual.getListaRecibidos(), UsuarioActual.getListaGrupos(), UsuarioActual.getListaBorrador());
        //guardar en el archivo
        file.modificar(usuarioModificado, direccion);
        UsuarioActual = file.listar(direccion);
        new CambiaPanel(Menu.pnlPrincipal, new PanelBorrador(UsuarioActual));
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBoradorActionPerformed
        //crear un mensaje
        Menu.borrador=false;
        Mensaje borrador = new Mensaje(UsuarioActual.getCorreo(), jTextAreaDes.getText(), jTextFieldAsunto.getText(),
            PanelProcesadorTexto.jTextPane1.getText());

        UsuarioActual.getListaBorrador().add(borrador);
        System.out.println(UsuarioActual.getListaBorrador().size());
        Usuario usuarioModificado = new Usuario(UsuarioActual.getNombre(), UsuarioActual.getCorreo(), UsuarioActual.getClave(),
            UsuarioActual.getImagen(), UsuarioActual.getListaAmigo(), UsuarioActual.getListaEnviados(), UsuarioActual.getListaRecibidos(), UsuarioActual.getListaGrupos(), UsuarioActual.getListaBorrador());
        //guardar en el archivo
        file.modificar(usuarioModificado, direccion);
        UsuarioActual = file.listar(direccion);
        new CambiaPanel(Menu.pnlPrincipal, new PanelBorrador(UsuarioActual));
    }//GEN-LAST:event_jButtonBoradorActionPerformed

    private void jPanelProcesadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanelProcesadorKeyReleased

    }//GEN-LAST:event_jPanelProcesadorKeyReleased

    private void jPanelProcesadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanelProcesadorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelProcesadorKeyPressed
    private void hallarControl() {

        if (jTextAreaDes.getText().equals("") && jTextFieldAsunto.getText().equals("")) {
            jLabelContro2.setVisible(true);
            jLabelContro3.setVisible(true);
        } else if (jTextAreaDes.getText().equals("")) {
            jLabelContro3.setVisible(true);
        } else if (jTextFieldAsunto.getText().equals("")) {
            jLabelContro2.setVisible(true);
        }
    }

    private void cargarCombio() {
        jComboBoxAmigos.addItem("");
        for (Usuario amigo : UsuarioActual.getListaAmigo()) {
            jComboBoxAmigos.addItem(amigo.getCorreo());
        }

    }

    private String hallarDestinatario() {
        String destinatario = "";
        for (Usuario amigo : listaAmigosAuxiliar) {
            destinatario += amigo.getCorreo() + ";";
        }
        return destinatario;
    }

    private boolean disponibilidad(String correo) {
        for (Usuario amigo : listaAmigosAuxiliar) {
            if (amigo.getCorreo().equals(correo)) {
                return false;
            }
        }
        return true;

    }

    private Usuario buscarAmigo(String correo) {
        for (int i = 0; i < listaAmigosAuxiliar.size(); i++) {
            if (listaAmigosAuxiliar.get(i).getCorreo().equals(correo)) {
                return listaAmigosAuxiliar.get(i);
            }

        }
        return null;

    }

    private void mostarDestino() {
        //limpiamos el area
        jTextAreaDes.setText("");
        //rellenamos con lo que tengamos en nuestra 
        for (int i = 0; i < listaAmigosAuxiliar.size(); i++) {
            jTextAreaDes.append(listaAmigosAuxiliar.get(i).getCorreo() + ";");

        }
        Menu.des=jTextAreaDes.getText();
    }

    private void cargarListaAuxiliar() {
        String mail = "";
        for (int i = 0; i < jTextAreaDes.getText().length(); i++) {

            if (jTextAreaDes.getText().charAt(i) != ';') {
                mail += jTextAreaDes.getText().charAt(i);
            } else {
                Usuario temp = new Usuario("name", mail);
                listaAmigosAuxiliar.add(temp);
                mail = "";
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorador;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonDescartar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContro2;
    private javax.swing.JLabel jLabelContro3;
    private javax.swing.JLabel jLabelContro4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAlinear;
    private javax.swing.JMenuItem jMenuAmarillo;
    private javax.swing.JMenuItem jMenuArial;
    private javax.swing.JMenuItem jMenuAzul;
    private javax.swing.JMenuBar jMenuBarProcesador;
    private javax.swing.JMenuItem jMenuCe;
    private javax.swing.JMenuItem jMenuCourier;
    private javax.swing.JMenuItem jMenuCursiva;
    private javax.swing.JMenuItem jMenuDe;
    private javax.swing.JMenu jMenuEstilo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuIz;
    private javax.swing.JMenuItem jMenuNegrita;
    private javax.swing.JMenuItem jMenuNegro;
    private javax.swing.JMenuItem jMenuRojo;
    private javax.swing.JMenuItem jMenuSize12;
    private javax.swing.JMenuItem jMenuSize16;
    private javax.swing.JMenuItem jMenuSize20;
    private javax.swing.JMenuItem jMenuSize24;
    private javax.swing.JMenuItem jMenuSub;
    private javax.swing.JMenu jMenuSubrayar;
    private javax.swing.JMenuItem jMenuVerdana;
    private javax.swing.JMenuItem jMenuVerde;
    private javax.swing.JMenu jMenusize;
    private javax.swing.JPanel jPanelProcesador;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDes;
    private javax.swing.JTextField jTextFieldAsunto;
    // End of variables declaration//GEN-END:variables
}
