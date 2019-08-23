package com.ncs.asset.model;

 

import lombok.*;

 

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

 

@Entity
@Data
@NoArgsConstructor
public class Asset {

 

    @Id    
    @GeneratedValue
    private Long assetId;

 

    public void setAssetId(long assetId) {
        this.assetId = assetId;
    }

 

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

 

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

 

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

 

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

 


    @Column
    private String assetGroup;
    
    @Column
    private String assetNo;
    
     @Column
     private String assetName;
    
     @Column
     private String description1;
     
     public String getAssetGroup() {
        return assetGroup;
    }

 

    public void setAssetGroup(String assetGroup) {
        this.assetGroup = assetGroup;
    }

 

    public String getAssetNo() {
        return assetNo;
    }

 

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

 

    public String getDescription1() {
        return description1;
    }

 

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

 

    public String getDescription2() {
        return description2;
    }

 

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

 

    public String getSerialNumber() {
        return serialNumber;
    }

 

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

 

    public String getEmployeeCode() {
        return employeeCode;
    }

 

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

 

    public String getEmployeeName() {
        return employeeName;
    }

 

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

 

    public String getDepartment() {
        return department;
    }

 

    public void setDepartment(String department) {
        this.department = department;
    }

 

    public String getStatus() {
        return status;
    }

 

    public void setStatus(String status) {
        this.status = status;
    }

 

    public String getReason() {
        return reason;
    }

 

    public void setReason(String reason) {
        this.reason = reason;
    }

 

    public long getAssetId() {
        return assetId;
    }

 

    public String getAssetName() {
        return assetName;
    }

 

    public String getVendorName() {
        return vendorName;
    }

 

    public String getTypeName() {
        return typeName;
    }

 

    public String getGroupName() {
        return groupName;
    }

 


    @Column
     private String description2;
     
     @Column
     private String serialNumber;
     

 

     @Column
     private String vendorName;
     
    @Column
    private String typeName;

 

    @Column
    private String groupName;

 

   
    @Column
    private String employeeCode;
    
    @Column
    private String employeeName;
    
    @Column 
    private String department;
    
    @Column
    private String status;
    
    @Column
    private String reason;

 

}