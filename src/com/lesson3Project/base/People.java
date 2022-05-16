package com.lesson3Project.base;

import com.lesson3Project.model.Address;

public abstract class People {

    private String name;    // имя (возмость изменения)
    private String sname;// фамилия (возмость изменения)
    private int age; // возраст
    private Address address; // адрес из Address!
    private int pay; // зарплата (возмость изменения)
    private int hour;//зп за месяц(часы)

    public void setPay(int pay) {

        this.pay = pay;
    }

    public int zpm() {

        return hour * pay;
    }

    public People(String name, String sname, int age, int pay, int hour, Address address) {
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.pay = pay;
        this.hour = hour;
        this.address = address;
    }

    public People(String name, String sname, int age, Address address) {
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным!");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPay() {

        return pay;
    }

    public int getHour() {

        return hour;
    }

    public void setHour(int summ) {

        this.hour = hour;
    }
}

