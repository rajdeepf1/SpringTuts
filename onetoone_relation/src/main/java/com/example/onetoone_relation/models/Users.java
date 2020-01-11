package com.example.onetoone_relation.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "userName")
    private String userName;

    @OneToOne(mappedBy = "users", cascade = CascadeType.ALL)
    @JsonManagedReference
    private UsersContact usersContact;

    public Users() {
    }


    public Users(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UsersContact getUsersContact() {
        return usersContact;
    }

    public void setUsersContact(UsersContact usersContact) {
        this.usersContact = usersContact;
    }
}
