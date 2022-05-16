package com.lesson3Project.model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;    // название
    private String clas;//  курс
    private List<Student> students; // ученик из Student(изм)
    private List<Teacher> teachers; // препод из Teacher(изм)

    public Group(String name, String clas, List<Student> students, List<Teacher> teachers) {
        this.name = name;
        this.clas = clas;
        this.students = students;
        this.teachers = teachers;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setClas(String clas) {

        this.clas = clas;
    }



    public void displayInfo() {
        System.out.println("Группа:" + "\n Название: " + name + "\n Курс: " + clas
                + "\n Имя студента: " + students + "." + "\n Имя преподователя: " + teachers + ".");
    }
}
