
package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {
private Connection conex= null;

public MateriaData(){
 conex= Conexion.getConexion();
}

public void guardarMateria(Materia materia){
    String sql="INSERT INTO materia (nombre,año, estado) VALUES (?, ?, ?)";
    try {
        PreparedStatement ps= conex.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, materia.getNombre());
        ps.setInt(2, materia.getAnio());
        ps.setBoolean(3, materia.isEstado());
        ps.executeUpdate();
        ResultSet id= ps.getGeneratedKeys();
        if(id.next()){
         materia.setIdMateria(id.getInt(1));
            System.out.println("Materia agregada con exito");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al agregar Materia");
    }
    
        
    }
}



