package com.rodrigo.practica_parcial;

import android.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionManager
{
    public ConnectionManager()
    {

    }

    public byte[] getString(String urlString)
    {
        int response = 0;
        HttpURLConnection conexion = null;
        URL url;

        try
        {
            url = new URL(urlString);
            conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();
            response = conexion.getResponseCode();
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        if(response == 200)
        {
            try
            {
                InputStream isr = conexion.getInputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int length = 0;
                while((length = isr.read(buffer)) != -1)
                {
                    baos.write(buffer,0,length);
                }
                isr.close();
                return baos.toByteArray();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }
}
