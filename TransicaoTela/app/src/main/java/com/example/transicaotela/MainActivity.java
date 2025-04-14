package com.example.transicaotela;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText Matricula = findViewById(R.id.editTextText);
        EditText Nome = findViewById(R.id.editTextText2);
        EditText Nota1 = findViewById(R.id.editTextText3);
        EditText Nota2 = findViewById(R.id.editTextText4);
        Button Calcular = findViewById(R.id.button);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricula = Matricula.getText().toString();
                String nome = Nome.getText().toString();
                String nota1 = Nota1.getText().toString();
                String nota2 = Nota2.getText().toString();

                float n1 = Float.parseFloat(nota1);
                float n2 = Float.parseFloat(nota2);

                float media = (n1 * 0.4f) + (n2 * 0.6f);

// Cria a intent e envia os dados para a nova activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nome", nome);
                intent.putExtra("matricula", matricula);
                intent.putExtra("media", media);
                startActivity(intent);

            }

        });
    }
}