package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //List of songs (English songs)
        // Find the View that shows the English songs category
        TextView englishSongs = (TextView) findViewById(R.id.english_songs);
        // Set a click listener on that View
        englishSongs.setOnClickListener(this);

        //List of songs (Dutch songs)
        // Find the View that shows the Dutch songs category
        TextView dutchSongs = (TextView) findViewById(R.id.dutch_songs);
        // Set a click listener on that View
        dutchSongs.setOnClickListener(this);

        //List of songs (Swedish songs)
        // Find the View that shows the Swedish songs category
        TextView swedishSongs = (TextView) findViewById(R.id.swedish_songs);
        // Set a click listener on that View
        swedishSongs.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.english_songs:
                Intent englishSongsIntent = new Intent(MainActivity.this, EnglishSongs.class);
                startActivity(englishSongsIntent);
                break;

            case R.id.dutch_songs:
                Intent dutchSongsIntent = new Intent(MainActivity.this, DutchSongs.class);
                startActivity(dutchSongsIntent);
                break;

            case R.id.swedish_songs:
                Intent swedishSongsIntent = new Intent(MainActivity.this, SwedishSongs.class);
                startActivity(swedishSongsIntent);
                break;
        }
    }
}
