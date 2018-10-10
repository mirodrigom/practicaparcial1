package com.rodrigo.practica_parcial;

public class Modelo
{
    private String nombre;
    private String apellido;
    private String telefono;

    public Modelo()
    {

    }

    public Modelo(String nom, String ape, String tel)
    {
        this.nombre = nom;
        this.apellido = ape;
        this.telefono = tel;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
}