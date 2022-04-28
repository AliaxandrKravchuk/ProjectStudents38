package com.company;

import com.company.model.Dog;
import com.company.model.Raccoon;
import com.company.util.Converter;

public class Main {

    public static void main (String[] arg) {

        Converter<String, Integer> converter = el -> el.toString();

        int age = 45;
        String ageStr = converter.convert(age);

        Converter<Raccoon, Dog> dogConverter = dog -> new Raccoon(dog.getName(), dog.getAge(), "Grey");

        Dog dog = new Dog("Mike", 12, 30);
        Raccoon raccoon = dogConverter.convert(dog);
        System.out.println(raccoon.getName() + " " + raccoon.getAge() + " " + raccoon.getColor());
    }
}
