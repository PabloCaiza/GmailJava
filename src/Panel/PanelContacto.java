package Panel;

import Control.MyOwnFocusTraversalPolicy;
import Control.imgTabla;
import Modelo.Usuario;
import Vista.VentanaGuardarContacto;
import Vista.VentanaModificarContacto;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.Image;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PanelContacto extends javax.swing.JPanel {

    private boolean mostrar;
    private Usuario usuarioActual;
    private String direccionActual;
    private ArrayList<Usuario> candidatos = new ArrayList<>();

    public PanelContacto() {

    }

    public PanelContacto(Usuario usu, String direccion) {
        initComponents();
        Vector<Component> order = new Vector<Component>();
        usuarioActual = usu;
        propiedadesTabla();
        direccionActual = direccion;

        jButtonLimpiar.setVisible(false);
        order.add(jTextFieldBuscar);
        MyOwnFocusTraversalPolicy policy = new MyOwnFocusTraversalPolicy(order);
        this.setFocusTraversalPolicy(policy);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBuscar = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jComboBoxBuscar = new javax.swing.JComboBox();
        jButtonAgregarAmigo = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAmigo = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelBuscar.setForeground(new java.awt.Color(153, 153, 153));
        jLabelBuscar.setText("Buscar");
        add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 70, 40));

        jTextFieldBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
        });
        add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 260, 30));

        jComboBoxBuscar.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxBuscarPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        add(jComboBoxBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 260, 30));

        jButtonAgregarAmigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addFriend.png"))); // NOI18N
        jButtonAgregarAmigo.setBorder(null);
        jButtonAgregarAmigo.setContentAreaFilled(false);
        jButtonAgregarAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAmigoActionPerformed(evt);
            }
        });
        add(jButtonAgregarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, 40));

        jTableAmigo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jTableAmigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Imagen ", "Nombre", "Correo", "Enviar"
            }
        ));
        jTableAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableAmigo.getTableHeader().setResizingAllowed(false);
        jTableAmigo.getTableHeader().setReorderingAllowed(false);
        jTableAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAmigoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAmigo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 590, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmigoMouseClicked
        //aceder a la posicion en x en la tabla q se va a coreesponder con el objeto de la listaamigo
        int x = jTableAmigo.rowAtPoint(evt.getPoint());
        System.out.println("x: " + x);
        VentanaModificarContacto mc = new VentanaModificarContacto(usuarioActual, direccionActual, x);
        mc.setVisible(true);
    }//GEN-LAST:event_jTableAmigoMouseClicked

    private void jTextFieldBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyPressed
        jLabelBuscar.setVisible(false);
        jButtonLimpiar.setVisible(true);

    }//GEN-LAST:event_jTextFieldBuscarKeyPressed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased
        if (jTextFieldBuscar.getText().equals("")) {
            jLabelBuscar.setVisible(true);
            jButtonLimpiar.setVisible(false);
        } else {
            jButtonLimpiar.setVisible(true);

        }

        buscar(jTextFieldBuscar.getText().toLowerCase());
    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        //limpiar
        jTextFieldBuscar.setText("");
        jComboBoxBuscar.removeAllItems();
        jButtonLimpiar.setVisible(false);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAgregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAmigoActionPerformed
        VentanaGuardarContacto guardarContacto = new VentanaGuardarContacto(usuarioActual, direccionActual);
        guardarContacto.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarAmigoActionPerformed

    private void jComboBoxBuscarPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxBuscarPopupMenuWillBecomeInvisible
        int pos = jComboBoxBuscar.getSelectedIndex();
        if (mostrar && pos >= 0) {
        
            jTextFieldBuscar.setText(candidatos.get(pos).getNombre());
            VentanaModificarContacto mc = new VentanaModificarContacto(usuarioActual, direccionActual, buscarPosicion(candidatos.get(pos).getCorreo()));
            mc.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxBuscarPopupMenuWillBecomeInvisible
    public void propiedadesTabla() {
        //ordenar la lista 
        orderNombre();
        jTableAmigo.setDefaultRenderer(Object.class, new imgTabla());
        String titulos[] = {"Imagen", "Nombre", "Correo"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Object[] columna = new Object[modelo.getColumnCount()];
        for (int i = 0; i < usuarioActual.getListaAmigo().size(); i++) {
            Icon fondo=new ImageIcon(usuarioActual.getListaAmigo().get(i).getImagen().getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            columna[0] = (new JLabel(fondo));
            columna[1] = usuarioActual.getListaAmigo().get(i).getNombre();
            columna[2] = usuarioActual.getListaAmigo().get(i).getCorreo();

            modelo.addRow(columna);
        }
        jTableAmigo.setRowHeight(100);

        jTableAmigo.setModel(modelo);
    }

    private int buscarPosicion(String correo) {
        int cont = 0;
        for (Usuario usuario : usuarioActual.getListaAmigo()) {
            if (usuario.getCorreo().equals(correo)) {
                return cont;
            }
            cont++;
        }
        return -1;
    }
//    /*Metodo para ordenar ascendentement  los nombres*/

    private void orderNombre() {
        for (int i = 0; i < usuarioActual.getListaAmigo().size(); i++) {
            int min = i;
            for (int j = i; j < usuarioActual.getListaAmigo().size(); j++) {
                if (usuarioActual.getListaAmigo().get(min).getNombre().compareToIgnoreCase(usuarioActual.getListaAmigo().get(j).getNombre()) > 0) {
                    min = j;
                }

            }
            Usuario temp = usuarioActual.getListaAmigo().get(min);
            usuarioActual.getListaAmigo().set(min, usuarioActual.getListaAmigo().get(i));
            usuarioActual.getListaAmigo().set(i, temp);

        }

    }

    private void buscar(String nombre) {

        candidatos.clear();
        jComboBoxBuscar.removeAllItems();
        if (!nombre.equals("")) {
            for (int i = 0; i < usuarioActual.getListaAmigo().size(); i++) {

                int cont = 0;
                int min = Math.min(nombre.length(), usuarioActual.getListaAmigo().get(i).getNombre().length());
                String auxiliar = usuarioActual.getListaAmigo().get(i).getNombre().substring(0, min);
                if (auxiliar.equalsIgnoreCase(nombre)) {
                    candidatos.add(usuarioActual.getListaAmigo().get(i));
                }

            }

            //agregar elementos al combo
            for (int i = 0; i < candidatos.size(); i++) {
                jComboBoxBuscar.addItem(candidatos.get(i).getNombre() + " " + candidatos.get(i).getCorreo());

            }
            //mostrar combox
            mostrar = false;
            jComboBoxBuscar.hidePopup();
            mostrar = true;
            jComboBoxBuscar.showPopup();

            //  jComboBox1.firePopupMenuWillBecomeVisible();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarAmigo;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox jComboBoxBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmigo;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
