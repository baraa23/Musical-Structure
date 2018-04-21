package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SwedishSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create an array with songs name and artist
        final ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Din soldat", "Albin", R.drawable.dinsoldat));
        songs.add(new Songs("En sista gång", "Albin", R.drawable.sistagang));
        songs.add(new Songs("Jag Sa Till Dig", "Abidaz", R.drawable.jagsatilldig));
        songs.add(new Songs("Råknas", "Abidaz", R.drawable.raknas));
        songs.add(new Songs("Helt Seriöst", "Kaliffa", R.drawable.heltseri));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Songs}. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter =
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
                Intent intent = new Intent(SwedishSongs.this, NowPlaying.class);
                intent.putExtra("Example Item", songs.get(position));

                startActivity(intent);

            }
        });
    }
}
