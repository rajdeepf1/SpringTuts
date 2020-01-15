package com.example.onetoone_relation.Controller;

import com.example.onetoone_relation.dao.UsersRepositoryForOnetoMany;
import com.example.onetoone_relation.models.UsersModelForOneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/usersOneToMany")
public class ControllerForUsers_OneToMany {

    @Autowired
    UsersRepositoryForOnetoMany repository;

    @GetMapping("/all")
    public List<UsersModelForOneToMany> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{name}")
    public List<UsersModelForOneToMany> getUser(@PathVariable("name") final String name) {
        return repository.findByName(name);

    }

    /*@GetMapping("/id/{id}")
    public UsersModelForOneToMany getId(@PathVariable("id") final UsersModelForOneToMany id) {
        return repository.findOne(id);
    }*/

    @GetMapping("/update/{id}/{name}")
    public UsersModelForOneToMany update(@PathVariable("id") final Integer id, @PathVariable("name")
    final String name) {


        UsersModelForOneToMany users = new UsersModelForOneToMany();
        users.getId(id);
        users.setName(name);

        return repository.save(users);
    }

}
