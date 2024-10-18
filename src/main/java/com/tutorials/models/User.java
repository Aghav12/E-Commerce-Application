package com.tutorials.models;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = false)
    private  String name;

    //consider as User-Name
    @Column(unique = true)
    private String email;

    private String password;

    private String gender;

    private String phoneNo;

    private String address;

    private String about;

    private Date createdAt;

    private boolean active;
}
