package com.rodrigo.practica_parcial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter <MiViewHolder>
{
    private List<Modelo> modelo;
    private MainActivity ma;

    public MyAdapter(MainActivity ma,List<Modelo> modelo)
    {
        this.modelo = modelo;
        this.ma = ma;
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        MiViewHolder mvh = new MiViewHolder(view,ma);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder miViewHolder, int i)
    {
        miViewHolder.txtNom.setText(this.modelo.get(i).getNombre());
        miViewHolder.txtApe.setText(this.modelo.get(i).getApellido());
        miViewHolder.setPosition(i);
    }

    @Override
    public int getItemCount()
    {
        return this.modelo.size();
    }
}
