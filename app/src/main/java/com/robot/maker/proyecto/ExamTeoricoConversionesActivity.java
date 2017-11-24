package com.robot.maker.proyecto;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ExamTeoricoConversionesActivity extends AppCompatActivity {

    RadioButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez;
    Button buttonCalificar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_teorico_conversiones);

        uno = findViewById(R.id.radioButton_respuesta3_pregunta1_exam_teorico_conversiones);
        dos = findViewById(R.id.radioButton_respuesta2_pregunta2_exam_teorico_conversiones);
        tres = findViewById(R.id.radioButton_respuesta2_pregunta3_exam_teorico_conversiones);
        cuatro = findViewById(R.id.radioButton_respuesta3_pregunta4_exam_teorico_conversiones);
        cinco = findViewById(R.id.radioButton_respuesta1_pregunta5_exam_teorico_conversiones);
        seis = findViewById(R.id.radioButton_respuesta2_pregunta6_exam_teorico_conversiones);
        siete = findViewById(R.id.radioButton_respuesta1_pregunta7_exam_teorico_conversiones);
        ocho = findViewById(R.id.radioButton_respuesta1_pregunta8_exam_teorico_conversiones);
        nueve = findViewById(R.id.radioButton_respuesta4_pregunta9_exam_teorico_conversiones);
        diez = findViewById(R.id.radioButton_respuesta3_pregunta10_exam_teorico_conversiones);

        buttonCalificar = findViewById(R.id.button_calificar_examen_teorico_conversiones);
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
                    Toast.makeText(ExamTeoricoConversionesActivity.this, getString(R.string.calificacion_text)+" "+String.valueOf(a), Toast.LENGTH_SHORT).show();
                }else if(calificacion ==5 || calificacion<5){
                    Toast.makeText(ExamTeoricoConversionesActivity.this, getString(R.string.mala_suerte), Toast.LENGTH_SHORT).show();
                }

            }
        });

        //ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
