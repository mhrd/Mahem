package com.eagle.anonymous.mahem;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;

public class SabtAgahi_Car extends AppCompatActivity {
    EditText Group,Title,brand,shasy_typpe,naghd,year,K_meter,Gheimat,AgahiDahande_type,Type,call,Tozihat,location
            ,PhoneNum,Email;
    View CallLayout,TypeLayout,AgahiDahandeLayout,GheimatLayout,NaghdLayout,BrandLayout,ShasyTypeLayout;
    TextView Type_1,Type_2,Type_3,agahiD_1,agahiD_2,Gh_1,Gh_2,Gh_3,Gh_4,Sh_1,Sh_2,Sh_3,Sh_4,Sh_5,Sh_6,Sh_7
            ,naghd_1,naghd_2,Br_1,Br_2,Br_3,Br_4,Br_5,Br_6,Br_7,Br_8,Br_9,Br_10;
    CheckBox rules,chat,email_check;
    Button send,cam1,cam2,cam3,cam4,cam5;
    PopupWindow Type_Layout,Call_Layout,Gheimat_Layout,agahiD_Layout,Shasy_type_Layout,Naghd_Layout,Brand_Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabt_agahi__car);


        Group=(EditText)findViewById(R.id.T1);
        Title=(EditText)findViewById(R.id.T2);
        brand=(EditText)findViewById(R.id.T3);
        shasy_typpe=(EditText)findViewById(R.id.T4);
        naghd=(EditText)findViewById(R.id.T5);
        year=(EditText)findViewById(R.id.T6);
        K_meter=(EditText)findViewById(R.id.T7);
        Gheimat=(EditText)findViewById(R.id.T8);
        AgahiDahande_type=(EditText)findViewById(R.id.T9);
        Type=(EditText)findViewById(R.id.T10);
        call=(EditText)findViewById(R.id.T11);
        Tozihat=(EditText)findViewById(R.id.T12);
        location=(EditText)findViewById(R.id.T13);


        send=(Button)findViewById(R.id.send);
        cam1=(Button)findViewById(R.id.c1);
        cam2=(Button)findViewById(R.id.c2);
        cam3=(Button)findViewById(R.id.c3);
        cam4=(Button)findViewById(R.id.c4);
        cam5=(Button)findViewById(R.id.c5);

        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        CallLayout=inflater.inflate(R.layout.call_layout,null);
        TypeLayout=inflater.inflate(R.layout.type_agahi_layout,null);
        GheimatLayout=inflater.inflate(R.layout.gheimat_layout,null);
        AgahiDahandeLayout=inflater.inflate(R.layout.agahi_dahande_layout,null);
        ShasyTypeLayout=inflater.inflate(R.layout.shasy_layout,null);
        NaghdLayout=inflater.inflate(R.layout.naghd_layout,null);
        BrandLayout=inflater.inflate(R.layout.brand_layout,null);


        PhoneNum=(EditText)CallLayout.findViewById(R.id.call1);
        Email=(EditText)CallLayout.findViewById(R.id.Call2);


        rules=(CheckBox)findViewById(R.id.rule);
        chat=(CheckBox)CallLayout.findViewById(R.id.chat);
        email_check=(CheckBox)CallLayout.findViewById(R.id.Email_check);


        Type_1=(TextView)TypeLayout.findViewById(R.id.Tt1);
        Type_2=(TextView)TypeLayout.findViewById(R.id.Tt2);
        Type_3=(TextView)TypeLayout.findViewById(R.id.Tt3);
        agahiD_1=(TextView)AgahiDahandeLayout.findViewById(R.id.Tt1);
        agahiD_2=(TextView)AgahiDahandeLayout.findViewById(R.id.Tt2);
        Gh_1=(TextView)GheimatLayout.findViewById(R.id.Tt1);
        Gh_2=(TextView)GheimatLayout.findViewById(R.id.Tt2);
        Gh_3=(TextView)GheimatLayout.findViewById(R.id.Tt3);
        Gh_4=(TextView)GheimatLayout.findViewById(R.id.Tt4);
        Sh_1=(TextView)ShasyTypeLayout.findViewById(R.id.Tt1);
        Sh_2=(TextView)ShasyTypeLayout.findViewById(R.id.Tt2);
        Sh_3=(TextView)ShasyTypeLayout.findViewById(R.id.Tt3);
        Sh_4=(TextView)ShasyTypeLayout.findViewById(R.id.Tt4);
        Sh_5=(TextView)ShasyTypeLayout.findViewById(R.id.Tt5);
        Sh_6=(TextView)ShasyTypeLayout.findViewById(R.id.Tt6);
        Sh_7=(TextView)ShasyTypeLayout.findViewById(R.id.Tt7);
        Br_1=(TextView)BrandLayout.findViewById(R.id.Tt1);
        Br_2=(TextView)BrandLayout.findViewById(R.id.Tt2);
        Br_3=(TextView)BrandLayout.findViewById(R.id.Tt3);
        Br_4=(TextView)BrandLayout.findViewById(R.id.Tt4);
        Br_5=(TextView)BrandLayout.findViewById(R.id.Tt5);
        Br_6=(TextView)BrandLayout.findViewById(R.id.Tt6);
        Br_7=(TextView)BrandLayout.findViewById(R.id.Tt7);
        Br_8=(TextView)BrandLayout.findViewById(R.id.Tt8);
        Br_9=(TextView)BrandLayout.findViewById(R.id.Tt9);
        Br_10=(TextView)BrandLayout.findViewById(R.id.Tt10);
        naghd_1=(TextView)NaghdLayout.findViewById(R.id.Tt1);
        naghd_2=(TextView)NaghdLayout.findViewById(R.id.Tt2);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Call_Layout=popupDisplay(CallLayout);
                Call_Layout.showAsDropDown(view);


            }
        });

        Type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Type_Layout=popupDisplay(TypeLayout);
                Type_Layout.showAsDropDown(view);


            }
        });

        Type_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type.setText(Type_1.getText().toString());
                Type_Layout.dismiss();
            }
        });

        Type_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Type.setText(Type_2.getText().toString());
                Type_Layout.dismiss();
            }
        });


        Gheimat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Gheimat_Layout=popupDisplay(GheimatLayout);
                Gheimat_Layout.showAsDropDown(view);


            }
        });

        Gh_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_1.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_2.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_3.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        Gh_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gheimat.setText(Gh_4.getText().toString());
                Gheimat_Layout.dismiss();
            }
        });

        naghd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Naghd_Layout=popupDisplay(NaghdLayout);
                Naghd_Layout.showAsDropDown(view);


            }
        });

        naghd_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naghd.setText(naghd_1.getText().toString());
                Naghd_Layout.dismiss();
            }
        });

        naghd_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naghd.setText(naghd_2.getText().toString());
                Naghd_Layout.dismiss();
            }
        });

        shasy_typpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Shasy_type_Layout=popupDisplay(ShasyTypeLayout);
                Shasy_type_Layout.showAsDropDown(view);


            }
        });

        Sh_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shasy_typpe.setText(Sh_1.getText().toString());
                Shasy_type_Layout.dismiss();
            }
        });
        Sh_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shasy_typpe.setText(Sh_2.getText().toString());
                Shasy_type_Layout.dismiss();
            }
        });
        Sh_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shasy_typpe.setText(Sh_3.getText().toString());
                Shasy_type_Layout.dismiss();
            }
        });
        Sh_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shasy_typpe.setText(Sh_4.getText().toString());
                Shasy_type_Layout.dismiss();
            }
        });
        Sh_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shasy_typpe.setText(Sh_5.getText().toString());
                Shasy_type_Layout.dismiss();
            }
        });
        Sh_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shasy_typpe.setText(Sh_6.getText().toString());
                Shasy_type_Layout.dismiss();
            }
        });
        Sh_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shasy_typpe.setText(Sh_7.getText().toString());
                Shasy_type_Layout.dismiss();
            }
        });

        brand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Brand_Layout=popupDisplay(BrandLayout);
                Brand_Layout.showAsDropDown(view);


            }
        });
        Br_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_1.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_2.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_3.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_4.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_5.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_6.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_7.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_8.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_9.getText().toString());
                Brand_Layout.dismiss();
            }
        });
        Br_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brand.setText(Br_10.getText().toString());
                Brand_Layout.dismiss();
            }
        });

        AgahiDahande_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                agahiD_Layout=popupDisplay(AgahiDahandeLayout);
                agahiD_Layout.showAsDropDown(view);
            }
        });

        agahiD_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AgahiDahande_type.setText(agahiD_1.getText().toString());
                agahiD_Layout.dismiss();
            }
        });

        agahiD_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AgahiDahande_type.setText(agahiD_2.getText().toString());
                agahiD_Layout.dismiss();
            }
        });


    }


    public PopupWindow popupDisplay(View view)
    {
        final PopupWindow popupWindow=new PopupWindow(this);
        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        popupWindow.setFocusable(true);
        popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setContentView(view);
        return popupWindow;
    }

}
