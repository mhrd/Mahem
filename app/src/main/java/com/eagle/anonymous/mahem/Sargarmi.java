package com.eagle.anonymous.mahem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sargarmi extends AppCompatActivity {
Button cycle,sport,travel,asbab_bazi,music,book,pet,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sargarmi);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        cycle=(Button)findViewById(R.id.btn1);
        sport=(Button)findViewById(R.id.btn2);
        travel=(Button)findViewById(R.id.btn3);
        asbab_bazi=(Button)findViewById(R.id.btn4);
        music=(Button)findViewById(R.id.btn5);
        book=(Button)findViewById(R.id.btn6);
        pet=(Button)findViewById(R.id.btn7);
        other=(Button)findViewById(R.id.btn8);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sargarmi.this,Sargarmi_music.class);
                startActivity(i);
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sargarmi.this,Sargarmi_book.class);
                startActivity(i);
            }
        });

    }
}
