package com.example.gcb.direlkhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dirKhirBtn = (Button) findViewById(R.id.dirkhirBtn);
        Button khirBtn = (Button) findViewById(R.id.khirBtn);

        TextView nomTextView = (TextView) findViewById(R.id.nomTextView);
        TextView prenomTextView = (TextView) findViewById(R.id.nomTextView);


        khirBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EtlebElKhirActivity = new Intent(MainActivity.this, EtlebElKhirActivity.class);
                startActivity(EtlebElKhirActivity);


            }
        });

        dirKhirBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main2Activity = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(Main2Activity);
            }
        });

    }
}
