package com.rodrigo.practica_parcial;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class ApiJSON
{
    private JSONArray json;

    public ApiJSON(String json)
    {
        //Log.wtf("JSON:", json);
        try
        {
            this.json = new JSONArray(json);
        } catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    public List<Modelo> getJSON()
    {
        List<Modelo> personas = new ArrayList<Modelo>();
        JSONObject jsonData = new JSONObject();
        for (int i = 0; i < this.json.length() ; i++)
        {
            Modelo persona = new Modelo();
            try
            {
                jsonData = this.json.getJSONObject(i);
                persona.setNombre(jsonData.getString("first_name"));
                persona.setApellido(jsonData.getString("last_name"));
            } catch (JSONException e)
            {
                e.printStackTrace();
            }
            Log.wtf("json",persona.getApellido());
            personas.add(persona);
        }
        return personas;
    }
}
