package com.hw5task;

import com.hw5task.sort.Bubble;
import com.hw5task.sort.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class MainSort {

    public static void main(String[] args) {

        int[] randomN = new int[5];
        Random random = new Random();
        for (int x = 0; x < randomN.length; x++) {
            randomN[x] = random.nextInt(99);
            System.out.println("- " + randomN[x]);
        }
        //Пузырьком
//        Bubble r2 =new Bubble();
//        r2.bubble(randomN);
//        System.out.println("Сортировка пузырьком: " + Arrays.toString(randomN));

        //Быстрая
        QuickSort.quickSort(randomN, 0, randomN.length-1);
        System.out.println("Быстрая сортировка: " + Arrays.toString(randomN));
    }
}
