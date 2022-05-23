package com.lesson3Project.util;

import com.lesson3Project.exception.ReaderException;
import com.lesson3Project.model.Address;
import com.lesson3Project.model.Student;
import com.lesson3Project.model.Teacher;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

    public static Teacher addTeacher(String[] value) {
        return new Teacher(value[0], value[1], Integer.valueOf(value[2], 10), new Address(value[3], value[4], Integer.valueOf(value[5], 10), Integer.valueOf(value[6], 10)));
    }

    public static Student addStudent(String[] value) {
        return new Student(value[0], value[1], Integer.valueOf(value[2], 10), new Address(value[3], value[4], Integer.valueOf(value[5], 10), Integer.valueOf(value[6], 10)));
    }

    public static String[] StringParser(String data) {
        return data.replaceAll("[\\W]", " ").split(" ");
    }

    public static FileInputStream FileCheckOpen(String patch) throws ReaderException {
        try {
            return new FileInputStream(patch);
        } catch (IOException e) {
            throw new ReaderException("Файл: ".concat(patch).concat(" не найден!"));}
    }

    public static ArrayList<String> ListParser(String patch) {
        FileInputStream fileInputStream = null;
        ArrayList<String> listDataString = new ArrayList<>();
        try {
            fileInputStream = FileCheckOpen(patch);
            StringBuilder str = new StringBuilder();
            int a;
            while ((a = fileInputStream.read()) != -1) {
                str.append((char) a);
                if ((char) a == '\n') {
                    listDataString.add(String.valueOf(str));
                    str = new StringBuilder();}
            }
            return listDataString;
        } catch (ReaderException e) {
            System.out.printf(e.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();}
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                return listDataString;}
        }
    }
}