package com.example.thriftstore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
        for (int i = 0; i < 5; i++) {
            TextView tv = new TextView(this); // Prepare textview object programmatically
            tv.setText("Dynamic TextView" + i);
            tv.setId(i + 5);
            lLayout.addView(tv); // Add to your ViewGroup using this method
        }
        Toast.makeText(this, "count1 value: "+count1, Toast.LENGTH_SHORT).show();
        if(count1==0){
            TextView tblueshoes=new TextView(this);
            tblueshoes.setText("Blue Shoes Qty:");
            lLayout.addView(tblueshoes);
        }
    }
}
