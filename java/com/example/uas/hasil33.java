package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class hasil33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil33);
    }

    public void next33(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
}