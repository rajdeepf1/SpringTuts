package com.denso_asset_management.Models;

import javax.persistence.*;
import java.sql.Timestamp;

public class TableAssetDetailModelTest {

    
    private int Id;
   
    private int AssetTagNo;
    
    private String SerialNo;
   
    private String AssetName;
   
    private String Location;

    private String Description;

    private String BusinessUnit;

    private String DepartmentName;

    private String CompanyCode;

    private String ObjectCode;

    private String SubsidaryCode;

    private Timestamp DateAcquire;

    private int Quantity;

    private String ModelNo;

    private String Remarks;

    private String CreatedBy;

    private Timestamp CreatedDate;

    private String SystemIP;

    private String ModifiedBy;

    private Timestamp ModifiedDate;

    public TableAssetDetailModelTest() {
    }

    public TableAssetDetailModelTest(int assetTagNo, String serialNo, String assetName, String location, String description, String businessUnit, String departmentName, String companyCode, String objectCode, String subsidaryCode, Timestamp dateAcquire, int quantity, String modelNo, String remarks, String createdBy, Timestamp createdDate, String systemIP, String modifiedBy, Timestamp modifiedDate) {
        AssetTagNo = assetTagNo;
        SerialNo = serialNo;
        AssetName = assetName;
        Location = location;
        Description = description;
        BusinessUnit = businessUnit;
        DepartmentName = departmentName;
        CompanyCode = companyCode;
        ObjectCode = objectCode;
        SubsidaryCode = subsidaryCode;
        DateAcquire = dateAcquire;
        Quantity = quantity;
        ModelNo = modelNo;
        Remarks = remarks;
        CreatedBy = createdBy;
        CreatedDate = createdDate;
        SystemIP = systemIP;
        ModifiedBy = modifiedBy;
        ModifiedDate = modifiedDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAssetTagNo() {
        return AssetTagNo;
    }

    public void setAssetTagNo(int assetTagNo) {
        AssetTagNo = assetTagNo;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String serialNo) {
        SerialNo = serialNo;
    }

    public String getAssetName() {
        return AssetName;
    }

    public void setAssetName(String assetName) {
        AssetName = assetName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBusinessUnit() {
        return BusinessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        BusinessUnit = businessUnit;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getCompanyCode() {
        return CompanyCode;
    }

    public void setCompanyCode(String companyCode) {
        CompanyCode = companyCode;
    }

    public String getObjectCode() {
        return ObjectCode;
    }

    public void setObjectCode(String objectCode) {
        ObjectCode = objectCode;
    }

    public String getSubsidaryCode() {
        return SubsidaryCode;
    }

    public void setSubsidaryCode(String subsidaryCode) {
        SubsidaryCode = subsidaryCode;
    }

    public Timestamp getDateAcquire() {
        return DateAcquire;
    }

    public void setDateAcquire(Timestamp dateAcquire) {
        DateAcquire = dateAcquire;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getModelNo() {
        return ModelNo;
    }

    public void setModelNo(String modelNo) {
        ModelNo = modelNo;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        CreatedDate = createdDate;
    }

    public String getSystemIP() {
        return SystemIP;
    }

    public void setSystemIP(String systemIP) {
        SystemIP = systemIP;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public Timestamp getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        ModifiedDate = modifiedDate;
    }
}
