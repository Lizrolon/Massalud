
package massalud.AccesoAdatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3307/"; 
    private static final String DB="massalud"; 
    private static final String USUARIO="root"; 
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){};
    
    public static Connection getConexion(){
        //si la se conecta por primera vez entra.
        if (connection==null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
                JOptionPane.showMessageDialog(null,"Conectado");
                
            } catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(null,"Error al cargar el archivo "+ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Eror de conexion " + ex.getMessage());
            }
        }
       return connection;
    }
    
    
}
