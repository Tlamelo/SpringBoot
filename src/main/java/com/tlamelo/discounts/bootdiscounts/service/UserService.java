package com.tlamelo.discounts.bootdiscounts.service;

import com.tlamelo.discounts.bootdiscounts.data.UserRepository;
import com.tlamelo.discounts.bootdiscounts.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
