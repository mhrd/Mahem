package com.eagle.anonymous.mahem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sargarmi_music extends AppCompatActivity {
Button piano,saz_badi,guitar,dram,violon,sonati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sargarmi_music);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        piano=(Button)findViewById(R.id.btn1);
        saz_badi=(Button)findViewById(R.id.btn2);
        guitar=(Button)findViewById(R.id.btn3);
        dram=(Button)findViewById(R.id.btn4);
        violon=(Button)findViewById(R.id.btn5);
        sonati=(Button)findViewById(R.id.btn6);

    }
}
