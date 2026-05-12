package net.salesianos.restaurante;

public class Restaurante {

    private int puntuacion;
    private String nombre;
    private String ciudad;
    private String tipo;

    public Restaurante(int puntuacion,String nombre,String ciudad,String tipo){
        this.puntuacion = puntuacion;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.tipo = tipo;
    }

    public int getPunt(){
        return this.puntuacion;
    }

    public String getName(){
        return this.nombre;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setPuntuacion(int puntuacion) {
    if (puntuacion >= 1 && puntuacion <= 5) {
        this.puntuacion = puntuacion;
    } else {
        this.puntuacion = 1; 
    }
}

    public void setNombre(String name){
        this.nombre = name;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
    return nombre + " - " + ciudad + " - " + tipo + " - " + puntuacion;
    }
    public boolean esMejor(Restaurante otro){
        return this.puntuacion > otro.puntuacion;
    }
}
