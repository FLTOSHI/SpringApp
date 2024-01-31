package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "criminal")
public class criminalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String lastName;
    private String firstName;
    private String nickName;
    private int height;
    private String unusual;
    private String homeland;
    private String dateOfBirth;
    private String criminalJob;
    private String lastJob;
}
