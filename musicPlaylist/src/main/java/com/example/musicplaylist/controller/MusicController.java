package com.example.musicplaylist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.musicplaylist.dto.MusicDto;
// import com.example.musicplaylist.model.Music;
import com.example.musicplaylist.service.MusicPlaylist;


@Controller
public class MusicController {

	@Autowired
	MusicPlaylist mp;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("music", mp.getMusic());
		return mv;
	}

	@GetMapping("/add")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("add");
		return mv;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("id") int id) {
		mp.delete(id);
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("id") int id) {
		ModelAndView edit = new ModelAndView("edit");
		edit.addObject("song", mp.edit(id));
		return edit;
	}

	@PostMapping("/addSong")
	public ModelAndView addMusic(@ModelAttribute("song") MusicDto song, BindingResult result) {
		mp.save(song);
		return new ModelAndView("redirect:/");
	}

	@PostMapping("/search")
	public ModelAndView searchData(@RequestParam("query") String query ) {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("query", query);
		mv.addObject("music", mp.search(query));
		return mv;
	}
	
}
