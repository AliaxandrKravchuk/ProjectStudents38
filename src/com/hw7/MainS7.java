package com.hw7;

public class MainS7 {

    public static void main(String[] args) {
        // write your code here
        String str1 = ("Я изучаю Java");
        String str2 = ("Я изучаю java");
        String str1last5; //= str1.substring(str1.length() - 5);
        String str2last5; //= str2.substring(str2.length() - 5);

        if (str1 == null || str1.length() < 5 || str2 == null || str2.length() < 5) {
            System.out.println("строка короче 5");
        } else {
            str1last5 = str1.substring(str1.length() - 5);
            str2last5 = str2.substring(str2.length() - 5);
            if (str1last5.equals(str2last5))
                System.out.println("Последние 5 символов совпадают");
            else
                System.out.println("Последние 5 символов не совпадают");
        }

        if (str1 == null || str1.length() < 5 || str2 == null || str2.length() < 5) {
            System.out.println("строка короче 5");
        } else {
            str1last5 = str1.substring(str1.length() - 5);
            str2last5 = str2.substring(str2.length() - 5);
            if (str1last5.equalsIgnoreCase(str2last5))
                System.out.println("Последние 5 символов совпадают(без регистра)");
            else {
                System.out.println("Последние 5 символов не совпадают");
            }
        }
    }
}
