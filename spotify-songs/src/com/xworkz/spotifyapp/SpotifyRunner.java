package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.spotify.Spotify;
import com.xworkz.spotifyapp.spotifysongs.SpotifySongs;

public class SpotifyRunner {

    public static void main(String[] args){
        Spotify spotify = new Spotify();
        spotify.premium = 500;

        SpotifySongs songs = new SpotifySongs();
        songs.premiumId = 5;
        songs.kannadasongs = "1";
        songs.Hindisongs = "2";
        songs.Tamilsongs = "3";
        songs.telagusongs = "4";

        spotify.allow(songs);
    }

}
