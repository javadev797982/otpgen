package com.otpexample01.repository;

import com.otpexample01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    //userrepository doing here findbyemail if user is exist with this email do not register//else register
    User findByEmail(String email);
}
