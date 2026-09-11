package ar.edu.itec;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Jorge", "Dominguez", "44265396", "jorgedominguez@mano.com", "3757-954623");
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getEstado());
        alumno1.setEstado(EstadoAlumno.INACTIVO);
        System.out.println(alumno1.getEstado());
    }
}