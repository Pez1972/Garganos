package ar.edu.itec;

import java.util.ArrayList;

public class ProfesorService {

    private ArrayList<Profesor> profesores = new ArrayList<>();

    public void agregarProfesor(Profesor profesor) {

        for (Profesor p : profesores) {
            if (p.getDni().equals(profesor.getDni())) {
                throw new IllegalArgumentException("DNI ya registrado");
            }
        }

        profesores.add(profesor);
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}