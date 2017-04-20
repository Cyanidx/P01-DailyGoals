package com.example.jerald.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();
        String [] data = i.getStringArrayExtra("data");
        TextView tv = (TextView)findViewById(R.id.tvResult);
        tv.setText("Read up on materials before class : " +
                data[0] + "\n Arrive on time so as not to miss important part of the lesson : "
                + data[1] + "\n Attempt the problem myself : " + data[2] + "\n Reflection : " + data[3]);

        Button btn = (Button)findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(summary.this, MainActivity.class));

            }
        });

    }
}
