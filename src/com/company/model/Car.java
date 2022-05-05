package com.company.model;

public class Car implements Comparable<Car> {

    private String color;
    private int power;
    private String model;

    public Car(String color, int power, String model) {
        this.color = color;
        this.power = power;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car: " +
                "color='" + color + '\'' +
                ", power=" + power +
                ", model='" + model + '\'' +
                '.';

    }

    @Override
    public int compareTo(Car o) {
        int rez = this.model.compareTo(o.model);
        if (rez == 0) {
            rez = this.color.compareTo(o.color);
            if (rez == 0) {
                rez = this.power - o.power;
            }
        }

        return rez;
    }
}
