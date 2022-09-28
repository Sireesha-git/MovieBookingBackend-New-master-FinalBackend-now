package com.example.moviebookingbackend.controller;

import com.example.moviebookingbackend.model.Movies;
import com.example.moviebookingbackend.model.MoviesDto;
import com.example.moviebookingbackend.repository.MoviesRepo;
import com.example.moviebookingbackend.repository.TheatreRepo;
import com.example.moviebookingbackend.service.MoviesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @Autowired
    private MoviesRepo repository ;

    @Autowired
    private TheatreRepo theatreRepository ;

    @Autowired
    private ModelMapper modelMapper;


    public Movies convertToMovies(MoviesDto moviesDto){
        return modelMapper.map(moviesDto,Movies.class);
    }

    @PostMapping("/addMovie/{id}")
    public Movies addProduct(@RequestBody MoviesDto moviesDto,@PathVariable("id")int id) {
        Movies movies=convertToMovies(moviesDto);
        return moviesService.saveMovie(movies,id);
    }


    @PostMapping("/addMovies")
    public List<Movies> addMovie (@RequestBody List<Movies> movies){
        return moviesService.saveMovies(movies);
    }

    @GetMapping("/Movies")
    public List<Movies> findAllMovies(){
        return moviesService.getMovies();
    }

    @GetMapping("MovieById/{id}")
    public Movies findMoviesById(@PathVariable int id) {
        return moviesService.getMovieById(id);
    }

    @DeleteMapping("/movieDelete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return moviesService.deleteMovie(id);
    }

    @GetMapping("/theatre/getbyid/{theatreid}")
    public List<Movies> slotById(@PathVariable("theatreid") Integer theatreid){
        return moviesService.getMoviesByTheatreById(theatreid);
    }

}
