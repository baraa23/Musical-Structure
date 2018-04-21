package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //List of songs (English songs)
        // Find the View that shows the English songs category
        TextView englishSongs = (TextView) findViewById(R.id.english_songs);

// Set a click listener on that View
        englishSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the English songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent englishSongsIntent = new Intent(MainActivity.this, EnglishSongs.class);
                startActivity(englishSongsIntent);
            }
        });

        //List of songs (Dutch songs)
        // Find the View that shows the Dutch songs category
        TextView dutchSongs = (TextView) findViewById(R.id.dutch_songs);

// Set a click listener on that View
        dutchSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Dutch songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent dutchSongsIntent = new Intent(MainActivity.this, DutchSongs.class);
                startActivity(dutchSongsIntent);
            }
        });

        //List of songs (Swedish songs)
        // Find the View that shows the Swedish songs category
        TextView swedishSongs = (TextView) findViewById(R.id.swedish_songs);

// Set a click listener on that View
        swedishSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Swedish songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent swedishSongsIntent = new Intent(MainActivity.this, SwedishSongs.class);
                startActivity(swedishSongsIntent);
            }
        });


    }

}
