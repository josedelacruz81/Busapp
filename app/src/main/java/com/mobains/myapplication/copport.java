package com.mobains.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class copport extends AppCompatActivity {
    Button prut1, prut2, prut3, prut4, prut5, prut6, volt;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copport);
        volt = findViewById(R.id.volcp);
        volt.setOnClickListener(v -> onBackPressed());
        prut1 = findViewById(R.id.rut1p);
        prut1.setOnClickListener(v -> mps1());
        prut2 = findViewById(R.id.rut2p);
        prut2.setOnClickListener(v -> mps2());
        prut3 = findViewById(R.id.rut3p);
        prut3.setOnClickListener(v -> mps3());
        prut4 = findViewById(R.id.rut4p);
        prut4.setOnClickListener(v -> mps4());
        prut5 = findViewById(R.id.rut5p);
        prut5.setOnClickListener(v -> mps5());
        prut6 = findViewById(R.id.rut6p);
        prut6.setOnClickListener(v -> mps6());

    }

    public void mps1() {
        a = 1;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut1", a);
        startActivity(i);
    }

    public void mps2() {
        a = 2;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut1", a);
        startActivity(i);
    }

    public void mps3() {
        a = 3;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut1", a);
        startActivity(i);
    }

    public void mps4() {
        a = 4;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut1", a);
        startActivity(i);
    }

    public void mps5() {
        a = 5;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut1", a);
        startActivity(i);
    }

    public void mps6() {
        a = 6;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut1", a);
        startActivity(i);
    }

}