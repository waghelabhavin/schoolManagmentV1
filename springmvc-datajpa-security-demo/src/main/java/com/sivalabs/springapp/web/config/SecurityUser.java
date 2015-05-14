/**
 * 
 */
package com.sivalabs.springapp.web.config;

import java.util.ArrayList;
import java.util.Collection; 

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sivalabs.springapp.entities.Role;
import com.sivalabs.springapp.entities.User;

/**
 * @author Siva
 *
 */
public class SecurityUser extends User implements UserDetails
{

	private static final long serialVersionUID = 1L;
	public SecurityUser(User user) {
		if(user != null)
		{
			this.setId(user.getId());
			this.setUserName(user.getUserName());
			this.setEmail(user.getEmail());
			this.setFirstName(user.getFirstName());
			this.setLastName(user.getLastName());
			this.setPassword(user.getPassword());
			this.setCreatedOn(user.getCreatedOn());
			this.setModifiedOn(user.getModifiedOn());
			this.setRoles(user.getRoles());
			this.setSequrityQuestion(user.getSequrityQuestion());
			this.setAnswer(user.getAnswer());
		}		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		Role role = this.getRoles();
		
		if(role!= null)
		{
				SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
				authorities.add(authority);
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
}

