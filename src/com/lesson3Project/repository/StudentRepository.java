package com.lesson3Project.repository;

import com.lesson3Project.model.Group;
import com.lesson3Project.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public void removeStudents(List<Student> removeStudents) {

        students.removeAll(removeStudents);
    }

    public void addGroups(List<Student> newStudents) {

        students.addAll(newStudents);
    }

    public List<Student> getStudents() {

        return students;
    }
}
