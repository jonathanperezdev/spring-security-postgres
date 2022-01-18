package com.example.repository;

import com.example.models.ERole;
import com.example.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
        Optional<Role> findByName(ERole name);
}
