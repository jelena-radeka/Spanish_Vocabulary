package com.example.spanishvocabulary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


   public void goodAfter(View view){
       Button good_aft = (Button) findViewById(R.id.good_aft);
       MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.buenosdias);
       mediaPlayer.start();
   }

    public void goodBye(View view){
        Button goodbye = (Button) findViewById(R.id.goodbye);
        MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.adios);
        mediaPlayer.start();
    }
    public void tomorrow(View view){
        Button tomorrow = (Button) findViewById(R.id.tomorrow);
        MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.hastamanana);
        mediaPlayer.start();
    }

    public void name(View view){
        Button name = (Button) findViewById(R.id.name);
        MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.comosellama);
        mediaPlayer.start();
    }

    public void meet(View view){
        Button meet = (Button) findViewById(R.id.meet);
        MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.muchogusto);
        mediaPlayer.start();
    }

    public void from(View view){
        Button from = (Button) findViewById(R.id.from);
        MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.dedondeeres);
        mediaPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
