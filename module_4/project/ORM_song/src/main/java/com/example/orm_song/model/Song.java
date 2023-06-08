package com.example.orm_song.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String artist;
   private String genre;
   private String filePath;

   public Song() {
   }

   public Song(Long id, String title, String artist, String genre, String filePath) {
      this.id = id;
      this.title = title;
      this.artist = artist;
      this.genre = genre;
      this.filePath = filePath;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getArtist() {
      return artist;
   }

   public void setArtist(String artist) {
      this.artist = artist;
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public String getFilePath() {
      return filePath;
   }

   public void setFilePath(String filePath) {
      this.filePath = filePath;
   }
}