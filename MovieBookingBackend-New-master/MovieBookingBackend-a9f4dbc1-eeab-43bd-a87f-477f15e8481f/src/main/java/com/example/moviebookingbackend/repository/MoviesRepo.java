package com.example.moviebookingbackend.repository;

import com.example.moviebookingbackend.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MoviesRepo extends JpaRepository<Movies, Integer> {

    @Query("Select s from Movies s where s.theatre.theatreid = ?1")
    List<Movies> getMoviesByTheatreById(int theatreid);
}
