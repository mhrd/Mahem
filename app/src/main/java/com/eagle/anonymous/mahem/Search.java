package com.eagle.anonymous.mahem;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {
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
        setContentView(R.layout.activity_search);




        AdvList=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdvList.add(new Advertising(title,describtion,time,image));
        adapter=new AdvAdapter(this,AdvList);
        recyclerView.setAdapter(adapter);
    }
}
