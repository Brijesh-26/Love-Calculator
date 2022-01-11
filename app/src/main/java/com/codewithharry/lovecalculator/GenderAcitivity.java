package com.codewithharry.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GenderAcitivity extends AppCompatActivity {
    ImageView imageView_man, imageView_woman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_acitivity);

        imageView_man= findViewById(R.id.man);
        imageView_woman= findViewById(R.id.woman);

        imageView_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GenderAcitivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imageView_woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GenderAcitivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}