package com.example.austsimplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView carsList;
    String[] carsArr = {"Kia","BMW", "Toyota", "Volvo", "Tesla", "Honda", "Mercedes", "Saab", "Rover"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carsList = findViewById(R.id.lvCars);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_view_item, carsArr);
        carsList.setAdapter(adapter);

        carsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked on: "+ position, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("POSITION", position);
                startActivity(i);
            }
        });
    }
}