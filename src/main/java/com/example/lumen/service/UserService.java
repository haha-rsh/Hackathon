package com.example.lumen.service;


import com.example.lumen.model.User;
import com.example.lumen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Additional methods for creating users, etc.
}

