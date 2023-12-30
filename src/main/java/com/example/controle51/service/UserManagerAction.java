package com.example.controle51.service;

import com.example.controle51.dao.entities.User;
import com.example.controle51.service.dtos.UserDTO;
import com.example.controle51.service.mappers.UserMapper;

import java.util.List;

public class UserManagerAction implements UserManager{

    private final UserMapper userMapper;
    private final UserManager userManager;

    public UserManagerAction(UserManager userManager, UserMapper userMapper) {
        this.userManager = userManager;
        this.userMapper = userMapper;
    }


    public UserDTO saveUser(UserDTO userDTO) {

        UserDTO User = userManager.getUserByEmail(userDTO.getEmail());
        if (User != null) {
            throw new RuntimeException("L'email existe déjà dans la base de données .");
        }

        return userManager.saveUser(userDTO);
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return null;
    }

    @Override
    public void deleteUserById(Long userId) {
        userManager.deleteUserById(userId);
    }



}




