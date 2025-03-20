package model;

public class Director extends Persona {

    private String cargo;

    public Director(String nombre, String apellido, int edad, String id, String genero, String nacionalidad) {
        super(nombre, apellido, edad, id, genero, nacionalidad);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
