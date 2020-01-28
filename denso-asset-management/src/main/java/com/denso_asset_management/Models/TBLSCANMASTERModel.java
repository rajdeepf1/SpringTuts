package com.denso_asset_management.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TBLSCANMASTER")
public class TBLSCANMASTERModel {

    @Id
    @Column(name = "ScanId",nullable = false)
    private int scanId;

    @Column(name = "AssetName",length = 150,nullable = false)
    private String assetName;

    @Column(name = "Category",length = 150,nullable = false)
    private String category;

    @Column(name = "FinanceUniqueNo",length = 150,nullable = false)
    private String financeUniqueNo;

    @Column(name = "AssetBarcode",nullable = false)
    private int assetBarcode;

    @Column(name = "BrandName",length = 150,nullable = false)
    private String brandName;

    @Column(name = "SerialNo",length = 150,nullable = false)
    private String serialNo;

    @Column(name = "Site",length = 150,nullable = false)
    private String site;

    @Column(name = "ScanedDate",nullable = false)
    private Timestamp scanedDate;

    @Column(name = "SystemIP",length = 50,nullable = false)
    private String systemIP;

    @Column(name = "ScanedBy",length = 50,nullable = false)
    private String scanedBy;

    @Column(name = "IsActive",nullable = false)
    /*@JsonProperty("active")*/
    private boolean active;

    public TBLSCANMASTERModel() {
    }

    public TBLSCANMASTERModel(String assetName, String category, String financeUniqueNo, int assetBarcode, String brandName, String serialNo, String site, Timestamp scanedDate, String systemIP, String scanedBy, boolean active) {
        this.assetName = assetName;
        this.category = category;
        this.financeUniqueNo = financeUniqueNo;
        this.assetBarcode = assetBarcode;
        this.brandName = brandName;
        this.serialNo = serialNo;
        this.site = site;
        this.scanedDate = scanedDate;
        this.systemIP = systemIP;
        this.scanedBy = scanedBy;
        this.active = active;
    }


    public int getScanId() {
        return scanId;
    }

    public void setScanId(int scanId) {
        this.scanId = scanId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFinanceUniqueNo() {
        return financeUniqueNo;
    }

    public void setFinanceUniqueNo(String financeUniqueNo) {
        this.financeUniqueNo = financeUniqueNo;
    }

    public int getAssetBarcode() {
        return assetBarcode;
    }

    public void setAssetBarcode(int assetBarcode) {
        this.assetBarcode = assetBarcode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Timestamp getScanedDate() {
        return scanedDate;
    }

    public void setScanedDate(Timestamp scanedDate) {
        this.scanedDate = scanedDate;
    }

    public String getSystemIP() {
        return systemIP;
    }

    public void setSystemIP(String systemIP) {
        this.systemIP = systemIP;
    }

    public String getScanedBy() {
        return scanedBy;
    }

    public void setScanedBy(String scanedBy) {
        this.scanedBy = scanedBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public String toString() {
        return "TBLSCANMASTERModel{" +
                "scanId=" + scanId +
                ", assetName='" + assetName + '\'' +
                ", category='" + category + '\'' +
                ", financeUniqueNo='" + financeUniqueNo + '\'' +
                ", assetBarcode=" + assetBarcode +
                ", brandName='" + brandName + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", site='" + site + '\'' +
                ", scanedDate=" + scanedDate +
                ", systemIP='" + systemIP + '\'' +
                ", scanedBy='" + scanedBy + '\'' +
                ", isActive=" + active +
                '}';
    }
}
