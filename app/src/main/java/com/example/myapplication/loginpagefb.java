package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpagefb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpagefb);
        Button reg = findViewById(R.id.accbtn);
        reg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent  = new Intent(loginpagefb.this, Registeractivity.class);
                startActivity(intent);
            }
        });
    }
}