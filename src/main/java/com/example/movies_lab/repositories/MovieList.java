package com.example.movies_lab.repositories;

import com.example.movies_lab.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MovieList {

    private List<Movie> movies;

    public MovieList() {

       this.movies = new ArrayList<>();
    }


   public void addMovie(Movie movie) {
        this.movies.add(movie);
   }

    public Movie getMovieById(int id) {
        return this.movies.get(id);
    }

}
