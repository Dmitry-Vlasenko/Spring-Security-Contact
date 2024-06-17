package com.dvlasenko.App.service;

import com.dvlasenko.App.dto.UserDto;
import com.dvlasenko.App.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
