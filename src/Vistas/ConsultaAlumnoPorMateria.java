
package Vistas;

import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaAlumnoPorMateria extends javax.swing.JInternalFrame {
  
    private DefaultTableModel modeloMateria = new DefaultTableModel();
    private DefaultComboBoxModel modelito= null;
   private MateriaData materiaD;
   private InscripcionData insD;
    private Connection conex=null;
    
            private void llenarCB(){
                modelito= new DefaultComboBoxModel();
                jCBMateria.setModel(modelito);
                for(Materia aux:materiaD.listaMaterias()){
                    modelito.addElement(aux);
 
                }

            }

    public ConsultaAlumnoPorMateria(MateriaData materiaD,InscripcionData insD) {
        this.materiaD=materiaD;
        this.insD=insD;
        conex= Conexion.getConexion();
        initComponents();
        armarEncabezado();
        llenarCB();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterias = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();

        setTitle("Listado de alumnos");

        jLabel1.setText("LISTADO DE ALUMNOS POR MATERIA");

        jLabel2.setText("Seleccione una materia");

        jCBMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateriaActionPerformed(evt);
            }
        });

        jTMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTMaterias);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jBSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jBSalir)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriaActionPerformed

       Materia materia= (Materia)jCBMateria.getSelectedItem();
       borrarFilas();
       int id= materia.getIdMateria();
        if(materia!=null){
          List<Alumno> alumnos= new ArrayList<>();
           alumnos=insD.obtenerAlumnosXMateria(id);
            for(Alumno a:alumnos){
                 modeloMateria.addRow(new Object[]{
                       a.getIdAlumno(),
                        a.getDni(),
                         a.getApellido(),
                         a.getNombre()
                                 
    });
            }
        }
        
   
    }//GEN-LAST:event_jCBMateriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMaterias;
    // End of variables declaration//GEN-END:variables
private void armarEncabezado() {
        modeloMateria.addColumn("LEGAJO");
        modeloMateria.addColumn("DNI");
        modeloMateria.addColumn("APELLIDO");
        modeloMateria.addColumn("NOMBRE");
        jTMaterias.setModel(modeloMateria);
    }
private void borrarFilas(){
    int filas=jTMaterias.getRowCount()-1;
    for(int f=filas;f>=0;f--){
        modeloMateria.removeRow(f);
    }
}

}
