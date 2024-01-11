package service;

import models.User;

import java.util.List;

public interface UserService {
    String addUser(User user);
    List<User> getAllUsers();
    String updateUserById(User id,User user);
    String deleteUserById(User id);
}
