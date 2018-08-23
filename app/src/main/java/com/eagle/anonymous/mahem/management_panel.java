
package com.eagle.anonymous.mahem;


import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Management_Panel extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Advertising> AdvList;
    panelAdapter adapter;
    CircleImageView AccountImage;


    TextView paneltxt;
    FloatingActionButton fab;


    private String title, describtion, time,family_name,chat_time;
    private int agahiimage,userImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management__panel);
        //fill this variables with information


        /*
        agahiimage=;
        time="";
        title="";
        describtion="";
        family_name="";
        chat_time="";
        userImage=;
        */



        AdvList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdvList.add(new Advertising(title,describtion,time,agahiimage,family_name,chat_time,userImage));
        adapter=new panelAdapter(this,AdvList);
        recyclerView.setAdapter(adapter);

        paneltxt=(TextView)findViewById(R.id.mp);
        paneltxt.setText(family_name+"پنل مدیریت");

        AccountImage=(CircleImageView)findViewById(R.id.AccoutImage);
        AccountImage.setImageResource(userImage);

        fab=(FloatingActionButton)findViewById(R.id.FAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

