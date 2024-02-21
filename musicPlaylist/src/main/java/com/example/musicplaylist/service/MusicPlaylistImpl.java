package com.example.musicplaylist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.musicplaylist.dto.MusicDto;
import com.example.musicplaylist.model.Music;
import com.example.musicplaylist.repository.MusicRepository;

@Service
public class MusicPlaylistImpl implements MusicPlaylist {

	@Autowired
	MusicRepository mr;

	@Override
	public List<MusicDto> getMusic() {
		List<MusicDto> md = new ArrayList<>();
		List<Music> m = mr.findAll();
		for (Music song : m) {
			MusicDto musicDto = new MusicDto();
			musicDto.setMusicId(song.getMusicId());
			musicDto.setName(song.getName());
			musicDto.setGenre(song.getGenre());
			musicDto.setSinger(song.getSinger());
			md.add(musicDto);
		}
		return md;
	}

	// @Override
	// public void save(Music music) {
	// mr.save(music);
	// }
	public void save(MusicDto musicDto) {
		if (musicDto.getMusicId() == 0) {
			Music music = new Music();
			music.setName(musicDto.getName());
			music.setGenre(musicDto.getGenre());
			music.setSinger(musicDto.getSinger());
			mr.save(music);
		} else {
			Music editMusic = mr.findById(musicDto.getMusicId()).get();
			editMusic.setName(musicDto.getName());
			editMusic.setGenre(musicDto.getGenre());
			editMusic.setSinger(musicDto.getSinger());
			mr.save(editMusic);
		}
	}

	@Override
	public void delete(int id) {
		mr.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Music edit(int id) {
		return mr.getById(id);
	}

	@Override
	public List<Music> search(String query) {
//		List<Music> filtered = new ArrayList<>();
//		List<Music> l  = mr.findAll();
//		System.out.println(l);
//		for(Music m: l){
//			if(m.getSinger().equals(query)){
//				System.out.println(m.getSinger());
//				filtered.add(m);
//			}
//		}
//		return filtered;
		return mr.getMusicBySinger(query);
	}

}