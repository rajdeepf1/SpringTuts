package com.example.onetoone_relation.models;

import javax.persistence.*;

@Entity
@Table(name = "users_contact",catalog = "one_to_one_relation")
public class UsersContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // this line automatically generates auto inc. id and pk
    @Column(name = "id")
    private Integer id;
    private  Integer phoneNo;

    @OneToOne(cascade = CascadeType.ALL) // try to update users table
    @JoinColumn(name = "id",referencedColumnName = "user_id")
    private Users users;


    public UsersContact() {
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


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
