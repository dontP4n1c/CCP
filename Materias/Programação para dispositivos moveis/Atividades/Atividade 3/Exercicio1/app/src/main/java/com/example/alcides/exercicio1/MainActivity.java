package com.example.alcides.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText value1;
    private EditText value2;
    private TextView res1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.lblValue1);
        value2 = findViewById(R.id.lblValue2);

        res1 = findViewById(R.id.lblRes1);
    }

    public void Somar(View v){
        float v1 = Float.parseFloat(value1.getText().toString());
        float v2 = Float.parseFloat(value2.getText().toString());

        res1.setText("Resultado: "+(v1 + v2));
    }

    public void Subtrair(View v){
        float v1 = Float.parseFloat(value1.getText().toString());
        float v2 = Float.parseFloat(value2.getText().toString());

        res1.setText("Resultado: "+(v1 - v2));
    }

    public void Divisão(View v){
        float v1 = Float.parseFloat(value1.getText().toString());
        float v2 = Float.parseFloat(value2.getText().toString());

        res1.setText("Resultado: "+(v1 / v2));
    }

    public void Multiplicacao(View v){
        float v1 = Float.parseFloat(value1.getText().toString());
        float v2 = Float.parseFloat(value2.getText().toString());

        res1.setText("Resultado: "+(v1 * v2));
    }
}
