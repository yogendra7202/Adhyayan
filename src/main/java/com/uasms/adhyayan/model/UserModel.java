package com.uasms.adhyayan.model;

import com.uasms.adhyayan.entity.Course;
import java.util.Date;


public record UserModel(
        Integer id,
        String name,
        Long phoneNo,
        String email,
        Date dateOfBirth,
        String address,
        Course course
) {
    public UserModel(Integer id, String name, Long phoneNo, String email,
                     Date dateOfBirth, String address, Course course) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.course = course;
    }
}
