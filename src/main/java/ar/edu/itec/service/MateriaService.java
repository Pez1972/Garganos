package ar.edu.itec.service;

import ar.edu.itec.Materia;

public class MateriaService {

    public void agregarCorrelativa(Materia materia, Materia correlativa) {

        if (materia == correlativa) {
            throw new IllegalArgumentException(
                    "Una materia no puede ser correlativa de sí misma"
            );
        }

        if (materia.getCorrelativas().contains(correlativa)) {
            throw new IllegalArgumentException(
                    "La materia ya está cargada como correlativa"
            );
        }

        if (dependeDe(correlativa, materia)) {
            throw new IllegalArgumentException(
                    "No se puede agregar la correlativa porque genera un ciclo"
            );
        }

        materia.getCorrelativas().add(correlativa);
    }

    private boolean dependeDe(Materia materia, Materia buscada) {

        if (materia.getCorrelativas().contains(buscada)) {
            return true;
        }

        for (Materia correlativa : materia.getCorrelativas()) {
            if (dependeDe(correlativa, buscada)) {
                return true;
            }
        }

        return false;
    }
}