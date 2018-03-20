package org.sdrc.bbbp.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Area implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer areaId;

	
	private String areaName;

	
	private Integer parentAreaId;


	private Integer level;


	private Timestamp createdDate;


	private Timestamp updatedDate;


	private boolean isLive;


	private String areaCode;


	private String shortName;

	// ******** bi-directional one-to-many association to UserAreaMapping
	// *******
	
	private List<UserAreaMapping> userAreaMappings;

	public Area() {
		super();
	}

	public Area(int areaId) {
		this.areaId = areaId;
	}

	// getter setters
	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getParentAreaId() {
		return parentAreaId;
	}

	public void setParentAreaId(int parentAreaId) {
		this.parentAreaId = parentAreaId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<UserAreaMapping> getUserAreaMappings() {
		return userAreaMappings;
	}

	public void setUserAreaMappings(List<UserAreaMapping> userAreaMappings) {
		this.userAreaMappings = userAreaMappings;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
