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

    public void setPunt(int punt){
        this.puntuacion = punt;
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
}
