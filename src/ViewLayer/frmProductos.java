package ViewLayer;

import BusinessModelLayer.Producto;
import javax.swing.JOptionPane;
import DataAccessLayer.DataAccess;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;


/**
 *
 * @author virid
 */
public class frmProductos extends javax.swing.JInternalFrame {
     
    /**
     * Creates new form fmrProductos
     */
    public frmProductos() {
        initComponents();
        jtProductos.setModel(new Producto().GetAllModel());
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bActualizar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
        setVisible(true);

        jToolBar1.setFloatable(false);
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

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        frmCrudProductos obj = new frmCrudProductos();
        obj.setTitle("Nuevo Producto");
        obj.setModal(true);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
        jtProductos.setModel(new Producto().GetAllModel());
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        if (jtProductos.getSelectedRow() >= 0) {
            int idProducto = (int) jtProductos.getValueAt(jtProductos.getSelectedRow(), 0);
            frmCrudProductos obj = new frmCrudProductos(idProducto);
            obj.setTitle("Modificar producto");
            obj.setModal(true);
            obj.setLocationRelativeTo(null);
            obj.setVisible(true);
            jtProductos.setModel(new Producto().GetAllModel());
        }else{
            JOptionPane.showMessageDialog(null, "Debes de seleccionar un registro");
        }        
    }//GEN-LAST:event_bModificarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (jtProductos.getSelectedRow() >= 0) {
            int idProducto = (int) jtProductos.getValueAt(jtProductos.getSelectedRow(), 0);
            Producto obj = new Producto();
            obj.setIdProducto(idProducto);
            obj.Delete();
            jtProductos.setModel(new Producto().GetAllModel());
        }else{
            JOptionPane.showMessageDialog(null, "Debes de seleccionar un registro");
        }        
       
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
       jtProductos.setModel(new Producto().GetAllModel());
    }//GEN-LAST:event_bActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
}
