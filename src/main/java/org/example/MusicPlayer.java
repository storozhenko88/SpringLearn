package org.example;

public class MusicPlayer {
    String brand;
    Music music;

    public MusicPlayer (Music music){
        this.music = music;
    }

    public void sounds(){
        music.playMusic();
    }
}
