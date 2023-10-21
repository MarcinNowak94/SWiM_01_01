package com.example.swim_01_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SquareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        Button calculate = (Button)findViewById(R.id.squarecalculatebutton);
        EditText sideinput = (EditText)findViewById(R.id.squareareainput);
        TextView area = (TextView)findViewById(R.id.squareareadisplay);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                /* Display content of field as toast
                Toast.makeText(getApplicationContext(), side.getText().toString(), Toast.LENGTH_SHORT).show();
                 */
                Double side= Double.parseDouble(sideinput.getText().toString());
                area.setText((side*side)+"");
            }
        });

    }
}