package com.spungkyb.kuissemarang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class kuis extends AppCompatActivity {
    TextView tvSoal;
    RadioGroup rgPilihan;
    RadioButton rbJwbna, rbJwbnb, rbJwbnc, rbJwbnd;
    Button btnJawab;
    int nilai = 0, nomer = 0;
    String[] pertanyaan = {"1. Makanan khas semarang terbuat dari kelapa?", "2. Makanan Khas Semarang Lumpia Dalamnya berisi?"};
    String[] jwbA = {"Wingko", "Telur"};
    String[] jwbB = {"Donat","Kerupuk"};
    String[] jwbC = {"Perkedel","Rebung"};
    String[] jwbD = {"Burger","Kacang"};
    String[] kunciJawab={"Wingko","Rebung"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        tvSoal = (TextView)findViewById(R.id.tv_soal);
        rgPilihan = (RadioGroup) findViewById(R.id.rg_jawaban);
        rbJwbna = (RadioButton) findViewById(R.id.rb_jwb_a);
        rbJwbnb = (RadioButton) findViewById(R.id.rb_jwb_b);
        rbJwbnc = (RadioButton) findViewById(R.id.rb_jwb_c);
        rbJwbnd = (RadioButton) findViewById(R.id.rb_jwb_d);
        btnJawab = (Button) findViewById(R.id.btn_jwb);
        SoalKuis();
    }
    private void SoalKuis(){
        tvSoal.setText(pertanyaan[nomer]);
        rbJwbna.setText(jwbA[nomer]);
        rbJwbnb.setText(jwbB[nomer]);
        rbJwbnc.setText(jwbC[nomer]);
        rbJwbnd.setText(jwbD[nomer]);

    }

    public void jawab(View view) {
        koreksi();
        rgPilihan.clearCheck();
        nomer++;
        if (nomer<2){
            SoalKuis();
        }
        else{
            String skorNilai =  String.valueOf(nilai);
            Intent skor = new Intent(kuis.this,hasil.class);
            skor.putExtra("hasil",skorNilai);
            startActivity(skor);
        }
    }

    private void koreksi() {
        if(rbJwbna.isChecked()){
            if(rbJwbna.getText().toString().equals(kunciJawab[nomer])){
                nilai++;
                Toast.makeText(this,"Jawaban Tepat Sekali",Toast.LENGTH_SHORT).show();
            }
        }
        if(rbJwbnb.isChecked()){
            if(rbJwbnb.getText().toString().equals(kunciJawab[nomer])){
                nilai++;
                Toast.makeText(this,"Jawaban Tepat Sekali",Toast.LENGTH_SHORT).show();
            }
        }
        if(rbJwbnc.isChecked()){
            if(rbJwbnc.getText().toString().equals(kunciJawab[nomer])){
                nilai++;
                Toast.makeText(this,"Jawaban Tepat Sekali",Toast.LENGTH_SHORT).show();
            }
        }
        if(rbJwbnd.isChecked()){
            if(rbJwbnd.getText().toString().equals(kunciJawab[nomer])){
                nilai++;
                Toast.makeText(this,"Jawaban Tepat Sekali",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
