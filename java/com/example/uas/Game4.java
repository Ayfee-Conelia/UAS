package com.example.uas;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;
import androidx.appcompat.app.AppCompatActivity;



public class Game4 extends AppCompatActivity {

    TextView input;
    Button speak;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4);
        start();
    }

    void start() {
        input = (TextView) findViewById(R.id.input);
        speak = (Button) findViewById(R.id.speak);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    // Inisialisasi bahasa yang digunakan disini menggunakan bahasa Indonesia
                    int result = tts.setLanguage(Locale.ENGLISH);
                    // Logika untuk mengecek bahasa data bahasa hilang atau tidak dan mengecek apakah bahasa didukung atau tidak
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "This language is not supported");
                    } else {
                        speak.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "initialization failed");
                }
            }
        });

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                say();
            }
        });
    }

    void say() {
        String text = input.getText().toString();
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    protected void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    public void Button1Clicked(View view) {
        Intent intent = new Intent(this,hasil44.class);
        startActivity(intent);//ketika button di klik menusju hasil1
    }
    public void Button2Clicked(View view) {
        Intent intent = new Intent(this,hasil4.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
    public void Button3Clicked(View view) {
        Intent intent = new Intent(this,hasil44.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
    public void Button4Clicked(View view) {
        Intent intent = new Intent(this,hasil44.class);
        startActivity(intent);//ketika button di klik menusju hasil11
    }
}