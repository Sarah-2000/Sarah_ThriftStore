package com.example.thriftstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
    private EditText etEmail;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button Register;
    private int count=5;
    private static final String TAG = "EmailPassword";

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Context mycontext;
//        Toast toast=new Toast(mycontext);
//        ImageView view=new ImageView(mycontext);
//        view.setImageResource(R.drawable.mainicon);
//        toast.setView(view);
//        toast.show();



        mAuth = FirebaseAuth.getInstance();

        setContentView(R.layout.activity_main);
        etEmail=(EditText)findViewById(R.id.etemail);
        Password=(EditText)findViewById(R.id.etPassword);
        //Info=(TextView)findViewById(R.id.tvInfo);
        Login=(Button)findViewById(R.id.btnLogin);
        Register=(Button)findViewById(R.id.register);
        //Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                signIn(etEmail.getText().toString(),Password.getText().toString());
            }
        });
        Register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                createAccount(etEmail.getText().toString(),Password.getText().toString());
            }
        });



    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.

        FirebaseUser currentUser = mAuth.getCurrentUser();

    }
    /*private void validate(String userName,String userPassword){
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
    }*/

    private void createAccount(String email, String password) {
        Log.d(TAG, "createAccount:" + email);

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(MainActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }
    private void signIn(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            Intent intent=new Intent(MainActivity.this,Home.class);
                            startActivity(intent);
                            FirebaseUser user = mAuth.getCurrentUser();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(MainActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }
}