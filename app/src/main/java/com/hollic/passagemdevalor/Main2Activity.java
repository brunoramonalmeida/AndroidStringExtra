package com.hollic.passagemdevalor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = findViewById(R.id.texto);

        Intent i = getIntent();
        if (i.hasExtra("x")) {
            texto.setText(i.getStringExtra("x"));
        }
    }
}
