package com.kodecamp.securitypoc2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodecamp.securitypoc2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String uname);

}
