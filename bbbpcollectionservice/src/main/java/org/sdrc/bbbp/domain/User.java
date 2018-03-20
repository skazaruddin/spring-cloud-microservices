package org.sdrc.bbbp.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


public class User implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer userId;

	private String name;

	private String userName;

	private String password;

	private boolean enabled = true;
	
	private boolean credentialexpired = false;

	private boolean expired;

	private boolean locked = false;
	
	
	
	Collection<UserAreaMapping> areas;

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isCredentialexpired() {
		return credentialexpired;
	}

	public void setCredentialexpired(boolean credentialexpired) {
		this.credentialexpired = credentialexpired;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public Collection<UserAreaMapping> getAreas() {
		return areas;
	}

	public void setAreas(Collection<UserAreaMapping> areas) {
		this.areas = areas;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

}
