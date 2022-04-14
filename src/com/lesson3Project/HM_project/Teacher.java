package com.lesson3Project.HM_project;

public class Teacher {

    private String name;    // имя (возмость изменения)
    private String sname;// фамилия (возмость изменения)
    private int age; // возраст
    private Address address; // адрес из Address!
    private int pay; // зарплата (возмость изменения)
    private int summ = zpm();//зп за месяц


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

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getAge() {
        return age;
    }

    public Teacher(String name, String sname, int age, int pay, Address address) {
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.pay = pay;
        this.address = address;
    }

    public int zpm(){
        summ = pay * 30;
        return summ;
    }

    public void displayInfo() {
        System.out.println("Учитель:" + "\n ФИО: " + name + " " + sname + "\n Возраст: " + age + "\n Зарплата: " + zpm() + "\n Адрес: " + address.displayInfo());
    }

    public String displayInfoName() {
        return  " " + name + " " + sname;
    }
}
