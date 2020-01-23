package com.example.multipart_fileupload.DAO;

import com.example.multipart_fileupload.Models.FileUploadModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<FileUploadModel,Integer> {
}
