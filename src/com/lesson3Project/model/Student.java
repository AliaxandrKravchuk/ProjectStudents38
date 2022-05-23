package com.lesson3Project.model;

import com.lesson3Project.base.People;

public class Student extends People {

    private String studentInfo;

    public Student(String name, String sname, int age, Address address) {

        super(name, sname, age, address);
    }

    public void displayInfo() {
        System.out.println ("Студент:" + "\n ФИО: " + getName() + " " + getSname() + "\n Возраст: " + getAge() + "\n Адрес: " + getAddress().toString());
    }

    public String getStudentInfo() {
        return studentInfo;
    }

    public String toString() {

        return " " + getName() + " " + getSname();
    }
}
