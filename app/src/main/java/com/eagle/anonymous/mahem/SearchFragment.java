package com.eagle.anonymous.mahem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SearchFragment extends Fragment {
    
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;
    ImageView Filter;

    RecyclerView recyclerView;
    List<Advertising> AdvList;
    AdvAdapter adapter;


    //fill this variables with information
    private String title, describtion, time;
    private int image;
    ///////////
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View searchView= inflater.inflate(R.layout.activity_search,container,false);
        AdvList=new ArrayList<>();
        recyclerView=(RecyclerView)searchView.findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ///this line add search views to the list:
        AdvList.add(new Advertising(title,describtion,time,image));
        adapter=new AdvAdapter(this,AdvList);
        recyclerView.setAdapter(adapter);

        Filter=(ImageView)searchView.findViewById(R.id.filter);
        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Search.this,Filter_other.class);
                startActivity(i);

            }
        });
        return searchView;
    }
}
