package com.abhijit.fitnessmicroservice.repository;

import com.abhijit.fitnessmicroservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByEmail(String email);
}
