
package massalud.Entidades;


public class Prestador {
    private int idPrestador;
    private int dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int telefono;
    private Especialidad especialidad;
    boolean activo;

    public Prestador() {
    }

    public Prestador(int idPrestador, int dni, String nombre, String apellido, String domicilio, int telefono, Especialidad especialidad, boolean activo) {
        this.idPrestador = idPrestador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public Prestador(int dni, String nombre, String apellido, String domicilio, int telefono, Especialidad especialidad, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    

  
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Prestador{" + " " + idPrestador + " " + dni + " " + nombre + " " + apellido + " " + domicilio + " " + telefono + " " + especialidad + " " + activo + '}';
    }
    
}
