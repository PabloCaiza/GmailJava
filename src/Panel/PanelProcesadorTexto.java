/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import Vista.Menu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Pablo Caiza
 */
public class PanelProcesadorTexto extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public PanelProcesadorTexto() {
        initComponents();
        this.add(jMenuBar1, BorderLayout.NORTH);

        generarEstilo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jMenuBar1.setAutoscrolls(true);

        jMenusize.setText("Tamaño");

        jMenuSize12.setText("12");
        jMenusize.add(jMenuSize12);

        jMenuSize16.setText("16");
        jMenusize.add(jMenuSize16);

        jMenuSize20.setText("20");
        jMenusize.add(jMenuSize20);

        jMenuSize24.setText("24");
        jMenusize.add(jMenuSize24);

        jMenuBar1.add(jMenusize);

        jMenuEstilo.setText("Estilo");

        jMenuNegrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negrita.png"))); // NOI18N
        jMenuNegrita.setText("Negrita");
        jMenuEstilo.add(jMenuNegrita);

        jMenuCursiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cursiva.png"))); // NOI18N
        jMenuCursiva.setText("Cursiva");
        jMenuEstilo.add(jMenuCursiva);

        jMenuBar1.add(jMenuEstilo);

        jMenu1.setText("Fuente");

        jMenuArial.setText("Arial");
        jMenu1.add(jMenuArial);

        jMenuCourier.setText("Courier");
        jMenu1.add(jMenuCourier);

        jMenuVerdana.setText("Verdana");
        jMenu1.add(jMenuVerdana);

        jMenuBar1.add(jMenu1);

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

        jMenuBar1.add(jMenuAlinear);

        jMenuSubrayar.setText("Subrayar");

        jMenuSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/underline.png"))); // NOI18N
        jMenuSub.setText("Subrayar");
        jMenuSubrayar.add(jMenuSub);

        jMenuBar1.add(jMenuSubrayar);

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

        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPane1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextPane1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCeActionPerformed

    private void jMenuNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuNegroActionPerformed

    private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyReleased
        Menu.contenido = jTextPane1.getText();
        System.out.println(Menu.contenido);
    }//GEN-LAST:event_jTextPane1KeyReleased

    public void generarEstilo() {

        //size jpanel
        //size
        jMenuSize12.addActionListener(new StyledEditorKit.FontSizeAction("size", 12));
        jMenuSize16.addActionListener(new StyledEditorKit.FontSizeAction("size", 16));
        jMenuSize20.addActionListener(new StyledEditorKit.FontSizeAction("size", 20));
        jMenuSize24.addActionListener(new StyledEditorKit.FontSizeAction("size", 24));
        //estilo
        jMenuNegrita.addActionListener(new StyledEditorKit.BoldAction());
        jMenuCursiva.addActionListener(new StyledEditorKit.ItalicAction());
        //fuente
        jMenuArial.addActionListener(new StyledEditorKit.FontFamilyAction("fuente", "Arial"));
        jMenuCourier.addActionListener(new StyledEditorKit.FontFamilyAction("fuente", "Courier"));
        jMenuVerdana.addActionListener(new StyledEditorKit.FontFamilyAction("fuente", "Verdana"));
        //alinear
        jMenuIz.addActionListener(new StyledEditorKit.AlignmentAction("alinear", 0));//0 izquieda
        jMenuCe.addActionListener(new StyledEditorKit.AlignmentAction("alinear", 1));//1 centro
        jMenuDe.addActionListener(new StyledEditorKit.AlignmentAction("alinear", 2));//2 derecha
        jMenuItem1.addActionListener(new StyledEditorKit.AlignmentAction("alinear", 3));//justificado;
        //subrayar
        jMenuSub.addActionListener(new StyledEditorKit.UnderlineAction());
        //colores
        jMenuAzul.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.blue));
        jMenuVerde.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.green));
        jMenuAmarillo.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.yellow));
        jMenuRojo.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.red));
        jMenuNegro.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.BLACK));

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAlinear;
    private javax.swing.JMenuItem jMenuAmarillo;
    private javax.swing.JMenuItem jMenuArial;
    private javax.swing.JMenuItem jMenuAzul;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
