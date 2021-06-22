package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class hasil11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil11);
    }

    public void next11(View view) {
        Intent intent = new Intent(hasil11.this,Game2.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
}