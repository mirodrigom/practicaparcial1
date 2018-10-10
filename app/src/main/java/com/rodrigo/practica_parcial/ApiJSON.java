package com.rodrigo.practica_parcial;

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
                persona.setNombre(jsonData.getString("name"));
                persona.setApellido(jsonData.getString("apellido"));
            } catch (JSONException e)
            {
                e.printStackTrace();
            }
            personas.add(persona);
        }
        return personas;
    }
}
