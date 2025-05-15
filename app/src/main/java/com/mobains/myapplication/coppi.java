package com.mobains.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class coppi extends AppCompatActivity {
    Button volt, pirut1, pirut2;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coppi);
        volt = findViewById(R.id.volcpi);
        volt.setOnClickListener(v -> onBackPressed());
        pirut1 = findViewById(R.id.rutpi1);
        pirut1.setOnClickListener(v -> mps1());
        pirut2 = findViewById(R.id.rutpi2);
        pirut2.setOnClickListener(v -> mps2());
    }

    private void mps1() {
        a = 1;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut4", a);
        startActivity(i);
    }

    private void mps2() {
        a = 2;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut4", a);
        startActivity(i);
    }
}