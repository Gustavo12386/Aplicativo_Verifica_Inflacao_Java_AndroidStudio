package com.gustavo.primeiraplicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarResultado(View view){

        TextView texto = (TextView) findViewById(R.id.textResultado);
        int numero = new Random().nextInt(21);
        texto.setText("Percentual de inflação"+numero+"%");
    }
}