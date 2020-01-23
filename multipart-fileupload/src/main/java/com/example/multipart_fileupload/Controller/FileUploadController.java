package com.example.multipart_fileupload.Controller;

import com.example.multipart_fileupload.DAO.FileUploadRepository;
import com.example.multipart_fileupload.Models.FileUploadModel;
import com.example.multipart_fileupload.Models.FileUploadReturnResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@RestController
@RequestMapping("/rest/fileUpload")
public class FileUploadController {

    //destination folder to upload the files
    private static String UPLOAD_FOLDER = "C:\\Users\\DashInternational\\Pictures\\";

    MultipartFile multipartFile;

    @Autowired
    FileUploadRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @PostMapping("/upload")
    public FileUploadReturnResponseModel fileUpload(@RequestPart("file") MultipartFile file) {

        System.out.println(file.getName());

        FileUploadReturnResponseModel model = new FileUploadReturnResponseModel();

        FileUploadModel fileUploadModel = new FileUploadModel();

        if (file.isEmpty()) {
            model.setStatus(false);
            model.setMessage("Please select a file and try again");
            model.setFileUploadData(null);
            return  model;
        }else {
            Path path = null;
            try {
                // read and write the file to the selected location-
                byte[] bytes = file.getBytes();
                path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
                Files.write(path, bytes);

                multipartFile = file;

                fileUploadModel.setImagePath(path.toString());
                repository.save(fileUploadModel);
                model.setStatus(true);
                model.setMessage("File Uploaded sucessfully");
                model.setFileUploadData(fileUploadModel);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        logger.info(multipartFile.toString());

        return model;
    }


    @GetMapping(value = "/getImage/{id}")
    public Optional<FileUploadModel> getData(@PathVariable("id") int id){
        return repository.findById(id);
    }

}
