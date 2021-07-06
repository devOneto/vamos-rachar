package com.example.vamos_rachar_pdm_2021_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRachar;
    EditText quantidadePessoas;
    EditText valorConta;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantidadePessoas = (EditText) findViewById(R.id.quantidadePessoas);
        valorConta = (EditText) findViewById(R.id.valorDaConta);
        resultado = (TextView) findViewById(R.id.resultado);

        btnRachar = (Button) findViewById(R.id.btnRachar);
        btnRachar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if(v==btnRachar){
            double a = Double.parseDouble( valorConta.getText().toString() );
            int b = Integer.parseInt( quantidadePessoas.getText().toString() );
            double result =  a / b ;
            resultado.setText( String.valueOf(result) );
        }
    }
}