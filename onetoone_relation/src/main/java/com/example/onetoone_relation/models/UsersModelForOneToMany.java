package com.example.onetoone_relation.models;

import javax.persistence.*;

@Entity
@Table(name = "users_oneToMany")
public class UsersModelForOneToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    private Integer salary;
    private String teamName;


    public UsersModelForOneToMany() {
    }


    public UsersModelForOneToMany(String name, Integer salary, String teamName) {
        this.name = name;
        this.salary = salary;
        this.teamName = teamName;
    }


    public Integer getId(Integer id) {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
