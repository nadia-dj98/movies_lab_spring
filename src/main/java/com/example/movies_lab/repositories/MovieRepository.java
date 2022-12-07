package com.example.movies_lab.repositories;

import com.example.movies_lab.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {



}