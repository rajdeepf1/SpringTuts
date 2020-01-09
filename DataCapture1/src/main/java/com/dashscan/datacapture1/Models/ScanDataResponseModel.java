package com.dashscan.datacapture1.Models;

public class ScanDataResponseModel {

    private boolean status;
    private ScanDataModel response;

    private String message;

    public ScanDataResponseModel() {
    }

    public ScanDataResponseModel(boolean status, ScanDataModel response, String message) {
        this.status = status;
        this.response = response;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ScanDataModel getResponse() {
        return response;
    }

    public void setResponse(ScanDataModel response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
