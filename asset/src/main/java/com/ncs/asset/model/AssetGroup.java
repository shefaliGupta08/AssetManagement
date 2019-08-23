package com.ncs.asset.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AssetGroup {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "groupId",unique=true, nullable = false)
	private Long groupId;
	private String groupName;
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	

}
