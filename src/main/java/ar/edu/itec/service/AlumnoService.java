package ar.edu.itec.service;

import ar.edu.itec.model.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoService {

    private List<Alumno> alumnos;

    public AlumnoService() {
        alumnos = new ArrayList<>();
    }
    public void agregarAlumno(Alumno alumno) {
        for (Alumno alumnoExistente : alumnos) {
            if (alumnoExistente.getDni().equals(alumno.getDni())) {
                throw new IllegalArgumentException("El DNI ya está registrado");
            }
        }
        alumnos.add(alumno);
    }
    public Alumno buscarPorDni(String dni) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno;
            }
        }
        return null;
    }
}