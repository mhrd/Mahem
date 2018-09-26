package com.eagle.anonymous.mahem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class MenuLineFragment extends Fragment {
    Button estekhdam,amlak,naghlie,electric,home,khadamat,tajhizat,sargarmi,personal;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View menuLineView inflater.inflate(R.layout.activity_group,container,false);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        estekhdam=(Button)findViewById(R.id.btn1);
        amlak=(Button)findViewById(R.id.btn2);
        naghlie=(Button)findViewById(R.id.btn3);
        electric=(Button)findViewById(R.id.btn4);
        home=(Button)findViewById(R.id.btn5);
        khadamat=(Button)findViewById(R.id.btn6);
        tajhizat=(Button)findViewById(R.id.btn7);
        sargarmi=(Button)findViewById(R.id.btn8);
        personal=(Button)findViewById(R.id.btn9);


        estekhdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Estekhdami.class);
                startActivity(i);
            }
        });
        amlak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Amlak.class);
                startActivity(i);
            }
        });
        naghlie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Naghlieh.class);
                startActivity(i);
            }
        });

        electric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Electric.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Home_EQ.class);
                startActivity(i);
            }
        });
        khadamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Khadamat.class);
                startActivity(i);
            }
        });

        tajhizat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Tajhizat.class);
                startActivity(i);
            }
        });
        sargarmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Sargarmi.class);
                startActivity(i);
            }
        });

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Group.this,Personal.class);
                startActivity(i);
            }
        });

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();

        return menuLineView;
    }
}
