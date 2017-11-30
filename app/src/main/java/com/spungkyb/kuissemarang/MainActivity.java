package com.spungkyb.kuissemarang;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    ImageView ivWisata, ivKuliner, ivKuis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivWisata = (ImageView)findViewById(R.id.iv_wisata);
        ivKuis=(ImageView)findViewById(R.id.iv_kuis);
        ivKuliner = (ImageView)findViewById(R.id.iv_kuliner);

        ivWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah= new Intent(MainActivity.this,wisata.class);
                startActivity(pindah);
            }
        });

        ivKuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,kuliner.class);
                startActivity(intent);
            }
        });
        ivKuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,kuis.class);
                startActivity(intent);
            }
        });
    }

}
