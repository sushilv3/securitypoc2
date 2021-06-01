package com.kodecamp.securitypoc2.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kodecamp.securitypoc2.entity.User;

public class LoginUser implements UserDetails {

	final private User u;

	public LoginUser(User u) {
		this.u = u;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(() -> "read");
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return u.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return u.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
