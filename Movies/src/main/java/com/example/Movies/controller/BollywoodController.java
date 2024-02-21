package com.example.Movies.controller;

import com.example.Movies.service.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ResourceBundle;

@Controller
@RequestMapping("/bollywood")
@ResponseBody
public class BollywoodController {

    @Autowired
    Movie m;

    @GetMapping("/")
    public String bollyWood(){
        m.BollywoodMovies();
        return "<h1 style= color:\"red\";>Bollywood movies are here</h1>";
    }
}
