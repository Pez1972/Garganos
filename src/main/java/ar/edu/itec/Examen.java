package ar.edu.itec;

import java.time.LocalDate;
import java.util.ArrayList;

public class Examen {
    private LocalDate fecha;
    private TipoEvaluacion tipo;
    private ArrayList<Nota> notas;

    public Examen(LocalDate fecha, TipoEvaluacion tipo, ArrayList<Nota> notas) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.notas = notas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoEvaluacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvaluacion tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}