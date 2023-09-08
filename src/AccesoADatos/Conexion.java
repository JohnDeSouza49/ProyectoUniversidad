/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

/**
 *
 * @author Kanji
 */
import java.sql.Connection;
import java.sql.DriverManager;  // 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private String url;
    private String usuario;    // root
    private String password;   // ""

    private static Connection conexion = null;  // lo que importa  

    public Conexion(String url, String usr, String pass) {
        this.url = "jdbc:mariabd://localhost/universidad";
        usuario = usr;
        password = pass;
    }

    public Connection buscarConexion() {
        if (conexion == null) {  // si es la primera vez
            try {
                //cargamos las clases de mariadb que implementan JDBC
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, password);
            } catch (SQLException | ClassNotFoundException ex) {  // si me olvide de importar la libreria // error al cargar los drivers
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion; // retorna la conexion establecida
    }
}
