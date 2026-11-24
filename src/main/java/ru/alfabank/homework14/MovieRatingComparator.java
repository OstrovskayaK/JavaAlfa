package ru.alfabank.homework14;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieRatingComparator implements Comparator<Movie> {

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Interstellar", 8.7));
        movies.add(new Movie("Shrek", 8.0));
        movies.add(new Movie("Nachalo", 8.8));
        movies.add(new Movie("Venom", 6.6));

        System.out.println("Films list before sorting");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        movies.sort(new MovieRatingComparator());

        System.out.println("\nFilms after sorting");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


    @Override
    public int compare(Movie o1, Movie o2) {
        return  Double.compare(o1.getRate(), o2.getRate());
    }
}


