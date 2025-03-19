
package model;

public class Persona {
private String nombre;
private	String apellido;
private	int edad;
private	String id;
private String genero;
private  String nacionalidad ;

public Persona (String nombre, String apellido, int edad, String id, String genero, String nacionalidad){
    this.nombre=nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.id = id;
    this.genero = genero;
    this.nacionalidad = nacionalidad;  
}

public void setNombre (String nombre){
    this.nombre = nombre;
}

public String getNombre(){
    return nombre;
}


public void setApellido (String apellido){
    this.apellido = apellido;
}

public String getApellido (){
    return apellido;
}

public void setEdad(int edad){
   this.edad = edad;
}

public int getEdad(){
    return edad;
}

public void setId (String id){
   this.id = id;
}

public String getId (){
    return id;
}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }







}