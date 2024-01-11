package dao;

import database.Database;
import models.User;

import java.util.List;

public class DaoUserImpl implements DaoUserInterface {
    private final Database database;

    public DaoUserImpl(Database database) {
        this.database = database;
    }

    @Override
    public String addUser(User user) {
        database.users.add(user);
        return "Success added";
    }

    @Override
    public List<User> getAllUsers() {
        return database.users;
    }

    @Override
    public String updateUserById(Long id, User user) {
        for (User user1 : database.users) {
            if (id.equals(user1.getId())){
                user1.setName(user.getName());
                user1.setEmail(user.getEmail());
                user1.setPassword(user.getPassword());
                user1.setRole(user.getRole());
            }else throw new RuntimeException("Not succes!!!");
        }
        return "Success updated!!!";
    }

    @Override
    public String deleteUserById(Long id) {
        for (User user : database.users) {
            if (id.equals(user.getId())){
                getAllUsers().remove(user);
            }else throw new RuntimeException("Not success!");
        }
        return "Success deleted!";
    }
}
