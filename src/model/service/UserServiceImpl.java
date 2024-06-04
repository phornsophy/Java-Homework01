package model.service;

import mapper.Mapper;
import model.User;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void addNewUser(User user) {
        userDao.addNewUser(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers()
                .stream()
                .map(Mapper::mapFromUserToUserDto)
                .toList();
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {}
}
