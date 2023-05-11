package com.mettler.jwt.mettlerAuth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mettler.jwt.mettlerAuth.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	 
    Optional<User> findByUsername(String username);
  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}