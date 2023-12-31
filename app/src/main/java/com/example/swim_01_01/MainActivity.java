package com.example.swim_01_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //https://www.tomaszx.pl/materialy/pum_lab1.pdf
    //Excercise 1: Geometry
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView square=(TextView)findViewById(R.id.squaretext);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), SquareActivity.class);
                startActivity(intent);
            }
        });

        TextView rectangle=(TextView)findViewById(R.id.rectangletext);
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), RectangleActivity.class);
                startActivity(intent);
            }
        });

        TextView circle=(TextView)findViewById(R.id.circletext);
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), CircleActivity.class);
                startActivity(intent);
            }
        });
    }
}

//Notes:
//alt+enter to import class
