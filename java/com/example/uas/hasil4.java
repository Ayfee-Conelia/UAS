package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class hasil4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil4);
    }

    public void next4(View view) {
        Intent intent = new Intent(this,Game5.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
}