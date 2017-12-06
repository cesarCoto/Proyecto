package com.robot.maker.proyecto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    //This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques

    //se crea una variable para la vista tipo TextView
    TextView textView_ourBlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Se enlazan las vistas con la clase Java
        textView_ourBlog = findViewById(R.id.textView_blog);
        textView_ourBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Este codigo es para mandar a nuestro blog al hacer click sobre el TextView nuestro Blog
                String url = "https://androidprototipo.blogspot.mx/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //se activa el button ir atras para poder visualizarlo.
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
