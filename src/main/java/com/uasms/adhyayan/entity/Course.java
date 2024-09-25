package com.uasms.adhyayan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private Integer code;
    private String name;
    private Integer duration;
    private Long fee;
    private University university;

}
