/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo57;

import java.time.LocalDate;
import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UniversidadGrupo57 {

    public static void main(String[] args) {
       // Alumno alumno = new Alumno(, 0, apellido, nombre, LocalDate.MIN, true)
        
        //inscripcion.guardarInscripcion(inscripcion);
        

        //Connection con = Conexion.getConexion();
        //Alumno juan=new Alumno (45866683,"Martinez","pedro",LocalDate.of(1980,4,25),true);
       /* AlumnoData alu=new AlumnoData();
        MateriaData mat = new MateriaData();
        Materia materia = null;
        Alumno alumno = null;
        alumno = alu.buscarAlumno(2);
        materia = mat.buscarMateria(5);
        Inscripcion inscripcion = new Inscripcion( 8, alumno,  materia);
        InscripcionData insc = new InscripcionData();
        try {
            insc.guardarInscripcion(inscripcion);*/
            
            //System.out.println(alu.listarAlumnos());
            // alu.guardarAlumno(juan);
            
            
            //System.out.println(materia.listarMaterias());
            //Connection con = Conexion.getConexion();  // TODO code application logic here
            // Alumno juan = new Alumno(12312366, "luna", "pedro", LocalDate.of(1980, 4, 25), true);
           // AlumnoData alu = new AlumnoData();
            //MateriaData mat = new MateriaData();
            //System.out.println(alu.buscarAlumno(8));
           //System.out.println(mat.buscarMateria(23));
            //alu.guardarAlumno(juan);
       /* } catch (SQLException ex) {
            Logger.getLogger(UniversidadGrupo57.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       InscripcionData insc = new InscripcionData();
        //System.out.println(insc.obtenerInscripcionesPorAlumno(8));
        //System.out.println(insc.obtenerInscripciones());
        //System.out.println(insc.obtenerMateriasCursadas(8));
        
        //insc.actualizarNota(11, 5, 9);
        
        //insc.borrarInscripcionMaterialAlumno(1, 5);
        
       /* for(Inscripcion in:insc.obtenerInscripciones()){
            
            System.out.println("id: "+in.getIdInscripto()+" - nota: "+ in.getNota() + " - idAlumno: "+
                    in.getAlumno().getIdAlumno()+ " - idMateria: " + in.getMateria().getIdMateria());
        }*/
       
       
       for(Materia in:insc.obtenerMateriasNoCursadas(11)){
           
           System.out.println("idMateria: " + in.getIdMateria()+" - materia: " + in.getNombre()
           + " - anio: " + in.getAnio());
       }
    }
}
