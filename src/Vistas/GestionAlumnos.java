package Vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    private AlumnoData alumnoD;

    public GestionAlumnos(AlumnoData alumnoD) {
        initComponents();
        this.alumnoD = alumnoD;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jBBuscarAlumno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jREstado = new javax.swing.JRadioButton();
        jBIngresarAlumno = new javax.swing.JButton();
        jBEliminarAlumno = new javax.swing.JButton();
        jBGuardarAlumno = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jDFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setTitle("Alumno");

        jLabel1.setText("ALUMNO");

        jLabel2.setText("DNI :");

        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });

        jBBuscarAlumno.setText("Buscar");
        jBBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de Nacimiento");

        jREstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREstadoActionPerformed(evt);
            }
        });

        jBIngresarAlumno.setText("Nuevo");
        jBIngresarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarAlumnoActionPerformed(evt);
            }
        });

        jBEliminarAlumno.setText("Eliminar");
        jBEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarAlumnoActionPerformed(evt);
            }
        });

        jBGuardarAlumno.setText("Guardar");
        jBGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarAlumnoActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addComponent(jTDni))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTApellido)
                                    .addComponent(jTNombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jREstado))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jDFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBIngresarAlumno)
                        .addGap(32, 32, 32)
                        .addComponent(jBEliminarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardarAlumno)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jBBuscarAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5))
                    .addComponent(jREstado))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIngresarAlumno)
                    .addComponent(jBEliminarAlumno)
                    .addComponent(jBGuardarAlumno)
                    .addComponent(jBSalir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jREstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jREstadoActionPerformed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarAlumnoActionPerformed

        //int dni = Integer.parseInt(jTDni.getText());
        String apellido = jTApellido.getText().toString();
        String nombre = jTNombre.getText().toString();
        //LocalDate fechaNacimiento = jDFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // boolean estado = jREstado.isSelected();

        if (apellido.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos");

            return;

        }
        try {

            int dni = Integer.parseInt(jTDni.getText());
            if (dni < 1000000 || dni > 99999999) {
                JOptionPane.showMessageDialog(null, "ingresa un DNI válido");
                return;
            }
            LocalDate fechaNacimiento = jDFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jREstado.isSelected();
            List<Alumno> listaA = new ArrayList<>();
            Alumno a= new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
            listaA = alumnoD.listarAlumnos();
            for(Alumno aux: listaA){
                if(aux.getDni()!=dni){
                   alumnoD.guardarAlumno(new Alumno(dni, apellido, nombre, fechaNacimiento, estado));
                   break;
                }else{
             Alumno nuevo= new Alumno(aux.getIdAlumno(), dni, apellido, nombre, fechaNacimiento, estado);
                    alumnoD.modificarAlumno(nuevo);

                    }
           
            }
            jTDni.setText("");
            jTApellido.setText("");
            jTNombre.setText("");
            jREstado.setSelected(true);
            jDFechaNacimiento.setDate(null);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "datos incorrectos");

            jTDni.setText("");
            jTApellido.setText("");
            jTNombre.setText("");

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos");
        }

    }//GEN-LAST:event_jBGuardarAlumnoActionPerformed

    private void jBBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarAlumnoActionPerformed
        // TODO add your handling code here:

        int dni = Integer.parseInt(jTDni.getText());

        Alumno alumno = alumnoD.buscarAlumnoPorDni(dni);

        jTApellido.setText(alumno.getApellido());
        jTNombre.setText(alumno.getNombre());
        jREstado.setSelected(alumno.isEstado());
        LocalDate fechaNac = alumno.getFechaNacimiento();
        Date date = java.sql.Date.valueOf(fechaNac);
        jDFechaNacimiento.setDate(date);
        //hola


    }//GEN-LAST:event_jBBuscarAlumnoActionPerformed

    private void jBIngresarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarAlumnoActionPerformed
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jREstado.setSelected(true);
        jDFechaNacimiento.setDate(null);

// TODO add your handling code here:
    }//GEN-LAST:event_jBIngresarAlumnoActionPerformed

    private void jBEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarAlumnoActionPerformed
        int dni = Integer.parseInt(jTDni.getText());
        if (jTDni != null) {

            AlumnoData alumno = new AlumnoData();
            Alumno a = alumno.buscarAlumnoPorDni(dni);

            alumno.eliminarAlumno(a.getIdAlumno());
            jREstado.setSelected(false);

    }//GEN-LAST:event_jBEliminarAlumnoActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarAlumno;
    private javax.swing.JButton jBEliminarAlumno;
    private javax.swing.JButton jBGuardarAlumno;
    private javax.swing.JButton jBIngresarAlumno;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
