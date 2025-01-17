package com.jonatas.crudspring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonatas.crudspring.model.Course;
import com.jonatas.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    
    
    private final CourseRepository courseRepository;

    
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @GetMapping
    public java.util.List<Course> list(){
        return courseRepository.findAll();
    }
}
