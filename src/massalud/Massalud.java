
package massalud;

import massalud.AccesoAdatos.AfiliadoData;
import massalud.AccesoAdatos.EspecialidadData;
import massalud.AccesoAdatos.PrestadorData;
import massalud.Entidades.Afiliado;
import massalud.Entidades.Especialidad;
import massalud.Entidades.Prestador;

/**
 *
 * @author Michi
 */
public class Massalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Afiliado afi = new Afiliado(4,"Nadia", "Rodriguez", 4678813, 11345572, "Santiago 19", true);
        AfiliadoData dat=new AfiliadoData();
        //dat.guardarAfiliado(afi);
        
      //Afiliado af=  dat.buscarAfiliado(1);
      //Afiliado af = dat.buscarAfiliadoporDni(4678912);
        //System.out.println(af);
        /*for (Afiliado ar : dat.listarAfiliadosactivos() ) {
            System.out.println(ar.toString());
        }*/
        //dat.modificarAfi(afi);
        Especialidad esp= new Especialidad(3,"Odontologo");
        EspecialidadData data = new EspecialidadData();
        //data.guardarEsp(esp);
        Prestador pres = new Prestador(46725756, "Julian", "Rosaz", "Salta 19", 11452343,esp, true);
        
        PrestadorData presD=new  PrestadorData();
        //presD.guardarPrestador(pres);
       
       Prestador ps = presD.buscarPres(8);
        System.out.println(ps);
        //Especialidad es = data.buscarEp(1);
        //System.out.println(es);
        
                
        
    }
    
}
