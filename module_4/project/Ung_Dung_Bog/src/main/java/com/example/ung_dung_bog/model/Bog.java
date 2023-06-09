package com.example.ung_dung_bog.model;

import javax.persistence.*;

@Entity
@Table(name = "Bog")
public class Bog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    public Bog() {
    }

    public Bog( String title, String description) {
        this.title = title;
        this.description = description;
    }
    @Override
    public String toString() {
        return String.format("Bog[id=%d, title='%s', description='%s']", id, title, description);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
