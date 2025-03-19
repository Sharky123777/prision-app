
package model;


public class Celda{
    
private String idCelda;
private	String tipo;
private	int capacidadMaxima;
private	boolean ocupada;

    public Celda(String idCelda, String tipo, int capacidadMaxima, boolean ocupada) {
        this.idCelda = idCelda;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        this.ocupada = ocupada;
    }

    public String getIdCelda() {
        return idCelda;
    }

    public void setIdCelda(String idCelda) {
        this.idCelda = idCelda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }




}