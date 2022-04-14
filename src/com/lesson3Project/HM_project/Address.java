package com.lesson3Project.HM_project;

public class Address {
// возмость изменения

    private String city;    // город
    private String street;// улица
    private int home; // дом
    private int room; // квартира

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Address(String city, String street, int home, int room) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.room = room;
    }

    public String displayInfo() {
        return "\n -Город: " + city + "\n -Улица: " + street + "\n -Дом: " + home + "\n -Квартира: " + room;
    }

}