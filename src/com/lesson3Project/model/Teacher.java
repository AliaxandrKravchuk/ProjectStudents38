package com.lesson3Project.model;

import com.lesson3Project.base.People;
import com.lesson3Project.util.ComparTeacher;

import java.util.Comparator;


public class Teacher extends People implements Comparable<Teacher> {

    public Teacher(String name, String sname, int age, int pay, int hour, Address address) {
        super(name, sname, age, pay, hour, address);
    }

    public void displayInfo() {
        System.out.println("Учитель:" + "\n ФИО: " + getName() + " " + getSname() + "\n Возраст: " + getAge() + "\n Зарплата: " + zpm() + "\n Адрес: " + getAddress().displayInfo());
    }

    public String toString() {

        return  " " + getName() + " " + getSname();
    }

    static Comparator<Teacher> AgeComparator = new ComparTeacher();

    @Override
    public int compareTo(Teacher o) {
        return this.getAge() - o.getAge();
    }
}
