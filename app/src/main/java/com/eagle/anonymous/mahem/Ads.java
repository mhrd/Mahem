package com.eagle.anonymous.mahem;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;


import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Ads extends AppCompatActivity {
   
    ImageView Filter;

    RecyclerView recyclerView;
    List<Advertising> AdvList;
    AdvAdapter adapter;


    //fill this variables with information
    private String title, describtion, time;
    private int image;
    ///////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);
        AdvList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ///this line add search views to the list:
        AdvList.add(new Advertising(title,describtion,time,image));
        adapter=new AdvAdapter(this,AdvList);
        recyclerView.setAdapter(adapter);

        Filter=(ImageView)findViewById(R.id.filter);
        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Ads.this,Filter_other.class);
                startActivity(i);

            }
        });


   

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();
    }

}
