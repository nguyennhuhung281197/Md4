package com.example.ung_dung_bog.repository;

import com.example.ung_dung_bog.model.Bog;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BogRepository implements IBogRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Bog> findAll() {
        TypedQuery<Bog> query = entityManager.createQuery("select b from Bog b", Bog.class);
        return query.getResultList();
    }

    @Override
    public Bog findById(Long id) {
        TypedQuery<Bog> query = entityManager.createQuery("select b from Bog b where b.id = :id", Bog.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Bog bog) {
        if (bog.getId() != null) {
            entityManager.merge(bog);
        } else {
            entityManager.persist(bog);
        }
    }

    @Override
    public void remove(Long id) {
        Bog bog = findById(id);
        if (bog != null) {
            entityManager.remove(bog);
        }
    }
}
