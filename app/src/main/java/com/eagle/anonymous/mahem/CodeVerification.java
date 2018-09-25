package com.eagle.anonymous.mahem;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.ImageView;

public class CodeVerification extends AppCompatActivity {
    EditText etCode;
    Button btnVerify;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verification);

        init();

        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etCode.getText().toString().equals("")) {
                    etCode.setError("کد را وارد کنید");
                    return;
                }
                save(etCode.getText().toString());
            Intent i=new Intent(CodeVerification.this,Ads.class);
            startActivity(i);
            CodeVerification.this.finish();
            }
        });
    


    }


    private void init() {

        etCode = (EditText) findViewById(R.id.et_code);
        btnVerify = (Button) findViewById(R.id.btn_verify);
    }

    private void save(String code) {
        //
    }
}
