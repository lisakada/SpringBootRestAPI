package com.example.SBRestAPIdemo.model;

import javax.persistence.*;

@Entity
@Table(name="Cat")
public class Cat {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Cat() {
    }

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
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
}