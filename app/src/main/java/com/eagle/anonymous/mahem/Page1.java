package com.eagle.anonymous.mahem;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Page1 extends AppCompatActivity {
    TextView CityName;
    ImageView Image;
    ListView Estekhdami, Agahi;

    View navigationBar;
    ImageView Home, Add, Menu, MenuLine, Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        CityName = (TextView) findViewById(R.id.title);
        Image = (ImageView) findViewById(R.id.image);

        LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Estekhdami = (ListView) findViewById(R.id.listv1);
        Agahi = (ListView) findViewById(R.id.listv2);

        map();
        Toast.makeText(this, getLocalClassName().toString() + "\nNiky", Toast.LENGTH_LONG).show();
    }


    public void map() {
        LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        navigationBar = inflater.inflate(R.layout.bottom_navigation, null);
        Home = (ImageView) navigationBar.findViewById(R.id.home);
        Add = (ImageView) navigationBar.findViewById(R.id.add);
        Menu = (ImageView) navigationBar.findViewById(R.id.menu_f);
        MenuLine = (ImageView) navigationBar.findViewById(R.id.menuLine_f);
        Search = (ImageView) navigationBar.findViewById(R.id.search_f);

//        Search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getBaseContext(), Search.class);
//                startActivity(i);
//
//            }
//        });
//
//        Menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getBaseContext(), Menu2.class);
//                startActivity(i);
//
//            }
//        });
//
//        Add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getBaseContext(), SabtAgahi_other.class);
//                startActivity(i);
//
//            }
//        });
//
//        MenuLine.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getBaseContext(), Group.class);
//                startActivity(i);
//
//            }
//        });


    }
}
