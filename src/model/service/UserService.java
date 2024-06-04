package model.service;

import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    void addNewUser(User user);
    List<UserDto> getAllUsers();
    void deleteUser(Integer id);
    void updateUser(User user);
}
