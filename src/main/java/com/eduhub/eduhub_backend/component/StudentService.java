package com.eduhub.eduhub_backend.component;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public Student getStudent() {

        return new Student(
                101,
                "Mith",
                "ra"
        );
    }
}
