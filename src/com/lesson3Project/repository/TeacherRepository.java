package com.lesson3Project.repository;

import com.lesson3Project.model.Group;
import com.lesson3Project.model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {

    private static List<Teacher> teachers = new ArrayList<>();

    public static void removeTeachers(List<Teacher> removeTeachers) {

        teachers.removeAll(removeTeachers);
    }

    public static void addTeachers(List<Teacher> newTeachers) {

        teachers.addAll(newTeachers);
    }

    public static List<Teacher> getTeachers() {

        return teachers;
    }
}
