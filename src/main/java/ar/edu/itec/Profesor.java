package ar.edu.itec;

public class Profesor {
    private String nombre;
    private String apellido;
    private String dni;
    private String mail;
    private String telefono;
    private EstadoProfesor estado;



    public Profesor(String nombre, String apellido, String dni, String mail, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.telefono = telefono;
        this.estado = EstadoProfesor.ACTIVO;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EstadoProfesor getEstado() {
        return estado;
    }

    public void setEstado(EstadoProfesor estado) {
        this.estado = estado;
    }
}
