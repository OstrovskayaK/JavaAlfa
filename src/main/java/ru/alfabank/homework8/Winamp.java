package ru.alfabank.homework8;

public class Winamp {

    static void main() {
        //создали новый плейлист
        Playlist playlist1 = new Playlist();

        //добавили песни
        playlist1.addSongToPlaylist("My oh my");
        playlist1.addSongToPlaylist("da chto ti opat slushaesh");
        playlist1.addSongToPlaylist("Best song 2");
        playlist1.addSongToPlaylist("eto tvoe tytz-tytz-tytz");

        //получили песню
        playlist1.getSongByIndex(2);

        // заменили песню
        playlist1.updateSongByIndex(0, "Zhevaniy krot!");

        //удалили
        playlist1.removeSongByIndex(2);


        //вывели весь плейлист
        System.out.println(playlist1);


    }
}
