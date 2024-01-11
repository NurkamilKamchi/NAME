package service;

import dao.DaoUserImpl;
import models.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private final DaoUserImpl daoUser;

    public UserServiceImpl(DaoUserImpl daoUser) {
        this.daoUser = daoUser;
    }

    @Override
    public String addUser(User user) {
        daoUser.addUser(user);
        return "Success added";
    }

    @Override
    public List<User> getAllUsers() {
        return daoUser.getAllUsers();
    }


    @Override
    public String updateUserById(User id, User user) {
        try {
            daoUser.updateUserById(id, user);
        } catch (Exception e) {
            return "Not succes!!!";
        }
        return "Success updated!!!";
    }

    @Override
    public String deleteUserById(User id) {
        try {
            daoUser.deleteUserById(id);
        } catch (Exception e) {
            return "Not success!";
        }
        return "Success deleted!";
    }
}
