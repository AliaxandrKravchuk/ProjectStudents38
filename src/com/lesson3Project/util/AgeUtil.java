package com.lesson3Project.util;

import com.lesson3Project.exception.OldException;
import com.lesson3Project.exception.YoungException;

public class AgeUtil {

    public static void checkAge(int age) {
        try {
            checkAgeYoung(age);
            checkAgeOld(age);

            System.out.println("Возраст подходит");

        } catch (YoungException | OldException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Конец");
        }

    }

    private static void checkAgeYoung(int age) throws YoungException {
        if (age < 16) {
            throw new YoungException("Возраст меньше 16");
        }
    }

    private static void checkAgeOld(int age) throws OldException {
        if (age > 100) {
            throw new OldException("Возраст больше 100");
        }
    }
}
