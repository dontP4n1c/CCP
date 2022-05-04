package com.example.exercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt1;
    private TextView txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView2);
    }

    public void MudarInstancia(View v){
        Button botao1 = findViewById(R.id.btnPrincipal);
        Button botao2 = findViewById(R.id.btnAuto);
        Button botao3 = findViewById(R.id.btnEmpresarial);
        Button botao4 = findViewById(R.id.btnPortateis);
        Button botao5 = findViewById(R.id.btnResidencial);
        Button botao6 = findViewById(R.id.btnViagem);

        botao1.setBackgroundColor(getResources().getColor(R.color.desativo));
        botao2.setBackgroundColor(getResources().getColor(R.color.desativo));
        botao3.setBackgroundColor(getResources().getColor(R.color.desativo));
        botao4.setBackgroundColor(getResources().getColor(R.color.desativo));
        botao5.setBackgroundColor(getResources().getColor(R.color.desativo));
        botao6.setBackgroundColor(getResources().getColor(R.color.desativo));

        v.setBackgroundColor(getResources().getColor(R.color.Ativo));

        int id = v.getId();
        if(id == R.id.btnPrincipal){
            txt1.setText("RGM: 19023693");
            txt2.setText("Marcelo Henrique");
        }
        else if(id == R.id.btnAuto){
            txt1.setText("Auto");
            txt2.setText("");
        }
        else if(id == R.id.btnPortateis){
            txt1.setText("Portateis");
            txt2.setText("");
        }
        else if(id == R.id.btnEmpresarial){
            txt1.setText("Empresarial");
            txt2.setText("");
        }
        else if(id == R.id.btnResidencial){
            txt1.setText("Residencial");
            txt2.setText("");
        }
        else if(id == R.id.btnViagem){
            txt1.setText("Viagem");
            txt2.setText("");
        }
    }
}