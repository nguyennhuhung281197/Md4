package com.example.ung_dung_bog.service;

import com.example.ung_dung_bog.model.Bog;
import com.example.ung_dung_bog.repository.IBogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceContext;
import java.util.List;
@Service
public class BogService implements IBogService {
    @Autowired
    private IBogRepository bogRepository;

    @Override
    public List<Bog> findAll() {
        return bogRepository.findAll();
    }

    @Override
    public Bog findById(Long id) {
        return bogRepository.findById(id);
    }

    @Override
    public void save(Bog bog) {
        bogRepository.save(bog);
    }

    @Override
    public void remove(Long id) {
        bogRepository.remove(id);
    }
}
