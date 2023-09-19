package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InscripcionData {

    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {

        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {

    }

    public List<Inscripcion> obtenerInscripciones() {

        List<Inscripcion> inscripciones = new ArrayList<>();

        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {

        List<Inscripcion> inscPorId = new ArrayList<>();

        return inscPorId;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {

        List<Materia> materiasCursadas = new ArrayList<>();

        return materiasCursadas;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {

        List<Materia> materiasNoCursadas = new ArrayList<>();

        return materiasNoCursadas;
    }

    public void borrarInscripcionMaterialAlumno(int idAlumno, int idMateria) {

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> materiasXAlumno = new ArrayList<>();
      String sql="SELECT * from alumno inner join inscripcion on(inscripcion.id_alumno=alumno.id_alumno) where id_materia=?";
      PreparedStatement ps;
      Alumno alumno= null;
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);
            ResultSet rs= ps.executeQuery();
            
          while(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("id_alumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                materiasXAlumno.add(alumno);
                ps.close();
          }
                

            
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
        

        return materiasXAlumno;
    }

}