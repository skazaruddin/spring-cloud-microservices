package org.sdrc.bbbp.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author Azaruddin (azaruddin@sdrc.co.in)
 *
 */

public class UserRoleFeaturePermissionMapping implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer userRoleFeaturePermissionId;
	
	private RoleFeaturePermissionScheme roleFeaturePermissionScheme;
	
	private UserAreaMapping userAreaMapping;
	
	private Timestamp updatedDate;
	
	private String updatedBy;

	public Integer getUserRoleFeaturePermissionId() {
		return userRoleFeaturePermissionId;
	}

	public void setUserRoleFeaturePermissionId(Integer userRoleFeaturePermissionId) {
		this.userRoleFeaturePermissionId = userRoleFeaturePermissionId;
	}

	public RoleFeaturePermissionScheme getRoleFeaturePermissionScheme() {
		return roleFeaturePermissionScheme;
	}

	public void setRoleFeaturePermissionScheme(RoleFeaturePermissionScheme roleFeaturePermissionScheme) {
		this.roleFeaturePermissionScheme = roleFeaturePermissionScheme;
	}

	public UserAreaMapping getUserAreaMapping() {
		return userAreaMapping;
	}

	public void setUserAreaMapping(UserAreaMapping userAreaMapping) {
		this.userAreaMapping = userAreaMapping;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	
}
