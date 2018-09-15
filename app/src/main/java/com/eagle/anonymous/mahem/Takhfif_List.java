package com.eagle.anonymous.mahem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Takhfif_List extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView city_selection;
    List<Takhfif> TList;
    TAdapter adapter;

    private ArrayList<String> last_c=new ArrayList<String>() {

    };
    private ArrayList<String> new_c=new ArrayList<String>() {

    };
    private ArrayList<String> t_city=new ArrayList<String>() {

    };
    private ArrayList<String> t_describe=new ArrayList<String>() {

    };
    private ArrayList<String> t_percent=new ArrayList<String>() {

    };


    private ArrayList<Integer> t_rate= new ArrayList<Integer>() {
    };
    private ArrayList<Integer> t_imagess= new ArrayList<Integer>() {
    };



    ///////intialize counter variable that show how many (takhfif agahi) will be shown in layout
    int counter=3;
    ///


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.takhfif_list);
        Toast.makeText(Takhfif_List.this,"initialize counter variable that show how many (takhfif agahi) will be shown in layout",Toast.LENGTH_LONG).show();

        Toast.makeText(Takhfif_List.this,"fill specific strings with network information in on create method",Toast.LENGTH_LONG).show();

        TList = new ArrayList<>();
        for(int i=0;i<counter;++i) {

            ///////fill these strings with network information
            last_c.add("vvv");
            new_c.add("PPPPPPP");
            t_city.add("aaaaaaa");
            t_describe.add("ssssss");
            t_percent.add("oooo"+"% تخفیف ");
            t_imagess.add(R.drawable.add);
            ///rate of takhfif... an integer between 0 to 5
            t_rate.add(2);
            ////////////////////////////////////////////



            recyclerView = (RecyclerView) findViewById(R.id.t_recycler_view);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            TList.add(new Takhfif(last_c.get(i), new_c.get(i), t_percent.get(i), t_describe.get(i), t_city.get(i),t_imagess.get(i)));

            adapter = new TAdapter(this, TList, new ClickListener() {
                @Override
                public void onPositionClicked(int position) {

                }

                @Override
                public void onLongClicked(int position) {

                }
            },t_rate);
            recyclerView.setAdapter(adapter);




        }



        city_selection=(TextView)findViewById(R.id.select_city);
        city_selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(Takhfif_List.this, city_selection);
                //Inflating the Popup using xml file
                popup.getMenuInflater()
                        .inflate(R.menu.cities, popup.getMenu());


                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(
                                Takhfif_List.this,
                                "You Clicked : " + item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show();
                        return true;
                    }
            });
                popup.show();
        }


    });
}}
