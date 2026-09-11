package ar.edu.itec;

import java.time.LocalTime;

public class ModuloHorario {
    private int numero;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public ModuloHorario(int numero, LocalTime horaInicio, LocalTime horaFin) {
        this.numero = numero;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}