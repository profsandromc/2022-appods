package com.example.appods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSair,btnODS1,btnODS2,btnODS3,btnODS4,btnODS5,btnODS6,btnODS7,btnODS8;
    Button btnODS9,btnODS10,btnODS11,btnODS12,btnODS13,btnODS14,btnODS15,btnODS16,btnODS17,btnQuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // botao para sair - instancio o objeto pelo ID
        btnSair = findViewById(R.id.btnSair);
        // importante importar os elementos ALT+ENTER = Option+Return
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // comando para fechar o aplicativo
                finish();
                finishAffinity();
            }
        });

        // botao para abrir recursos
        btnODS1 = findViewById(R.id.btnODS1);
        btnODS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS1 = new Intent( getApplicationContext(),ODS1Activity.class);
                startActivity( telaODS1);
            }
        });
        // ODS 2
        btnODS2 = findViewById(R.id.btnODS2);
        btnODS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS2 = new Intent( getApplicationContext(),ODS2Activity.class);
                startActivity(telaODS2);
            }
        });

        // ODS 3
        btnODS3 = findViewById(R.id.btnODS3);
        btnODS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS3 = new Intent( getApplicationContext(),ODS3Activity.class);
                startActivity(telaODS3);
            }
        });

        // ODS 4
        btnODS4 = findViewById(R.id.btnODS4);
        btnODS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS4 = new Intent( getApplicationContext(),ODS4Activity.class);
                startActivity(telaODS4);
            }
        });

        // ODS 5
        btnODS5 = findViewById(R.id.btnODS5);
        btnODS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS5 = new Intent( getApplicationContext(),ODS5Activity.class);
                startActivity(telaODS5);
            }
        });

        // ODS 6
        btnODS6 = findViewById(R.id.btnODS6);
        btnODS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS6 = new Intent( getApplicationContext(),ODS6Activity.class);
                startActivity(telaODS6);
            }
        });

        // ODS 7
        btnODS7 = findViewById(R.id.btnODS7);
        btnODS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS7 = new Intent( getApplicationContext(),ODS7Activity.class);
                startActivity(telaODS7);
            }
        });

        // ODS 8
        btnODS8 = findViewById(R.id.btnODS8);
        btnODS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS8 = new Intent( getApplicationContext(),ODS8Activity.class);
                startActivity(telaODS8);
            }
        });

        // ODS 9
        btnODS9 = findViewById(R.id.btnODS9);
        btnODS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS9 = new Intent( getApplicationContext(),ODS9Activity.class);
                startActivity(telaODS9);
            }
        });

        // ODS 10
        btnODS10 = findViewById(R.id.btnODS10);
        btnODS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS10 = new Intent( getApplicationContext(),ODS10Activity.class);
                startActivity(telaODS10);
            }
        });

        // ODS 11
        btnODS11 = findViewById(R.id.btnODS11);
        btnODS11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS11 = new Intent( getApplicationContext(),ODS11Activity.class);
                startActivity(telaODS11);
            }
        });

        // ODS 12
        btnODS12 = findViewById(R.id.btnODS12);
        btnODS12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS12 = new Intent( getApplicationContext(),ODS12Activity.class);
                startActivity(telaODS12);
            }
        });

        // ODS 13
        btnODS13 = findViewById(R.id.btnODS13);
        btnODS13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS13 = new Intent( getApplicationContext(),ODS13Activity.class);
                startActivity(telaODS13);
            }
        });

        // ODS 14
        btnODS14 = findViewById(R.id.btnODS14);
        btnODS14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS14 = new Intent( getApplicationContext(),ODS14Activity.class);
                startActivity(telaODS14);
            }
        });

        // ODS 15
        btnODS15 = findViewById(R.id.btnODS15);
        btnODS15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS15 = new Intent( getApplicationContext(),ODS15Activity.class);
                startActivity(telaODS15);
            }
        });

        // ODS 16
        btnODS16 = findViewById(R.id.btnODS16);
        btnODS16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS16 = new Intent( getApplicationContext(),ODS16Activity.class);
                startActivity(telaODS16);
            }
        });

        // ODS 17
        btnODS17 = findViewById(R.id.btnODS17);
        btnODS17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS17 = new Intent( getApplicationContext(),ODS17Activity.class);
                startActivity(telaODS17);
            }
        });

        // QUADRO
        btnQuadro = findViewById(R.id.btnQuadro);
        btnQuadro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaQuadro = new Intent( getApplicationContext(),QuadroActivity.class);
                startActivity(telaQuadro);
            }
        });

    }

}