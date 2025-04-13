package com.example.loginpage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);

        //TextView titulo = findViewById(R.id.textView);

        Button ok = findViewById(R.id.button);
        EditText nome = findViewById(R.id.editTextText3);
        EditText senha = findViewById(R.id.editTextText4);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = nome.getText().toString();
                String senhaDigitada = senha.getText().toString();

                if (usuario.equals("admin") && senhaDigitada.equals("admin")) {
                    String mensagem = "Login efetuado com sucesso\nUsuário: " + usuario + "\nSenha: " + senhaDigitada;
                    Toast.makeText(LoginActivity.this, mensagem, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show();}

            }
        });
    }
}
