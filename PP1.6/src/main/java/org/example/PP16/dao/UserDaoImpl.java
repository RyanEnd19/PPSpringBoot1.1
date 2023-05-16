package org.example.PP16.dao;
import dao.UserDao;
import model.User;
import org.springframework.stereotype.Repository;
import jakarta.persistence.*;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    public User findUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    public void saveUser(User user) {
        entityManager.persist(user);
    }

    public void updateUser(User user) {
        entityManager.merge(user);
    }

    public void deleteUser(Long id) {
        User user = findUserById(id);
        if(user != null){
            entityManager.remove(user);
        }
    }
}