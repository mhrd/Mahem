package android.niky.takhfifyab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personal extends AppCompatActivity {
Button clothes,watch,health,child_clothes,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        clothes=(Button)findViewById(R.id.btn1);
        watch=(Button)findViewById(R.id.btn2);
        health=(Button)findViewById(R.id.btn3);
        child_clothes=(Button)findViewById(R.id.btn4);
        other=(Button)findViewById(R.id.btn5);
       


    }
}
