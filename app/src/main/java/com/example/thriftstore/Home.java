package com.example.thriftstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    Button btnorder,btndonate;
    private ImageButton bp1,bp2,bp3,bp4,bp5,bp6,bp7,bp8,bm1,bm2,bm3,bm4,bm5,bm6,bm7,bm8;
    private TextView c1,c2,c3,c4,c5,c6,c7,c8;
    private int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bp1=(ImageButton)findViewById(R.id.add1);
        bp2=(ImageButton)findViewById(R.id.add2);
        bp3=(ImageButton)findViewById(R.id.add3);
        bp4=(ImageButton)findViewById(R.id.add4);
        bp5=(ImageButton)findViewById(R.id.add5);
        bp6=(ImageButton)findViewById(R.id.add6);
        bp7=(ImageButton)findViewById(R.id.add7);
        bp8=(ImageButton)findViewById(R.id.add8);

        bm1=(ImageButton)findViewById(R.id.minus1);
        bm2=(ImageButton)findViewById(R.id.minus2);
        bm3=(ImageButton)findViewById(R.id.minus3);
        bm4=(ImageButton)findViewById(R.id.minus4);
        bm5=(ImageButton)findViewById(R.id.minus5);
        bm6=(ImageButton)findViewById(R.id.minus6);
        bm7=(ImageButton)findViewById(R.id.minus7);
        bm8=(ImageButton)findViewById(R.id.minus8);

        c1=(TextView)findViewById(R.id.number1);
        c2=(TextView)findViewById(R.id.number2);
        c3=(TextView)findViewById(R.id.number3);
        c4=(TextView)findViewById(R.id.number4);
        c5=(TextView)findViewById(R.id.number5);
        c6=(TextView)findViewById(R.id.number6);
        c7=(TextView)findViewById(R.id.number7);
        c8=(TextView)findViewById(R.id.number8);

        bm1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count1>0){
                count1--;
                c1.setText(String.valueOf(count1));}
            }
        });
        bm2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count2>0){
                count2--;
                c2.setText(String.valueOf(count2));}
            }
        });
        bm3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count3>0){
                count3--;
                c3.setText(String.valueOf(count3));}
            }
        });
        bm4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count4>0){
                count4--;
                c4.setText(String.valueOf(count4));}
            }
        });
        bm5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count5>0){
                count5--;
                c5.setText(String.valueOf(count5));}
            }
        });
        bm6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count6>0){
                count6--;
                c6.setText(String.valueOf(count6));}
            }
        });
        bm7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count7>0){
                count7--;
                c7.setText(String.valueOf(count7));}
            }
        });
        bm8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(count8>0){
                count8--;
                c8.setText(String.valueOf(count8));}
            }
        });

        bp1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count1++;
                c1.setText(String.valueOf(count1));
            }
        });
        bp2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count2++;
                c2.setText(String.valueOf(count2));
            }
        });
        bp3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count3++;
                c3.setText(String.valueOf(count3));
            }
        });
        bp4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count4++;
                c4.setText(String.valueOf(count4));
            }
        });
        bp5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count5++;
                c5.setText(String.valueOf(count5));
            }
        });
        bp6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count6++;
                c6.setText(String.valueOf(count6));
            }
        });
        bp7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count7++;
                c7.setText(String.valueOf(count7));
            }
        });
        bp8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                count8++;
                c8.setText(String.valueOf(count8));
            }
        });

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