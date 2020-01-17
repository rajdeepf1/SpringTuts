package com.example.pagination.Models;

import javax.persistence.*;

@Entity
@Table(name = "ScanData")
public class ScanDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String scanData;
    long scanDataTimeStamp;

    public ScanDataModel() {
    }

    public ScanDataModel(int id, String scanData, long scanDataTimeStamp) {
        this.id = id;
        this.scanData = scanData;
        this.scanDataTimeStamp = scanDataTimeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScanData() {
        return scanData;
    }

    public void setScanData(String scanData) {
        this.scanData = scanData;
    }

    public long getScanDataTimeStamp() {
        return scanDataTimeStamp;
    }

    public void setScanDataTimeStamp(long scanDataTimeStamp) {
        this.scanDataTimeStamp = scanDataTimeStamp;
    }
}
