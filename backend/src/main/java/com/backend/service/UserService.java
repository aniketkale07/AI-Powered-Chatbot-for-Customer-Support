package com.backend.service;
import com.backend.model.*;
import java.util.List;



public interface UserService  {
    
    User login(String username, String password);
    User register(User user);
    User getUserByUsername(String username);
    User getUserById(Long id);
    User updateUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    List<User> searchUsers(String username);
    Boolean isUserLogin(String username); 
    void logout(String username);

}
