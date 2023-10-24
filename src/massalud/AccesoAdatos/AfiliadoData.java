
package massalud.AccesoAdatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import massalud.Entidades.Afiliado;


public class AfiliadoData {
    private Connection con=null;
    
    
    public AfiliadoData() {
        con = Conexion.getConexion();
    }
    
   public void guardarAfiliado(Afiliado afiliado){
       String sql="INSERT INTO afiliado(idAfiliado, nombre, apellido, dni, telefono, domicilio, activo) "
               + "VALUES (?,?,?,?,?,?,?)";
       
       
       try {

           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, null);
           ps.setString(2, afiliado.getNombre());
           ps.setString(3, afiliado.getApellido());
           ps.setInt(4, afiliado.getDni());
           ps.setInt(5, afiliado.getTelefono());
           ps.setString(6, afiliado.getDomicilio());
           ps.setBoolean(7, afiliado.isActivo());
           int num = ps.executeUpdate();

           if (num >= 1) {
               JOptionPane.showMessageDialog(null, "Afiliado Guardado");
           }
           ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Afiliado, "
                   + "no se pudo guardar el afiiado");
       }
   } 
   
   public Afiliado buscarAfiliado(int id){
       
       Afiliado afi = null;
       
      String sql="SELECT nombre,apellido,dni,telefono,domicilio,activo FROM afiliado WHERE idAfiliado = ? AND activo = 1";
      PreparedStatement ps=null;
      try{
      
      ps = con.prepareStatement(sql);
      ps.setInt(1,id);
      
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          
          afi = new Afiliado();
          afi.setIdAfiliado(id);
          
          afi.setNombre(rs.getString("nombre"));
          afi.setApellido(rs.getString("apellido"));
          afi.setDni(rs.getInt("dni"));
          afi.setTelefono(rs.getInt("telefono"));
          afi.setDomicilio(rs.getString("domicilio"));
          afi.setActivo(rs.getBoolean("activo"));
 
      }else{

          return null;
      }
        ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Afiliado"+ex.getMessage());
       }  
   
   return afi;
   }
  
   public Afiliado buscarAfiliadoporDni(int dni){
       
       Afiliado afi = null;
       
      String sql="SELECT idAfiliado,nombre,apellido,dni,telefono,domicilio,activo FROM afiliado WHERE dni = ?";
      PreparedStatement ps=null;
      try{
      
      ps = con.prepareStatement(sql);
      ps.setInt(1,dni);
      
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          
          afi = new Afiliado();
          afi.setIdAfiliado(rs.getInt("idAfiliado"));
          afi.setDni(dni);
          afi.setNombre(rs.getString("nombre"));
          afi.setApellido(rs.getString("apellido"));
          afi.setTelefono(rs.getInt("telefono"));
          afi.setDomicilio(rs.getString("domicilio"));
          afi.setActivo(rs.getBoolean("activo"));
 
      }else{
      
          JOptionPane.showMessageDialog(null,"No se encuentra ese afiliado en la Base de Datos");
      
      }
        ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Afiliado"+ex.getMessage());
       }  
   
   return afi;
   }  
   
   public List<Afiliado> listarAfiliados(){
       List<Afiliado> af = new ArrayList<>();
     
    try{   
     String sql="SELECT * FROM afiliado"; 
     PreparedStatement ps =con.prepareStatement(sql);
     
     ResultSet rs = ps.executeQuery();
      
      while(rs.next()){
          Afiliado afi = new Afiliado();
         
          afi.setIdAfiliado(rs.getInt("idAfiliado"));
          afi.setDni(rs.getInt("dni"));
          afi.setNombre(rs.getString("nombre"));
          afi.setApellido(rs.getString("apellido"));
          afi.setTelefono(rs.getInt("telefono"));
          afi.setDomicilio(rs.getString("domicilio"));
          afi.setActivo(rs.getBoolean("activo"));
          af.add(afi);
      
      }
      ps.close();
     
     
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Afiliado"+ex.getMessage());
    }
    
   return af;
   }
  
   public List<Afiliado> listarAfiliadosactivos(){
       List<Afiliado> af = new ArrayList<>();
     
    try{   
     String sql="SELECT * FROM afiliado WHERE activo = 1"; 
     PreparedStatement ps =con.prepareStatement(sql);
     
     ResultSet rs = ps.executeQuery();
      
      while(rs.next()){
          Afiliado afi = new Afiliado();
         
          afi.setIdAfiliado(rs.getInt("idAfiliado"));
          afi.setDni(rs.getInt("dni"));
          afi.setNombre(rs.getString("nombre"));
          afi.setApellido(rs.getString("apellido"));
          afi.setTelefono(rs.getInt("telefono"));
          afi.setDomicilio(rs.getString("domicilio"));
          afi.setActivo(true);
          af.add(afi);
      
      }
      ps.close();
     
     
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Afiliado"+ex.getMessage());
    }
    
   return af;
   }
   public void  modificarAfi(Afiliado afi){
     AfiliadoData afiD = new AfiliadoData();
     Afiliado afiliado = new Afiliado();
     String sql="UPDATE afiliado SET  nombre = ?, apellido = ?, telefono = ?, domicilio = ?,dni= ?, activo = ?  WHERE idAfiliado = ? ";
      PreparedStatement ps = null;
       try {
            ps = con.prepareStatement(sql);
            ps.setString(1, afi.getNombre());
           ps.setString(2, afi.getApellido());
           ps.setInt(3, afi.getTelefono());
           ps.setString(4, afi.getDomicilio());
           ps.setInt(5, afi.getDni());
           ps.setBoolean(6, afi.isActivo());
           afiliado = afiD.buscarAfiliadoporDni(afi.getDni());
            ps.setInt(7, afiliado.getIdAfiliado());
           int exito = ps.executeUpdate();
           
           if(exito>0){
           
           JOptionPane.showMessageDialog(null, "Afiliado modificado de manera exitosa");
           
           }else{               
           
               JOptionPane.showMessageDialog(null, "El Afiliado que desea modificar no existe en la base de datos");
           }
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar al ingresar a la tabla afiliado"+ex.getMessage());
       }

 }
   public void  modificarAfi2(Afiliado afi){
     String sql="UPDATE afiliado SET  nombre = ?, apellido = ?, telefono = ?, domicilio = ?,dni= ?, activo = ?  WHERE idAfiliado = ? ";
      PreparedStatement ps = null;
       try {
            ps = con.prepareStatement(sql);
            ps.setString(1, afi.getNombre());
           ps.setString(2, afi.getApellido());
           ps.setInt(3, afi.getTelefono());
           ps.setString(4, afi.getDomicilio());
           ps.setInt(5, afi.getDni());
           ps.setBoolean(6, afi.isActivo());
            ps.setInt(7, afi.getIdAfiliado());
           int exito = ps.executeUpdate();
           
           if(exito>0){
           
           JOptionPane.showMessageDialog(null, "Afiliado modificado de manera exitosa");
           
           }else{               
           
               JOptionPane.showMessageDialog(null, "El Afiliado que desea modificar no existe en la base de datos");
           }
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar al ingresar a la tabla afiliado"+ex.getMessage());
       }

 }
   public void borrarAfiliado(int idAfiliado){ 
        String sql = "DELETE FROM afiliado WHERE idAfiliado= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAfiliado);
            int fila = ps.executeUpdate();
           if(fila>0){
               
               JOptionPane.showMessageDialog(null, "Afiliado eliminado correctamente");

           }else{
           
           JOptionPane.showMessageDialog(null, "El afiliado que desea eliminar no se encuentra en la base de datos");
           }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Afiliado "+ex.getMessage());
        }
    
   
  
   
}
}