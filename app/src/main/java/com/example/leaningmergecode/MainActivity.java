package com.example.leaningmergecode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    TextView textView;



    Button button;
    Intent intent;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView.setText("hi");


        intent = new Intent(MainActivity.this, Profile.class);
        startActivity(intent);
    }
}