package com.uasms.adhyayan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/users")
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok().body("User Fetched!!");
    }

    @PostMapping("/users")
    public ResponseEntity<String> insertUser(){
        return ResponseEntity.ok().body("User Inserted!!");
    }

    @DeleteMapping("/users")
    public ResponseEntity<String> deleteUser(){
        return ResponseEntity.ok().body("User Deleted!!");
    }

    @PutMapping("/users")
    public ResponseEntity<String> updateUser(){
        return ResponseEntity.ok().body("User Updated!!");
    }

}
