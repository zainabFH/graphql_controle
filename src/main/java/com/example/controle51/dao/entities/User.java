package com.example.controle51.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
@Builder @Setter @Getter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_User;
    private String name;
    private String email;
    private Date date_Naissance;
    private String password;

}
