package ru.daniil.springboot.service;

import ru.daniil.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(int id);
    void save(User user);
    void deleteById(long id);
    void update(int id, User user);
}