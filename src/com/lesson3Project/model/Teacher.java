package com.lesson3Project.model;

import com.lesson3Project.base.People;


public class Teacher extends People {

    public Teacher(String name, String sname, int age, int pay, int hour, Address address) {
        super(name, sname, age, pay, hour, address);
    }

    public void displayInfo() {
        System.out.println("Учитель:" + "\n ФИО: " + getName() + " " + getSname() + "\n Возраст: " + getAge() + "\n Зарплата: " + zpm() + "\n Адрес: " + getAddress().displayInfo());
    }

    public String displayInfoName() {
        return  " " + getName() + " " + getSname();
    }
}
