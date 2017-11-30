package com.spungkyb.kuissemarang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView tvNilai;
    Button btnBelajar, btnKuisLagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvNilai = (TextView)findViewById(R.id.tv_nilai);
        btnBelajar = (Button)findViewById(R.id.btn_belajar);
        btnKuisLagi = (Button)findViewById(R.id.btn_kuis);

        tvNilai.setText(getIntent().getStringExtra("hasil"));

        btnBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(hasil.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnKuisLagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hasil.this, kuis.class);
                startActivity(intent);
            }
        });
    }
}
