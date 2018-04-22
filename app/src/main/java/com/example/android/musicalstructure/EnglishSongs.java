package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create an array with songs name and artist
        final ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs(getString(R.string.song1), getString(R.string.artist1), R.drawable.cheapthrills));
        songs.add(new Songs(getString(R.string.song2), getString(R.string.artist2), R.drawable.flashlight));
        songs.add(new Songs(getString(R.string.song3), getString(R.string.artist3), R.drawable.panda));
        songs.add(new Songs(getString(R.string.song4), getString(R.string.artist4), R.drawable.mapsmaroon));
        songs.add(new Songs(getString(R.string.song5), getString(R.string.artist5), R.drawable.closer));


        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        final SongAdapter adapter =
                new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list,
        ListView listView = (ListView) findViewById(R.id.song_list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // set OnClickListener on listview to open NowPlaying activity.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(EnglishSongs.this, NowPlaying.class);
                intent.putExtra(Constants.EXAMPLE_ITEM, songs.get(position));

                startActivity(intent);

            }
        });

    }
}
