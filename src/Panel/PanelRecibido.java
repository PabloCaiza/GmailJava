
package Panel;

import Panel.PanelMensajeRecibido;
import Control.Archivo;
import Control.CambiaPanel;
import Control.imgTabla;
import Modelo.Mensaje;
import Modelo.Usuario;
import Vista.Menu;
import Vista.Menu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo Caiza
 */
public class PanelRecibido extends javax.swing.JPanel {
    private Usuario usuarioActual;
    private String direccionActual;
    private Archivo file=new Archivo();
    private boolean estado=false;
    public PanelRecibido() {
        initComponents();
    }
    public PanelRecibido(Usuario usu) {
       
        initComponents();
        usuarioActual=usu;
        propiedadTabla();
        direccionActual="Usuarios\\" + usuarioActual.getCorreo() + ".dat";
    }
    private void propiedadTabla(){
        jTableRecibido.setDefaultRenderer(Object.class, new imgTabla());
        String titulos[]={"Emisor","Asunto","Estado"};
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        Object[]columna=new Object[modelo.getColumnCount()];
        
        for (int i = usuarioActual.getListaRecibidos().size()-1; i >=0; i--) {
          estado = usuarioActual.getListaRecibidos().get(i).isEstado();
            if (estado) {

                columna[0] = (String) usuarioActual.getListaRecibidos().get(i).getEmisor();
                columna[1] = (String) usuarioActual.getListaRecibidos().get(i).getAsunto();
                columna[2] = new JLabel(new ImageIcon(getClass().getResource("/images/correo.png")));
            } else {
                columna[0] = new JLabel(usuarioActual.getListaRecibidos().get(i).getEmisor());
                columna[1] = new JLabel(usuarioActual.getListaRecibidos().get(i).getAsunto());
                columna[2] = new JLabel(new ImageIcon(getClass().getResource("/images/email.png")));
            }
            modelo.addRow(columna);
        
        }
        jTableRecibido.setModel(modelo);
        jTableRecibido.setRowHeight(80);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRecibido = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableRecibido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableRecibido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Emisor", "Asunto", "Estado"
            }
        ));
        jTableRecibido.getTableHeader().setResizingAllowed(false);
        jTableRecibido.getTableHeader().setReorderingAllowed(false);
        jTableRecibido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecibidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRecibido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jTableRecibidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecibidoMouseClicked
        int x=(usuarioActual.getListaRecibidos().size()-1)-jTableRecibido.rowAtPoint(evt.getPoint());
        System.out.println(x);
        //cambiamos el estado del mensaje a visto
        usuarioActual.getListaRecibidos().get(x).setEstado(true);
        Usuario usuarioModifificado=new Usuario(usuarioActual.getNombre(),usuarioActual.getCorreo(),usuarioActual.getClave(),usuarioActual.getImagen(),
        usuarioActual.getListaAmigo(),usuarioActual.getListaEnviados(),usuarioActual.getListaRecibidos(),usuarioActual.getListaGrupos()
        ,usuarioActual.getListaBorrador());
       file.modificar(usuarioModifificado,direccionActual);
        System.out.println("modificado");
        //visualizamos el mensaje en un pabel
       new CambiaPanel(Menu.pnlPrincipal, new PanelMensajeRecibido(usuarioActual,x,direccionActual));
    }//GEN-LAST:event_jTableRecibidoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRecibido;
    // End of variables declaration//GEN-END:variables
}
