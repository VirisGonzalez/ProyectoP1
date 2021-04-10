package ViewLayer;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author virid
 */
public class frmMain extends javax.swing.JFrame {
    /**
     * Creates new form frmMainn
     */
    public frmMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    public void ControlaUbicacion(JInternalFrame inter) {
        boolean m = true;
        String Nombre = inter.getTitle();
        for (int i = 0; i < desktopPane.getComponentCount(); i++) {
            if (inter.getClass().isInstance(desktopPane.getComponent(i))) {
                inter.toFront();
                desktopPane.moveToFront(inter);
                m = false;
            } 
        }
        if (m) {
            desktopPane.add(inter);
            Dimension destopSize = desktopPane.getSize();
            Dimension frame = inter.getSize();
            inter.setLocation((destopSize.width - frame.width) / 2, (destopSize.height - frame.height) / 2);
        }
        inter.show();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        mnCatalogos = new javax.swing.JMenu();
        btnFarmacias = new javax.swing.JMenuItem();
        btnProductos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        mnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carpeta.png"))); // NOI18N
        mnArchivo.setText("Archivo");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        mnArchivo.add(btnSalir);

        jMenuBar1.add(mnArchivo);

        mnCatalogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/catalogar.png"))); // NOI18N
        mnCatalogos.setText("Catalogos");

        btnFarmacias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/farmacia.png"))); // NOI18N
        btnFarmacias.setText("Farmacias");
        btnFarmacias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmaciasActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnFarmacias);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estar.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnProductos);

        jMenuBar1.add(mnCatalogos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFarmaciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmaciasActionPerformed
        frmFarmacias obj = new frmFarmacias();
        ControlaUbicacion(obj);
    }//GEN-LAST:event_btnFarmaciasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        frmProductos obj = new frmProductos();
        ControlaUbicacion(obj);
    }//GEN-LAST:event_btnProductosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnFarmacias;
    private javax.swing.JMenuItem btnProductos;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnCatalogos;
    // End of variables declaration//GEN-END:variables
}
