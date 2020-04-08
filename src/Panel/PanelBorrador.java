package Panel;

import Control.Archivo;
import Control.CambiaPanel;
import Control.MyDefaultTableCellRenderer;
import Control.imgTabla;
import Modelo.Mensaje;
import Modelo.Usuario;
import Vista.Menu;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo Caiza
 */
public class PanelBorrador extends javax.swing.JPanel {

    private Usuario usuarioActual;
    private String direccionActual;
    private Archivo file = new Archivo();

    public PanelBorrador() {
        initComponents();
    }

    public PanelBorrador(Usuario usu) {

        initComponents();
        usuarioActual = usu;

        direccionActual = "Usuarios\\" + usuarioActual.getCorreo() + ".dat";
        propiedadTabla();
    }

    private void propiedadTabla() {
        jTableEnviado.setDefaultRenderer(Object.class, new MyDefaultTableCellRenderer());
        String titulos[] = {"Tipo", "Receptor", "Asunto"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Object[] columna = new Object[modelo.getColumnCount()];

        for (int i = usuarioActual.getListaBorrador().size() - 1; i >= 0; i--) {
            columna[0] = "[Borrador]";;
            columna[1] = new JLabel(usuarioActual.getListaBorrador().get(i).getDestinatario());
            columna[2] = new JLabel(usuarioActual.getListaBorrador().get(i).getAsunto());
            

            modelo.addRow(columna);

        }

        jTableEnviado.setModel(modelo);
        jTableEnviado.setRowHeight(80);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEnviado = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableEnviado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableEnviado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Receptor", "Asunto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableEnviado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableEnviado.getTableHeader().setResizingAllowed(false);
        jTableEnviado.getTableHeader().setReorderingAllowed(false);
        jTableEnviado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnviadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEnviado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEnviadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnviadoMouseClicked
        int x = (usuarioActual.getListaBorrador().size() - 1) - jTableEnviado.rowAtPoint(evt.getPoint());

        new CambiaPanel(Menu.pnlPrincipal, new PanelEnviar(usuarioActual, x));
    }//GEN-LAST:event_jTableEnviadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnviado;
    // End of variables declaration//GEN-END:variables
}
