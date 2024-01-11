package service;

import models.User;

import java.util.List;

public interface UserService {
    String addUser(User user);
    List<User> getAllUsers();
    String updateUserById(Long id,User user);
    String deleteUserById(Long id);
}
