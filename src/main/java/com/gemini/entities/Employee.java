package com.gemini.entities;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Employee {
    private int id;
    private String name;
    private String department;
}
