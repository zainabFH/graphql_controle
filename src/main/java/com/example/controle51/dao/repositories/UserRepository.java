package com.example.controle51.dao.repositories;

import com.example.controle51.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
