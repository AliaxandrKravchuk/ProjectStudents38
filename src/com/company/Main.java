package com.company;


import com.company.base.Box;
import com.company.model.Annimal;
import com.company.model.Car;
import com.company.util.MaxPowerCarComparator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box<String> boxString = new Box<>("Hello");
        Box<Integer> boxInt= new Box<>(45);

        List<Box> boxes = new ArrayList<Box>(){{
            add(boxString);
            add(boxInt);
        }};

        boxes.stream().filter(b -> b.getT().equals("Hello")).forEach(b -> System.out.println(b));


        Car car1 = new Car("Grey", 500, "Ferrari");
        Car car2 = new Car("Red", 150, "Lamborghini");
        Car car3 = new Car("Black", 450, "Ford");

        List<Car> cars = new ArrayList<Car>() {{
            add(car1);
            add(car2);
            add(car3);
        }};

        cars.stream().sorted().forEach(car -> System.out.println(car));

        Annimal an1 = new Annimal(10, 20);
        Annimal an2 = new Annimal(15, 10);
        Annimal an3 = new Annimal(12, 33);

        List<Annimal> annimals = new ArrayList<Annimal>(){{
            add(an1);
            add(an2);
            add(an3);
        }};

        annimals.stream().sorted().forEach(anni -> System.out.println(anni));

        Comparator powerCompar = new MaxPowerCarComparator();
        cars.stream().sorted(powerCompar).forEach(car -> System.out.println(car));



//        List<Integer> numbers = new ArrayList<Integer>(){{
//            add(5);
//            add(9);
//            add(2);
//        }};
//
//        numbers.stream().sorted().forEach(n -> System.out.println(n));
    }
}
