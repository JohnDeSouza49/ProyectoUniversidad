
package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;

public class MateriaData {
private Connection conex= null;

public MateriaData(){
 conex= Conexion.getConexion();
}

public void guardarMateria(Materia materia){
    String sql="INSERT INTO materia (nombre,año, estado) VALUES (?, ?, ?)";
}


}
