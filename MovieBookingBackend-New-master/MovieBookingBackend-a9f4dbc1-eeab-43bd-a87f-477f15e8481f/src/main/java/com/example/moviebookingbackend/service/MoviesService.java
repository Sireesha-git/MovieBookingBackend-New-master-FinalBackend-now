package com.example.moviebookingbackend.service;



import com.example.moviebookingbackend.model.Movies;
import com.example.moviebookingbackend.model.Theatre;
import com.example.moviebookingbackend.repository.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepo moviesRepository;

    public Movies saveMovie(Movies movie,int id) {
        Movies movies=new Movies(movie.getTitle(),movie.getCast(),movie.getDate(),movie.getLanguage(),movie.getPrice(),movie.getShowTime(),movie.getTotalTicket());
        movies.setImage(movie.getImage());
        movies.setLocation(movie.getLocation());
        movies.setTheatre(new Theatre(id));
        return moviesRepository.save(movies);
    }

    public List<Movies> saveMovies(List<Movies> movies){
        return moviesRepository.saveAll(movies);
    }

    public List<Movies> getMoviesByTheatreById(int theatreid){
        return moviesRepository.getMoviesByTheatreById(theatreid);
    }

    public List<Movies> getMovies(){
        return moviesRepository.findAll();
    }

    public Movies getMovieById(int id) {
        return moviesRepository.findById(id).orElse(null);
    }


    public String deleteMovie(int id) {
        moviesRepository.deleteById(id);
        return "Product removed Succcessfully" +id;
    }

}

