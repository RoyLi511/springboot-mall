package com.royli.springbootmall.dao;

import com.royli.springbootmall.dto.UserRegisterRequest;
import com.royli.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);

}
