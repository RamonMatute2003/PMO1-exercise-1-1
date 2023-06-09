package com.example.pmo1_exercise11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Message extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        EditText result=findViewById(R.id.txt_result);
        Math math=new Math();
        result.setText(math.show_result());
    }
}