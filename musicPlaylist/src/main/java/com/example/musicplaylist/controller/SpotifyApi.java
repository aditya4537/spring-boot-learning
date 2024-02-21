package com.example.musicplaylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpotifyApi {
	private final String SPOTIFY_API_URL = "https://developer.spotify.com/dashboard/15c66bd3616c43b48e01518473c7e491"; // Example Spotify API URL
    private final RestTemplate restTemplate = new RestTemplate();

    

    @GetMapping("/spotify")
    public ModelAndView searchTracks(String query) {
        String searchEndpoint = SPOTIFY_API_URL + "/search?type=track&q=" + query;

        // Make GET request to Spotify API
        String response = restTemplate.getForObject(searchEndpoint, String.class);

        ModelAndView mv = new ModelAndView("spotify");
        mv.addObject("spot", response);
        // Process the response (parse JSON, handle data)
        // ...
        return mv;
    }
}
