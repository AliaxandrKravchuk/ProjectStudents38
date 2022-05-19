package com.lesson3Project.util;

import com.lesson3Project.model.Teacher;

import java.util.Comparator;

public class ComparTeacher implements Comparator<Teacher> {

    @Override
    public int compare(Teacher t1, Teacher t2) {
        return t1.getAge() - t2.getAge();
    }
}
