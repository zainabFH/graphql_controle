package com.example.controle51;

import com.example.controle51.dao.entities.User;
import com.example.controle51.dao.repositories.UserRepository;
import com.example.controle51.service.dtos.UserDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import static graphql.introspection.IntrospectionQueryBuilder.build;

@SpringBootApplication
public class Controle51Application {

    public static void main(String[] args) {
        SpringApplication.run(Controle51Application.class, args);
    }

     @Bean
     CommandLineRunner start(UserRepository userRepository){
        return args -> {
            List<UserDTO> userDTOS = List.of(
                    UserDTO.builder().name("zainab").email("zainab@gmail.com").build(),
                    UserDTO.builder().name("zainab2").email("zainab2@gmail.com").build(),
                    UserDTO.builder().name("zainab3").email("zainab3@gmail.com").build(),
                    UserDTO.builder().name("zainab4").email("zainab4@gmail.com").build()


            );
        };
     }

}
