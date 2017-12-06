package com.robot.maker.proyecto;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques


public class ExamPracticoVectorsActivity extends AppCompatActivity {


    TextView textViewHelpVector;

    EditText uno,uno_dos,
            dos,dos_dos,
            tres,tres_dos,
            cuatro,cuatro_dos;

    Button buttonCalificar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_practico_vectors);

        uno = findViewById(R.id.respuesta1_1_examen_vec);
        uno_dos = findViewById(R.id.respuesta1_2_examen_vec);

        dos = findViewById(R.id.respuesta2_1_examen_vec);
        dos_dos = findViewById(R.id.respuesta2_2_examen_vec);

        tres = findViewById(R.id.respuesta3_1_examen_vec);
        tres_dos = findViewById(R.id.respuesta3_2_examen_vec);

        cuatro = findViewById(R.id.respuesta4_1_examen_vec);
        cuatro_dos = findViewById(R.id.respuesta4_2_examen_vec);

        buttonCalificar = findViewById(R.id.button_calificar_examen_vectores);

        buttonCalificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int calificacion = 0;
                String uno1 = uno.getText().toString();
                String uno2 = uno_dos.getText().toString();

                String dos1 = dos.getText().toString();
                String dos2 = dos_dos.getText().toString();

                String tres1 = tres.getText().toString();
                String tres2 = tres_dos.getText().toString();

                String cuatro1 = cuatro.getText().toString();
                String cuatro2 = cuatro_dos.getText().toString();

                if (uno1.length() != 0 && uno2.length() != 0 && dos1.length() != 0 && dos2.length() != 0 && tres1.length() != 0 && tres2.length() != 0 && cuatro1.length() != 0 && cuatro2.length() != 0) {
                    //res1
                    int a = Integer.parseInt(uno1);
                    int a2 = Integer.parseInt(uno2);
                    int res1 = 100;
                    int res1_2 = 110;

                    //res2
                    int b = Integer.parseInt(dos1);
                    int b2 = Integer.parseInt(dos2);
                    int res2 = 201;
                    int res2_2 = 197;

                    //res3
                    int c = Integer.parseInt(tres1);
                    int c2 = Integer.parseInt(tres2);
                    int res3 = 45;
                    int res3_2 = 53;

                    //res4
                    int d = Integer.parseInt(cuatro1);
                    int d2 = Integer.parseInt(cuatro2);

                    if (a == res1 && a2 == res1_2) {
                        calificacion = calificacion + 1;
                    }
                    if (b == res2 && b2 == res2_2) {
                        calificacion = calificacion + 1;
                    }
                    if (c == res3 && c2 == res3_2) {
                        calificacion = calificacion + 1;
                    }
                    if (d == res3 && d2 == res3_2) {
                        calificacion = calificacion + 1;
                    }
                    if (calificacion == 4 || calificacion > 2) {
                        Toast.makeText(ExamPracticoVectorsActivity.this, getString(R.string.calificacion_text) + " " + calificacion + "/4", Toast.LENGTH_SHORT).show();
                    } else if (calificacion == 2 || calificacion < 2) {
                        Toast.makeText(ExamPracticoVectorsActivity.this, getString(R.string.mala_suerte), Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(ExamPracticoVectorsActivity.this, "Por favor escribe algo", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //formulario
        final View bottomSheet = findViewById(R.id.design_bottom_sheet_vectors);
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
        //mostar el formulario
        textViewHelpVector = findViewById(R.id.textView_help_exam_vectores);
        textViewHelpVector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (behavior.getState() == BottomSheetBehavior.STATE_COLLAPSED){
                   behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }else {
                    behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });

    }
}
