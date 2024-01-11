package dao;

import models.User;

import java.util.List;

public interface DaoUserInterface {
    String addUser(User user);
    List<User> getAllUsers();
    String updateUserById(Long id,User user);
    String deleteUserById(Long id);
}
