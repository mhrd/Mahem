package com.eagle.anonymous.mahem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class MenuFragment extends Fragment {
    View navigationBar;
    ImageView Home,Add,Menu,MenuLine,Search;

RelativeLayout JobBank,OffFinder,Register,Laws,ads,Estekhdami,MyAds,Share,Favorite,aboutUs,Setting,ContactUs;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View menuView= inflater.inflate(R.layout.activity_menu2,container,false);
        
        JobBank=(RelativeLayout)findViewById(R.id.btn_bank);
        OffFinder=(RelativeLayout)findViewById(R.id.btn_off);
        Register=(RelativeLayout)findViewById(R.id.btn_register);
        Laws=(RelativeLayout)findViewById(R.id.btn_law);
        ads=(RelativeLayout)findViewById(R.id.btn_ads);
        Estekhdami=(RelativeLayout)findViewById(R.id.btn_employment);
        MyAds=(RelativeLayout)findViewById(R.id.btn_my_ads);
        Share=(RelativeLayout)findViewById(R.id.btn_share);
        Favorite=(RelativeLayout)findViewById(R.id.btn_favorite);
        aboutUs=(RelativeLayout)findViewById(R.id.btn_about_us);
        Setting=(RelativeLayout)findViewById(R.id.btn_setting);
        ContactUs=(RelativeLayout)findViewById(R.id.btn_contact_us);

        Toast.makeText(this,getLocalClassName().toString()+"\nNiky",Toast.LENGTH_LONG).show();

        JobBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,JobBankMenu.class);
                startActivity(i);
            }
        });

        OffFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Off_Finder.class);
                startActivity(i);
            }
        });


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Register.class);
                startActivity(i);
            }
        });


        Laws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Laws.class);
                startActivity(i);
            }
        });

        ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Ads.class);
                startActivity(i);
            }
        });


        Estekhdami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Estekhdami_menu.class);
                startActivity(i);
            }
        });

        MyAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Ads_show.class);
                startActivity(i);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,AboutUs.class);
                startActivity(i);
            }
        });
        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,Setting.class);
                startActivity(i);
            }
        });

        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu2.this,ContactUs.class);
                startActivity(i);
            }
});
        return menuView;
    }
}
