package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.factoriaf5.apimovies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
