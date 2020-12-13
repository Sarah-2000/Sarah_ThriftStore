package com.example.thriftstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int count=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Context mycontext;
        Toast toast=new Toast(mycontext);
        ImageView view=new ImageView(mycontext);
        view.setImageResource(R.drawable.mainicon);
        toast.setView(view);
        toast.show();

        setContentView(R.layout.activity_main);
        etEmail=(EditText)findViewById(R.id.etemail);
        Password=(EditText)findViewById(R.id.etPassword);
        //Info=(TextView)findViewById(R.id.tvInfo);
        Login=(Button)findViewById(R.id.btnLogin);
        //Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                validate(etEmail.getText().toString(),Password.getText().toString());
            }
        });
    }
    private void validate(String userName,String userPassword){
        if((userName.equals("admin@admin")) && (userPassword.equals("Admin"))){
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