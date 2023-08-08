package com.example.soundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;

import android.media.MediaPlayer;

import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
            }
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.button_sound);
    }

    private void playSound() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.button_sound);
        mediaPlayer.start();
    }
}