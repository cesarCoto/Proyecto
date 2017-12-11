package com.robot.maker.proyecto;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ExamTeoricVectorsActivity extends AppCompatActivity {
    //This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques

    RadioButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez;
    Button buttoncalificar;

    View viewToastVectores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_teoric_vectors);

        //se crea la instancia para la tostada custom
        LayoutInflater inflater = getLayoutInflater();
        viewToastVectores = inflater.inflate(R.layout.tostada,(ViewGroup) findViewById(R.id.custom_layout));
        //se optiene el TextView para mandar el dato si se paso el examen o no
        final TextView textViewcalificacion = (TextView) viewToastVectores.findViewById(R.id.calificaiontexto);
        final ImageView imageViewtoasCalificacion = (ImageView) viewToastVectores.findViewById(R.id.imagenToas);


        uno = findViewById(R.id.radioButton_respuesta2_pregunta1_exam_teorico_vectores);
        dos = findViewById(R.id.radioButton_respuesta3_pregunta2_exam_teorico_vectores);
        tres = findViewById(R.id.radioButton_respuesta2_pregunta3_exam_teorico_vectores);
        cuatro = findViewById(R.id.radioButton_respuesta2_pregunta4_exam_teorico_vectores);
        cinco = findViewById(R.id.radioButton_respuesta3_pregunta5_exam_teorico_vectores);
        seis = findViewById(R.id.radioButton_respuesta4_pregunta6_exam_teorico_vectores);
        siete = findViewById(R.id.radioButton_respuesta1_pregunta7_exam_teorico_vectores);
        ocho = findViewById(R.id.radioButton_respuesta2_pregunta8_exam_teorico_vectores);
        nueve = findViewById(R.id.radioButton_respuesta3_pregunta9_exam_teorico_vectores);
        diez = findViewById(R.id.radioButton_respuesta1_pregunta10_exam_teorico_vectores);

        buttoncalificar = findViewById(R.id.button_calificar_examen_teorico_vectores);
        buttoncalificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int calificacion = 0;
                if (uno.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (dos.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (tres.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (cuatro.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (cinco.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (siete.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (siete.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (ocho.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (nueve.isChecked()) {
                    calificacion = calificacion + 1;
                }
                if (diez.isChecked()) {
                    calificacion = calificacion + 1;
                }

                int a = calificacion;
                if (calificacion ==10 || calificacion>5){

                    Toast toastcalificacion = Toast.makeText(ExamTeoricVectorsActivity.this,"Toast:Gravity.TOP",Toast.LENGTH_LONG);
                    toastcalificacion.setGravity(Gravity.BOTTOM,0,60);
                    toastcalificacion.setView(viewToastVectores);
                    toastcalificacion.show();
                    textViewcalificacion.setText(getString(R.string.textofelicitaciones) + String.valueOf(calificacion) + getString(R.string.dediez));

                }else if(calificacion ==5 || calificacion<5){

                    Toast toastcalificacionmal = Toast.makeText(ExamTeoricVectorsActivity.this,"Toast:Gravity.TOP",Toast.LENGTH_LONG);
                    toastcalificacionmal.setGravity(Gravity.BOTTOM,0,60);
                    toastcalificacionmal.setView(viewToastVectores);
                    toastcalificacionmal.show();
                    textViewcalificacion.setText(getString(R.string.mala_suerte) + String.valueOf(calificacion) + getString(R.string.dediez));
                    imageViewtoasCalificacion.setImageResource(R.drawable.mal);


                }

            }
        });

        //button ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
