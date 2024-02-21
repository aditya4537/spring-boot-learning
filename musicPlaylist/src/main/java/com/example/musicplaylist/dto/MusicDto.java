package com.example.musicplaylist.dto;

public class MusicDto {
	private int musicId;
	private String name;
	private String genre;
	private String singer;
	
	public int getMusicId() {
		return musicId;
	}

	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "MusicDto [musicId=" + musicId + ", name=" + name + ", genre=" + genre + ", singer=" + singer + "]";
	}
}
