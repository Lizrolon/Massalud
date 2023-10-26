
package massalud.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
       
      String sql="SELECT  dni, nombre ,apellido ,domicilio,telefono,idEspecialidad, activo FROM prestador WHERE idPrestador = ? AND activo = 1";
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
      
         return null;
      
      }
        ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla prestador"+ex.getMessage());
       }  
   
   return pres;
   }
   
   
public Prestador buscarPresDni(int dni) {
        Prestador pres = null;

        String sql = "SELECT idPrestador, nombre,apellido,domicilio,telefono,idEspecialidad, activo FROM prestador WHERE dni = ?";
        PreparedStatement ps = null;
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                pres = new Prestador();
                pres.setIdPrestador(rs.getInt("idPrestador"));
                pres.setNombre(rs.getString("nombre"));
                pres.setApellido(rs.getString("apellido"));
                pres.setDomicilio(rs.getString("domicilio"));
                pres.setTelefono(rs.getInt("telefono"));
                Especialidad es = esp.buscarEp(rs.getInt("idEspecialidad"));
                pres.setDni(dni);
                pres.setEspecialidad(es);
                pres.setActivo(rs.getBoolean("activo"));

            } else {

                JOptionPane.showMessageDialog(null, "No se encuentra ese prestador en la Base de Datos");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador" + ex.getMessage());
        }

        return pres;
    }

    public void  modificarPrestador(Prestador pres){
     PrestadorData presD = new PrestadorData();
     EspecialidadData espD = new EspecialidadData();
     
   
     
     String sql="UPDATE prestador SET  nombre = ?, apellido = ?, telefono = ?, "
             + " domicilio = ?, activo = ?, idEspecialidad =?, dni=? WHERE IdPrestador = ? ";
      PreparedStatement ps = null;
       try {
            ps = con.prepareStatement(sql);
           ps.setString(1, pres.getNombre());
           ps.setString(2, pres.getApellido());
           ps.setInt(3, pres.getTelefono());
           ps.setString(4, pres.getDomicilio());
           ps.setBoolean(5, pres.isActivo());
           
           
           ps.setInt(6, pres.getEspecialidad().getIdEspecialidad());
           
           ps.setInt(7, pres.getDni());
           ps.setInt(8, pres.getIdPrestador());
           int exito = ps.executeUpdate();
           
           if(exito>0){
           
           JOptionPane.showMessageDialog(null, "Prestador modificado de manera exitosa");
           
           }else{               
           
               JOptionPane.showMessageDialog(null, "El Prestador que desea modificar no existe en la base de datos");
           }
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar al ingresar a la tabla Prestador"+ex.getMessage());
       }

 }
    public List<Prestador> listarPrestador() {
        List<Prestador> af = new ArrayList<>();

        try {
            String sql = "SELECT * FROM prestador";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Prestador afi = new Prestador();

                afi.setIdPrestador(rs.getInt("idPrestador"));
                afi.setDni(rs.getInt("dni"));
                afi.setNombre(rs.getString("nombre"));
                afi.setApellido(rs.getString("apellido"));
                afi.setTelefono(rs.getInt("telefono"));
                afi.setDomicilio(rs.getString("domicilio"));
                
                Especialidad es = esp.buscarEp(rs.getInt("idEspecialidad"));
                afi.setEspecialidad(es);
                
                afi.setActivo(rs.getBoolean("activo"));
                af.add(afi);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Prestador" + ex.getMessage());
        }

        return af;
    }

   public void borrarPres(int idPrestador){ 
        String sql = "DELETE FROM prestador WHERE idPrestador= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idPrestador);
            int fila = ps.executeUpdate();
           if(fila>0){
               
               JOptionPane.showMessageDialog(null, "Prestador eliminado correctamente");

           }else{
           
           JOptionPane.showMessageDialog(null, "El prestador que desea eliminar no se encuentra en la base de datos");
           }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar el prestador tiene ordenes activas");
        }
    
   
  
   
}
   } 
    
    

