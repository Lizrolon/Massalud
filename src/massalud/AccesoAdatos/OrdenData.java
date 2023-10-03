
package massalud.AccesoAdatos;

import java.sql.Connection;
import java.util.List;
import massalud.Entidades.Orden;


public class OrdenData {
    private Connection con=null;
    
    public OrdenData() {
        con = Conexion.getConexion();
    }
    
    public void guardarOrden(){}
    public void modificarOrd(){}
    public List<Orden> listarOrden(){
        return null;
     }
    public void borrarOrdporAfi(int id){      
}
    public void borrarOrdporPres(int id){    
    }
    public List<Orden> listarOrdenporAfi(){
        return null;
     }
     public List<Orden> listarOrdenporPres(){
        return null;
     }
}
