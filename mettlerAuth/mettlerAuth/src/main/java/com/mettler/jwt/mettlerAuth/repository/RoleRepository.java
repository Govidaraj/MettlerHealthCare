package com.mettler.jwt.mettlerAuth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mettler.jwt.mettlerAuth.Models.ERole;
import com.mettler.jwt.mettlerAuth.Models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
