package com.example.appods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS2Activity extends AppCompatActivity {

    Button btnVoltarODS2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods2);

        btnVoltarODS2 = findViewById(R.id.btnVoltarODS2);
        btnVoltarODS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPrincipal = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(telaPrincipal);
            }
        });
    }
}