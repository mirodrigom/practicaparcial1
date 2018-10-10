package com.rodrigo.practica_parcial;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Controlador
{
    Vista vista;
    Modelo modelo;
    List<Modelo> personas;

    public Controlador()
    {
        this.personas = new ArrayList<Modelo>();
    }

    public Vista getVista()
    {
        return vista;
    }

    public void setVista(Vista vista)
    {
        this.vista = vista;
    }

    public Modelo getModelo()
    {
        return modelo;
    }

    public void setModelo(Modelo modelo)
    {
        this.modelo = modelo;
    }

    public void setPersonas(List<Modelo> lista)
    {
            this.personas = lista;
    }

    public void setPersonas()
    {
        List<Modelo> lista = new ArrayList<Modelo>();
        Modelo p1 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p2 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p3 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p4 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p5 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p6 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p7 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p8 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p9 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p10 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p11 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p12 = new Modelo("Rodrigo","Juan","234234324");
        Modelo p13 = new Modelo("Rodrigo","Juan","234234324");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);
        lista.add(p11);
        lista.add(p12);
        lista.add(p13);
    }

    public List<Modelo> getPersonas()
    {
        return this.personas;
    }
}
