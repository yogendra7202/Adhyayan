package com.uasms.adhyayan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class User {

    @Id
    private Integer id;
    private Long phoneNo;
    private String email;
    private Date dateOfBirth;
    private String address;
    private Course course;

}
