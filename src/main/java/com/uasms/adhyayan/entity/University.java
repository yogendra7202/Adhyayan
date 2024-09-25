package com.uasms.adhyayan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class University {

    @Id
    private Integer code;
    private String name;
    private String location;
    private Date established;
    private String contact;

}
