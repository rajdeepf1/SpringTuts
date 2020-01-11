package com.example.onetoone_relation.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "users_contact")
public class UsersContact {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO) // this line automatically generates auto inc. id and pk
    @Column(name = "id")
    private Integer id;

    @Column(name = "phoneNo")
    private  Integer phoneNo;

    @Column(name = "address")
    private String address;

    @OneToOne
    @MapsId
    @JsonBackReference
    private Users users;

    public UsersContact() {
    }

    public UsersContact(Integer phoneNo, String address) {
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
