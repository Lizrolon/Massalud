
package massalud.Entidades;

import java.time.LocalDate;


public class Orden {
   private int idOrden;
   private Afiliado Afiliado;
   private Prestador Prestador;
   LocalDate fecha;
   private String formaPago;
   private int importe;

    public Orden() {
    }

    public Orden(int idOrden, Afiliado Afiliado, Prestador Prestador, LocalDate fecha, String formaPago, int importe) {
        this.idOrden = idOrden;
        this.Afiliado = Afiliado;
        this.Prestador = Prestador;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
    }

    public Orden(Afiliado Afiliado, Prestador Prestador, LocalDate fecha, String formaPago, int importe) {
        this.Afiliado = Afiliado;
        this.Prestador = Prestador;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Afiliado getAfiliado() {
        return Afiliado;
    }

    public void setAfiliado(Afiliado Afiliado) {
        this.Afiliado = Afiliado;
    }

    public Prestador getPrestador() {
        return Prestador;
    }

    public void setPrestador(Prestador Prestador) {
        this.Prestador = Prestador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Orden{" + " " + idOrden + " " + Afiliado.getIdAfiliado() + " " + Prestador.getIdPrestador() + " " + fecha + " " + formaPago + " " + importe + '}';
    }
   
   
}
