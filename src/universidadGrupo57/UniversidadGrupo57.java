/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo57;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import Entidades.Alumno;
import java.sql.Connection;

public class UniversidadGrupo57 {

    public static void main(String[] args) {
      //Connection con = Conexion.getConexion();
    Alumno a= new Alumno(45866683, "Luque", "Jazmin",(2004-07-07), true);
    AlumnoData data= new AlumnoData();
    data.guardarAlumno(a);
    }
    
}
