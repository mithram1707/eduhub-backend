package com.eduhub.eduhub_backend.component;

public class Course {

    private String CourseCode;
    private String CourseName;
    private int credit;

    public Course(String CourseCode, String CourseName, int credit) {

        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.credit = credit;
    }
}