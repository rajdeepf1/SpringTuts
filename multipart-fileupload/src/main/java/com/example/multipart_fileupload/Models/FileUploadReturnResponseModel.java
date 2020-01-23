package com.example.multipart_fileupload.Models;

public class FileUploadReturnResponseModel {

    private boolean status;
    private String message;

    private FileUploadModel fileUploadData;

    public FileUploadReturnResponseModel() {
    }


    public FileUploadReturnResponseModel(boolean status, String message, FileUploadModel fileUploadData) {
        this.status = status;
        this.message = message;
        this.fileUploadData = fileUploadData;
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

    public FileUploadModel getFileUploadData() {
        return fileUploadData;
    }

    public void setFileUploadData(FileUploadModel fileUploadData) {
        this.fileUploadData = fileUploadData;
    }
}
