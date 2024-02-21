package com.example.Movies.controller;

import com.example.Movies.service.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tollywood")
@ResponseBody
public class TollywoodController {

    @Autowired
    Movie m;

    @GetMapping("/")
    public String tollyWood(){
        m.TollywoodMovies();
        return "<h1>Tollywood movies are here</h1>";
    }
}