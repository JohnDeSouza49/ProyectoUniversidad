package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InscripcionData {

    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {

        con = Conexion.getConexion();
    }

    public void guardarInscripcion(int idAlumno, int idMateria)  throws SQLException {
        String sql = "INSERT INTO Inscripcion (idAlumno, idMateria) VALUES (?, ?)";

       
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

        return materiasXAlumno;
    }

}