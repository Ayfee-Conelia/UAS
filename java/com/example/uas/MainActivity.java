package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        Intent intent = new Intent(this,Game1.class);
        startActivity(intent);
    }

    public void credit(View view) {
        Intent intent = new Intent(this,Credit.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(this,videoplayer.class);
        startActivity(intent);
    }
}