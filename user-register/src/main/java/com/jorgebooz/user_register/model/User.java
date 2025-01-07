package com.jorgebooz.user_register.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name ;

    @Column(nullable = false, unique = true)
    private String email;
}
