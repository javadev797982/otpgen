package com.otpexample01.service;

import com.otpexample01.entity.User;
import com.otpexample01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        //save the user to DB
        return userRepository.save(user);

    }
}
