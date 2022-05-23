package com.lesson3Project.repository;

import com.lesson3Project.model.Group;
import com.lesson3Project.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> students = new ArrayList<>();

    public static void removeStudents(List<Student> removeStudents) {

        students.removeAll(removeStudents);
    }

    public static void addStudents(List<Student> newStudents) {

        students.addAll(newStudents);
    }

    public static List<Student> getStudents() {

        return students;
    }
}
