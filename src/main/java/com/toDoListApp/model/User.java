package com.toDoListApp.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table (name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String sex;

    @Column (name = "registration_date")
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private LocalDate registrationDate = LocalDate.now();
}

