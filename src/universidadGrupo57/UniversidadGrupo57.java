/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo57;

import java.time.LocalDate;
import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Connection;

public class UniversidadGrupo57 {

    public static void main(String[] args) {

        //Connection con = Conexion.getConexion();
        //Alumno juan=new Alumno (45866683,"Martinez","pedro",LocalDate.of(1980,4,25),true);
        //AlumnoData alu=new AlumnoData();
        //alu.listarAlumnos();
        // alu.guardarAlumno(juan);
        Materia uno = new Materia("Matematica", 2, true);
        MateriaData materia = new MateriaData();
        materia.guardarMateria(uno);


     //Connection con = Conexion.getConexion();  // TODO code application logic here
    //Alumno juan=new Alumno (45866683,"Martinez","pedro",LocalDate.of(1980,4,25),true);
    //AlumnoData alu=new AlumnoData();
    //alu.listarAlumnos();
   // alu.guardarAlumno(juan);
    //Materia uno= new Materia("Matematica",2, true);
    //MateriaData materia= new MateriaData();
       // System.out.println(materia.listarMaterias());


        //Connection con = Conexion.getConexion();  // TODO code application logic here
        Alumno juan = new Alumno(12312366, "luna", "pedro", LocalDate.of(1980, 4, 25), true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(juan);

    }
}
