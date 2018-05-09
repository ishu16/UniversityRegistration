package com.company;

public class Student extends Person {

    public Student(int StudentID, String name, String address) {

        super(name, address);
        this.StudentID = StudentID;

    }

    public int getStudentID() {
        return StudentID;
    }

    private int StudentID;




}