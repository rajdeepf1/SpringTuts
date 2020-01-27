package com.denso_asset_management.Models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tblAssetDetail")
public class TableAssetDetailModel {

    @Id
    @Column(name = "Id",nullable = false)
    private int Id;
    @Column(name = "AssetTagNo",nullable = false)
    private int AssetTagNo;
    @Column(name = "SerialNo",length = 100,nullable = false)
    private String SerialNo;
    @Column(name = "AssetName",length = 200,nullable = false)
    private String AssetName;
    @Column(name = "Location",length = 200,nullable = false)
    private String Location;
    @Column(name = "Description",length = 200,nullable = false)
    private String Description;
    @Column(name = "BusinessUnit",length = 50,nullable = false)
    private String BusinessUnit;
    @Column(name = "DepartmentName",length = 200,nullable = false)
    private String DepartmentName;
    @Column(name = "CompanyCode",length = 50,nullable = false)
    private String CompanyCode;
    @Column(name = "ObjectCode",length = 50,nullable = false)
    private String ObjectCode;
    @Column(name = "SubsidaryCode",length = 50,nullable = false)
    private String SubsidaryCode;
    @Column(name = "DateAcquire",nullable = false)
    private Timestamp DateAcquire;
    @Column(name = "Quantity",nullable = false)
    private int Quantity;
    @Column(name = "ModelNo",length = 200,nullable = false)
    private String ModelNo;
    @Column(name = "Remarks",length = 500,nullable = false)
    private String Remarks;
    @Column(name = "CreatedBy",length = 100,nullable = false)
    private String CreatedBy;
    @Column(name = "CreatedDate",nullable = false)
    private Timestamp CreatedDate;
    @Column(name = "SystemIP",length = 50,nullable = false)
    private String SystemIP;
    @Column(name = "ModifiedBy",length = 100,nullable = false)
    private String ModifiedBy;
    @Column(name = "ModifiedDate",nullable = false)
    private Timestamp ModifiedDate;

    public TableAssetDetailModel() {
    }

    public TableAssetDetailModel(int assetTagNo, String serialNo, String assetName, String location, String description, String businessUnit, String departmentName, String companyCode, String objectCode, String subsidaryCode, Timestamp dateAcquire, int quantity, String modelNo, String remarks, String createdBy, Timestamp createdDate, String systemIP, String modifiedBy, Timestamp modifiedDate) {
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
