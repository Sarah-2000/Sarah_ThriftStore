package com.example.thriftstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int count=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        //Info=(TextView)findViewById(R.id.tvInfo);
        Login=(Button)findViewById(R.id.btnLogin);
        //Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });
    }
    private void validate(String userName,String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("Admin"))){
            Intent intent=new Intent(MainActivity.this,Home.class);
            startActivity(intent);
        }else{
            count--;
            //Info.setText();
            Toast.makeText(this, "No of attempts remaining: "+String.valueOf(count), Toast.LENGTH_SHORT).show();
            if(count==0){
                Login.setEnabled(false);
            }
        }
    }
}