package service;

import java.util.List;
import model.*;

public interface UserService {
    List<User> findAllUsers();
    User findUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}