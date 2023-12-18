package org.factoriaf5.apimovies.services;
import java.util.List;

import org.factoriaf5.apimovies.exceptions.MovieNotFoundException;
import org.factoriaf5.apimovies.models.Movie;
import org.factoriaf5.apimovies.repositories.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    MovieRepository repository;
    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }
    public List<Movie> getAll() {
        List<Movie> movies = repository.findAll();
        return movies;
    }

    public Movie getById(Long id) throws Exception {
        Movie movie = repository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

        return movie;
    }

    public Movie save(Movie movie) {
        
        Movie newMovie = repository.save(movie);
        return newMovie;
    }
}
