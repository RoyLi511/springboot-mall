package com.royli.springbootmall.service;

import com.royli.springbootmall.dto.UserRegisterRequest;
import com.royli.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

}
