package ru.alfabank.homework14;

public class Movie {

    String title;
    double rate;

    public Movie(String title, double rate) {
        this.title = title;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rate=" + rate +
                '}';
    }
}
