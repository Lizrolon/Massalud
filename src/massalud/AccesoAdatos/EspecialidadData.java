
package massalud.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import massalud.Entidades.Especialidad;


public class EspecialidadData {
    private Connection con = null;

    public EspecialidadData() {
        con = Conexion.getConexion();
    }
    
    public void guardarEsp(Especialidad esp){
    
    String sql = "INSERT INTO especialidad(idEspecialidad, especialidad) VALUES(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, esp.getEspecialidad());
          int f = ps.executeUpdate();
        if(f==1){
            
            JOptionPane.showMessageDialog(null,"Especialidad guardada");
        
        }  
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Especialidad"+ex.getMessage());
        }
    
    }
   public Especialidad buscarEp(int id){
       Especialidad esp = null;
      
       String sql = "SELECT * FROM especialidad WHERE idEspecialidad = ?";
       PreparedStatement ps;
       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
           ResultSet rs = ps.executeQuery();
         if(rs.next()){
             esp = new Especialidad();
             esp.setIdEspecialidad(id);
             esp.setEspecialidad(rs.getString("especialidad"));
   
         }   
      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Especialidada"+ex.getMessage());
   } 
   return esp;  
   }   
    public Especialidad modificar(String especialidad, int id) {

        Especialidad esp = new Especialidad();

        String sql = "UPDATE especialidad SET especialidad = ? WHERE idEspecialidad = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, especialidad);
            ps.setInt(2, id);

            int nw = ps.executeUpdate();

            if (nw > 0) {
                JOptionPane.showMessageDialog(null, "Especialidad modificada");
            } else {
                JOptionPane.showMessageDialog(null, "error al modificar la especialidad.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a tabla de especialidad " + ex.getMessage());
        }
        return esp;
    }
    
    public List<Especialidad> listarEsp() {
        List<Especialidad> esp = new ArrayList<>();
        try {
            String sql = "SELECT * FROM especialidad";
            try (PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    Especialidad es = new Especialidad();
                    es.setIdEspecialidad(rs.getInt("idEspecialidad"));
                    es.setEspecialidad(rs.getString("especialidad"));
                    esp.add(es);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla especialidad: " + ex.getMessage());
        }

        return esp;
    }
    
    public void borrarEspecialidad(int idEspecialidad) {
        String sql = "DELETE FROM especialidad WHERE idEspecialidad= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idEspecialidad);
            int fila = ps.executeUpdate();
            if (fila > 0) {

                JOptionPane.showMessageDialog(null, "Especialidad eliminado correctamente");

            } else {

                JOptionPane.showMessageDialog(null, "La especialidad que desea eliminar no se encuentra en la base de datos");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, la especialidad seleccionada tiene pretadores activos");
            return;
        }
    }
}