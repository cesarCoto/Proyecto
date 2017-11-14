package com.robot.maker.proyecto;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExamTeoricVectorsActivity extends AppCompatActivity {
    //This code was made by Cesar Uriel Coto Coazozon and the help of Jose Manuel Coutiño Vazques
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_teoric_vectors);

        //button ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
