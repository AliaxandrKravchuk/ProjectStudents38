package com.hw7;

public class MainS13 {

    public static void main(String[] args) {
        // write your code here
        String str1 = "25 + 40 = 65";

        StringBuilder sb1 = new StringBuilder(str1);
        sb1 = new StringBuilder(str1);
        sb1.deleteCharAt(8);
        sb1.insert(8, "Равно");
        System.out.println(sb1);

        StringBuilder sb2= new StringBuilder(str1);
        sb2 = new StringBuilder(str1);
        sb2.replace(8, 9, "равно");
        System.out.println(sb2);
    }
}
