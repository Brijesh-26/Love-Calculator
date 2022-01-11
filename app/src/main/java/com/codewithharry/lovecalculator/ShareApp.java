package com.codewithharry.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ShareApp extends AppCompatActivity {

    TextView textView;
    
    LinearLayout linearLayout_share, linear_layout_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_app);

        textView= findViewById(R.id.heart);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ShareApp.this, GenderAcitivity.class);
                startActivity(intent);
            }
        });
        
        linearLayout_share= findViewById(R.id.share_linear_layout);
        linear_layout_rate= findViewById(R.id.linear_layout_rate);
        
        linear_layout_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShareApp.this, "feature will be available after uploading it on playstore", Toast.LENGTH_SHORT).show();
            }
        });
        linearLayout_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShareApp.this, "after uploading on playstore you can share the app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}