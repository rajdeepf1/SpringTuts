package com.example.onetoone_relation.models;

import javax.persistence.*;

@Entity
@Table(name = "users_contact_oneToMany")
public class UsersContactModelForOneToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private Integer phoneNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UsersModelForOneToMany users;


    public UsersContactModelForOneToMany() {
    }


    public UsersContactModelForOneToMany(Integer phoneNo, UsersModelForOneToMany users) {
        this.phoneNo = phoneNo;
        this.users = users;
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

    public UsersModelForOneToMany getUsers() {
        return users;
    }

    public void setUsers(UsersModelForOneToMany users) {
        this.users = users;
    }
}
