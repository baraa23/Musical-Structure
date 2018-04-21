package com.example.android.musicalstructure;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * {@link Songs} represents a song name and artist the user wants to listen.
 */

public class Songs implements Parcelable {

    public static final Creator<Songs> CREATOR = new Creator<Songs>() {
        @Override
        public Songs createFromParcel(Parcel in) {
            return new Songs(in);
        }

        @Override
        public Songs[] newArray(int size) {
            return new Songs[size];
        }
    };
    /**
     * song name
     */
    private String mSongName;
    /**
     * artist name
     */
    private String mArtistName;
    /**
     * Drawable resource ID (Song Art)
     */
    private int mImageSongArt;

    /**
     * Create a new Song object.
     *
     * @param songName   is the song name
     * @param artistName is the artist name
     */
    public Songs(String songName, String artistName, int imageSongArt) {
        mSongName = songName;
        mArtistName = artistName;
        mImageSongArt = imageSongArt;
    }

    protected Songs(Parcel in) {
        mSongName = in.readString();
        mArtistName = in.readString();
        mImageSongArt = in.readInt();
    }

    /**
     * Get the song name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the Image resource ID
     */
    public int getImageSongArt() {
        return mImageSongArt;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSongName);
        dest.writeString(mArtistName);
        dest.writeInt(mImageSongArt);
    }
}
