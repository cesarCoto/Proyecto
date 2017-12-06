package com.robot.maker.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

// This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques


public class ExamPracticoMagnitudesActivity extends AppCompatActivity {

    RadioButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez;
    Button buttonCalificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_practico_magnitudes);

        uno = findViewById(R.id.radioButton_respuesta1_pregunta1_exam_magnitudes);
        dos = findViewById(R.id.radioButton_respuesta1_pregunta2_exam_magnitudes);
        tres = findViewById(R.id.radioButton_respuesta2_pregunta3_exam_magnitudes);
        cuatro = findViewById(R.id.radioButton_respuesta2_pregunta4_exam_magnitudes);
        cinco = findViewById(R.id.radioButton_respuesta2_pregunta5_exam_magnitudes);
        seis = findViewById(R.id.radioButton_respuesta1_pregunta6_exam_magnitudes);
        siete = findViewById(R.id.radioButton_respuesta1_pregunta7_exam_magnitudes);
        ocho = findViewById(R.id.radioButton_respuesta2_pregunta8_exam_magnitudes);
        nueve = findViewById(R.id.radioButton_respuesta1_pregunta9_exam_magnitudes);
        diez = findViewById(R.id.radioButton_respuesta1_pregunta10_exam_magnitudes);

        buttonCalificar = findViewById(R.id.button_calificar_examen_magnitudes);
        buttonCalificar.setOnClickListener(new View.OnClickListener() {
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
                    Toast.makeText(ExamPracticoMagnitudesActivity.this, getString(R.string.calificacion_text)+" "+String.valueOf(a), Toast.LENGTH_SHORT).show();
                }else if(calificacion ==5 || calificacion<5){
                    Toast.makeText(ExamPracticoMagnitudesActivity.this, getString(R.string.mala_suerte), Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
