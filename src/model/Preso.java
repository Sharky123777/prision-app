package model;

import java.time.LocalDate;

public class Preso extends Persona{

    private String delito;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private String nivelDeSeguridad;
    private String condicion;
    private boolean enAislamiento;
    private int numeroDeVisitas;

    public Preso(String nombre, String apellido, int edad, String id, String genero, String nacionalidad) {
        super(nombre, apellido, edad, id, genero, nacionalidad);
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNivelDeSeguridad() {
        return nivelDeSeguridad;
    }

    public void setNivelDeSeguridad(String nivelDeSeguridad) {
        this.nivelDeSeguridad = nivelDeSeguridad;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public boolean isEnAislamiento() {
        return enAislamiento;
    }

    public void setEnAislamiento(boolean enAislamiento) {
        this.enAislamiento = enAislamiento;
    }

    public int getNumeroDeVisitas() {
        return numeroDeVisitas;
    }

    public void setNumeroDeVisitas(int numeroDeVisitas) {
        this.numeroDeVisitas = numeroDeVisitas;
    }

}
