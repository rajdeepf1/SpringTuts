package com.example.MappingRelationsPracticalTelusko.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class StudentModel  {

    @Id
    private int rollno;

    private String name;
    private int marks;

    @OneToOne(fetch = FetchType.LAZY)
    private LaptopModel laptopModel;



    public LaptopModel getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(LaptopModel laptopModel) {
        this.laptopModel = laptopModel;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
