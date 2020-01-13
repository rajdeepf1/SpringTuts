package com.example.springBootWithMsSqlServer.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "TestTable")
public class Test {

    @Id
    int id;

    String name;

    int rollNo;


    public Test() {
    }


    public Test(int id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
