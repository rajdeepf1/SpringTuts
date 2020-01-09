package com.example.MappingRelationsPracticalTelusko.Controller;


import com.example.MappingRelationsPracticalTelusko.dao.StudentRepository;
import com.example.MappingRelationsPracticalTelusko.models.LaptopModel;
import com.example.MappingRelationsPracticalTelusko.models.StudentLaptopModel;
import com.example.MappingRelationsPracticalTelusko.models.StudentModel;
import com.example.MappingRelationsPracticalTelusko.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@RequestMapping("/rest/telusko")
@RestController
public class Controller  {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping(value = "/insertData")
    public String insertData(){
//@RequestBody StudentLaptopModel model

        LaptopModel laptopModel = new LaptopModel();

        StudentModel studentModel = new StudentModel();
        studentModel.setName("Rajdeep");
        studentModel.setRollno(1);
        studentModel.setMarks(70);

        laptopModel.setLid(101);
        laptopModel.setLname("Macbook pro");

        studentModel.setLaptopModel(laptopModel);


          studentRepository.save(studentModel);

        return "Data Inserted successfully !";
    }


    @GetMapping(value = "/showAllData")
    public List<StudentModel> getUsersContact(){
        return studentRepository.findAll();
    }

    // this method recieves data in x-www-form-urlencoded (data should be in Map) and hides data in the url
    @PostMapping(value = "/getDataInBody",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDataInBody(@RequestBody MultiValueMap map){
        System.out.println(map.get("name")+"\n"+map.get("marks"));
        return map.toString();
    }

    /*StudentModel studentModel = new StudentModel();
        studentModel.setName(map.get("name"));
        studentModel.setMarks();*/

    @RequestMapping(value = "/insertUserData", method = RequestMethod.POST)
    @ResponseBody
    public UserModel insertUser (@RequestBody UserModel user) {
        //logger.debug("I am in the controller and got user name: " + user.toString());
        System.out.println(user.getName()+"\n"+user.getMarks());
        return user;
    }


}
