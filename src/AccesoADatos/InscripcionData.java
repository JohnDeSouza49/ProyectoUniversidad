package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;
    private Inscripcion inscripcion;
    private Alumno alumno;
    private Materia materia;
    public InscripcionData() {

        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion inscripcion) throws SQLException {
       
        String sql = "INSERT INTO inscripcion(nota, id_alumno, id_materia)  VALUES (?, ?, ?)";
                try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
                    System.out.println("todo bien");
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar la inscripción" + e.getMessage());
        }

    }

   /* public List<Inscripcion> obtenerInscripciones() {

        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        Alumno alu = null;
        Materia mat = null;
        Inscripcion insc=null;
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                insc= new Inscripcion();
                insc.setIdInscripto(rs.getInt("id_inscripto"));
                insc.setNota(rs.getDouble("nota"));
                int alumno=rs.getInt("id_alumno");
               int materia = rs.getInt("id_materia");  
                Alumno alu = buscarAlumno(idAlumno);
                Materia mat = buscarMateria(idMateria);
                insc.setAlumno(alu);
                insc.setMateria(mat);
                inscripciones.add(insc);
                
            }
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error al obtener la lista" + e.getMessage());
        }

        return inscripciones;
        
       
    }*/
    public List<Inscripcion> obtenerInscripciones() {
    List<Inscripcion> inscripciones = new ArrayList<>();
    String sql = "SELECT * FROM inscripcion";
    Inscripcion insc = null;
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            AlumnoData aluData = new AlumnoData();
            MateriaData matData = new MateriaData();
            insc = new Inscripcion();
            insc.setIdInscripto(rs.getInt("id_inscripto"));
            insc.setNota(rs.getDouble("nota"));
            int idAlumno = rs.getInt("id_alumno");
            int idMateria = rs.getInt("id_materia");  
            Alumno alu = aluData.buscarAlumno(idAlumno);
            Materia mat = matData.buscarMateria(idMateria);
            
            insc.setAlumno(alu);
            insc.setMateria(mat);
            inscripciones.add(insc);
        }
    } catch (SQLException e) {
       JOptionPane.showMessageDialog(null, "Error al obtener la lista" + e.getMessage());
    }

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
        String sql = "SELECT * from alumno inner join inscripcion on(inscripcion.id_alumno=alumno.id_alumno) where id_materia=?";
        PreparedStatement ps;
        Alumno alumno = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
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


