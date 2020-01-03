package com.example.onetoone_relation.Controller;

import com.example.onetoone_relation.dao.UsersContactRepository;
import com.example.onetoone_relation.models.Users;
import com.example.onetoone_relation.models.UsersContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rest/userscontact")
@RestController
public class Controller {

    @Autowired
    private UsersContactRepository repository;

    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact(){
        return repository.findAll();
    }


    @PostMapping(value = "/insert")
    public List<UsersContact> insertData(@RequestParam Integer phoneNo,@RequestParam String name,@RequestParam Integer salary,@RequestParam String teamName){

        UsersContact usersContact = new UsersContact();
        usersContact.setPhoneNo(phoneNo);

        Users users = new Users();
        users.setName(name);
        users.setSalary(salary);
        users.setTeamName(teamName);
        users.setUser_Id(usersContact.getId());

        usersContact.setUsers(users);

        repository.save(usersContact);

        return repository.findAll();
    }


    @PutMapping(value = "/update/{id}")
    public List<UsersContact> updateData(@RequestParam Integer phoneNo,@RequestParam String name,@RequestParam Integer salary,@RequestParam String teamName){

        UsersContact usersContact = new UsersContact();
        usersContact.setPhoneNo(phoneNo);

        Users users = new Users();
        users.setName(name);
        users.setSalary(salary);
        users.setTeamName(teamName);

        usersContact.setUsers(users);

        repository.save(usersContact);

        return repository.findAll();
    }

}
