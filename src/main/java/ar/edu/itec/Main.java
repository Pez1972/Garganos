package ar.edu.itec;

import ar.edu.itec.service.ProfesorService;

public class Main {

    public static void main(String[] args) {

        ProfesorService profesorService = new ProfesorService();

        Profesor profesor1 = new Profesor(
                "Juan",
                "Perez",
                "46480021",
                "juan@gmail.com",
                "3754123456"
        );

        profesorService.agregarProfesor(profesor1);

        System.out.println("Profesor agregado:");
        System.out.println(profesor1.getNombre());
        System.out.println("Estado: " + profesor1.getEstado());

        System.out.println("----------------");

        Profesor encontrado = profesorService.buscarPorDni("46480021");

        if (encontrado != null) {
            System.out.println("Profesor encontrado:");
            System.out.println(encontrado.getNombre());
        }

        System.out.println("----------------");

        profesorService.darDeBaja("46480021");

        System.out.println("Estado después de la baja:");
        System.out.println(profesor1.getEstado());
    }
}