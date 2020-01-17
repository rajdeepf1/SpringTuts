package com.example.pagination.Models;

import java.util.List;

public class ScanDataListResponseModel {

    private boolean status;
    private String message;
    private List<ScanDataModel> list;

    public ScanDataListResponseModel() {
    }


    public ScanDataListResponseModel(boolean status, String message, List<ScanDataModel> list) {
        this.status = status;
        this.message = message;
        this.list = list;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ScanDataModel> getList() {
        return list;
    }

    public void setList(List<ScanDataModel> list) {
        this.list = list;
    }
}
