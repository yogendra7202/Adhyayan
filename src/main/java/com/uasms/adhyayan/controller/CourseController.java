package com.uasms.adhyayan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public ResponseEntity<String> getCourse(){
        return ResponseEntity.ok().body("Course Fetched!!");
    }

    @PostMapping("/courses")
    public ResponseEntity<String> insertCourse(){
        return ResponseEntity.ok().body("Course Inserted!!");
    }

    @DeleteMapping("/courses")
    public ResponseEntity<String> deleteCourse(){
        return ResponseEntity.ok().body("Course Deleted!!");
    }

    @PutMapping("/courses")
    public ResponseEntity<String> updateCourse(){
        return ResponseEntity.ok().body("Course Updated!!");
    }

}
