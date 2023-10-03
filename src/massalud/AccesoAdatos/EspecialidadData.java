
package massalud.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
   public void modificar(int id){}
   public List<Especialidad> listarEsp(){
        return null;
   }
   
   
}
