package com.hollic.passagemdevalor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText campo;
    String frase;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.botao);
        campo = findViewById(R.id.frase);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frase = campo.getText().toString();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("x",frase);
                startActivity(i);
            }
        });
    }
}
