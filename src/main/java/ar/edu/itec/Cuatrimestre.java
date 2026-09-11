package ar.edu.itec;

import java.time.LocalDate;

public class Cuatrimestre {
    private int año;
    private int numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Cuatrimestre(int año, int numero, LocalDate fechaInicio, LocalDate fechaFin) {
        this.año = año;
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}