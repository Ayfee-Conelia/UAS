package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class hasil5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil5);
    }

    public void next5(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
}