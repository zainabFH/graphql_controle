package com.example.controle51.service;

import com.example.controle51.service.dtos.UserDTO;

import java.util.List;

public interface UserManager {

    UserDTO saveUser(UserDTO userDTO);

    UserDTO getUserByEmail(String email);


    void deleteUserById(Long userId);
}