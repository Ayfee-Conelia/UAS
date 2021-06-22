package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class hasil1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil1);
    }

    public void next1(View view) {
        Intent intent = new Intent(this,Game2.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
}