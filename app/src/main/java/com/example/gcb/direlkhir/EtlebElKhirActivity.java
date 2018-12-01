package com.example.gcb.direlkhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class EtlebElKhirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etleb_el_khir);

        TextView adrTextView = (TextView) findViewById(R.id.adrTextView);
        CheckBox urgCb = (CheckBox) findViewById(R.id.urgCb);
        CheckBox donSangCb = (CheckBox) findViewById(R.id.donSangCb);
        CheckBox FinanceCb = (CheckBox) findViewById(R.id.FinanceCb);
        CheckBox renseignCb = (CheckBox) findViewById(R.id.renseignCb);
        CheckBox MedicamentCb = (CheckBox) findViewById(R.id.MedicamentCb);
        CheckBox AutreCb = (CheckBox) findViewById(R.id.AutreCb);

        Button anlBtn = (Button) findViewById(R.id.anlBtn);
        Button pstBtn = (Button) findViewById(R.id.pstBtn);

        anlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(EtlebElKhirActivity.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });

    }
}
