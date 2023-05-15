package dao;
import model.*;
import java.util.List;

public interface UserDao {
    List<User> findAllUsers();
    User findUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
