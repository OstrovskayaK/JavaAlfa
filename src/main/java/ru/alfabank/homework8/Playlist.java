package ru.alfabank.homework8;

import java.util.ArrayList;

public class Playlist {

    String playlistName = "Back to childhood";
    ArrayList<String> songList = new ArrayList<>();

    public void addSongToPlaylist(String songName) {
        songList.add(songName);
        System.out.println("Song added: " + songName);
    }

    public void removeSongByIndex(int index) {
        if (index >= 0 && index < songList.size()) {
            String removedSong = songList.remove(index);
            System.out.println("Song " + removedSong + " removed");
        } else
            System.out.println("Incorrect index. try Again.");

    }

    public void updateSongByIndex(int index, String newSong) {
        if (index >= 0 && index < songList.size()) {
            songList.set(index, newSong);
            System.out.println("Song with index " + index + " updated to " + newSong);
        } else
            System.out.println("Incorrect index. try Again.");
    }

    public void getSongByIndex(int index) {
        if (index >= 0 && index < songList.size()) {
            String selectedSong = songList.get(index);
            System.out.println("Selected song - " + selectedSong);
            //System.out.println("index - " + index);
        } else
            System.out.println("Incorrect index. try Again.");
    }

    @Override
    public String toString() {
        StringBuilder readablePlaylist = new StringBuilder();
        return "Playlist: " + playlistName + " with songs:" + songList;
    }
}
