package com.kodecamp.securitypoc2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.kodecamp.securitypoc2.service.LoginUserDetailsService;


@Configuration
public class SecurityConfiguration {

	@Bean
	public UserDetailsService userDetailsService() {

		return new LoginUserDetailsService();
	}

	// for row password
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
