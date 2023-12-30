package com.example.controle51.service.mappers;

import com.example.controle51.dao.entities.User;
import com.example.controle51.service.dtos.UserDTO;

public class UserMapper {

    public  UserDTO ToDTO(User user) {
        return new UserDTO(
                user.getName(),
                user.getEmail(),
                user.getDate_Naissance()
        );
    }

    public  User ToEntity(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setDate_Naissance(userDTO.getDate_Naissance());
        return user;
    }
}
