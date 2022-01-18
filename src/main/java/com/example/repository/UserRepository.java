package com.example.repository;

import com.example.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

        Optional<User> findByUserName(String username);
        Boolean existsByUserName(String username);
        Boolean existsByEmail(String email);
}
