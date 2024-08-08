package com.xworkz.spotifyapp.spotifysongs;

public class SpotifySongs {

    public int premiumId;
    public String kannadasongs;
    public String Hindisongs;
    public String Tamilsongs;
    public String telagusongs;

    public void displayDetails(){
        System.out.println("the kannada songs is:"+ this.kannadasongs);
        System.out.println("the Hindi songs is :"+ this.Hindisongs);
        System.out.println("the Tamil songs is:"+ this.Tamilsongs);
        System.out.println("the telagu songs is :"+ this.telagusongs);
    }
}
