package com.example.leaningmergecode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    TextView textView;



    Button button;

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView.setText("hi");

        textView.setText("add some new text");
        for (int i=0; i<5; i++) {
            textView.setText("set text 5 from sophann_book_mark");
        }
    }
}