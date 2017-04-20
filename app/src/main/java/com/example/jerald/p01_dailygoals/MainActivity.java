package com.example.jerald.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // Get the RadioGroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radioGroup);
                RadioGroup rg2 = (RadioGroup)findViewById(R.id.radioGroup2);
                // Get the EditText object
                EditText et = (EditText)findViewById(R.id.personal);
                String reflection = et.getText().toString();
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                int x = rg1.getCheckedRadioButtonId();
                int z = rg2.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);
                RadioButton rb1= (RadioButton)findViewById(x);
                RadioButton rb2 = (RadioButton)findViewById(z);
                String a = rb.getText().toString();
                String s = rb1.getText().toString();
                String d = rb2.getText().toString();

                String [] data = {a,s,d,reflection};

                Intent i = new Intent(MainActivity.this, summary.class);
                i.putExtra("data",data);

                startActivity(i);

            }});

    }
}
