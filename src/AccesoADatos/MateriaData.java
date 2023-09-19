
package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection conex = null;

    public MateriaData() {
        conex = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre,año, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet id = ps.getGeneratedKeys();
            if (id.next()) {
                materia.setIdMateria(id.getInt(1));
                JOptionPane.showMessageDialog(null,"Materia Agregada");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar Materia");
        }
    }

    public Materia buscarMateria(int id) {
        String query = "SELECT * from materia WHERE id_materia=?";
        Materia m = null;
        try {
            PreparedStatement ps = conex.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                m = new Materia();
                m.setIdMateria(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("año"));
                m.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "error al encontrar materia con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

   public List<Materia> listaMaterias() {
        List<Materia> materias = new ArrayList<>();
        Materia m = null;
        String sql = "SELECT * FROM materia WHERE estado=1";
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                m = new Materia();
                m.setIdMateria(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("año"));
                m.setEstado(rs.getBoolean("estado"));
                materias.add(m);
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return materias;

    }
   public void eliminarMateria(int id){
        String sql="UPDATE materia SET estado=0 WHERE id_materia=?";
        try {
            PreparedStatement ps= conex.prepareStatement(sql);  
            ps.setInt(1, id);

            int fila= ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, "Se elimino materia con id: "+id);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se encontro la tabla materia..");
        }
        
   }
public void modificarMateria(Materia mat) {

        String sql = "UPDATE materia SET nombre = ?, año = ?, estado=? WHERE id_materia = ?";
        PreparedStatement ps = null;

        try {
            ps = conex.prepareStatement(sql);
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnio());
            ps.setBoolean(3, mat.isEstado());
           ps.setInt(4, mat.getIdMateria());
            int exito = ps.executeUpdate();
            ps.close();
           if (exito == 1) {
              JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
           } else {
               JOptionPane.showMessageDialog(null, "La materia no existe");
            }
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }

                
    
    
}



