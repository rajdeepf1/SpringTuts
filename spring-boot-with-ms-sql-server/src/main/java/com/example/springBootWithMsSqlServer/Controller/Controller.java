package com.example.springBootWithMsSqlServer.Controller;

import com.example.springBootWithMsSqlServer.Dao.StudentRepository;
import com.example.springBootWithMsSqlServer.Dao.TestRepository;
import com.example.springBootWithMsSqlServer.Models.Student;
import com.example.springBootWithMsSqlServer.Models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/ms_sql_server")
public class Controller {

    @Autowired
    TestRepository repository;

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value = "/getData")
    public List<Test> getData(){
        return repository.findAll();
    }

    @GetMapping(value = "/getStudentData")
    public List<Student> getStudentData(){
        return studentRepository.findAll();
    }

    @PostMapping(value = "/insertStudent")
    public String insertData(){


        Student student = new Student();

        student.setName("Rajdeep Singh");
        student.setMarks(77);
        student.setRollNo("77777");

        studentRepository.save(student);

        return "Data Inserted";
    }


}
//https://www.javaguides.net/2019/01/spring-boot-microsoft-sql-server-jpa-hibernate-crud-restful-api-tutorial.html