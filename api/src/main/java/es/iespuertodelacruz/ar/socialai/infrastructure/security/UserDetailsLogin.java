package es.iespuertodelacruz.ar.socialai.infrastructure.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsLogin  implements UserDetails{
	
	public UserDetailsLogin() {}
	String username;
	String password;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

	    List<GrantedAuthority> authorities
	      = new ArrayList<>();
	
	    authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

	    return authorities;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getUsername() {
		return username;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}

