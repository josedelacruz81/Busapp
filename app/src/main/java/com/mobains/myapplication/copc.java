package com.mobains.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class copc extends AppCompatActivity {
    Button volt, crut1, crut2, crut3, crut4;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copc);
        volt = findViewById(R.id.volcc);
        volt.setOnClickListener(v -> onBackPressed());
        crut1 = findViewById(R.id.rutc1);
        crut1.setOnClickListener(v -> mps1());
        crut2 = findViewById(R.id.rutc2);
        crut2.setOnClickListener(v -> mps2());
        crut3 = findViewById(R.id.rutc3);
        crut3.setOnClickListener(v -> mps3());
        crut4 = findViewById(R.id.rutc4);
        crut4.setOnClickListener(v -> mps4());
    }

    private void mps1() {
        a = 1;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut3", a);
        startActivity(i);
    }

    private void mps2() {
        a = 2;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut3", a);
        startActivity(i);
    }

    private void mps3() {
        a = 3;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut3", a);
        startActivity(i);
    }

    private void mps4() {
        a = 4;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut3", a);
        startActivity(i);
    }
}