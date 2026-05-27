package com.eduhub.eduhub_backend.Controller;

import com.eduhub.eduhub_backend.component.CourseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/course")
    public CourseModel getCourse() {

        return new CourseModel(
                101,
                "Spring Boot"
        );
    }
}