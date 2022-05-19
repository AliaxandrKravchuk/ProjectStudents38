package com.lesson3Project.model;

import com.lesson3Project.base.People;

public class Student extends People {


    public Student(String name, String sname, int age, Address address) {

        super(name, sname, age, address);
    }

    public void displayInfo() {
        System.out.println ("Студент:" + "\n ФИО: " + getName() + " " + getSname() + "\n Возраст: " + getAge() + "\n Адрес: " + getAddress().displayInfo());
    }

    public String toString() {

        return " " + getName() + " " + getSname();
    }
}
