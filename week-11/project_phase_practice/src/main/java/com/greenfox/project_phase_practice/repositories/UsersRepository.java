package com.greenfox.project_phase_practice.repositories;

import com.greenfox.project_phase_practice.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

  Optional<Users> findByName(String username);
}
