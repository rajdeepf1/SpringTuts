package com.dashscan.datacapture1.Models;

public class ScanDataResponseModel {

    private boolean status;
    private String message;
    private ScanDataModel response;

    public ScanDataResponseModel() {
    }

    public ScanDataResponseModel(boolean status, ScanDataModel response, String message) {
        this.status = status;
        this.message = message;
        this.response = response;
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

    public ScanDataModel getResponse() {
        return response;
    }

    public void setResponse(ScanDataModel response) {
        this.response = response;
    }


}
