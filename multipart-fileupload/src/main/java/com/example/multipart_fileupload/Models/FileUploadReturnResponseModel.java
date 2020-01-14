package com.example.multipart_fileupload.Models;

public class FileUploadReturnResponseModel {

    private boolean status;
    private String message;

    public FileUploadReturnResponseModel() {
    }

    public FileUploadReturnResponseModel(boolean status, String message) {
        this.status = status;
        this.message = message;
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
}
