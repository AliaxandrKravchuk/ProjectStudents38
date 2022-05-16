package com.lesson3Project.model;

public class Group {

    private String name;    // название
    private String clas;//  курс
    private Student nameStudent; // ученик из Student(изм)
    private Teacher nameTeacher; // препод из Teacher(изм)

    public Group(String name, String clas, Student nameStudent, Teacher nameTeacher) {
        this.name = name;
        this.clas = clas;
        this.nameStudent = nameStudent;
        this.nameTeacher = nameTeacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void displayInfo() {
        System.out.println("Группа:" + "\n Название: " + name + "\n Курс: " + clas
        +"\n Имя студента: " + nameStudent.displayInfoName() + "\n Имя преподователя: " + nameTeacher.displayInfoName());
    }
}
