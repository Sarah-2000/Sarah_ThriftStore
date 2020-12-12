package com.example.thriftstore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class order extends Home {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        LinearLayout lLayout = (LinearLayout) findViewById(R.id.ll); // Root ViewGroup in which you want to add textviews

        Bundle bundle = getIntent().getExtras();
        int count1=bundle.getInt("cnt1");
        int count2=bundle.getInt("cnt2");
        int count3=bundle.getInt("cnt3");
        int count4=bundle.getInt("cnt4");
        int count5=bundle.getInt("cnt5");
        int count6=bundle.getInt("cnt6");
        int count7=bundle.getInt("cnt7");
        int count8=bundle.getInt("cnt8");
        int p1=bundle.getInt("p1");
        int p2=bundle.getInt("p2");
        int p3=bundle.getInt("p3");
        int p4=bundle.getInt("p4");
        int p5=bundle.getInt("p5");
        int p6=bundle.getInt("p6");
        int p7=bundle.getInt("p7");
        int p8=bundle.getInt("p8");
       if(count1>0){
            TextView tblueshoes=new TextView(this);
            tblueshoes.setText("Blue Shoes Qty: "+count1+" Amount: "+p1*count1);
            lLayout.addView(tblueshoes);
        }
        if(count2>0){
            TextView tjacket=new TextView(this);
            tjacket.setText("Leather Jacket Qty: "+count2+" Amount: "+p2*count2);
            lLayout.addView(tjacket);
        }
        if(count3>0){
            TextView tjeans=new TextView(this);
            tjeans.setText("Jeans Qty: "+count3+" Amount: "+p3*count3);
            lLayout.addView(tjeans);
        }
        if(count4>0){
            TextView tbabyshoes=new TextView(this);
            tbabyshoes.setText("Baby Shoes Qty: "+count4+" Amount: "+p4*count4);
            lLayout.addView(tbabyshoes);
        }
        if(count5>0){
            TextView ttshirt=new TextView(this);
            ttshirt.setText("T Shirt Qty: "+count5+" Amount: "+p5*count5);
            lLayout.addView(ttshirt);
        }
        if(count6>0){
            TextView tshirt=new TextView(this);
            tshirt.setText("Shirt Qty: "+count6+" Amount: "+p6*count6);
            lLayout.addView(tshirt);
        }
        if(count7>0){
            TextView tbrownshoes=new TextView(this);
            tbrownshoes.setText("Brown Shoes Qty: "+count7+" Amount: "+p7*count7);
            lLayout.addView(tbrownshoes);
        }
        if(count8>0){
            TextView twedges=new TextView(this);
            twedges.setText("Wedges Qty: "+count8+" Amount: "+p8*count8);
            lLayout.addView(twedges);
        }
        int total=p1*count1+p2*count2+p3*count3+p4*count4+p5*count5+p6*count6+p7*count7+p8*count8;
        TextView t=new TextView(this);
        t.setText("Total: "+total);
        lLayout.addView(t);
    }
}
