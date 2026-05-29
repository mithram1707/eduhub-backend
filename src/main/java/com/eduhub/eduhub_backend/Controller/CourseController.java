package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.component.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    static List<Course> courseList = new ArrayList<>();

    static {

        courseList.add(new Course("C101", "DSA", 4));
        courseList.add(new Course("C102", "Java Programming", 3));
        courseList.add(new Course("C103", "Spring Boot", 4));
        courseList.add(new Course("C104", "Database Management", 3));
        courseList.add(new Course("C105", "Operating Systems", 4));
    }

    @GetMapping("/course")
    public List<Course> getCourse() {


        return courseList;
    }
}