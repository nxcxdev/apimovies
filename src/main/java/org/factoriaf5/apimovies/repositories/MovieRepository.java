package org.factoriaf5.apimovies.repositories;

import org.factoriaf5.apimovies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long>{
    
}