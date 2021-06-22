package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hasil2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil2);
    }

    public void next2(View view) {
        Intent intent = new Intent(this,Game3.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
}