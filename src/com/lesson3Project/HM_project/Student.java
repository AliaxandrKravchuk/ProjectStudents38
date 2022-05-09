package com.lesson3Project.HM_project;

public class Student {

    private String name;    // имя (возмость изменения)
    private String sname;// фамилия (возмость изменения)
    private int age; // возраст
    private Address address; // адрес из Address!


    public void setName(String name) {
        this.name = name;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным!");
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, String sname, int age, Address address) {
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println ("Студент:" + "\n ФИО: " + name + " " + sname + "\n Возраст: " + age + "\n Адрес: " + address.displayInfo());
    }

    public String displayInfoName() {
        return " " + name + " " + sname;
    }
}
