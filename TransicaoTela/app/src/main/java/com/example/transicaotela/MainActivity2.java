package com.example.transicaotela;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Resultado = findViewById(R.id.textView);

        String nome = getIntent().getStringExtra("nome");
        String matricula = getIntent().getStringExtra("matricula");
        float media = getIntent().getFloatExtra("media", 0);

        String mensagem = "Bem vindo aluno: " + nome + " - Matricula: " + matricula + "\nSua nota final eh: " + media;

        Resultado.setText(mensagem);

    }
}