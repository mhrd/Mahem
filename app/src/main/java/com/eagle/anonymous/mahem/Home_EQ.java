package android.niky.takhfifyab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_EQ extends AppCompatActivity {
Button kitchen,design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__eq);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        kitchen=(Button)findViewById(R.id.btn1);
        design=(Button)findViewById(R.id.btn2);

        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home_EQ.this,Home_Kitchen.class);
                startActivity(i);
            }
        });

        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home_EQ.this,Home_Design.class);
                startActivity(i);
            }
        });
    }
}
