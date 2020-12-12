package com.example.thriftstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button btnorder,btndonate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnorder=findViewById(R.id.btnorder);
        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,order.class);
                startActivity(intent);
            }
        });
        btndonate=findViewById(R.id.btndonate);
        btndonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Donate.class);
                startActivity(intent);
            }
        });
    }
}