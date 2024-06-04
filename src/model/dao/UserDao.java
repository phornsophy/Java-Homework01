package model.dao;

import lombok.Data;
import model.User;

import java.util.List;
public interface UserDao {
    void addNewUser(User user);
    void deleteUser(Integer id);
    List<User> getAllUsers();
    void updateUser(User user);
}
