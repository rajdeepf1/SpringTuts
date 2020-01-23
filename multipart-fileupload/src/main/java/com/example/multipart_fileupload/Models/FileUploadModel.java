package com.example.multipart_fileupload.Models;

import javax.persistence.*;

@Entity
@Table(name = "file_Upload_table")
public class FileUploadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String imagePath;

    public FileUploadModel() {
    }


    public FileUploadModel(String imagePath) {
        this.imagePath = imagePath;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


    @Override
    public String toString() {
        return "FileUploadModel{" +
                "id=" + id +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
