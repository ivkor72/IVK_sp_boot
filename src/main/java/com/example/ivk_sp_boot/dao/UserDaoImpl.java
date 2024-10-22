package com.example.ivk_sp_boot.dao;


import com.example.ivk_sp_boot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    public List<User> getAllUsers() {

        return   em.createQuery("from User", User.class).getResultList();
    }

//    @Override
//    public void saveUser(User user) {
//       if (user.getId() == 0) {
//            em.persist(user);
//        } else {
//            em.merge(user);
//        }
//        em.flush();
//    }
//
//    @Override
//    public User getUser(int id) {
//        User user = em.find(User.class, id);
//        return user;
//    }
//
//    @Override
//    public void deleteUser(int id) {
//        User user = em.find(User.class, id);
//        em.remove(user);
//        em.flush();
//    }
}
