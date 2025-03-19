
package model;


public class Policia extends Persona {
   private String placa;
   private String rango;
   private String cargo;
   
   public Policia (String placa, String rango, String cargo, String nombre, String apellido, int edad, String id, String genero, String nacionalidad ){
       super(nombre, apellido, edad, id, genero, nacionalidad);
       
       this.placa = placa;
       this.cargo = cargo;
       this.rango = rango;
   }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
   
    
}
