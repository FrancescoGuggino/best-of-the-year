package org.learning.bestoftheyear;

import org.learning.bestoftheyear.model.Movie;
import org.learning.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String index (Model model) {

        String myName = "Francesco Guggino";
        model.addAttribute ("name", myName);

        return "homepage";
    }

    @GetMapping("/movies")
    public String movies (Model model) {

        List<Movie> movieList = getMovies();
        model.addAttribute("movies", movieList);

        return "movies";
    }

    @GetMapping("/songs")
    public String songs (Model model) {

        List<Song> songList = getSongs();
        model.addAttribute("songs", songList);

        return "songs";
    }

    private List<Movie> getMovies() {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1,"Oppenheimer"));
        movies.add(new Movie(2,"Interstellar"));
        movies.add(new Movie(3,"Dune"));
        movies.add(new Movie(4,"Blade Runner"));
        movies.add(new Movie(5,"Arrival"));
        movies.add(new Movie(6,"District 9"));

        return movies;
    }

    private List<Song> getSongs() {

        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1,"The Shrine/An Argument"));
        songs.add(new Song(2,"Mykonos"));
        songs.add(new Song(3,"White Winter Hymnal"));
        songs.add(new Song(4,"St. James Infirmary"));
        songs.add(new Song(5,"Too Good Too Bad"));
        songs.add(new Song(6,"Roman Holiday"));

        return songs;
    }
}
