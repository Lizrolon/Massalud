
package massalud.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import massalud.Entidades.Afiliado;
import massalud.Entidades.Especialidad;
import massalud.Entidades.Prestador;


public class PrestadorData {
    private Connection con = null;
    EspecialidadData esp = new EspecialidadData();
    public PrestadorData() {
        con = Conexion.getConexion();
    }
  
    public void guardarPrestador(Prestador pres){
      String sql="INSERT INTO prestador(idPrestador, dni, nombre, apellido,domicilio, telefono,idEspecialidad, activo) "
               + "VALUES (?,?,?,?,?,?,?,?)";
    try {
           
           PreparedStatement ps= con.prepareStatement(sql);
        ps.setString(1, null);
        ps.setInt(2,pres.getDni());
        ps.setString(3, pres.getNombre());
        ps.setString(4,pres.getApellido() );
        ps.setString(5, pres.getDomicilio());
        ps.setInt(6, pres.getTelefono());
        ps.setInt(7,pres.getEspecialidad().getIdEspecialidad());
        ps.setBoolean(8, pres.isActivo());
        int num = ps.executeUpdate();
        
        
        
        if(num>0){
            
          JOptionPane.showMessageDialog(null,"Prestador agregado con éxito");
 
        }
         ps.close();  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Prestador"+ex.getMessage());
       }

    }
    public Prestador buscarPres(int id){
    Prestador pres = null;
       
      String sql="SELECT  dni, nombre,apellido,domicilio,telefono,idEspecialidad, activo FROM prestador WHERE idPrestador = ?";
      PreparedStatement ps=null;
      try{
     
      ps = con.prepareStatement(sql);
      ps.setInt(1,id);
      
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          
          pres = new Prestador();
          pres.setIdPrestador(id);
          pres.setDni(rs.getInt("dni"));
          pres.setNombre(rs.getString("nombre"));
          pres.setApellido(rs.getString("apellido"));
          pres.setDomicilio(rs.getString("domicilio"));
          pres.setTelefono(rs.getInt("telefono"));
          Especialidad es = esp.buscarEp(rs.getInt("idEspecialidad"));
          pres.setEspecialidad(es);
          pres.setActivo(rs.getBoolean("activo"));
 
      }else{
      
          JOptionPane.showMessageDialog(null,"No se encuentra ese prestador en la Base de Datos");
      
      }
        ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla prestador"+ex.getMessage());
       }  
   
   return pres;
   }
   
   } 
    
    

