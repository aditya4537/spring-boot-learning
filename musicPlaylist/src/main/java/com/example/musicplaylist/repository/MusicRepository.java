package com.example.musicplaylist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.musicplaylist.model.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
	
	@Query("SELECT m FROM musicdetails m ORDER BY m.musicId ASC")
	public List<Music> findAll();
	
	@Query
	("SELECT m FROM musicdetails m "
			+ "WHERE LOWER(CONCAT(m.singer, m.name, m.genre)) "
			+ "LIKE LOWER(CONCAT('%', :s, '%'))")

//	@Query("SELECT m FROM musicdetails m "
//			+ "WHERE LOWER(m.singer) LIKE CONCAT('%', LOWER(:s), '%')"
//			+ "OR LOWER(m.name) LIKE CONCAT('%', LOWER(:s), '%')"
//			+ "OR LOWER(m.genre) LIKE CONCAT('%', LOWER(:s), '%')"
//			+ "ORDER BY m.musicId ASC")
	public List<Music> getMusicBySinger(@Param("s") String singer);
}
