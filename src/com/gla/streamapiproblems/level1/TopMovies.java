package com.gla.streamapiproblems.level1;

import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("A", 8.5, 2022),
            new Movie("B", 9.0, 2023),
            new Movie("C", 7.5, 2021),
            new Movie("D", 8.9, 2024),
            new Movie("E", 9.2, 2023),
            new Movie("F", 8.0, 2022)
        );

        movies.stream()
              .sorted((a, b) -> Double.compare(b.rating, a.rating))
              .limit(5)
              .forEach(m -> System.out.println(m.name + " " + m.rating));
    }
}
