package com.springapp.usermanager.service;

import com.springapp.usermanager.model.User;

import java.util.List;

/**
 * Created by aimurat on 24.08.2016.
 */
public interface UserService {
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById(int id);

    public List<User> listUsers();
}
