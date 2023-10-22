package com.example.swim_01_01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RectangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        Button calculate = (Button)findViewById(R.id.rectanglecalculatebutton);
        EditText sideinputa = (EditText)findViewById(R.id.rectangleareainputa);
        EditText sideinputb = (EditText)findViewById(R.id.rectangleareainputb);
        TextView area = (TextView)findViewById(R.id.rectangleareadisplay);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                /* Display content of field as toast
                Toast.makeText(getApplicationContext(), side.getText().toString(), Toast.LENGTH_SHORT).show();
                 */
                Double sidea= Double.parseDouble(sideinputa.getText().toString());
                Double sideb= Double.parseDouble(sideinputb.getText().toString());
                area.setText((sidea*sideb)+"");
            }
        });
    }
}