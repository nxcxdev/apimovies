package org.factoriaf5.apimovies.controllers;

import java.util.List;

import org.factoriaf5.apimovies.models.Movie;
import org.factoriaf5.apimovies.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "${api-endpoint}/movies")
public class MovieController {
    MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Movie> index() {
        List<Movie> movies = service.getAll();
        return movies;
    }
}