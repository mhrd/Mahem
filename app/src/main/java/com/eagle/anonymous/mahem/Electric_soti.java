package com.eagle.anonymous.mahem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Electric_soti extends AppCompatActivity {
Button camera,System_soti,TV,DVD,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric_soti);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        camera=(Button)findViewById(R.id.btn1);
        System_soti=(Button)findViewById(R.id.btn2);
        TV=(Button)findViewById(R.id.btn3);
        DVD=(Button)findViewById(R.id.btn4);
        other=(Button)findViewById(R.id.btn5);
    }
}
