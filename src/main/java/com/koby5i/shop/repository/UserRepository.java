package com.koby5i.shop.repository;

import com.koby5i.shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //find by Username
    Optional<User> findByUsername(String username);
}
