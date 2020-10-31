package com.example.mythirdapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        message=(EditText)findViewById(R.id.editTextTextPersonName);
        Intent mainActCall=getIntent();

    }

    public void submit(View view) {
        Intent callMainAct=new Intent(getApplicationContext(),MainActivity.class);
        callMainAct.putExtra("message",message.getText().toString());
        startActivity(callMainAct);
    }
}