package com.example.thriftstore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;

import static android.widget.RelativeLayout.ABOVE;
import static android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM;
import static android.widget.RelativeLayout.BELOW;
import static android.widget.RelativeLayout.CENTER_HORIZONTAL;
import static android.widget.RelativeLayout.RIGHT_OF;
import static com.example.thriftstore.R.id.BOTTOM_END;
import static com.example.thriftstore.R.id.btnconfirmOrder;
import static com.example.thriftstore.R.id.inpadd;
import static com.example.thriftstore.R.id.ll;

public class order extends Home {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        LinearLayout lLayout = (LinearLayout) findViewById(ll); // Root ViewGroup in which you want to add textviews
        LinearLayout lLayout2 = (LinearLayout) findViewById(R.id.ll2); // Root ViewGroup in which you want to add textviews
        Bundle bundle = getIntent().getExtras();
        int count1 = bundle.getInt("cnt1");
        int count2 = bundle.getInt("cnt2");
        int count3 = bundle.getInt("cnt3");
        int count4 = bundle.getInt("cnt4");
        int count5 = bundle.getInt("cnt5");
        int count6 = bundle.getInt("cnt6");
        int count7 = bundle.getInt("cnt7");
        int count8 = bundle.getInt("cnt8");
        int p1 = bundle.getInt("p1");
        int p2 = bundle.getInt("p2");
        int p3 = bundle.getInt("p3");
        int p4 = bundle.getInt("p4");
        int p5 = bundle.getInt("p5");
        int p6 = bundle.getInt("p6");
        int p7 = bundle.getInt("p7");
        int p8 = bundle.getInt("p8");
        if (count1 > 0) {
            TextView tblueshoes = new TextView(this);
            tblueshoes.setText("Blue Shoes");
            lLayout.addView(tblueshoes);
            TextView tblueshoesamt = new TextView(this);
            tblueshoesamt.setText("Qty: " + count1 + " Amount: " + p1 * count1);
            lLayout2.addView(tblueshoesamt);
        }
        if (count2 > 0) {
            TextView tjacket = new TextView(this);
            tjacket.setText("Leather Jacket ");
            lLayout.addView(tjacket);
            TextView tjacketamt = new TextView(this);
            tjacketamt.setText("Qty: " + count2 + " Amount: " + p2 * count2);
            lLayout2.addView(tjacketamt);
        }
        if (count3 > 0) {
            TextView tjeans = new TextView(this);
            tjeans.setText("Jeans ");
            lLayout.addView(tjeans);
            TextView tjeansamt = new TextView(this);
            tjeansamt.setText("Qty: " + count3 + " Amount: " + p3 * count3);
            lLayout2.addView(tjeansamt);
        }
        if (count4 > 0) {
            TextView tbabyshoes = new TextView(this);
            tbabyshoes.setText("Baby Shoes");
            lLayout.addView(tbabyshoes);
            TextView tbabyshoesamt = new TextView(this);
            tbabyshoesamt.setText("Qty: " + count4 + " Amount: " + p4 * count4);
            lLayout2.addView(tbabyshoesamt);
        }
        if (count5 > 0) {
            TextView ttshirt = new TextView(this);
            ttshirt.setText("T Shirt");
            lLayout.addView(ttshirt);
            TextView ttshirtamt = new TextView(this);
            ttshirtamt.setText("Qty: " + count5 + " Amount: " + p5 * count5);
            lLayout2.addView(ttshirtamt);
        }
        if (count6 > 0) {
            TextView tshirt = new TextView(this);
            tshirt.setText("Shirt");
            lLayout.addView(tshirt);
            TextView tshirtamt = new TextView(this);
            tshirtamt.setText("Qty: " + count6 + " Amount: " + p6 * count6);
            lLayout2.addView(tshirtamt);
        }
        if (count7 > 0) {
            TextView tbrownshoes = new TextView(this);
            tbrownshoes.setText("Brown Shoes");
            lLayout.addView(tbrownshoes);
            TextView tbrownshoesamt = new TextView(this);
            tbrownshoesamt.setText("Qty: " + count7 + " Amount: " + p7 * count7);
            lLayout2.addView(tbrownshoesamt);
        }
        if (count8 > 0) {
            TextView twedges = new TextView(this);
            twedges.setText("Wedges");
            lLayout.addView(twedges);

            TextView twedgesamt = new TextView(this);
            twedgesamt.setText("Qty: " + count8 + " Amount: " + p8 * count8);
            lLayout2.addView(twedgesamt);
        }

        RelativeLayout rl = findViewById(R.id.rl);
        int total = p1 * count1 + p2 * count2 + p3 * count3 + p4 * count4 + p5 * count5 + p6 * count6 + p7 * count7 + p8 * count8;
        TextView t = new TextView(this);
        RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(ABOVE,btnconfirmOrder);

        params.addRule(RelativeLayout.CENTER_HORIZONTAL);



        t.setLayoutParams(params);

        t.setText("Total: " + total);
        rl.addView(t);
        Button btnconfirmOrder=findViewById(R.id.btnconfirmOrder);
        btnconfirmOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(total==0){btnconfirmOrder.setEnabled(false);}
                else {
                    Toast.makeText(order.this, "Your order has been placed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
