package com.lesson3Project;

import com.lesson3Project.base.People;
import com.lesson3Project.exception.AgeException;
import com.lesson3Project.exception.OldException;
import com.lesson3Project.exception.YoungException;
import com.lesson3Project.model.*;
import com.lesson3Project.util.AgeUtil;
import com.lesson3Project.util.Converter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Address addressSt1 = new Address("Минск", "Ленина", 9, 9);
        Student student1 = new Student("Александр", "Какой-то", 18, addressSt1);
//        student1.setAge(-10);
        student1.displayInfo();

        Address addressSt2 = new Address("Minsk", "a2", 2, 2);
        Student student2 = new Student("n2", "s2", 10, addressSt2);
        //student2.displayInfo();

        Address addressSt3 = new Address("Minsk", "a3", 3, 3);
        Student student3 = new Student("n3", "s3", 199, addressSt3);
        student3.setAge(2555);
//        try {
//            AgeUtil.checkAge(student3);
//
//        } catch (Exception wrap) {
//
//            Exception cause = (Exception) wrap.getCause();
//
//            if (cause != null) {
//                System.out.println("Not pass, cause: " + cause.getMessage());
//            } else {
//                System.out.println(wrap.getMessage());
//            }
//        }
        student3.displayInfo();

        Address addressT1 = new Address("Минск", "Есенина", 1, 11);
        Teacher teacher1 = new Teacher("Учитель", "Препод", 26, 100, 30, addressT1);
//        teacher1.setAge(-12);
        teacher1.displayInfo();

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);

        Group group = new Group("Java", 38, students, teachers);
        group.displayInfo();

        Converter<Teacher, Metodist> converter = m -> new Metodist(m.getName(), m.getSname(), m.getAge(), m.getAddress());
        Metodist methodist = converter.convert(teacher1);
        methodist.displayInfo();


    }
}