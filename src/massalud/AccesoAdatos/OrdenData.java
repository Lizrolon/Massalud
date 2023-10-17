
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
import massalud.Entidades.Orden;
import massalud.Entidades.Prestador;


public class OrdenData {
    private Connection con=null;
    
    private AfiliadoData afiD = new AfiliadoData();
    private Afiliado afi = new Afiliado();
    private PrestadorData presD = new PrestadorData();
    private Prestador pres = new   Prestador();
    public OrdenData() {
        con = Conexion.getConexion();
    }
    
    public void guardarOrden(Orden orden){
            String sql="INSERT INTO orden(idOrden, idAfiliado, idPrestador, fecha, formaPago, importe) "
               + "VALUES (?,?,?,?,?,?)";
    try {
           
            
           PreparedStatement ps= con.prepareStatement(sql);
        ps.setString(1, null);
        ps.setInt(2,orden.getAfiliado().getIdAfiliado());
        ps.setInt(3,orden.getPrestador().getIdPrestador());
        ps.setDate(4,Date.valueOf(orden.getFecha()));
        ps.setString(5, orden.getFormaPago());
        ps.setInt(6, orden.getImporte());
        
        int num = ps.executeUpdate();
        
        
        
        if(num>0){
            
          JOptionPane.showMessageDialog(null,"Orden agregada con éxito");
 
        }
         ps.close();  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Orden"+ex.getMessage());
       }

    
    
    }
    
    
    
    public void modificarOrd(Orden or){
        
    String sql="UPDATE orden SET  idAfiliado = ?, idPrestador = ?, fecha = ?, formaPago = ?, importe= ? "
            + "WHERE idOrden = ? ";
      PreparedStatement ps = null;
          
       try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1,or.getAfiliado().getIdAfiliado());
            ps.setInt(2,or.getPrestador().getIdPrestador());
            ps.setDate(3,Date.valueOf(or.getFecha()));
            ps.setString(4, or.getFormaPago());
            ps.setInt(5, or.getImporte());
            ps.setInt(6,or.getIdOrden());
 
           int exito = ps.executeUpdate();
           
           if(exito>0){
           
           JOptionPane.showMessageDialog(null, "Orden modificado de manera exitosa");
           
           }else{               
           
               JOptionPane.showMessageDialog(null, "La orden que desea modificar no existe en la base de datos");
           }
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar al ingresar a la tabla orden"+ex.getMessage());
       }
        
    }
    
    
    public List<Orden> listarOrden(){
        List<Orden> ord = new ArrayList();
         try{   
     String sql="SELECT * FROM orden"; 
     PreparedStatement ps =con.prepareStatement(sql);
     
     ResultSet rs = ps.executeQuery();
      
      while(rs.next()){
          Orden orden= new Orden();
         
          orden.setIdOrden(rs.getInt("idOrden"));
          afi= afiD.buscarAfiliado(rs.getInt("idAfiliado"));
          pres = presD.buscarPres(rs.getInt("idPrestador"));
          orden.setFecha(rs.getDate("fecha").toLocalDate());
          orden.setFormaPago(rs.getString("formaPago"));
          orden.setImporte(rs.getInt("importe"));
          orden.setAfiliado(afi);
          orden.setPrestador(pres);
          ord.add(orden);
      
      }
      ps.close();
     
     
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Orden"+ex.getMessage());
    }
    
        
        return ord;
     }
    
    
    
    
    
    public Orden BuscarOrden(int id) {
        Orden orden = new Orden();
        try {
            String sql = "SELECT * FROM orden WHERE idOrden = ? ";
            PreparedStatement ps = con.prepareStatement(sql);

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                orden.setIdOrden(rs.getInt("idOrden"));
                afi = afiD.buscarAfiliado(rs.getInt("idAfiliado"));
                pres = presD.buscarPres(rs.getInt("idPrestador"));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setFormaPago(rs.getString("formaPago"));
                orden.setImporte(rs.getInt("importe"));
                orden.setAfiliado(afi);
                orden.setPrestador(pres);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden" + ex.getMessage());
        }

        return orden;
    }
    
    
    
    public void borrarOrdporAfi(int idAfiliado, int idOrden){ 
        String sql = "DELETE FROM orden WHERE idOrden = ? AND idAfiliado= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idOrden);
            ps.setInt(2, idAfiliado);
            int fila = ps.executeUpdate();
           if(fila>0){
               
               JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");

           }else{
           
           JOptionPane.showMessageDialog(null, "La orden que desea eliminar no se encuentra en la base de datos");
           }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla orden"+ex.getMessage());
        }
        
}
    public void borrarOrdporPres(int idOrden, int idPrestador){ 
        String sql = "DELETE FROM orden WHERE idOrden = ? AND idPrestador= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idOrden);
            ps.setInt(2, idPrestador);
            int fila = ps.executeUpdate();
           if(fila>0){
               
               JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
           
           }else{
           
           JOptionPane.showMessageDialog(null, "La orden que desea eliminar no se encuentra en la base de datos");
           }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla orden"+ex.getMessage());
        }
        
    }
    public List<Orden> listarOrdenporAfi(int id){
        ArrayList<Orden> orden = new ArrayList<>();
        
        
        try {
            String sql = "SELECT * FROM orden WHERE idAfiliado= ? ";
        PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
        while(rs.next()){
            Orden or = new Orden();
            or.setIdOrden(rs.getInt("idOrden"));
          afi= afiD.buscarAfiliado(rs.getInt("idAfiliado"));
          pres = presD.buscarPres(rs.getInt("idPrestador"));
          or.setFecha(rs.getDate("fecha").toLocalDate());
          or.setFormaPago(rs.getString("formaPago"));
          or.setImporte(rs.getInt("importe"));
          or.setAfiliado(afi);
          or.setPrestador(pres);
          orden.add(or);
  
        }    
        ps.close();
            
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error al obtener ordenes"+ex.getMessage());
            
        }
  
        return orden;
     }
     public List<Orden> listarOrdenporPres(int id){
            ArrayList<Orden> orden = new ArrayList<>();
        
        
        try {
            String sql = "SELECT * FROM orden WHERE idPrestador= ? ";
        PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
        while(rs.next()){
            Orden or = new Orden();
            or.setIdOrden(rs.getInt("idOrden"));
          afi= afiD.buscarAfiliado(rs.getInt("idAfiliado"));
          pres = presD.buscarPres(rs.getInt("idPrestador"));
          or.setFecha(rs.getDate("fecha").toLocalDate());
          or.setFormaPago(rs.getString("formaPago"));
          or.setImporte(rs.getInt("importe"));
          or.setAfiliado(afi);
          or.setPrestador(pres);
          orden.add(or);
  
        }    
        ps.close();
            
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error al obtener ordenes"+ex.getMessage());
            
        }

        return orden;
     }
     
}
