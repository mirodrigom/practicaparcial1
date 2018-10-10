package com.rodrigo.practica_parcial;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Handler.Callback
{

    Modelo modelo;
    Controlador controlador;
    Vista vista;
    MiHilo handler;
    MyAdapter miAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.modelo = new Modelo();
        this.controlador = new Controlador();
        this.controlador.setModelo(this.modelo);
        this.vista = new Vista(this,this.controlador);
        this.controlador.setVista(this.vista);
        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerview);
        this.miAdaptador = new MyAdapter(this,this.controlador.getPersonas());
        rv.setAdapter(miAdaptador);
        rv.setLayoutManager(new LinearLayoutManager(this));
        Handler miHandler = new Handler(this);
        MiHilo hiloUno = new MiHilo(miHandler,"url","json","get");
        hiloUno.start();
    }

    @Override
    public boolean handleMessage(Message msg)
    {
        switch (msg.arg1)
        {
            case 0:
                controlador.setPersonas((List<Modelo>) msg.obj);
                this.miAdaptador.notifyDataSetChanged();
                break;
        }
        return false;
    }
}
