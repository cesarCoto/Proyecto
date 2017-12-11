package com.robot.maker.proyecto;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


// This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques

public class ExamPracticoNewtonActivity extends AppCompatActivity {

    //se crea una variable para cada Vista
    TextView textViewHelpNewton;
    EditText uno,dos,dos_dos,tres,cuatro,cinco;

    Button buttonCalificar;
    View viewToastadaNewton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_practico_newton);

        //se crea la instancia para la tostada custom
        LayoutInflater inflater = getLayoutInflater();
        viewToastadaNewton = inflater.inflate(R.layout.tostada,(ViewGroup) findViewById(R.id.custom_layout));
        //se optiene el TextView para mandar el dato si se paso el examen o no
        final TextView textViewcalificacion = (TextView) viewToastadaNewton.findViewById(R.id.calificaiontexto);
        final ImageView imageViewtoasCalificacion = (ImageView) viewToastadaNewton.findViewById(R.id.imagenToas);

        //se enlazan las vista a la calse Java
        uno = findViewById(R.id.respuesta1_examen_newton);
        dos = findViewById(R.id.respuesta2_1_examen_newton);
        dos_dos = findViewById(R.id.respuesta2_2_examen_newton);
        tres = findViewById(R.id.respuesta3_examen_newton);
        cuatro = findViewById(R.id.respuesta4_examen_newton);
        cinco = findViewById(R.id.respuesta5_examen_newton);

        //Se enlza el Button y se asigna el Onclick para que funcione
        buttonCalificar = findViewById(R.id.button_calificar_newton);
        buttonCalificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int calificarcion = 0;
                //extracccion
                String a = uno.getText().toString();
                String b = dos.getText().toString();
                String b2 = dos_dos.getText().toString();
                String c = tres.getText().toString();
                String d = cuatro.getText().toString();
                String e = cinco.getText().toString();
                if(uno.length()!=0 &&dos.length()!=0 && dos_dos.length()!=0 && tres.length()!=0 && cuatro.length()!=0 && cinco.length()!=0) {
                    //res1
                    int res1 = 6000;
                    int a_a = Integer.parseInt(a);
                    //res2
                    float b_b = Float.parseFloat(b);
                    int b2_b2 = Integer.parseInt(b2);
                    float resb1 = (float) 4.9;
                    int resb2 = 59;
                    //res3
                    int c_c = Integer.parseInt(c);
                    int res3 = 63;
                    //res4
                    float d_d = Float.parseFloat(d);
                    float res4 = (float) 0.10;
                    //res5
                    float e_e = Float.parseFloat(e);
                    float res5 = (float) 14.7;
                    if (a_a == res1) {
                        calificarcion = calificarcion + 1;
                    }
                    if (b_b == resb1 && b2_b2 == resb2) {
                        calificarcion = calificarcion + 1;
                    }
                    if (c_c == res3) {
                        calificarcion = calificarcion + 1;
                    }
                    if (d_d == res4) {
                        calificarcion = calificarcion + 1;
                    }
                    if (e_e == res5) {
                        calificarcion = calificarcion + 1;
                    }
                     /*en esta parte se toma el valor de calificacion y si es mayor que 5 se mostrara una custom Toast que dira nuestra calificacion final
                    en caso contrario mostrara cuales respuestas tenemos bien y un mensaje de sige intentando*/
                    if (calificarcion == 5 || calificarcion > 2) {

                        Toast toastcalificacion = Toast.makeText(ExamPracticoNewtonActivity.this,"Toast:Gravity.TOP",Toast.LENGTH_LONG);
                        toastcalificacion.setGravity(Gravity.BOTTOM,0,60);
                        toastcalificacion.setView(viewToastadaNewton);
                        toastcalificacion.show();
                        textViewcalificacion.setText(getString(R.string.textofelicitaciones) + String.valueOf(calificarcion) + getString(R.string.texto_de5));



                    } else if (calificarcion == 2 || calificarcion < 2) {
                        Toast toastcalificacion = Toast.makeText(ExamPracticoNewtonActivity.this,"Toast:Gravity.TOP",Toast.LENGTH_LONG);
                        toastcalificacion.setGravity(Gravity.BOTTOM,0,60);
                        toastcalificacion.setView(viewToastadaNewton);
                        toastcalificacion.show();
                        textViewcalificacion.setText(getString(R.string.mala_suerte) + String.valueOf(calificarcion) + getString(R.string.texto_de5));
                        imageViewtoasCalificacion.setImageResource(R.drawable.mal);

                    }
                }else {
                    Toast.makeText(ExamPracticoNewtonActivity.this, getString(R.string.escribealgo), Toast.LENGTH_SHORT).show();
                }
            }
        });






        //aqui se controla el formulario
        View bottomSheet = findViewById(R.id.design_bottom_sheet_newton);
        final BottomSheetBehavior behavior = BottomSheetBehavior.from(bottomSheet);
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState){
                    case BottomSheetBehavior.STATE_DRAGGING:
                        Log.i("BottomSheetCallback", "BottomSheetBehaviour.STATE_DRAGGING");
                        break;
                    case  BottomSheetBehavior.STATE_SETTLING:
                        Log.i("BottomSheetCallback", "BottomSheetBehaviour.STATE_SETTLING");
                        break;
                    case  BottomSheetBehavior.STATE_EXPANDED:
                        Log.i("BottomSheetCallback", "BottomSheetBehaviour.STATE_EXPANDED");
                        break;
                    case BottomSheetBehavior.STATE_COLLAPSED:
                        Log.i("BottomSheetCallback", "BottomSheetBehaviour.STATE_COLLAPSED");
                        break;
                    case BottomSheetBehavior.STATE_HIDDEN:
                        Log.i("BottomSheetCallback", "BottomSheetBehaviour.STATE_HIDDEN");
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
        //codigo para mostar el formulario
        textViewHelpNewton = findViewById(R.id.textView_help_exam_newton);
        textViewHelpNewton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (behavior.getState()==BottomSheetBehavior.STATE_COLLAPSED){
                    behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }else{
                    behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
    }
}
