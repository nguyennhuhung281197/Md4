package com.example.mini_test_t1_md4.service;

import com.example.mini_test_t1_md4.model.Posts;

import java.util.List;

public interface IPosts {
    List<Posts> findAll();

    void save(Posts posts);

    Posts findById(int id);

    void update(int id, Posts posts);

    void delete(int id);

}
