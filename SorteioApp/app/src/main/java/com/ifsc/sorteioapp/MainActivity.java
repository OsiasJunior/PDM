package com.ifsc.sorteioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    EditText edInicial, edFinal;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edInicial=findViewById(R.id.editTextVInicial);
        edFinal=findViewById(R.id.editTextVFinal);
        textView=findViewById(R.id.textViewValorSorteado);

    }

    public void sorteioNumero(View view){
        int vInicial=0,VFinal=0;
        vInicial=Integer.parseInt(edInicial.getText().toString());
        VFinal=Integer.parseInt(edFinal.getText().toString());
        int numeroSorteado= new Random().nextInt((VFinal-vInicial))+1+vInicial;
        Log.i("ValorRandom", Integer.toString(numeroSorteado));
        textView.setText(Integer.toString(numeroSorteado));


    }


}