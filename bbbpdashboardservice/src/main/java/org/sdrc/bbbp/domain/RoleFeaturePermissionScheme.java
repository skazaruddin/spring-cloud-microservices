package org.sdrc.bbbp.domain;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author Azaruddin (azaruddin@sdrc.co.in)
 *
 */

public class RoleFeaturePermissionScheme implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private Integer roleFeaturePermissionSchemeId;
	
	private String schemeName;
	

	private Role role;
	

	private FeaturePermissionMapping featurePermissionMapping;
	
	private Timestamp updatedDate;
	
	private String updatedBy;
	
	private List<UserRoleFeaturePermissionMapping> userRoleFeaturePermissionMappings;

	public Integer getRoleFeaturePermissionSchemeId() {
		return roleFeaturePermissionSchemeId;
	}

	public void setRoleFeaturePermissionSchemeId(Integer roleFeaturePermissionSchemeId) {
		this.roleFeaturePermissionSchemeId = roleFeaturePermissionSchemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public FeaturePermissionMapping getFeaturePermissionMapping() {
		return featurePermissionMapping;
	}

	public void setFeaturePermissionMapping(FeaturePermissionMapping featurePermissionMapping) {
		this.featurePermissionMapping = featurePermissionMapping;
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

	public List<UserRoleFeaturePermissionMapping> getUserRoleFeaturePermissionMappings() {
		return userRoleFeaturePermissionMappings;
	}

	public void setUserRoleFeaturePermissionMappings(List<UserRoleFeaturePermissionMapping> userRoleFeaturePermissionMappings) {
		this.userRoleFeaturePermissionMappings = userRoleFeaturePermissionMappings;
	}
	

}
