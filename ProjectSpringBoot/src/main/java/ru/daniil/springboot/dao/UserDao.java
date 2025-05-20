package ru.daniil.springboot.dao;

import org.springframework.stereotype.Repository;
import ru.daniil.springboot.model.User;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();
    User findById(int id);
    void save(User user);
    void delete(int id);
    void update(User user);
}