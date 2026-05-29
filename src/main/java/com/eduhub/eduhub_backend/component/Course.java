package com.eduhub.eduhub_backend.component;

public class Course {

    private final String CourseCode;
    private final String CourseName;
    private final int credit;

    public Course(String CourseCode, String CourseName, int credit) {

        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.credit = credit;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getCredit() {
        return credit;
    }
}