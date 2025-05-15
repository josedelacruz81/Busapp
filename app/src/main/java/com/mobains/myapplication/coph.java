package com.mobains.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class coph extends AppCompatActivity {
    Button volt, hrut1, hrut2, hrut3, hrut4;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coph);
        volt = findViewById(R.id.volch);
        volt.setOnClickListener(v -> onBackPressed());
        hrut1 = findViewById(R.id.ruth1);
        hrut1.setOnClickListener(v -> mps1());
        hrut2 = findViewById(R.id.ruth2);
        hrut2.setOnClickListener(v -> mps2());
        hrut3 = findViewById(R.id.ruth3);
        hrut3.setOnClickListener(v -> mps3());
        hrut4 = findViewById(R.id.ruth4);
        hrut4.setOnClickListener(v -> mps4());
    }

    private void mps1() {
        a = 1;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut2", a);
        startActivity(i);
    }

    private void mps2() {
        a = 2;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut2", a);
        startActivity(i);
    }

    private void mps3() {
        a = 3;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut2", a);
        startActivity(i);
    }

    private void mps4() {
        a = 4;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("rut2", a);
        startActivity(i);
    }
}