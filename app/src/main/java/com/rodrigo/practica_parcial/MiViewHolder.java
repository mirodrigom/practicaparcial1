package com.rodrigo.practica_parcial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    private MainActivity ma;
    public TextView txtNom;
    public TextView txtApe;
    private int position;
    public MiViewHolder(@NonNull View itemView,MainActivity ma)
    {
        super(itemView);
        this.ma = ma;
        this.txtNom = (TextView) itemView.findViewById(R.id.nom);
        this.txtApe = (TextView) itemView.findViewById(R.id.ape);
        itemView.setOnClickListener(this);
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    @Override
    public void onClick(View v)
    {
        Log.wtf("tocado", String.valueOf(this.position));
        //haceralgo(this.position)
    }
}
