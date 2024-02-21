package com.example.Movies.service;

import com.example.Movies.model.MovieData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieImpl implements Movie {

    ArrayList<MovieData> bollywood = new ArrayList<>();

    ArrayList<MovieData> tollywood = new ArrayList<>();

    @Override
    public void BollywoodMovies() {
        bollywood.clear();

        MovieData md = new MovieData();
        md.setName("Tiger 3");
        md.setGenre("Action");
        md.setRating(8);
        md.setTrending(true);
        bollywood.add(md);

        MovieData md1 = new MovieData();
        md1.setName("Hera Pheri");
        md1.setGenre("Comedy");
        md1.setRating(9);
        md1.setTrending(true);
        bollywood.add(md1);

        System.out.println(bollywood);
    }

    @Override
    public void TollywoodMovies() {
        tollywood.clear();

        MovieData md = new MovieData();
        md.setName("Pushpa");
        md.setGenre("Action");
        md.setRating(9);
        md.setTrending(true);
        tollywood.add(md);

        MovieData md1 = new MovieData();
        md1.setName("Dangerous Kheladi");
        md1.setGenre("Action-Comedy");
        md1.setRating(6);
        md1.setTrending(false);
        tollywood.add(md1);

        System.out.println(tollywood);

    }
}
