package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ActualizacionDeNotas extends javax.swing.JInternalFrame {

    private DefaultComboBoxModel cbmodelo = null;
    private DefaultTableModel modeloNotas = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return c == 2;
        }
    };

    private AlumnoData ad;
    private InscripcionData id;

    public ActualizacionDeNotas(AlumnoData ad, InscripcionData id) {
        this.id = id;
        this.ad = ad;
        initComponents();
        armarEncabezado();
        llenarCB();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCBAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNotaMateria = new javax.swing.JTable();
        jBGuardarNota = new javax.swing.JButton();
        jBSalirdeNotas = new javax.swing.JButton();

        setTitle("Carga de notas");

        jLabel1.setText("Seleccione un alumno");

        jLabel2.setText("CARGA DE NOTAS");

        jCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnoActionPerformed(evt);
            }
        });

        jTNotaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jTNotaMateria);

        jBGuardarNota.setText("Guardar");
        jBGuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarNotaActionPerformed(evt);
            }
        });

        jBSalirdeNotas.setText("Salir");
        jBSalirdeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirdeNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jBGuardarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalirdeNotas)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalirdeNotas)
                    .addComponent(jBGuardarNota))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnoActionPerformed
        Alumno alumno = (Alumno) jCBAlumno.getSelectedItem();
        borrarFilas();
        int idAlumno = alumno.getIdAlumno();
        List<Materia> mCursadas = new ArrayList<>();
        mCursadas = id.obtenerMateriasCursadas(idAlumno);
        List<Inscripcion> lista = new ArrayList<>();
        lista = id.obtenerInscripcionesPorAlumno(idAlumno);
        if (alumno != null) {
            for (Inscripcion m : lista) {
                modeloNotas.addRow(new Object[]{
                    m.getMateria().getIdMateria(),
                    m.getMateria().getNombre(),
                    m.getNota()

                });
            }
        }

    }//GEN-LAST:event_jCBAlumnoActionPerformed

    private void jBGuardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarNotaActionPerformed

        try {
            Alumno a = (Alumno) jCBAlumno.getSelectedItem();
            int idAlumno = a.getIdAlumno();
            int fila = jTNotaMateria.getSelectedRow();
            for (int i = 0; i <= jTNotaMateria.getRowCount(); i++) {
                int idMateria = (int) jTNotaMateria.getValueAt(fila, 0);
                double nota = Double.parseDouble(jTNotaMateria.getValueAt(fila, 2).toString());

                id.actualizarNota(idAlumno, idMateria, nota);

    }//GEN-LAST:event_jBGuardarNotaActionPerformed

            JOptionPane.showMessageDialog(null, "nota modificada");
        } catch (ArrayIndexOutOfBoundsException exc) {
            JOptionPane.showMessageDialog(null, "Error al guardar nota");
        }
    }

    private void jBSalirdeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirdeNotasActionPerformed

        this.dispose();
    }//GEN-LAST:event_jBSalirdeNotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardarNota;
    private javax.swing.JButton jBSalirdeNotas;
    private javax.swing.JComboBox<String> jCBAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTNotaMateria;
    // End of variables declaration//GEN-END:variables
private void armarEncabezado() {
        modeloNotas.addColumn("CÓDIGO");
        modeloNotas.addColumn("NOMBRE");
        modeloNotas.addColumn("NOTA");
        jTNotaMateria.setModel(modeloNotas);
    }

    private void llenarCB() {
        cbmodelo = new DefaultComboBoxModel();
        jCBAlumno.setModel(cbmodelo);
        for (Alumno aux : ad.listarAlumnos()) {
            cbmodelo.addElement(aux);
        }

    }

    private void borrarFilas() {
        int filas = jTNotaMateria.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloNotas.removeRow(f);
        }
    }

}
