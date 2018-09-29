package com.eagle.anonymous.mahem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View homeView=inflater.inflate(R.layout.home,container,false);

        CityName = (TextView) homeView.findViewById(R.id.title);
        Image = (ImageView) homeView.findViewById(R.id.image);


        Estekhdami = (ListView) homeView.findViewById(R.id.listv1);
        Agahi = (ListView) homeView.findViewById(R.id.listv2);
        return homeView;
    }
}
