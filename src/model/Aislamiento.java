package model;

import java.time.LocalDate;

public class Aislamiento {
    private String idAislamiento;
    private String motivo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcion;
    private String celdaAsignada;

    public Aislamiento(String idAislamiento, String motivo, LocalDate fechaInicio, LocalDate fechaFin, String descripcion, String celdaAsignada) {
        this.idAislamiento = idAislamiento;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.celdaAsignada = celdaAsignada;
    }

    public String getIdAislamiento() {
        return idAislamiento;
    }

    public void setIdAislamiento(String idAislamiento) {
        this.idAislamiento = idAislamiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCeldaAsignada() {
        return celdaAsignada;
    }

    public void setCeldaAsignada(String celdaAsignada) {
        this.celdaAsignada = celdaAsignada;
    }
    
    
    
    
}