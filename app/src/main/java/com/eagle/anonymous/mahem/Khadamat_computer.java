package com.eagle.anonymous.mahem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Khadamat_computer extends AppCompatActivity {
Button web,net,pc,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khadamat_computer);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);


        web=(Button)findViewById(R.id.btn1);
        net=(Button)findViewById(R.id.btn2);
        pc=(Button)findViewById(R.id.btn3);
        mobile=(Button)findViewById(R.id.btn4);

    }
}
