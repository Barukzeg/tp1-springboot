package com.example.tp1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User {

    @Getter
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "userId")
    private Integer id;

    @Getter
    @Setter
    private String nom;

    @Getter
    @Setter
    private String motDePasse;

    @Getter
    @Setter
    private String role;
}