package com.mobains.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class rutas extends AppCompatActivity {
    Button volt,pb,hb,cb,picb;
    ImageButton pib,hib,cib,piib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);
        volt = findViewById(R.id.vol);
        volt.setOnClickListener(v -> onBackPressed());
        pib = findViewById(R.id.ibp);
        pib.setOnClickListener(v -> coppor());
        hib = findViewById(R.id.ibh);
        hib.setOnClickListener(v -> coph());
        cib = findViewById(R.id.ibc);
        cib.setOnClickListener(v -> copc());
        piib = findViewById(R.id.ibpi);
        piib.setOnClickListener(v -> copi());

        pb = findViewById(R.id.bp);
        pb.setOnClickListener(v -> coppor());
        hb = findViewById(R.id.bh);
        hb.setOnClickListener(v -> coph());
        cb = findViewById(R.id.bc);
        cb.setOnClickListener(v -> copc());
        picb = findViewById(R.id.bpi);
        picb.setOnClickListener(v -> copi());
    }

    public void coppor() {
        Intent i = new Intent(this, copport.class);
        startActivity(i);
    }

    public void coph() {
        Intent i = new Intent(this, coph.class);
        startActivity(i);
    }

    public void copc() {
        Intent i = new Intent(this, copc.class);
        startActivity(i);
    }

    public void copi() {
        Intent i = new Intent(this, coppi.class);
        startActivity(i);
    }
}