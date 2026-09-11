package ar.edu.itec;

import java.util.ArrayList;

public class HorarioClase {
    private DayOfWeek diaSemana;
    private ArrayList<ModuloHorario> modulos;

    public HorarioClase(DayOfWeek diaSemana, ArrayList<ModuloHorario> modulos) {
        this.diaSemana = diaSemana;
        this.modulos = modulos;
    }

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana;
    }

    public ArrayList<ModuloHorario> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<ModuloHorario> modulos) {
        this.modulos = modulos;
    }
}