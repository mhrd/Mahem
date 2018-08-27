package android.niky.takhfifyab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SabtAgahi extends AppCompatActivity {
    Button estekhdam,takhfifYab,amlak,naghlie,electric,home,khadamat,tajhizat,sargarmi,personal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabt_agahi);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);



        estekhdam=(Button)findViewById(R.id.btn1);
        takhfifYab=(Button)findViewById(R.id.btn2);
        amlak=(Button)findViewById(R.id.btn3);
        naghlie=(Button)findViewById(R.id.btn4);
        electric=(Button)findViewById(R.id.btn5);
        home=(Button)findViewById(R.id.btn6);
        khadamat=(Button)findViewById(R.id.btn7);
        tajhizat=(Button)findViewById(R.id.btn8);
        sargarmi=(Button)findViewById(R.id.btn9);
        personal=(Button)findViewById(R.id.btn10);

        takhfifYab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SabtAgahi.this,TakhfifYab.class);
                startActivity(i);
            }
        });
    }
}
