package ViewLayer;

import BusinessModelLayer.Farmacia;
import javax.swing.JOptionPane;

/**   
 *
 * @author virid
 */
public class frmFarmacias extends javax.swing.JInternalFrame {
    
    
    /**
     * Creates new form frmFarmacias
     */
    public frmFarmacias() {
        initComponents();
        jtFarmacias.setModel(new Farmacia().GetAllModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bActualizar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFarmacias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Farmacias");
        setVisible(true);

        jToolBar1.setRollover(true);

        bActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        bActualizar.setText("Actualizar");
        bActualizar.setFocusable(false);
        bActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(bActualizar);

        bNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-archivo.png"))); // NOI18N
        bNuevo.setText("Nuevo");
        bNuevo.setFocusable(false);
        bNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(bNuevo);

        bModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        bModificar.setText("Modificar");
        bModificar.setFocusable(false);
        bModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(bModificar);

        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.setFocusable(false);
        bEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(bEliminar);

        jtFarmacias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtFarmacias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        frmCrudFarmacias obj = new frmCrudFarmacias();
        obj.setTitle("Nueva Farmacia");
        obj.setModal(true);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
        jtFarmacias.setModel(new Farmacia().GetAllModel());

    }//GEN-LAST:event_bNuevoActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
       if (jtFarmacias.getSelectedRow() >= 0) {
            int idFarmacia = (int) jtFarmacias.getValueAt(jtFarmacias.getSelectedRow(), 0);
            frmCrudFarmacias obj = new frmCrudFarmacias(idFarmacia);
            obj.setTitle("Modificar producto");
            obj.setModal(true);
            obj.setLocationRelativeTo(null);
            obj.setVisible(true);
            jtFarmacias.setModel(new Farmacia().GetAllModel());
        }else{
            JOptionPane.showMessageDialog(null, "Debes de seleccionar un registro");
        }       
    }//GEN-LAST:event_bModificarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (jtFarmacias.getSelectedRow() >= 0) {
            int idFarmacia = (int) jtFarmacias.getValueAt(jtFarmacias.getSelectedRow(), 0);
            Farmacia obj = new Farmacia();
            obj.setIdFarmacia(idFarmacia);
            obj.Delete();
            jtFarmacias.setModel(new Farmacia().GetAllModel());
        }else{
            JOptionPane.showMessageDialog(null, "Debes de seleccionar un registro");
        }        
       
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
       jtFarmacias.setModel(new Farmacia().GetAllModel());
    }//GEN-LAST:event_bActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtFarmacias;
    // End of variables declaration//GEN-END:variables
}
