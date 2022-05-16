package com.lesson3Project;

import com.lesson3Project.model.Address;
import com.lesson3Project.model.Group;
import com.lesson3Project.model.Student;
import com.lesson3Project.model.Teacher;

public class Main {

    public static void main(String[] args) {

        Address addressSt1 = new Address("Минск", "Ленина", 9, 9);
        Student student1 = new Student("Александр", "Какой-то", 18, addressSt1);
        student1.setAge(-10);
        student1.displayInfo();

        Address addressSt2 = new Address("Minsk", "a2", 2, 2);
        Student student2 = new Student("n2", "s2", 10, addressSt2);
        //student2.displayInfo();

        Address addressSt3 = new Address("Minsk", "a3", 3, 3);
        Student student3 = new Student("n3", "s3", 10, addressSt3);
        //student3.displayInfo();

        Address addressT1 = new Address("Минск", "Есенина", 1, 11);
        Teacher teacher1 = new Teacher("Учитель", "Препод", 26, 100, 30, addressT1);
        teacher1.setAge(-12);
        teacher1.displayInfo();

        Group group = new Group("Java", "38", student1, teacher1);
        group.displayInfo();



    }
}
