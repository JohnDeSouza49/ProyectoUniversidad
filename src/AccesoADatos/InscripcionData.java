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
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();
    private Inscripcion inscripcion;
    //private Alumno alumno;
    // private Materia materia;

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
            JOptionPane.showMessageDialog(null, "Error al guardar la inscripción" + e.getMessage());
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        Inscripcion insc = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                insc = new Inscripcion();
                insc.setIdInscripto(rs.getInt("id_inscripto"));
                insc.setNota(rs.getDouble("nota"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("id_alumno"));
                Materia mat = matData.buscarMateria(rs.getInt("id_materia"));

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
        String sql = "SELECT * from inscripcion where id_alumno=?";
        Inscripcion insc = null;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                insc = new Inscripcion();
                insc.setIdInscripto((id));
                insc.setNota(rs.getDouble("nota"));
                int idAlumno = rs.getInt("id_alumno");
                int idMateria = rs.getInt("id_materia");
                Alumno alu = aluData.buscarAlumno(idAlumno);
                Materia mat = matData.buscarMateria(idMateria);
                insc.setAlumno(alu);
                insc.setMateria(mat);
                inscPorId.add(insc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return inscPorId;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {

        List<Materia> materiasCursadas = new ArrayList<>();
        String sql = "SELECT inscripcion.id_materia, nombre, año from inscripcion, materia where inscripcion.id_materia=materia.id_materia and inscripcion.id_alumno=?";
        PreparedStatement ps = null;
        Materia m = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                m = new Materia();
                m.setIdMateria(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("año"));
                materiasCursadas.add(m);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla inscripcion");
        }

        return materiasCursadas;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {

        List<Materia> materiasNoCursadas = new ArrayList<>();

        String sql = "SELECT * FROM  materia WHERE estado=1 And id_materia not in"
                + "(SELECT id_materia FROM inscripcion WHERE id_alumno=?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("id_Materia"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnio(rs.getInt("año"));
                materiasNoCursadas.add(mat);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla materia");
        }

        return materiasNoCursadas;
    }

    public void borrarInscripcionMaterialAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE id_alumno = ? AND id_materia = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int rs = ps.executeUpdate();

            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada con èxito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        String sql = "UPDATE inscripcion SET  nota=? WHERE id_alumno = ? AND id_materia= ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int rs = ps.executeUpdate();

            //if (rs == 1) {
            //  JOptionPane.showMessageDialog(null, "Nota modificada con éxito");
            //}
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

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
                alumno.setEstado(rs.getBoolean("estado"));
                materiasXAlumno.add(alumno);
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return materiasXAlumno;
    }

}
