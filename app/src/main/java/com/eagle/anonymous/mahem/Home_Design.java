package com.eagle.anonymous.mahem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_Design extends AppCompatActivity {
Button carpet,chair,lostr,commode,parde,bed,decor,TV_desk,fan,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__design);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        carpet=(Button)findViewById(R.id.btn1);
        chair=(Button)findViewById(R.id.btn2);
        lostr=(Button)findViewById(R.id.btn3);
        commode=(Button)findViewById(R.id.btn4);
        parde=(Button)findViewById(R.id.btn5);
        bed=(Button)findViewById(R.id.btn6);
        decor=(Button)findViewById(R.id.btn7);
        TV_desk=(Button)findViewById(R.id.btn8);
        fan=(Button)findViewById(R.id.btn9);
        other=(Button)findViewById(R.id.btn10);
    }
}
