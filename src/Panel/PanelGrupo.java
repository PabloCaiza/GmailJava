package Panel;

import Panel.PanelEnviarGrupo;
import Panel.PanelEditarGrupo;
import Panel.PanelCrearGrupo;
import Control.Archivo;
import Control.CambiaPanel;
import Control.imgTabla;
import Modelo.Grupo;
import Modelo.Usuario;
import Vista.Menu;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo Caiza
 */
public class PanelGrupo extends javax.swing.JPanel {

    private Usuario usuarioActual;
    private String direccionActual;
    private ArrayList<Grupo> listaGrupo;
    private Archivo file = new Archivo();

    public PanelGrupo(Usuario usu, String direccion) {
        initComponents();
        usuarioActual = usu;
        propiedadesTabla();
        direccionActual = direccion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAmigo = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAmigo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jTableAmigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Imagen ", "Nombre", "Editar", "Borrar", "Enviar"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 590, 430));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addGroup.png"))); // NOI18N
        jButtonAgregar.setBorder(null);
        jButtonAgregar.setContentAreaFilled(false);
        jButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmigoMouseClicked
        //aceder a la posicion en x en la tabla q se va a coreesponder con el objeto de la listaamigo
        int x = jTableAmigo.rowAtPoint(evt.getPoint());
        int y = jTableAmigo.columnAtPoint(evt.getPoint());
        //columna ver
        if(x<usuarioActual.getListaGrupos().size()&&(y==0||y==1)){
            new CambiaPanel(Menu.pnlPrincipal, new PanelEditarGrupo(usuarioActual, x));
        }
        
        //columna editar
        if (x < usuarioActual.getListaGrupos().size() && y == 2) {
            new CambiaPanel(Menu.pnlPrincipal, new PanelEditarGrupo(usuarioActual, direccionActual, x));
 

        }
        //columna eliminar
        if (x < usuarioActual.getListaGrupos().size() && y == 3) {
            eliminarGrupo(x);
        }
        //columna enviar correo grupo
        if (x < usuarioActual.getListaGrupos().size() && y == 4) {
            //le enviamos el grupo q deseo enviar un correo
            new CambiaPanel(Menu.pnlPrincipal, new PanelEnviarGrupo(usuarioActual.getListaGrupos().get(x), usuarioActual));
            
        }

    }//GEN-LAST:event_jTableAmigoMouseClicked

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
       new CambiaPanel(Menu.pnlPrincipal, new PanelCrearGrupo(usuarioActual, direccionActual));
    }//GEN-LAST:event_jButtonAgregarActionPerformed
    private void propiedadesTabla() {
        jTableAmigo.setDefaultRenderer(Object.class, new imgTabla());
        String titulos[] = {"Imagen", "Nombre", "Editar", "Borrar", "Enviar"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Object[] columna = new Object[modelo.getColumnCount()];
        for (int i = 0; i < usuarioActual.getListaGrupos().size(); i++) {
            columna[0] = (new JLabel(new ImageIcon(getClass().getResource("/images/group.png"))));
            columna[1] = usuarioActual.getListaGrupos().get(i).getNombre();
            columna[2] = (new JLabel(new ImageIcon(getClass().getResource("/images/pencil.png"))));
            columna[3] = (new JLabel(new ImageIcon(getClass().getResource("/images/eliminar.png"))));
            columna[4] = (new JLabel(new ImageIcon(getClass().getResource("/images/send.png"))));
            modelo.addRow(columna);
        }
        jTableAmigo.setRowHeight(60);

        jTableAmigo.setModel(modelo);
    }

    private void sobrescribirArchivo() {
        Usuario usuarioModificado = new Usuario(usuarioActual.getNombre(), usuarioActual.getCorreo(), usuarioActual.getClave(),
                usuarioActual.getImagen(), usuarioActual.getListaAmigo(), usuarioActual.getListaEnviados(), usuarioActual.getListaRecibidos(), listaGrupo
        ,usuarioActual.getListaBorrador());
        //modificar en su archivo individual
        file.modificar(usuarioModificado, direccionActual);
        propiedadesTabla();

    }
        private void eliminarGrupo(int pos) {
        //sacamos la lista del grupo
        listaGrupo = usuarioActual.getListaGrupos();
        //eliminamos el grupo
        listaGrupo.remove(pos);
        //modificamos el archivo individual
        sobrescribirArchivo();
        //volvemos a cargar la tabla
        propiedadesTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmigo;
    // End of variables declaration//GEN-END:variables
}
