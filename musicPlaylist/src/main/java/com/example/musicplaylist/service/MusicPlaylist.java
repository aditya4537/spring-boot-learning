package com.example.musicplaylist.service;

import java.util.List;

import com.example.musicplaylist.dto.MusicDto;
import com.example.musicplaylist.model.Music;

public interface MusicPlaylist {

	public List<MusicDto> getMusic();

	void save(MusicDto musicDto);

	void delete(int id);

	public Music edit(int id);

	public List<Music> search(String query);
}
