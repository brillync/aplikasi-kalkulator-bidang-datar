package com.brilly.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button Lingkaran = (Button) findViewById(R.id.lingkaran);

            Lingkaran.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent lingkaran = new Intent(MainActivity.this, lingkaran.class);
                    startActivity(lingkaran);
                }
            } );

            Button persegipanjang = (Button) findViewById(R.id.persegipanjang);

            persegipanjang.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent persegipanjang = new Intent(MainActivity.this, persegiPanjang.class);
                    startActivity(persegipanjang);
                }
            });
            Button segitiga = (Button) findViewById(R.id.segitiga);

            segitiga.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent segitiga = new Intent(MainActivity.this, segitiga.class);
                    startActivity(segitiga);
                }
            });
        }
        public void keluar(View view){
            System.exit(0);
        }
    }