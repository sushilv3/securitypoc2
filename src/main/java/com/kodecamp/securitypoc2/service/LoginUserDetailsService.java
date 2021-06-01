package com.kodecamp.securitypoc2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kodecamp.securitypoc2.entity.User;
import com.kodecamp.securitypoc2.repo.LoginUser;
import com.kodecamp.securitypoc2.repo.UserRepository;

public class LoginUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> user = userRepository.findByUsername(username);
		System.out.println("User details from LoginUserDetailsService :: "+user);
		User u = user.orElseThrow(() -> new UsernameNotFoundException("user not found"));
		return new LoginUser(u);
	}

}
