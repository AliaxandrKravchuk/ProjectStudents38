package com.lesson3Project.service;

import com.lesson3Project.model.Student;
import com.lesson3Project.repository.StudentRepository;

import java.util.List;

public class StudentServise {

    private StudentRepository studentRepository;

    public StudentServise(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public void removeStudents(List<Student> removeStudents){
        removeStudents.forEach(gr -> System.out.println(gr));
        studentRepository.removeStudents(removeStudents);
    }

    public void addStudents(List<Student> newStudents){
        newStudents.forEach(gr -> System.out.println(gr));
        studentRepository.addGroups(newStudents);
    }
}
