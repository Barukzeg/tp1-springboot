package com.example.tp1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User {

    public enum Role {
        MODERATOR,
        PUBLISHER
    }

    @Getter
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "userId")
    private Integer id;

    @Getter
    @Setter
    private String pseudo;

    @Getter
    @Setter
    private String motDePasse;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Role role;
}