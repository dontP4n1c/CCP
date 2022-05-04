package com.example.alcides.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
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

    public void fazerConta(View v){
        float v1 = Float.parseFloat(value1.getText().toString());
        float v2 = Float.parseFloat(value2.getText().toString());

        int tipoConta = ((RadioGroup) findViewById(R.id.tipoConta)).getCheckedRadioButtonId();
        if(tipoConta == R.id.Somar){
            res1.setText("Resultado:" + (v1 + v2));
        }
        else if(tipoConta == R.id.Subtrair){
            res1.setText("Resultado:" + (v1 - v2));
        }
        else if(tipoConta == R.id.Multiplicar){
            res1.setText("Resultado:" + (v1 * v2));
        }
        else{
            res1.setText("Resultado:" + (v1 / v2));
        }
    }
}
