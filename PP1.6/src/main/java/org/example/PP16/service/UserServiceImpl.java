package service;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements service.UserService {

    private dao.UserDao userDao;

    @Autowired
    public UserServiceImpl(dao.UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }

    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}