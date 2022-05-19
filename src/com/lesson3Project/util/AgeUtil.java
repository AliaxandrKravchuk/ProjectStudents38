package com.lesson3Project.util;

import com.lesson3Project.base.People;
import com.lesson3Project.exception.OldException;
import com.lesson3Project.exception.YoungException;

public class AgeUtil {

    public static void checkAge(People age) {
        try {
            AgeUtil.checkAgeYoung(age);
            AgeUtil.checkAgeOld(age);

        } catch (YoungException | OldException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Конец");
        }

    }

    private static void checkAgeYoung(People age) throws YoungException {
        if (age.getAge() < 16) {
            throw new YoungException("Возраст не подходит(Young)");
        }
    }

    private static void checkAgeOld(People age) throws OldException {
        if (age.getAge() > 100) {
            throw new OldException("Возраст не подходит(Old)");
        }
    }
}
