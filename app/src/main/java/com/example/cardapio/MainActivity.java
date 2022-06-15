package com.example.cardapio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox checkpc, checkpsv, checkrefri, checkbrownie;
    RadioButton radioavista, radio2x, radio3x;
    TextView mostratotal, mostrasub;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //escondendo a barra
        getSupportActionBar().hide();

        //instanciando as opções
        checkpc = (CheckBox) findViewById(R.id.checkpc);
        checkpsv = (CheckBox) findViewById(R.id.checkpsv);
        checkrefri = (CheckBox) findViewById(R.id.checkrefri);
        checkbrownie = (CheckBox) findViewById(R.id.checkbrownie);
        //instanciando o pagamento
        radioavista = (RadioButton) findViewById(R.id.radioavista);
        radio2x = (RadioButton) findViewById(R.id.radio2x);
        radio3x = (RadioButton) findViewById(R.id.radio3x);
        //instanciando o botão
        Button botao = (Button) findViewById(R.id.botao);
        //instanciando o texto total e subtotal
        mostratotal = (TextView) findViewById(R.id.mostratotal);
        mostrasub = (TextView) findViewById(R.id.mostrasub);



        //action do botão
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;
                if (checkpc.isChecked())
                    total += 10.00;
                if (checkpsv.isChecked())
                    total += 8.00;
                if (checkrefri.isChecked())
                    total += 5.00;
                if (checkbrownie.isChecked())
                    total += 6.00;

                double avista = 0.10;
                double taxa = 0.05;

                if (radioavista.isChecked())
                    total -= total * avista;
                if (radio3x.isChecked())
                    total += total * taxa;


                TextView texto=findViewById(R.id.mostratotal);
                texto.setText("valor total: R$"+total);}

        });

        mostrasub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double subtotal = 0;
                double avista = 0.10;
                double taxa = 0.05;


                if (radioavista.isChecked())
                    subtotal -= subtotal * avista;
                if (radio3x.isChecked())
                    subtotal += subtotal * taxa;



                if (checkpc.isChecked())
                    subtotal += 10.00;
                TextView texto=findViewById(R.id.mostrasub);
                texto.setText("subtotal: R$"+subtotal);
                if (radioavista.isChecked())
                    subtotal -= subtotal * avista;
                if (radio3x.isChecked())
                    subtotal += subtotal * taxa;

                if (checkpsv.isChecked())
                    subtotal += 8.00;
                TextView texto2=findViewById(R.id.mostrasub);
                texto2.setText("subtotal: R$"+subtotal);
                if (radioavista.isChecked())
                    subtotal -= subtotal * avista;
                if (radio3x.isChecked())
                    subtotal += subtotal * taxa;


                if (checkrefri.isChecked())
                    subtotal += 5.00;
                TextView texto3=findViewById(R.id.mostrasub);
                texto3.setText("subtotal: R$"+subtotal);
                if (radioavista.isChecked())
                    subtotal -= subtotal * avista;
                if (radio3x.isChecked())
                    subtotal += subtotal * taxa;


                if (checkbrownie.isChecked())
                    subtotal += 6.00;
                TextView texto4=findViewById(R.id.mostrasub);
                texto4.setText("subtotal: R$"+subtotal);
                if (radioavista.isChecked())
                    subtotal -= subtotal * avista;
                if (radio3x.isChecked())
                    subtotal += subtotal * taxa;

            }


        });



    }
}