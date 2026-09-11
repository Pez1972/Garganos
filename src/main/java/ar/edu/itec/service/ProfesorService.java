package ar.edu.itec.service;

import ar.edu.itec.EstadoProfesor;
import ar.edu.itec.Profesor;

import java.util.ArrayList;

public class ProfesorService {

    private ArrayList<Profesor> profesores = new ArrayList<>();

    public void agregarProfesor(Profesor profesor) {

        if (!emailValido(profesor.getMail())) {
            throw new IllegalArgumentException(
                    "Email no válido. Debe contener @"
            );
        }

        if (!telefonoValido(profesor.getTelefono())) {
            throw new IllegalArgumentException(
                    "Teléfono no válido. Solo se permiten números y debe tener entre 8 y 15 dígitos."
            );
        }

        for (Profesor p : profesores) {
            if (p.getDni().equals(profesor.getDni())) {
                throw new IllegalArgumentException(
                        "DNI ya registrado"
                );
            }
        }

        profesores.add(profesor);
    }

    public Profesor buscarPorDni(String dni) {

        for (Profesor profesor : profesores) {
            if (profesor.getDni().equals(dni)) {
                return profesor;
            }
        }

        return null;
    }

    public void modificarProfesor(
            String dni,
            String nombre,
            String apellido,
            String mail,
            String telefono) {

        Profesor profesor = buscarPorDni(dni);

        if (profesor == null) {
            throw new IllegalArgumentException(
                    "Profesor no encontrado"
            );
        }

        if (!emailValido(mail)) {
            throw new IllegalArgumentException(
                    "Email no válido. Debe contener @"
            );
        }

        if (!telefonoValido(telefono)) {
            throw new IllegalArgumentException(
                    "Teléfono no válido. Solo se permiten números y debe tener entre 8 y 15 dígitos."
            );
        }

        profesor.setNombre(nombre);
        profesor.setApellido(apellido);
        profesor.setMail(mail);
        profesor.setTelefono(telefono);
    }

    public void darDeBaja(String dni) {

        Profesor profesor = buscarPorDni(dni);

        if (profesor == null) {
            throw new IllegalArgumentException(
                    "Profesor no encontrado"
            );
        }

        profesor.setEstado(EstadoProfesor.INACTIVO);
    }

    private boolean emailValido(String email) {
        return email != null
                && !email.trim().isEmpty()
                && email.contains("@");
    }

    private boolean telefonoValido(String telefono) {
        return telefono != null
                && !telefono.trim().isEmpty()
                && telefono.matches("\\d{8,15}");
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}