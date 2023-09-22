
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;



public class UniversidadGrupo57 extends javax.swing.JFrame {

    private AlumnoData alumnoD;
    private MateriaData materiaD;
    private InscripcionData insD;
    
    public UniversidadGrupo57() {
        initComponents();
        alumnoD = new AlumnoData();
        materiaD= new MateriaData();
        insD= new InscripcionData();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbAlumno = new javax.swing.JMenu();
        miFormularioAlumno = new javax.swing.JMenuItem();
        mbMateria = new javax.swing.JMenu();
        miFormularioMateria = new javax.swing.JMenuItem();
        mbAdministracion = new javax.swing.JMenu();
        MiMenuInscripciones = new javax.swing.JMenuItem();
        miNotas = new javax.swing.JMenuItem();
        mbConsultas = new javax.swing.JMenu();
        miAlumnosPorMateria = new javax.swing.JMenuItem();
        mbSalir = new javax.swing.JMenu();
        MISalirDeLaVentana = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar3.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar3.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        mbAlumno.setText("Alumno");

        miFormularioAlumno.setText("Formulario de Alumno");
        miFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFormularioAlumnoActionPerformed(evt);
            }
        });
        mbAlumno.add(miFormularioAlumno);

        jMenuBar1.add(mbAlumno);

        mbMateria.setText("Materia");

        miFormularioMateria.setText("Formulario de Materia");
        miFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFormularioMateriaActionPerformed(evt);
            }
        });
        mbMateria.add(miFormularioMateria);

        jMenuBar1.add(mbMateria);

        mbAdministracion.setText("Administración");

        MiMenuInscripciones.setText("Manejo de Inscripciones");
        MiMenuInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiMenuInscripcionesActionPerformed(evt);
            }
        });
        mbAdministracion.add(MiMenuInscripciones);

        miNotas.setText("Manipulación de notas");
        miNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNotasActionPerformed(evt);
            }
        });
        mbAdministracion.add(miNotas);

        jMenuBar1.add(mbAdministracion);

        mbConsultas.setText("Consultas");

        miAlumnosPorMateria.setText("Alumnos por Materia");
        miAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlumnosPorMateriaActionPerformed(evt);
            }
        });
        mbConsultas.add(miAlumnosPorMateria);

        jMenuBar1.add(mbConsultas);

        mbSalir.setText("Salir");
        mbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSalirActionPerformed(evt);
            }
        });

        MISalirDeLaVentana.setText("Salir del buscador");
        MISalirDeLaVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MISalirDeLaVentanaActionPerformed(evt);
            }
        });
        mbSalir.add(MISalirDeLaVentana);

        jMenuBar1.add(mbSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFormularioAlumnoActionPerformed
        // TODO add your handling code here:
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        GestionAlumnos gp = new GestionAlumnos(alumnoD);
        gp.setVisible(true);
        jDEscritorio.add(gp);
        jDEscritorio.moveToFront(gp);

    }//GEN-LAST:event_miFormularioAlumnoActionPerformed

    private void miNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNotasActionPerformed
        // TODO add your handling code here:
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ActualizacionDeNotas an = new ActualizacionDeNotas(alumnoD,insD);
        an.setVisible(true);
        jDEscritorio.add(an);
        jDEscritorio.moveToFront(an);
    }//GEN-LAST:event_miNotasActionPerformed

    private void miAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlumnosPorMateriaActionPerformed
        
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ConsultaAlumnoPorMateria an = new ConsultaAlumnoPorMateria(materiaD, insD);
        an.setVisible(true);
        jDEscritorio.add(an);
        jDEscritorio.moveToFront(an);
    }//GEN-LAST:event_miAlumnosPorMateriaActionPerformed

    private void miFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFormularioMateriaActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        GestionMaterias an = new GestionMaterias(materiaD);
        an.setVisible(true);
        jDEscritorio.add(an);
        jDEscritorio.moveToFront(an);
    }//GEN-LAST:event_miFormularioMateriaActionPerformed

    private void MiMenuInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiMenuInscripcionesActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        Inscripciones mi = new Inscripciones();
        mi.setVisible(true);
        jDEscritorio.add(mi);
        jDEscritorio.moveToFront(mi); 
    }//GEN-LAST:event_MiMenuInscripcionesActionPerformed

    private void mbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSalirActionPerformed
    
  
    }//GEN-LAST:event_mbSalirActionPerformed

    private void MISalirDeLaVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MISalirDeLaVentanaActionPerformed
       
                                              
        this.dispose(); // Esto cierra la ventana actual


    }//GEN-LAST:event_MISalirDeLaVentanaActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UniversidadGrupo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniversidadGrupo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniversidadGrupo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniversidadGrupo57.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UniversidadGrupo57().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MISalirDeLaVentana;
    private javax.swing.JMenuItem MiMenuInscripciones;
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mbAdministracion;
    private javax.swing.JMenu mbAlumno;
    private javax.swing.JMenu mbConsultas;
    private javax.swing.JMenu mbMateria;
    private javax.swing.JMenu mbSalir;
    private javax.swing.JMenuItem miAlumnosPorMateria;
    private javax.swing.JMenuItem miFormularioAlumno;
    private javax.swing.JMenuItem miFormularioMateria;
    private javax.swing.JMenuItem miNotas;
    // End of variables declaration//GEN-END:variables
}

