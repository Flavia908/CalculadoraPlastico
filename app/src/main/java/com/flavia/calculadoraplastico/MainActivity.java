package com.flavia.calculadoraplastico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button multiplicar = (Button)findViewById(R.id.button);
        final EditText no1 = (EditText)findViewById(R.id.editText8);
        final EditText no2 = (EditText)findViewById(R.id.editText9);
        final TextView Resposta = (TextView)findViewById(R.id.textView2);
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resposta.setText(String.valueOf(Double.valueOf(String.valueOf(no1.getText()))*Double.valueOf(String.valueOf(no2.getText()))));
            }
        });
    }
}
