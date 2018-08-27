package com.eagle.anonymous.mahem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Electric extends AppCompatActivity {
Button tablet,net,soti,console,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        tablet=(Button)findViewById(R.id.btn1);
        net=(Button)findViewById(R.id.btn2);
        soti=(Button)findViewById(R.id.btn3);
        console=(Button)findViewById(R.id.btn4);
        other=(Button)findViewById(R.id.btn5);

        tablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Electric.this,Electric_Tablet.class);
                startActivity(i);
            }
        });
        soti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Electric.this,Electric_soti.class);
                startActivity(i);
            }
        });

    }
}
