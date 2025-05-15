package com.mobains.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton rp, pm;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rp = findViewById(R.id.rutasprincipales);
        rp.setOnClickListener(v -> ruts());
        pm = findViewById(R.id.paradasmapa);
        pm.setOnClickListener(v -> parma());
    }

    public void ruts() {
        Intent i = new Intent(this, rutas.class);
        startActivity(i);
    }

    public void parma() {
        a=1;
        Intent i = new Intent(this, maprut.class);
        i.putExtra("par",a);
        startActivity(i);
    }
}