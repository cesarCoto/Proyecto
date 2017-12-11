package com.robot.maker.proyecto;

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

// This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques


public class ExamTeoricoConversionesActivity extends AppCompatActivity {

    // se crea una variable para cada Vista
    RadioButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez;
    Button buttonCalificar;


    View viewToastConversiones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_teorico_conversiones);

        //se crea la instancia para la tostada custom
        LayoutInflater inflater = getLayoutInflater();
        viewToastConversiones = inflater.inflate(R.layout.tostada,(ViewGroup) findViewById(R.id.custom_layout));
        //se optiene el TextView para mandar el dato si se paso el examen o no
        final TextView textViewcalificacion = (TextView) viewToastConversiones.findViewById(R.id.calificaiontexto);
        final ImageView imageViewtoasCalificacion = (ImageView) viewToastConversiones.findViewById(R.id.imagenToas);

        //se enlazan las vista a la calse Java
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

        // se enlaza el button y se le asigna el onClick para que funcione
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
                /*en esta parte se toma el valor de calificacion y si es mayor que 5 se mostrara una custom Toast que dira nuestra calificacion final
                 en caso contrario mostrara cuales respuestas tenemos bien y un mensaje de sige intentando*/
                if (calificacion ==10 || calificacion>5){

                    Toast toastcalificacion = Toast.makeText(ExamTeoricoConversionesActivity.this,"Toast:Gravity.TOP",Toast.LENGTH_LONG);
                    toastcalificacion.setGravity(Gravity.BOTTOM,0,60);
                    toastcalificacion.setView(viewToastConversiones);
                    toastcalificacion.show();
                    textViewcalificacion.setText(getString(R.string.textofelicitaciones) + String.valueOf(calificacion) + getString(R.string.dediez));

                }else if(calificacion ==5 || calificacion<5){
                    Toast toastcalificacionmal = Toast.makeText(ExamTeoricoConversionesActivity.this,"Toast:Gravity.TOP",Toast.LENGTH_LONG);
                    toastcalificacionmal.setGravity(Gravity.BOTTOM,0,60);
                    toastcalificacionmal.setView(viewToastConversiones);
                    toastcalificacionmal.show();
                    textViewcalificacion.setText(getString(R.string.mala_suerte) + String.valueOf(calificacion) + getString(R.string.dediez));
                    imageViewtoasCalificacion.setImageResource(R.drawable.mal);


                }

            }
        });

        //ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
