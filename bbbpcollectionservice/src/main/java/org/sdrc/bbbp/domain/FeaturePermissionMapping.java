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




public class FeaturePermissionMapping implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer featurePermissionId;
	
	
	private Feature feature;
	

	private Permission permission;
	
	private Timestamp updatedDate;
	
	private String updatedBy;
	
	
	private String description;
	
	private List<RoleFeaturePermissionScheme> roleFeaturePermissionSchemes;

	public Integer getFeaturePermissionId() {
		return featurePermissionId;
	}

	public void setFeaturePermissionId(Integer featurePermissionId) {
		this.featurePermissionId = featurePermissionId;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
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

	public List<RoleFeaturePermissionScheme> getRoleFeaturePermissionSchemes() {
		return roleFeaturePermissionSchemes;
	}

	public void setRoleFeaturePermissionSchemes(List<RoleFeaturePermissionScheme> roleFeaturePermissionSchemes) {
		this.roleFeaturePermissionSchemes = roleFeaturePermissionSchemes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
