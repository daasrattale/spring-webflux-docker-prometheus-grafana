package io.daasrattale.springwebluxgrafanaprometheus.movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/movies")
public record MovieController() {

    @GetMapping
    public Flux<Movie> findAll() {
        return Flux.just(
                new Movie("Catch Me If You Can", 2002, "Steven Spielberg"),
                new Movie("Interstellar", 2014, "Christopher Nolan"),
                new Movie("Fight Club", 1999, "David Fincher"),
                new Movie("Creed", 2015, "Ryan Coogler"),
                new Movie("The Godfather", 1972, "Francis Ford Coppola"),
                new Movie("Avatar", 2009, "James Cameron"),
                new Movie("Inception", 2010, "Christopher Nolan"),
                new Movie("Forrest Gump", 1994, "Robert Zemeckis"),
                new Movie("Pulp Fiction", 1994, "Quentin Tarantino"),
                new Movie("Gladiator", 2000, "Ridley Scott"),
                new Movie("The Shawshank Redemption", 1994, "Frank Darabont"),
                new Movie("The Matrix", 1999, "The Wachowskis"),
                new Movie("The Dark Knight", 2008, "Christopher Nolan"),
                new Movie("Schindler's List", 1993, "Steven Spielberg"),
                new Movie("Inglourious Basterds", 2009, "Quentin Tarantino")
        );
    }

}
