package com.example.swim_01_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        Button calculate = (Button)findViewById(R.id.circlecalculatebutton);
        EditText radiusinput = (EditText)findViewById(R.id.circleareainput);
        TextView area = (TextView)findViewById(R.id.circleareadisplay);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Double radius= Double.parseDouble(radiusinput.getText().toString());
                area.setText((Math.PI*(radius*radius))+"");
            }
        });
    }
}