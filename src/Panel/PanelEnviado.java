package Panel;

import Control.Archivo;
import Control.CambiaPanel;
import Control.imgTabla;
import Modelo.Mensaje;
import Modelo.Usuario;
import Vista.Menu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo Caiza
 */
public class PanelEnviado extends javax.swing.JPanel {

    private Usuario usuarioActual;
    private String direccionActual;
    private Archivo file = new Archivo();

    private boolean estado = false;

    public PanelEnviado() {
        initComponents();
    }

    public PanelEnviado(Usuario usu) {

        initComponents();
        usuarioActual = usu;
        
        direccionActual = "Usuarios\\" + usuarioActual.getCorreo() + ".dat";
        propiedadTabla();
    }

    private void propiedadTabla() {
        jTableEnviado.setDefaultRenderer(Object.class, new imgTabla());
        String titulos[] = {"Receptor", "Asunto", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        Object[] columna = new Object[modelo.getColumnCount()];

        for (int i = usuarioActual.getListaEnviados().size()-1; i >=0; i--) {
            estado = usuarioActual.getListaEnviados().get(i).isEstado();
            if (estado) {

                columna[0] = (String) usuarioActual.getListaEnviados().get(i).getDestinatario();
                columna[1] = (String) usuarioActual.getListaEnviados().get(i).getAsunto();
                columna[2] = new JLabel(new ImageIcon(getClass().getResource("/images/correo.png")));
            } else {
                columna[0] = new JLabel(usuarioActual.getListaEnviados().get(i).getDestinatario());
                columna[1] = new JLabel(usuarioActual.getListaEnviados().get(i).getAsunto());
                columna[2] = new JLabel(new ImageIcon(getClass().getResource("/images/email.png")));
            }
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
                "Receptor", "Asunto", "Estado"
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
        int x = (usuarioActual.getListaEnviados().size()-1)-jTableEnviado.rowAtPoint(evt.getPoint());
        System.out.println(x);
        //cambiamos el estado del mensaje a visto
        usuarioActual.getListaEnviados().get(x).setEstado(true);
        Usuario usuarioModifificado = new Usuario(usuarioActual.getNombre(), usuarioActual.getCorreo(), usuarioActual.getClave(), usuarioActual.getImagen(),
                usuarioActual.getListaAmigo(), usuarioActual.getListaEnviados(), usuarioActual.getListaRecibidos(), usuarioActual.getListaGrupos()
        ,usuarioActual.getListaBorrador());
        file.modificar(usuarioModifificado, direccionActual);
        System.out.println("modificado");
        //visualizamos el mensaje en un pabel
        new CambiaPanel(Menu.pnlPrincipal, new PanelMensajeEnviado(usuarioActual, x, direccionActual));
    }//GEN-LAST:event_jTableEnviadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnviado;
    // End of variables declaration//GEN-END:variables
}
