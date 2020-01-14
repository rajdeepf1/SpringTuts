package com.example.multipart_fileupload.Controller;

import com.example.multipart_fileupload.Models.FileUploadReturnResponseModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/rest/fileUpload")
public class FileUploadController {

    //destination folder to upload the files
    private static String UPLOAD_FOLDER = "C:\\Users\\DashInternational\\Pictures\\Saved Pictures";

    MultipartFile multipartFile;

    @PostMapping("/upload")
    public FileUploadReturnResponseModel fileUpload(@RequestPart("file") MultipartFile file,@RequestPart("desc") MultipartFile desc) {

        System.out.println(file.getName()+" "+desc);

        FileUploadReturnResponseModel model = new FileUploadReturnResponseModel();

        if (file.isEmpty()) {
            model.setStatus(false);
            model.setMessage("Please select a file and try again");
            return  model;
        }
        Path path = null;
        try {
            // read and write the file to the selected location-
            byte[] bytes = file.getBytes();
            path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

            multipartFile = file;

        } catch (IOException e) {
            e.printStackTrace();
        }

        model.setStatus(true);
        model.setMessage("File Uploaded sucessfully"+"path :  "+path.toString());

        return model;
    }


    @GetMapping(value = "/getImage")
    public String getData(){
        Path path = Paths.get(UPLOAD_FOLDER + multipartFile.getOriginalFilename());
        return path.toString();
    }

}
