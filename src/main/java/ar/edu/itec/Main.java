package ar.edu.itec;


import ar.edu.itec.model.Alumno;
import ar.edu.itec.model.EstadoAlumno;
import ar.edu.itec.service.AlumnoService;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Jorge", "Dominguez", "44265396", "jorgedominguez@mano.com", "3757-954623");
        Alumno alumno2 = new Alumno("Carlos", "Perez", "44265396", "carlosperez@mail.com", "3757-111111");
        Alumno alumno3 = new Alumno("Damian", "Benta", "32851456", "gomezmail.com", "3757ABC123");

        AlumnoService servicio = new AlumnoService();
        servicio.agregarAlumno(alumno1);
        try {
            servicio.agregarAlumno(alumno2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        servicio.agregarAlumno(alumno3);

        Alumno encontrado = servicio.buscarPorDni("44265396");
        System.out.println(encontrado.getNombre());

        //System.out.println(alumno1.getNombre());
        //System.out.println(alumno1.getEstado());
        servicio.darDeBaja("44265396");
        System.out.println(alumno1.getEstado());
    }
}