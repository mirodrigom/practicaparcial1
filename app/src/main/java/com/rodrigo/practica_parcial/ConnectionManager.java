package com.rodrigo.practica_parcial;

import android.icu.util.Output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
        byte[] bytes = null;

        int response = 0;
        HttpURLConnection conexion = null;
        URL url;

        try
        {
            url = new URL(urlString);
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
                bytes = new byte[1024];
                int length = 0;
                while((length = isr.read(bytes)) != -1)
                {
                    baos.write(bytes,0,length);
                }
                isr.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return bytes;
    }
}
