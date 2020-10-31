package com.example.mythirdapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message=(TextView)findViewById(R.id.textView);
        Intent mainActCall=getIntent();
        String messageText=mainActCall.getStringExtra("message");
        message.setText(messageText);
    }

    public void getMessage(View view) {
        Intent callSecAct=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(callSecAct);
    }
}