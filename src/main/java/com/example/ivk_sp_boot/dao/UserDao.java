package com.example.ivk_sp_boot.dao;

import com.example.ivk_sp_boot.model.User;
import java.util.List;

public interface UserDao {

   public List<User> getAllUsers();

   public void saveUser(User user);

   public User getUser(int id);

   public void deleteUser(int id);
}
