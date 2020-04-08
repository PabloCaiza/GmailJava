package Panel;

import Control.Archivo;
import Control.CambiaPanel;
import Control.GrupoTrs;
import Modelo.Grupo;
import Modelo.Usuario;
import Vista.Menu;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelEditarGrupo extends javax.swing.JPanel {
    
    Usuario usuarioActual;
    boolean bandera = false;
    String direccionActual;
    private ArrayList<Grupo> listaGrupo;
    Archivo file = new Archivo();
    GrupoTrs grupoTrs = new GrupoTrs();
    ArrayList<Usuario> listaAmigosAuxiliar = new ArrayList<>();
    int posicion;
    
    public PanelEditarGrupo(Usuario usuario, int pos) {
        initComponents();
        
        usuarioActual = usuario;
        //ocultar components
        jComboBoxAgregar.setVisible(false);
        jButtonAgregar.setVisible(false);
        jButtonEliminar.setVisible(false);
        jButtonCancelar.setVisible(false);
        jButtonGuardar.setVisible(false);
        jTextFieldGrupo.setText(usuarioActual.getListaGrupos().get(pos).getNombre());
        jTextFieldGrupo.setEditable(false);
        jTextAreaDescripcion.setText(usuarioActual.getListaGrupos().get(pos).getDescripcion());
        jTextAreaDescripcion.setEditable(false);
        listaAmigosAuxiliar = usuarioActual.getListaGrupos().get(pos).getListaGrupo();
        jLabelControl2.setVisible(false);
        jLabelControl1.setVisible(false);
        propiedadTabla();
        posicion = pos;
    }

    public PanelEditarGrupo(Usuario usuario, String direccion, int pos) {
        initComponents();
        jButtonOk.setVisible(false);
        usuarioActual = usuario;
        direccionActual = direccion;
        jComboBoxAgregar.removeAllItems();
        cargarCombo();
        jTextFieldGrupo.setText(usuarioActual.getListaGrupos().get(pos).getNombre());
        jTextAreaDescripcion.setText(usuarioActual.getListaGrupos().get(pos).getDescripcion());
        listaAmigosAuxiliar = usuarioActual.getListaGrupos().get(pos).getListaGrupo();
        jLabelControl2.setVisible(false);
        jLabelControl1.setVisible(false);
        propiedadTabla();
        posicion = pos;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextFieldGrupo = new javax.swing.JTextField();
        jLabelControl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jComboBoxAgregar = new javax.swing.JComboBox();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMiembro = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelControl2 = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de grupo:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jTextFieldGrupo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldGrupoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldGrupoKeyReleased(evt);
            }
        });
        add(jTextFieldGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, -1));

        jLabelControl1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabelControl1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl1.setText("Ese nombre de grupo ya existe");
        add(jLabelControl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 200, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Descripción:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 240, 50));

        jComboBoxAgregar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBoxAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jComboBoxAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, -1));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar-usuario.png"))); // NOI18N
        jButtonAgregar.setBorder(null);
        jButtonAgregar.setContentAreaFilled(false);
        jButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar-usuario.png"))); // NOI18N
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jTableMiembro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableMiembro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMiembro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableMiembro.setEnabled(false);
        jTableMiembro.getTableHeader().setResizingAllowed(false);
        jTableMiembro.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableMiembro);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 590, 200));

        jButtonGuardar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 110, 40));

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
        add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 110, 40));

        jLabelControl2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabelControl2.setForeground(new java.awt.Color(255, 51, 51));
        jLabelControl2.setText("No se ha especificado ningún nombre.");
        add(jLabelControl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 210, 40));

        jButtonOk.setBackground(new java.awt.Color(0, 153, 255));
        jButtonOk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonOk.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOk.setText("Ok");
        jButtonOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        int pos = jComboBoxAgregar.getSelectedIndex();//sacamos la posicion del objeto
        if (grupoTrs.disponibilidad(listaAmigosAuxiliar, usuarioActual.getListaAmigo().get(pos).getCorreo())) {//si ya no se ha usado
            jLabelControl1.setVisible(false);
            System.out.println(pos);
            //creamos un contacto con el nombre y correo
            Usuario contacto = new Usuario(usuarioActual.getListaAmigo().get(pos).getNombre(), usuarioActual.getListaAmigo().get(pos).getCorreo());
            listaAmigosAuxiliar.add(contacto);//agreagaos contacto
            propiedadTabla();
        } else {
            JOptionPane.showMessageDialog(null, "ya exite ese amigo");
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int pos = jComboBoxAgregar.getSelectedIndex();
        //validar si esta en el grupo el amigo
        Usuario amigo = grupoTrs.buscarAmigo(listaAmigosAuxiliar, usuarioActual.getListaAmigo().get(pos).getCorreo());
        if (amigo != null) {//si existe
            listaAmigosAuxiliar.remove(amigo);//eliminamos el contacto
            propiedadTabla();
        } else {
            JOptionPane.showMessageDialog(null, "no existe ese usuario");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (!jTextFieldGrupo.getText().equals("")) {//este lleno
            //sacar la lista grupo
            listaGrupo = usuarioActual.getListaGrupos();
            //crear grupo modificado
            Grupo nuevoGrupo = new Grupo(jTextFieldGrupo.getText(), jTextAreaDescripcion.getText(), listaAmigosAuxiliar);
            //modificar en la lista
            listaGrupo.set(posicion, nuevoGrupo);
            //modificar en el archivo
            sobrescribirArchivo();
            //cerrar ventana
            new CambiaPanel(Menu.pnlPrincipal, new PanelGrupo(usuarioActual, direccionActual));
            
        } else {
            JOptionPane.showMessageDialog(null, "No se especifico un nombre");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        new CambiaPanel(Menu.pnlPrincipal, new PanelGrupo(usuarioActual, direccionActual));
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldGrupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGrupoKeyReleased
        if (grupoTrs.disponibilidadGrupo(usuarioActual.getListaGrupos(), jTextFieldGrupo.getText())) {
            bandera = true;
            jLabelControl1.setVisible(false);
            
        } else {
            bandera = false;
            jLabelControl1.setVisible(true);
        }
    }//GEN-LAST:event_jTextFieldGrupoKeyReleased

    private void jTextFieldGrupoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGrupoKeyPressed
        jLabelControl2.setVisible(false);
    }//GEN-LAST:event_jTextFieldGrupoKeyPressed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
       new CambiaPanel(Menu.pnlPrincipal, new PanelGrupo(usuarioActual, direccionActual));
    }//GEN-LAST:event_jButtonOkActionPerformed
    public void cargarCombo() {
        
        for (Usuario usuario : usuarioActual.getListaAmigo()) {
            jComboBoxAgregar.addItem(usuario.getCorreo());
        }
        
    }
    
    private void sobrescribirArchivo() {
        Usuario usuarioModificado = new Usuario(usuarioActual.getNombre(), usuarioActual.getCorreo(), usuarioActual.getClave(),
                usuarioActual.getImagen(), usuarioActual.getListaAmigo(), usuarioActual.getListaEnviados(), usuarioActual.getListaRecibidos(), listaGrupo,
        usuarioActual.getListaBorrador());
        //modificar en su archivo individual
        file.modificar(usuarioModificado, direccionActual);
        
    }
    
    private void propiedadTabla() {
        
        String titulos[] = {"Nombre", "Correo"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Object[] columna = new Object[modelo.getColumnCount()];
        
        for (int i = listaAmigosAuxiliar.size() - 1; i >= 0; i--) {
            columna[0] = listaAmigosAuxiliar.get(i).getNombre();
            columna[1] = listaAmigosAuxiliar.get(i).getCorreo();
            //verificar si ya se ha leido el mensaje      
            modelo.addRow(columna);
        }
        jTableMiembro.setModel(modelo);
        jTableMiembro.setRowHeight(80);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JComboBox jComboBoxAgregar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelControl1;
    private javax.swing.JLabel jLabelControl2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMiembro;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldGrupo;
    // End of variables declaration//GEN-END:variables
}
