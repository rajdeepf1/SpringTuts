package com.example.onetoone_relation.Controller;

import com.example.onetoone_relation.dao.UsersContactRepository;
import com.example.onetoone_relation.dao.UsersRepository;
import com.example.onetoone_relation.models.Users;
import com.example.onetoone_relation.models.UsersContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rest/oneToOneRel")
@RestController
public class Controller {

    @Autowired
    private UsersContactRepository usersContactRepository;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Users> getUsersContact(){
        return usersRepository.findAll();
    }


    @PostMapping(value = "/insert")
    public String insertData(){

        //usersRepository.deleteAllInBatch();
        //usersContactRepository.deleteAllInBatch();

        // Create a User instance
        Users user = new Users();
        user.setUserName("Rajdeep Singh");

        // Create a UsersContact instance
        UsersContact usersContact = new UsersContact();
        usersContact.setPhoneNo(12345);
        usersContact.setAddress("Delhi");

        // Set child reference(UsersContact) in parent entity(user)

        user.setUsersContact(usersContact);

        // Set parent reference(user) in child entity(UsersContact)

        usersContact.setUsers(user);



// Save Parent Reference (which will save the child as well)
        usersRepository.save(user);

        return "Data Inserted";
    }



//    @PutMapping(value = "/update/{id}")
//    public List<UsersContact> updateData(@RequestParam Integer phoneNo,@RequestParam String name,@RequestParam Integer salary,@RequestParam String teamName){
//
//        UsersContact usersContact = new UsersContact();
//        usersContact.setPhoneNo(phoneNo);
//
//        Users users = new Users();
////        users.setName(name);
////        users.setSalary(salary);
////        users.setTeamName(teamName);
////
////        usersContact.setUsers(users);
//
//        repository.save(usersContact);
//
//        return repository.findAll();
//    }

}
