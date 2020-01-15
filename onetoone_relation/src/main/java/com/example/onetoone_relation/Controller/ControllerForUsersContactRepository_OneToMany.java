package com.example.onetoone_relation.Controller;

import com.example.onetoone_relation.dao.UsersContactRepositoryForOneToMany;
import com.example.onetoone_relation.models.UsersContactModelForOneToMany;
import com.example.onetoone_relation.models.UsersModelForOneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/rest/userscontactOneToMany")
@RestController
public class ControllerForUsersContactRepository_OneToMany {

    @Autowired
    private UsersContactRepositoryForOneToMany usersContactRepository;

    @GetMapping(value = "/all")
    public List<UsersContactModelForOneToMany> getUsersContact() {
        return usersContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<UsersContactModelForOneToMany> update(@PathVariable final String name) {

        UsersContactModelForOneToMany usersContact = new UsersContactModelForOneToMany();

        UsersModelForOneToMany users = new UsersModelForOneToMany();
        users.setTeamName("Development");
        users.setSalary(10000);
        users.setName(name);


        usersContact.setPhoneNo(11111);
        usersContact.setUsers(users);

        usersContactRepository.save(usersContact);

        return usersContactRepository.findAll();


    }



    @GetMapping(value = "/insertData")
    public String insert() {

        UsersContactModelForOneToMany usersContact = new UsersContactModelForOneToMany();

        UsersModelForOneToMany users = new UsersModelForOneToMany();
        users.setTeamName("Development");
        users.setSalary(10000);
        users.setName("Rajdeep");


        usersContact.setPhoneNo(11111);
        usersContact.setUsers(users);

        usersContactRepository.save(usersContact);

        return "Data Saved";


    }



}
