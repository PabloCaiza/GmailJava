/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.DefaultEditorKit;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Pablo Caiza
 */
public class ProcesadorTexto extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */private boolean wrap;
    public ProcesadorTexto() {
        initComponents();
        this.setLocationRelativeTo(null);
       
      
        generarEstilo();

    }
   

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneProcesador = new javax.swing.JTextPane();
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

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPaneProcesador.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jTextPaneProcesadorHierarchyChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPaneProcesador);

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuNegroActionPerformed

    private void jMenuCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCeActionPerformed

    private void jTextPaneProcesadorHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jTextPaneProcesadorHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPaneProcesadorHierarchyChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesadorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcesadorTexto().setVisible(true);
            }
        });
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPaneProcesador;
    // End of variables declaration//GEN-END:variables
}
