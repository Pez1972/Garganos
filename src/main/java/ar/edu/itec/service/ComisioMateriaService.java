package ar.edu.itec.service;

import ar.edu.itec.ComisionMateria;
import ar.edu.itec.Cuatrimestre;
import ar.edu.itec.EstadoProfesor;
import ar.edu.itec.Materia;
import ar.edu.itec.Profesor;

public class ComisionMateriaService {

    public ComisionMateria crearComision(
            Materia materia,
            Profesor profesor,
            Cuatrimestre cuatrimestre) {

        if (profesor.getEstado() == EstadoProfesor.INACTIVO) {
            throw new IllegalArgumentException(
                    "No se puede asignar un profesor inactivo"
            );
        }

        return new ComisionMateria(
                materia,
                profesor,
                cuatrimestre
        );
    }
}