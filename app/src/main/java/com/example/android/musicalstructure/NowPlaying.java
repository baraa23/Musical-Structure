package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView mPlay;
        ImageView mPause;
        ImageView mStop;
        mPlay = findViewById(R.id.play_button);
        mPause = findViewById(R.id.pause_button);
        mStop = findViewById(R.id.stop_button);
        ImageView mLibrary = findViewById(R.id.library_button);

        // set OnClickListener on Library button in NowPlaying activity.
        mLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(libraryIntent);
            }
        });

        // set OnClickListener on Play button in NowPlaying activity.
        mPlay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Play ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlaying.this, "Play", Toast.LENGTH_SHORT).show();
            }
        });

        // set OnClickListener on Pause button in NowPlaying activity.
        mPause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Pause ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlaying.this, "Pause", Toast.LENGTH_SHORT).show();
            }
        });

        // set OnClickListener on Stop button in NowPlaying activity.
        mStop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Stop ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlaying.this, "Stop", Toast.LENGTH_SHORT).show();
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Songs exampleItem = intent.getParcelableExtra("Example Item");

        int songArt = exampleItem.getImageSongArt();
        String songName = exampleItem.getSongName();
        String artistName = exampleItem.getArtistName();

        ImageView imageView = findViewById(R.id.image_song);
        imageView.setImageResource(songArt);

        TextView textView1Song = findViewById(R.id.songg_namee);
        textView1Song.setText(songName);

        TextView textView2Artist = findViewById(R.id.artist_naamee);
        textView2Artist.setText(artistName);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
