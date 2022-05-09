package com.hw5task;


public class Main2 {

    public static void main(String[] args) {
        int a = 3, b = 120;
        for (int i = a; i <= b; i++) {
            if (random(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean random(int x) {
        if (x < 0) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return true;
            }
        }
        return false;
    }
}