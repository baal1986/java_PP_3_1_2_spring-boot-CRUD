package com.example.java_pp_3_1_2_springbootcrud.service;

import com.example.java_pp_3_1_2_springbootcrud.model.User;
import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(Long id);
}
