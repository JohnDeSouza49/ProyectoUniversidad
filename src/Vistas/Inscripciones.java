package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inscripciones extends javax.swing.JInternalFrame {

    InscripcionData id;
    MateriaData mat = new MateriaData();
    AlumnoData ad;
    List<Materia> lista = new ArrayList<>();
    List<Materia> listaNo = new ArrayList<>();
    private DefaultComboBoxModel cbmodelo = null;
    private DefaultTableModel modelo = new DefaultTableModel();

    public Inscripciones(AlumnoData ad, InscripcionData id) {
        this.ad = ad;
        this.id = id;
        initComponents();
        armarEncabezado();
        llenarCB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCBAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRBMateriasInscripto = new javax.swing.JRadioButton();
        jRBMateriasNoInscripto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterias = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnularMateria = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setTitle("Formulario de inscripcion");

        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setText("Seleccione un alumno");

        jCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        BotonGrupo.add(jRBMateriasInscripto);
        jRBMateriasInscripto.setText("Materias inscriptas");
        jRBMateriasInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasInscriptoActionPerformed(evt);
            }
        });

        BotonGrupo.add(jRBMateriasNoInscripto);
        jRBMateriasNoInscripto.setText("Materias no inscriptas");
        jRBMateriasNoInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasNoInscriptoActionPerformed(evt);
            }
        });

        jTMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTMaterias);

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnularMateria.setText("AnularInscripcion");
        jBAnularMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularMateriaActionPerformed(evt);
            }
        });

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jRBMateriasInscripto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRBMateriasNoInscripto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBInscribir)
                                .addGap(65, 65, 65)
                                .addComponent(jBAnularMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMateriasInscripto)
                    .addComponent(jRBMateriasNoInscripto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnularMateria)
                    .addComponent(jBSalir))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBMateriasInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasInscriptoActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        Alumno a = (Alumno) jCBAlumno.getSelectedItem();
        int idA = 0;
        borrarFilas();
        idA = a.getIdAlumno();
        if (jRBMateriasNoInscripto.isSelected() == false && jRBMateriasInscripto.isSelected() == true) {
            lista = id.obtenerMateriasCursadas(idA);
            for (Materia m : lista) {
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnio()
                });
            }
        }

    }//GEN-LAST:event_jRBMateriasInscriptoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnoActionPerformed
        // TODO add your handling code here:
        Alumno a = (Alumno) jCBAlumno.getSelectedItem();
        int idA = 0;
        borrarFilas();
        idA = a.getIdAlumno();

        lista = id.obtenerMateriasCursadas(idA);

        if (jRBMateriasNoInscripto.isSelected() == true && jRBMateriasInscripto.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "Seleccione una sola opcion");
        }
        if (jRBMateriasNoInscripto.isSelected() == true && jRBMateriasInscripto.isSelected() == false) {
            listaNo = id.obtenerMateriasNoCursadas(idA);
            for (Materia m : listaNo) {
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnio()
                });
    }//GEN-LAST:event_jCBAlumnoActionPerformed
        }
        if (jRBMateriasNoInscripto.isSelected() == false && jRBMateriasInscripto.isSelected() == true) {
            lista = id.obtenerMateriasCursadas(idA);
            for (Materia m : lista) {
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnio()
                });
            }
        }
    }
    private void jRBMateriasNoInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasNoInscriptoActionPerformed
        // TODO add your handling code here:
        Alumno a = (Alumno) jCBAlumno.getSelectedItem();
        int idA = 0;
        borrarFilas();
        idA = a.getIdAlumno();
        borrarFilas();
        if (jRBMateriasNoInscripto.isSelected() == true && jRBMateriasInscripto.isSelected() == false) {
            listaNo = id.obtenerMateriasNoCursadas(idA);
            for (Materia m : listaNo) {
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnio()
                });
            }
        }
    }//GEN-LAST:event_jRBMateriasNoInscriptoActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        try {
            Alumno a = (Alumno) jCBAlumno.getSelectedItem();
            int idMateria = 0;
            Materia materia = null;
            int fila = jTMaterias.getSelectedRow();
            for (int i = 0; i <= jTMaterias.getRowCount(); i++) {
                idMateria = (int) jTMaterias.getValueAt(fila, 0);
            }
            materia = mat.buscarMateria(idMateria);

            Inscripcion nueva = new Inscripcion(0, a, materia);
            try {
                id.guardarInscripcion(nueva);
                modelo.removeRow(fila);
            } catch (SQLException ex) {
                Logger.getLogger(Inscripciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Inscripcion guardada");
        } catch (ArrayIndexOutOfBoundsException exc) {
            JOptionPane.showMessageDialog(null, "Busque un alumno para poder inscribir");
        }

    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularMateriaActionPerformed
        // TODO add your handling code here:
        Alumno a = (Alumno) jCBAlumno.getSelectedItem();
        int idA = a.getIdAlumno();
        int idMateria = 0;
        int filas = jTMaterias.getSelectedRow();
        for (int i = 0; i <= jTMaterias.getRowCount(); i++) {
            idMateria = (int) jTMaterias.getValueAt(filas, 0);

        }
        id.borrarInscripcionMaterialAlumno(idA, idMateria);
        modelo.removeRow(filas);

    }//GEN-LAST:event_jBAnularMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonGrupo;
    private javax.swing.JButton jBAnularMateria;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBMateriasInscripto;
    private javax.swing.JRadioButton jRBMateriasNoInscripto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTMaterias;
    // End of variables declaration//GEN-END:variables
private void armarEncabezado() {
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("AÑO");
        jTMaterias.setModel(modelo);
    }

    private void llenarCB() {
        cbmodelo = new DefaultComboBoxModel();
        jCBAlumno.setModel(cbmodelo);
        for (Alumno aux : ad.listarAlumnos()) {
            cbmodelo.addElement(aux);
        }

    }

    private void borrarFilas() {
        int filas = jTMaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
