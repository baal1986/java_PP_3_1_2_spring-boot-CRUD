package com.example.java_pp_3_1_2_springbootcrud.dao;

import com.example.java_pp_3_1_2_springbootcrud.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("From User", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }

    @Override
    public void edit(User user) {
        User resUserFind = getById(user.getId());
        resUserFind.setFirstName(user.getFirstName());
        resUserFind.setLastName(user.getLastName());
        resUserFind.setEmail(user.getEmail());
    }

    @Override
    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }
}
