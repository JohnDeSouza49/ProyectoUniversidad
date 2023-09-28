package Vistas;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class GestionMaterias extends javax.swing.JInternalFrame {

    private MateriaData materiaD;

    public GestionMaterias(MateriaData materiaD) {
        this.materiaD = materiaD;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTCodigoDeMateria = new javax.swing.JTextField();
        jTMateria = new javax.swing.JTextField();
        jTAnio = new javax.swing.JTextField();
        jREstadoMateria = new javax.swing.JRadioButton();
        jBBuscarMateria = new javax.swing.JButton();
        jBLimpiarMateria = new javax.swing.JButton();
        jBEliminarMateria = new javax.swing.JButton();
        jBGuardarMateria = new javax.swing.JButton();
        jBSalirDeMateria = new javax.swing.JButton();

        setTitle("Materia");

        jLabel1.setText("MATERIA");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jLabel5.setText("Estado");

        jTCodigoDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoDeMateriaActionPerformed(evt);
            }
        });

        jBBuscarMateria.setText("Buscar");
        jBBuscarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarMateriaActionPerformed(evt);
            }
        });

        jBLimpiarMateria.setText("Nuevo");
        jBLimpiarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarMateriaActionPerformed(evt);
            }
        });

        jBEliminarMateria.setText("Eliminar");
        jBEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarMateriaActionPerformed(evt);
            }
        });

        jBGuardarMateria.setText("Guardar");
        jBGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarMateriaActionPerformed(evt);
            }
        });

        jBSalirDeMateria.setText("Salir");
        jBSalirDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirDeMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jREstadoMateria)
                                            .addComponent(jTMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTCodigoDeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBBuscarMateria)
                                        .addGap(24, 24, 24))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBLimpiarMateria)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminarMateria)
                                .addGap(20, 20, 20)
                                .addComponent(jBGuardarMateria)
                                .addGap(18, 18, 18)
                                .addComponent(jBSalirDeMateria)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigoDeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jREstadoMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarMateria)
                    .addComponent(jBEliminarMateria)
                    .addComponent(jBGuardarMateria)
                    .addComponent(jBSalirDeMateria))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirDeMateriaActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirDeMateriaActionPerformed

    private void jBGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarMateriaActionPerformed

        String nombre = jTMateria.getText();
        int anio = Integer.parseInt(jTAnio.getText());
        boolean estado = jREstadoMateria.isSelected();
        try{
        int idMateria = Integer.parseInt(jTCodigoDeMateria.getText());
             Materia mat = null;
        Materia a=null;
        List<Materia> listaM = new ArrayList<>();
        listaM = materiaD.listaTodasLasMaterias();
        for (Materia materia : listaM) {
            if(materia.getNombre().equals(nombre)&& materia.getAnio()==anio){
                mat=new Materia(idMateria, nombre, anio, estado);
                materiaD.modificarMateria(mat);
                break;
            } 
     }
                jTMateria.setText("");
                jTAnio.setText("");
                jREstadoMateria.setText("");


    } catch(NumberFormatException e){
        if(nombre!=null ){
         Materia mat=new Materia();
                mat.setNombre(nombre);
                mat.setAnio(anio);
                mat.setEstado(estado);
                materiaD.guardarMateria(mat);     
        }
        
    }

    }//GEN-LAST:event_jBGuardarMateriaActionPerformed

    private void jBLimpiarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarMateriaActionPerformed
        jTCodigoDeMateria.setText("");
        jTMateria.setText("");
        jTAnio.setText("");
        jREstadoMateria.setSelected(false);

    }//GEN-LAST:event_jBLimpiarMateriaActionPerformed

    private void jTCodigoDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoDeMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoDeMateriaActionPerformed

    private void jBEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarMateriaActionPerformed
        try {

            int id = Integer.parseInt(jTCodigoDeMateria.getText());

            if (jTCodigoDeMateria != null) {
                MateriaData mt = new MateriaData();
                mt.eliminarMateria(id);
                jREstadoMateria.setSelected(false);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe buscar una materia para poder eliminarla");
        }

    }//GEN-LAST:event_jBEliminarMateriaActionPerformed

    private void jBBuscarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarMateriaActionPerformed

        try {
            int id_materia = Integer.parseInt(jTCodigoDeMateria.getText());

            Materia materia = materiaD.buscarMateria(id_materia);

            jTMateria.setText(materia.getNombre());
            jTAnio.setText(String.valueOf(materia.getAnio()));
            jREstadoMateria.setSelected(materia.isEstado());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un codigo");
        }
    }//GEN-LAST:event_jBBuscarMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarMateria;
    private javax.swing.JButton jBEliminarMateria;
    private javax.swing.JButton jBGuardarMateria;
    private javax.swing.JButton jBLimpiarMateria;
    private javax.swing.JButton jBSalirDeMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jREstadoMateria;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTCodigoDeMateria;
    private javax.swing.JTextField jTMateria;
    // End of variables declaration//GEN-END:variables
}
