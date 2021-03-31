package com.upgrad.backendst2.service;

import com.upgrad.backendst2.Model.User;
import com.upgrad.backendst2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public void registerUser(User newUser){
        repository.register(newUser);
    }
}
