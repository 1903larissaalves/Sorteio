package com.estudos.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        sortearNumero();
    }

    private void sortearNumero(){
        Button sortearNumero = findViewById(R.id.sortearNumero);
        final TextView mostrarNumeroSorteado = findViewById(R.id.mostrarNumeroSorteado);
        final TextView textoNumeroSorteado = findViewById(R.id.textoNumeroSorteado);
        sortearNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = new Random().nextInt(101);
                textoNumeroSorteado.setText(String.valueOf(numero));
                mostrarNumeroSorteado.setText("Número sorteado é " + numero);
            }

        });
    }
}
