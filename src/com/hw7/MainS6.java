package com.hw7;

public class MainS6 {

    public static void main(String[] args) {

        String[] mass1 = {"Я", "изучаю", "Java"};
        String[] mass2 = {"скоро", "стану", "программистом"};

        System.out.println(Pl(mass1) + " " + PlCon(mass2));
    }

    private static String Pl(String[] mass) {
        String mass1 = mass[0];
        return mass1;
    }

    private static String PlCon(String[] mass) {
        String mass2 = mass[1].concat(" ").concat(mass[2]);
        return mass2;
    }
}
