package ar.edu.itec;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private int ano;
    private String cuatrimestre;
    private ArrayList<Materia> correlativas;

    public Materia(String nombre, int ano, String cuatrimestre) {
        this.nombre = nombre;
        this.ano = ano;
        this.cuatrimestre = cuatrimestre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}