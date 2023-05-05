package com.example.demo;


public class Cat {
    int id;
    String name;


    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat() {

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

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
