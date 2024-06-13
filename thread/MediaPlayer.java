package com.thread;

// Define the Video class
class Video {
    // Method to play video
    void play() {
        System.out.println("play video");
    }
}

// Define the Music class
class Music {
    // Method to play music
    void play() {
        System.out.println("play music");
    }
}

// Define the MediaPlayer class with the main method
public class MediaPlayer {
    public static void main(String[] args) {
        // Create an instance of Video and play the video
        Video v = new Video();
        v.play();  // Call the play method on the Video instance

        // Create an instance of Music and play the music
        Music m1 = new Music();
        m1.play();  // Call the play method on the Music instance
    }
}