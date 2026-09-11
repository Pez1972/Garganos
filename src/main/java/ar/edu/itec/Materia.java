package ar.edu.itec;

public class Materia {
    private String nombre;
    private int año;
    private String cuatrimestre;

    public Materia(String nombre, int año, String cuatrimestre) {
        this.nombre = nombre;
        this.año = año;
        this.cuatrimestre = cuatrimestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
}
