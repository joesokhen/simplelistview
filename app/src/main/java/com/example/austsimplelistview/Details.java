package com.example.austsimplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    TextView details;
    Data d = new Data();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        details = findViewById(R.id.tvDetails);
        Intent intent = getIntent();
        int p = intent.getIntExtra("POSITION", 0);
        details.setText("Car Details: "+d.carsDetailsArr[p]);
//        or simply use the below code
//        details.setText(i.getStringExtra("POSITION"));
    }
}