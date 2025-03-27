package com.backend.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.model.User;
import com.backend.repository.UserRepository;
import com.backend.service.UserService;

public class UserServiceImpl implements UserService {

    // AutoWired
    @Autowired
    private UserRepository userRepository;

    // USER LOGIN
    // -> Check the given data
    // -> Decrepyt the password and Check
    // -> Validate the Credential

    @Override
    public User login(String username, String password) {
        User loggedUser = new User();

        // Basic Validation
        if (username.isBlank() || password.isBlank()) {
            return null;
        }
        // Retrivev the user from DB
        loggedUser = userRepository.getuserByUsername(username);

        if (loggedUser != null) {
            if (loggedUser.getPassword() == password) {
                // if Passwrod Matched
                // -> redirect home Page
                return loggedUser;
            } else {
                // For Invalidate Password
                // -> 1. Redirect to Forget Password
                return null;
            }
        }

        return null;
    }

    // NEW USER REGISTRATION
    @Override
    public User register(User user) {
        User registerUser = new User();

        if (!user.getUsername().isBlank()) {
            if (!user.getPassword().isBlank()) {
                registerUser = user;
                userRepository.save(registerUser);
                return registerUser;
            } else {
                return null;
            }
        } else {
            // Invalidate the data Credential of user
            return null;
        }

    }

    // GET USER BY USERNAME
    @Override
    public User getUserByUsername(String username) {

        throw new UnsupportedOperationException("Unimplemented method 'getUserByUsername'");
    }

    // GET USER BY ID
    @Override
    public User getUserById(Long id) {

        return userRepository.getuserByUserId(id);

    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {

        userRepository.delete(userRepository.getuserByUserId(id));

    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public List<User> searchUsers(String username) {

        throw new UnsupportedOperationException("Unimplemented method 'searchUsers'");
    }

    @Override
    public Boolean isUserLogin(String username) {
        // Is UserLogged == null --> False
        // Is UserLogged != null --> True
        return null;
    }

    @Override
    public void logout(String username) {
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }

}
