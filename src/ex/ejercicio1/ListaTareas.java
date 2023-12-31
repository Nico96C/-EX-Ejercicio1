/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.ejercicio1;

import static ex.ejercicio1.ListaTareasView.listaTareas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nico
 */
public class ListaTareas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }

    };

    /**
     * Creates new form ListaTareas
     */
    public ListaTareas() {
        initComponents();
        armarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JButton();
        BotonCompletado = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(JTabla);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista de Tareas");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Marque para asignar estado de la tarea:");

        BotonEliminar.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BotonEliminar.setText("Eliminada");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonCompletado.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        BotonCompletado.setForeground(new java.awt.Color(0, 0, 0));
        BotonCompletado.setText("Completada");
        BotonCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCompletadoActionPerformed(evt);
            }
        });

        BotonSalir.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(0, 0, 0));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cargar Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BotonEliminar)
                .addGap(112, 112, 112)
                .addComponent(BotonCompletado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonCompletado)
                    .addComponent(BotonSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        int Fila = JTabla.getSelectedRow();
        System.out.println(Fila + "");
        if (Fila != -1) {

            for (int i = 0; i < JTabla.getRowCount(); i++) {

                for (Tarea aux : listaTareas) {
                    
                    if (JTabla.getValueAt(i, 0).toString().equals(aux.getCodigo()+"")) {
                        borrarFilas();
                        aux.setTipo("Eliminada");
                        modelo.addRow(new Object[]{aux.getCodigo(), aux.getDescripcion(), aux.getTipo()});
                        JOptionPane.showMessageDialog(this, "Se ha establecido la tarea como eliminada!");
                    } else {
                        borrarFilas();
                        for (Tarea lista1 : listaTareas) {
                            modelo.addRow(new Object[]{lista1.getCodigo(), lista1.getDescripcion(), lista1.getTipo()});

                        }
                    }
                    
                }
                break;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para borrar!");
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCompletadoActionPerformed

    }//GEN-LAST:event_BotonCompletadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        borrarFilas();
        for (Tarea aux : listaTareas) {
            modelo.addRow(new Object[]{aux.getCodigo(), aux.getDescripcion(), aux.getTipo()});
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCompletado;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTable JTabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion de la tarea");
        modelo.addColumn("Estado");
        JTabla.setModel(modelo);
    }

    private void borrarFilas() {

        int f = JTabla.getRowCount() - 1;
        for (int fila = f; fila >= 0; fila--) {

            modelo.removeRow(fila);
        }
    }
}
