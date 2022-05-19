package com.lesson3Project.model;

import com.lesson3Project.base.People;

public class Metodist extends People {

    private String metodist;

    public Metodist(String name, String sname, int age, Address address) {
        super(name, sname, age, address);
        this.metodist = new String(getName() + " " + getSname() + ", " + " " + "возраст: " + getAge() + ", " + getAddress());
    }

    public String getMetodist() {
        return metodist;
    }

    public void displayInfo() {
        System.out.println("Методист:"+ "\n" + getMetodist());
    }
}
