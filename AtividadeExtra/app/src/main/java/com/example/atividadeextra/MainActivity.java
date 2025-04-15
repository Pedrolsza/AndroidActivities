package com.example.atividadeextra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText resposta1, resposta2;
    Button finalizarProva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resposta1 = findViewById(R.id.editTextText);
        resposta2 = findViewById(R.id.editTextText2);
        finalizarProva = findViewById(R.id.button);

        finalizarProva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r1 = resposta1.getText().toString().trim().toLowerCase();
                String r2 = resposta2.getText().toString().trim().toLowerCase();

                int nota = 0;

                if (r1.equals("certo")) nota += 5;
                if (r2.equals("certo")) nota += 5;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nota", nota);
                startActivity(intent);
            }
        });

    }
}