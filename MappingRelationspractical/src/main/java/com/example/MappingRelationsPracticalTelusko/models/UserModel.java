package com.example.MappingRelationsPracticalTelusko.models;

public class UserModel {

    String name;
    String marks;

    public UserModel() {
    }


    public UserModel(String name, String marks) {
        this.name = name;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
