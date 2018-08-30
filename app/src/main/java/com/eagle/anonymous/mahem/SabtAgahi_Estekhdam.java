package android.niky.mahem;

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

public class SabtAgahi_Estekhdam extends AppCompatActivity {

    EditText Group,Title,EducationLevel,Gharardad,Tozihat,call,location
            ,PhoneNum,Email;
    View CallLayout,EducationLayout,GharardadLayout;
    TextView Ed_1,Ed_2,Ed_3,Ed_4,Ed_5,Ed_6,Gh_1,Gh_2,Gh_3,Gh_4;
    CheckBox rules,chat,email_check;
    Button send,cam1,cam2,cam3,cam4,cam5;
    PopupWindow Ed_Layout,Call_Layout,Gh_Layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabt_agahi__estekhdam);


        Group=(EditText)findViewById(R.id.T1);
        Title=(EditText)findViewById(R.id.T2);
        EducationLevel=(EditText)findViewById(R.id.T3);
        Gharardad=(EditText)findViewById(R.id.T4);
        Tozihat=(EditText)findViewById(R.id.T5);
        call=(EditText)findViewById(R.id.T6);
        location=(EditText)findViewById(R.id.T7);

        send=(Button)findViewById(R.id.send);
        cam1=(Button)findViewById(R.id.c1);
        cam2=(Button)findViewById(R.id.c2);
        cam3=(Button)findViewById(R.id.c3);
        cam4=(Button)findViewById(R.id.c4);
        cam5=(Button)findViewById(R.id.c5);

        LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        CallLayout=inflater.inflate(R.layout.call_layout,null);
        EducationLayout=inflater.inflate(R.layout.education_level_layout,null);
        EducationLayout=inflater.inflate(R.layout.gharardad_layout,null);


        PhoneNum=(EditText)CallLayout.findViewById(R.id.call1);
        Email=(EditText)CallLayout.findViewById(R.id.Call2);

        rules=(CheckBox)findViewById(R.id.rule);
        chat=(CheckBox)CallLayout.findViewById(R.id.chat);
        email_check=(CheckBox)CallLayout.findViewById(R.id.Email_check);

        Ed_1=(TextView)EducationLayout.findViewById(R.id.Tt1);
        Ed_2=(TextView)EducationLayout.findViewById(R.id.Tt2);
        Ed_3=(TextView)EducationLayout.findViewById(R.id.Tt3);
        Ed_4=(TextView)EducationLayout.findViewById(R.id.Tt4);
        Ed_5=(TextView)EducationLayout.findViewById(R.id.Tt5);
        Ed_6=(TextView)EducationLayout.findViewById(R.id.Tt6);
        Gh_1=(TextView)GharardadLayout.findViewById(R.id.Tt1);
        Gh_2=(TextView)GharardadLayout.findViewById(R.id.Tt2);
        Gh_3=(TextView)GharardadLayout.findViewById(R.id.Tt3);
        Gh_4=(TextView)GharardadLayout.findViewById(R.id.Tt4);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Call_Layout=popupDisplay(CallLayout);
                Call_Layout.showAsDropDown(view);


            }
        });


        EducationLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Ed_Layout=popupDisplay(CallLayout);
                Ed_Layout.showAsDropDown(view);
            }
        });
        Ed_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EducationLevel.setText(Ed_1.getText().toString());
                Ed_Layout .dismiss();
            }
        });

        Ed_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EducationLevel.setText(Ed_2.getText().toString());
                Ed_Layout .dismiss();
            }
        });

        Ed_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EducationLevel.setText(Ed_3.getText().toString());
                Ed_Layout .dismiss();
            }
        });

        Ed_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EducationLevel.setText(Ed_4.getText().toString());
                Ed_Layout .dismiss();
            }
        });

        Ed_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EducationLevel.setText(Ed_5.getText().toString());
                Ed_Layout .dismiss();
            }
        });

        Ed_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EducationLevel.setText(Ed_6.getText().toString());
                Ed_Layout .dismiss();
            }
        });

        Gharardad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Gh_Layout=popupDisplay(CallLayout);
                Gh_Layout.showAsDropDown(view);


            }
        });

        Gh_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gharardad.setText(Gh_1.getText().toString());
                Gh_Layout .dismiss();
            }
        });

        Gh_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gharardad.setText(Gh_2.getText().toString());
                Gh_Layout .dismiss();
            }
        });

        Gh_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gharardad.setText(Gh_3.getText().toString());
                Gh_Layout .dismiss();
            }
        });

        Gh_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gharardad.setText(Gh_4.getText().toString());
                Gh_Layout .dismiss();
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
