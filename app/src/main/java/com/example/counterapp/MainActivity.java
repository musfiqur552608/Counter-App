package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counttxt;
    private Button countbtn;

    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counttxt = findViewById(R.id.counttxt);
        countbtn = findViewById(R.id.countbtn);

        countbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counttxt.setText(""+ counting());
            }
        });

    }
    public int counting(){
       return ++count;
    }
}