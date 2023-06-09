package com.example.pmo1_exercise11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_sum,btn_subtract,btn_division,btn_multiplication;//btn_sum=suma, btn_subtract=restar, btn_multiplication=multiplicacion
    public EditText txt_number1,txt_number2;//number=numero
    public Double number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sum=(Button) findViewById(R.id.btn_sum);
        btn_subtract=(Button) findViewById(R.id.btn_subtract);
        btn_division=(Button) findViewById(R.id.btn_division);
        btn_multiplication=(Button) findViewById(R.id.btn_multiplication);

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(initialize()==true){
                    Math math_operation=new Math(number1,number2,1);
                    Intent new_window=new Intent(getApplicationContext(), Activity_Message.class);//new_window=nueva ventana
                    startActivity(new_window);
                }
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(initialize()==true){
                    Math math_operation=new Math(number1,number2,2);
                    Intent new_window=new Intent(getApplicationContext(), Activity_Message.class);//new_window=nueva ventana
                    startActivity(new_window);
                }
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(initialize()==true){
                    if(number2!=0){
                        Math math_operation=new Math(number1,number2,3);
                        Intent new_window=new Intent(getApplicationContext(), Activity_Message.class);//new_window=nueva ventana
                        startActivity(new_window);
                    }else{
                        Toast.makeText(getApplicationContext(),"Error: no se puede dividir entre 0",Toast.LENGTH_LONG).show();
                    }

                }
            }

        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(initialize()==true){
                    Math math_operation=new Math(number1,number2,4);
                    Intent new_window=new Intent(getApplicationContext(), Activity_Message.class);//new_window=nueva ventana
                    startActivity(new_window);
                }
            }
        });
    }

    public boolean initialize() {//initialize=inicializar
        txt_number1 = (EditText) findViewById(R.id.txt_number1);
        txt_number2 = (EditText) findViewById(R.id.txt_number2);

        if (txt_number1.getText().toString().equals("") || txt_number2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "No dejar campos vacios", Toast.LENGTH_LONG).show();
            return false;
        } else {
            number1 = Double.parseDouble(txt_number1.getText().toString());
            number2 = Double.parseDouble(txt_number2.getText().toString());
            return true;
        }
    }
}