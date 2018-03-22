package com.nigelapp.android.soundapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);

    }

    public void click_gum(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gum);
        mediaPlayer.start();

    }

    public void click_balls(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ballsosteel);
        mediaPlayer.start();

    }

    public void fatality(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fatal);
        mediaPlayer.start();
    }

    public void finish(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.finish);
        mediaPlayer.start();
    }

    public void flawless(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.flawless);
        mediaPlayer.start();
    }

    public void lol(View v) {
       MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lol);
       mediaPlayer.start();
    }

    public void bitch(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bitch);
        mediaPlayer.start();
    }

    public void itw(View v) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.power);
        mediaPlayer.start();
    }

}
