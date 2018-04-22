package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity implements View.OnClickListener {

    private ImageView mPlay;
    private ImageView mPause;
    private ImageView mStop;
    private ImageView mLibrary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        mPlay = findViewById(R.id.play_button);
        mPause = findViewById(R.id.pause_button);
        mStop = findViewById(R.id.stop_button);
        mLibrary = findViewById(R.id.library_button);

        // set OnClickListener on Library button in NowPlaying activity.
        mLibrary.setOnClickListener(this);

        // set OnClickListener on Play button in NowPlaying activity.
        mPlay.setOnClickListener(this);

        // set OnClickListener on Pause button in NowPlaying activity.
        mPause.setOnClickListener(this);

        // set OnClickListener on Stop button in NowPlaying activity.
        mStop.setOnClickListener(this);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Songs exampleItem = intent.getParcelableExtra(Constants.EXAMPLE_ITEM);

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

    @Override
    public void onClick(View v) {

        if (v.equals(mPlay)) {
            Toast.makeText(NowPlaying.this, getString(R.string.play_toast), Toast.LENGTH_SHORT).show();
        }

        if (v.equals(mPause)) {
            Toast.makeText(NowPlaying.this, getString(R.string.pause_toast), Toast.LENGTH_SHORT).show();
        }

        if (v.equals(mStop)) {
            Toast.makeText(NowPlaying.this, getString(R.string.stop_toast), Toast.LENGTH_SHORT).show();
        }

        if (v.equals(mLibrary)) {
            Intent libraryIntent = new Intent(NowPlaying.this, MainActivity.class);
            startActivity(libraryIntent);
        }

    }
}
