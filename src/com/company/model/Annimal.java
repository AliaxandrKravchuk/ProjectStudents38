package com.company.model;

public class Annimal implements Comparable<Annimal> {

    private int age;
    private int weight;

    public Annimal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Annimal: " +
                "age=" + age +
                ", weight=" + weight +
                '.';
    }

    @Override
    public int compareTo(Annimal o) {
        return this.age - o.age;
    }
}
