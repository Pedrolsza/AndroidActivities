package com.example.questoesalunos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup grupoPergunta1, grupoPergunta2;
    Button finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupoPergunta1 = findViewById(R.id.grupoPergunta1);
        grupoPergunta2 = findViewById(R.id.grupoPergunta2);
        finalizar = findViewById(R.id.button);

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int acertos = 0;

                int selected1 = grupoPergunta1.getCheckedRadioButtonId();
                if (selected1 == R.id.radioButton4) {
                    acertos++;
                }

                int selected2 = grupoPergunta2.getCheckedRadioButtonId();
                if (selected2 == R.id.radioButton8){
                    acertos++;
                }

                int nota = acertos * 5;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nota", nota);
                startActivity(intent);
            }
        });

    }
}