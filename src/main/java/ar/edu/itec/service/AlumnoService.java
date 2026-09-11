package ar.edu.itec.service;

import ar.edu.itec.model.Alumno;
import java.util.ArrayList;
import java.util.List;
import ar.edu.itec.model.EstadoAlumno;

public class AlumnoService {

    private List<Alumno> alumnos;

    public AlumnoService() {
        alumnos = new ArrayList<>();
    }
    public void agregarAlumno(Alumno alumno) {
        if (alumno.getNombre() == null || alumno.getNombre().isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (alumno.getApellido() == null || alumno.getApellido().isBlank()) {
            throw new IllegalArgumentException("El apellido es obligatorio");
        }
        if (alumno.getDni() == null || alumno.getDni().isBlank()) {
            throw new IllegalArgumentException("El DNI es obligatorio");
        }
        for (Alumno alumnoExistente : alumnos) {
            if (alumnoExistente.getDni().equals(alumno.getDni())) {
                throw new IllegalArgumentException("El DNI ya está registrado");
            }
        }
        if (alumno.getMail() == null || alumno.getMail().isBlank()
                || !alumno.getMail().contains("@")) {
            throw new IllegalArgumentException("El email no es válido");
        }
        if (alumno.getTelefono() == null || alumno.getTelefono().isBlank()
                || !alumno.getTelefono().matches("[0-9]{8,15}")) {
            throw new IllegalArgumentException("El formato del teléfono no es correcto");
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
    public void darDeBaja(String dni) {
        Alumno alumno = buscarPorDni(dni);
        if (alumno != null) {
            alumno.setEstado(EstadoAlumno.INACTIVO);
        }
    }
    public void modificarAlumno(String dni, String nombre, String apellido, String mail, String telefono) {
        Alumno alumno = buscarPorDni(dni);
        if (alumno == null) {
            throw new IllegalArgumentException("El alumno no existe");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido es obligatorio");
        }
        if (mail == null || mail.isBlank()
                || !mail.contains("@")) {
            throw new IllegalArgumentException("El email no es válido");
        }
        if (telefono == null || telefono.isBlank()
                || !telefono.matches("[0-9]{8,15}")) {
            throw new IllegalArgumentException("El formato del teléfono no es correcto");
        }
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setMail(mail);
        alumno.setTelefono(telefono);

    }
}