package com.example.leaningmergecode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        intent = new Intent(MainActivity.this, Profile.class);
        startActivity(intent);
        textView.setText("add some new text");
        for (int i=0; i<5; i++) {
            textView.setText("set text 5 from sophann_book_mark");
            textView.setText("add new line");
        }

        textView.setText("add new line");
    }
}