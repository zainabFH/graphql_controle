package com.example.controle51.web;

import com.example.controle51.dao.entities.User;
import com.example.controle51.dao.repositories.UserRepository;
import com.example.controle51.service.dtos.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Controller
public class UserGraphQLController {
    private final UserRepository userRepository;

    public UserGraphQLController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryMapping
    public List<User> userList(){
        return userRepository.findAll();

    }

    @QueryMapping
    public Optional<User> UserById(@PathVariable Long UserId){
        return userRepository.findById(UserId);
    }

    @MutationMapping
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long IdUser){
        userRepository.deleteById(IdUser);
    }



}
