package com.uasms.adhyayan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;


@Data
@Entity
public class User {

    @Id
    private Integer id;
    private String name;
    private Long phoneNo;
    private String email;
    private Date dateOfBirth;
    private String address;
    private Course course;

}
