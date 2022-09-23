package com.teste.testecalendario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity
{

    TextView data;
    Button btnmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.textoTeste);
        btnmostrar = findViewById(R.id.btnMostrar);



        btnmostrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                data.setText(gerarData());
            }
        });

    }

    public String gerarData()
    {
        //SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        DateFormat formatter= DateFormat.getDateTimeInstance();
        formatter.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
}

