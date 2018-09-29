package com.eagle.anonymous.mahem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SearchFragment extends Fragment {
    
   ImageView Filter,search_btn;

    RecyclerView recyclerView;
    ArrayList<Advertising> AdvList;
    AdvAdapter adapter;


    


    private ArrayList<String> title=new ArrayList<String>() {

    };
    private ArrayList<String> describtion=new ArrayList<String>() {

    };
    private ArrayList<String> time=new ArrayList<String>() {

    };


    private ArrayList<Integer> image= new ArrayList<Integer>() {
    };





    ///////intialize counter variable that show how many (takhfif agahi) will be shown in layout
    int counter=3;
    ///
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View searchView= inflater.inflate(R.layout.activity_search,container,false);
        AdvList= new ArrayList<>();

        for(int i=0;i<counter;++i) {
            title.add("ii");
            describtion.add("jj");
            time.add("yy");
            image.add(R.drawable.add);
            recyclerView = (RecyclerView) searchView.findViewById(R.id.RecyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            ///this line add search views to the list:
            AdvList.add(new Advertising(title.get(i), describtion.get(i), time.get(i), image.get(i)));
            adapter = new AdvAdapter(getContext(), AdvList);
            recyclerView.setAdapter(adapter);
        }

        Filter=(ImageView)searchView.findViewById(R.id.filter);
        Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i=new Intent(Search.this,Filter_other.class);
                //startActivity(i);
                Toast.makeText(getContext(),"clicked",Toast.LENGTH_LONG).show();


            }
        });

        search_btn=(ImageView)searchView.findViewById(R.id.search_icon);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return searchView;
    }
}
