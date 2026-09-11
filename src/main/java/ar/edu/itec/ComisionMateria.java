package ar.edu.itec;

public class ComisionMateria {
    private Materia materia;
    private Profesor profesor;
    private Cuatrimestre cuatrimestre;

    public ComisionMateria(Materia materia, Profesor profesor, Cuatrimestre cuatrimestre) {
        this.materia = materia;
        this.profesor = profesor;
        this.cuatrimestre = cuatrimestre;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Cuatrimestre getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(Cuatrimestre cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
}