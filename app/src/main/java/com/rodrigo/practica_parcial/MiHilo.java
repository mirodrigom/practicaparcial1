package com.rodrigo.practica_parcial;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class MiHilo extends Thread
{
    private String URL;
    private String queHacer;
    private String type;
    private Handler miHandler;

    public MiHilo(Handler miHandler, String URL, String queHacer, String type)
    {
        this.queHacer = queHacer;
        this.URL = URL;
        this.type = type;
        this.miHandler = miHandler;
    }

    @Override
    public void run()
    {
        super.run();

        Message msg = new Message();
        if(this.isInterrupted())
        {
            Log.wtf("thread","interrumpido");
        }else{
            ConnectionManager cm = new ConnectionManager();
            switch (this.queHacer.toLowerCase())
            {
                case "json":
                    if("get".equalsIgnoreCase(this.type))
                    {
                        msg.arg1 = 1;
                        msg.obj = new ApiJSON(new String(cm.getString(this.URL)));

                    }else if("post".equalsIgnoreCase(this.type))
                    {
                        msg.arg1 = 2;
                    }
                    break;
                case "xml":
                    if("get".equalsIgnoreCase(this.type))
                    {
                        msg.arg1 = 3;
                    }else if("post".equalsIgnoreCase(this.type))
                    {
                        msg.arg1 = 4;
                    }
                    break;
            }
        }
    }
}
