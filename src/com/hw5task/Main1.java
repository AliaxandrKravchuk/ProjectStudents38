package com.hw5task;

import java.util.Random;

public class Main1 {

    public static void main(String[] args) {

        int[] randomN = new int[5];
        Random random = new Random();
        for (int x = 0; x < randomN.length; x++) {
            randomN[x] = random.nextInt(20);
            System.out.println("- " + randomN[x]);
        }

        int max = randomN[0], min = randomN[0];
        for (int x = 0; x < randomN.length; x++) {
            if (randomN[x] > max)
                max = randomN[x];
            if (randomN[x] < min)
                min = randomN[x];
        }
        System.out.println("Максимальное: " + max + ", " + "Минимальное: " + min);

        double result = 0;
        for (double x : randomN) {
            result = result + x;
        }
        System.out.println("Среднее " + result / randomN.length);
    }
}
