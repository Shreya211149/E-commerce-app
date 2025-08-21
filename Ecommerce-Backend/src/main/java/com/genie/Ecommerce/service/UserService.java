package com.genie.Ecommerce.service;

import com.genie.Ecommerce.entities.User;
import com.genie.Ecommerce.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        try {
            User newUser = userRepository.save(user);
             System.out.println("User added successfully");
            return newUser;
        } catch (Exception e) {
            e.getMessage();
        }

        return null;
    }

    public User loginUser(String email, String password) {
       User user=userRepository.findByEmail(email);
       if(user!=null && user.getPassword().equals(password)){
        return user;
       }
       return null;

    }

    public List<User> getAllUsers() {

        return (List<User>) userRepository.findAll();
    }
}
