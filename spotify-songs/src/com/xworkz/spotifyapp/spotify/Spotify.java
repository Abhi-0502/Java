package com.xworkz.spotifyapp.spotify;

import com.xworkz.spotifyapp.spotifysongs.SpotifySongs;

public class Spotify {
    public int premium;
    public SpotifySongs songs;

    public boolean allow(SpotifySongs songs){
        boolean isAllowed = false;
        if(premium == 500){
            System.out.println("the premium is paid ");
            if(songs !=null){
                this.songs = songs;
                this.songs.displayDetails();
                isAllowed = true;
                System.out.println("the premium is paid to listing the songs");

            }else System.out.println("no premium is paid");
        }else
            System.out.println("first pay the premium amount");
        return isAllowed;
    }
}

