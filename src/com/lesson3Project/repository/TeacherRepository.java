package com.lesson3Project.repository;

import com.lesson3Project.model.Group;
import com.lesson3Project.model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {

    private List<Teacher> teachers = new ArrayList<>();

    public void removeTeachers(List<Teacher> removeTeachers) {

        teachers.removeAll(removeTeachers);
    }

    public void addGroups(List<Teacher> newTeachers) {

        teachers.addAll(newTeachers);
    }

    public List<Teacher> getTeachers() {

        return teachers;
    }
}
