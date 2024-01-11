package dao;

import models.User;

import java.util.List;

public interface DaoUserInterface {
    String addUser(User user);
    List<User> getAllUsers();
    String updateUserById(User id,User user);
    String deleteUserById(User id);
}
