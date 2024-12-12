package com.example.tp1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Fav {

    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "articleId")
    private Article article;

    @Getter
    @Setter
    private Boolean liked;
}
