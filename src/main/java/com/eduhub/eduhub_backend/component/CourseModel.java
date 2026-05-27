package com.eduhub.eduhub_backend.component;

public class CourseModel {

    private int id;
    private String courseName;

    public CourseModel(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }
}