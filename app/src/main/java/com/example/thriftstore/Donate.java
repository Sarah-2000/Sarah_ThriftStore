package com.example.thriftstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Donate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        Button donate = findViewById(R.id.btnconfirmdonate);
        Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{"Shoes", "Clothes", "Bags", "Jewellery", "Kids wear"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(Donate.this, "Thank you for donating!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}