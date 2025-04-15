package com.example.questoesalunos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resultado = findViewById(R.id.textView3);

        int nota = getIntent().getIntExtra("nota", 0);

        String mensagem;
        if (nota == 10) {
         mensagem = "Parabens, voce tirou nota 10";
        } else if (nota  == 5) {
            mensagem = "Voce tirou nota 5";
        } else {
            mensagem = "Voce errou as duas questoes, sua nota eh zero";
        }

        Resultado.setText(mensagem);

    }
}