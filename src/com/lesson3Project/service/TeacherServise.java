package com.lesson3Project.service;

import com.lesson3Project.model.Teacher;
import com.lesson3Project.repository.TeacherRepository;

import java.util.List;

public class TeacherServise {

    private TeacherRepository teacherRepository;

    public TeacherServise(TeacherRepository teacherRepository) {

        this.teacherRepository = teacherRepository;
    }

    public void removeTeachers(List<Teacher> removeTeachers){
        removeTeachers.forEach(gr -> System.out.println(gr));
        teacherRepository.removeTeachers(removeTeachers);
    }

    public void addTeachers(List<Teacher> newTeachers){
        newTeachers.forEach(gr -> System.out.println(gr));
        teacherRepository.addGroups(newTeachers);
    }
}
