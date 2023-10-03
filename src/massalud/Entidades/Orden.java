
package massalud.Entidades;

import java.time.LocalDate;


public class Orden {
    private int idOrden;
   private Afiliado idAfiliado;
   private Prestador idPrestador;
   LocalDate fecha;
   private String formaPago;
   private int importe;

    public Orden() {
    }

    public Orden(int idOrden, Afiliado idAfiliado, Prestador idPrestador, LocalDate fecha, String formaPago, int importe) {
        this.idOrden = idOrden;
        this.idAfiliado = idAfiliado;
        this.idPrestador = idPrestador;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
    }

    public Orden(Afiliado idAfiliado, Prestador idPrestador, LocalDate fecha, String formaPago, int importe) {
        this.idAfiliado = idAfiliado;
        this.idPrestador = idPrestador;
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

    public Afiliado getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(Afiliado idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public Prestador getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Prestador idPrestador) {
        this.idPrestador = idPrestador;
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
        return "Orden{" + "idOrden=" + idOrden + ", idAfiliado=" + idAfiliado + ", idPrestador=" + idPrestador + ", fecha=" + fecha + ", formaPago=" + formaPago + ", importe=" + importe + '}';
    }
   
   
}
