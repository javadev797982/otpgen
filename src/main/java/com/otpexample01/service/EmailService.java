package com.otpexample01.service;

import com.otpexample01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    
    @Autowired
    private UserRepository userRepository;

    public void sendOtpEmail(String email) {
    }
}
