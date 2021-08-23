package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String perguntaAtual;
    String respostaAtual;
    int contR = 0;
    int contP = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atualizaPerguntas();
    }
    public void atualizaPerguntas(){
        TextView pergunta = (TextView) findViewById(R.id.pergunta);
        String pergunta1 = "Quem descobriu o Brasil?";
        String pergunta2 = "Deve-se confiar nos quadrados?";
        String pergunta3 = "O que o sapo foi fazer no PC?";
        String resposta1 = "indios";
        String resposta2 = "sim";
        String resposta3 = "acessar a ram";

        if(contP == 1){
            perguntaAtual = pergunta1;
            respostaAtual = resposta1;
        }
        else if(contP == 2){
            perguntaAtual = pergunta2;
            respostaAtual = resposta2;
        }
        else if(contP == 3){
            perguntaAtual = pergunta3;
            respostaAtual = resposta3;
        }
        else{
            resultado.texto = "Você acertou "+contR+" questões!";
            Intent i = new Intent(this, resultado.class);
            startActivity(i);
            contP = 1;
            contR = 0;
            atualizaPerguntas();
        }
        pergunta.setText(perguntaAtual);
    }

    public void responder(View view){
        EditText resposta = (EditText) findViewById(R.id.resposta);
        String respostaUsuario = resposta.getText().toString();
        if(respostaUsuario.equals(respostaAtual)){
            contR++;
            Toast.makeText(MainActivity.this, "Você acertou!",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Você errou!",Toast.LENGTH_LONG).show();
        }
        contP++;
        atualizaPerguntas();
        resposta.setText(null);
    }
}





package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class resultados extends AppCompatActivity {
      static String texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
    }
}