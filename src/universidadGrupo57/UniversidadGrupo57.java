/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo57;

import java.time.LocalDate;
import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import Entidades.Alumno;
import java.sql.Connection;

/**
 *
 * @author Kanji
 */
public class UniversidadGrupo57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Connection con = Conexion.getConexion();  // TODO code application logic here
    Alumno juan=new Alumno (12312312,"luna","pedro",LocalDate.of(1980,4,25),true);
    AlumnoData alu=new AlumnoData();
    alu.guardarAlumno(juan);
    }
  
    
}
