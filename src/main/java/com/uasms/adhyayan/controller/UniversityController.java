package com.uasms.adhyayan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UniversityController {

    @GetMapping("/universities")
    public ResponseEntity<String> getUniversity(){
        return ResponseEntity.ok().body("University Fetched!!");
    }

    @PostMapping("/universities")
    public ResponseEntity<String> insertUniversity(){
        return ResponseEntity.ok().body("University Inserted!!");
    }

    @DeleteMapping("/universities")
    public ResponseEntity<String> deleteUniversity(){
        return ResponseEntity.ok().body("University Deleted!!");
    }

    @PutMapping("/universities")
    public ResponseEntity<String> updateUniversity(){
        return ResponseEntity.ok().body("University Updated!!");
    }

}
