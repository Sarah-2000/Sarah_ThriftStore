package com.example.thriftstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends MainActivity {
    Button btnorder,btndonate;
    private ImageButton bp1,bp2,bp3,bp4,bp5,bp6,bp7,bp8,bm1,bm2,bm3,bm4,bm5,bm6,bm7,bm8;
    private TextView c1,c2,c3,c4,c5,c6,c7,c8;
    protected int p1;
    private int p2;
    private int p3;
    private int p4;
    private int p5;
    private int p6;
    private int p7;
    private int p8;
    private TextView costblueshoes,costbrownshoes,costbabyshoes,costjeans,costjacket,costwedges,costtshirt,costshirt;
    public int count1=0;
    private int count2=0;
    private int count3=0;
    private int count4=0;
    private int count5=0;
    private int count6=0;
    private int count7=0;
    private int count8=0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.abtus:
                Intent intent2=new Intent(Home.this,About.class);
                startActivity(intent2);
                return true;
            case R.id.cart:
                Intent intent=new Intent(Home.this,order.class);

                Bundle bundle=new Bundle();
                bundle.putInt("cnt1",count1);
                bundle.putInt("cnt2",count2);
                bundle.putInt("cnt3",count3);
                bundle.putInt("cnt4",count4);
                bundle.putInt("cnt5",count5);
                bundle.putInt("cnt6",count6);
                bundle.putInt("cnt7",count7);
                bundle.putInt("cnt8",count8);
                bundle.putInt("p1",p1);
                bundle.putInt("p2",p2);
                bundle.putInt("p3",p3);
                bundle.putInt("p4",p4);
                bundle.putInt("p5",p5);
                bundle.putInt("p6",p6);
                bundle.putInt("p7",p7);
                bundle.putInt("p8",p8);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case R.id.donateitm:
                Intent intent1=new Intent(Home.this,Donate.class);
                startActivity(intent1);
                return true;
            case R.id.signout:
                signOut();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        costblueshoes=findViewById(R.id.costblueshoes);
        costbabyshoes=findViewById(R.id.costbabyshoes);
        costbrownshoes=findViewById(R.id.costbrownshoes);
        costjeans=findViewById(R.id.costjeans);
        costjacket=findViewById(R.id.costjacket);
        costshirt=findViewById(R.id.costshirt);
        costtshirt=findViewById(R.id.costtshirt);
        costwedges=findViewById(R.id.costwedges);
        bp1=(ImageButton)findViewById(R.id.add1);
        bp2=(ImageButton)findViewById(R.id.add2);
        bp3=(ImageButton)findViewById(R.id.add3);
        bp4=(ImageButton)findViewById(R.id.add4);
        bp5=(ImageButton)findViewById(R.id.add5);
        bp6=(ImageButton)findViewById(R.id.add6);
        bp7=(ImageButton)findViewById(R.id.add7);
        bp8=(ImageButton)findViewById(R.id.add8);
        p1=199;
        p2=399;
        p3=399;
        p4=299;
        p5=199;
        p6=199;
        p7=499;
        p8=299;
        costblueshoes.setText("₹ "+p1);
        costjacket.setText("₹"+p2);
        costjeans.setText("₹"+p3);
        costbabyshoes.setText("₹"+p4);
        costtshirt.setText("₹"+p5);
        costshirt.setText("₹"+p6);
        costbrownshoes.setText("₹"+p7);
        costwedges.setText("₹"+p8);
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

    }
}