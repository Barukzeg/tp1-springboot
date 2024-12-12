package com.example.tp1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Article {

    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "articleId")
    private Integer id;

    @Getter
    @Setter
    private String publishedDate;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "userId")
    private User author;

    @Getter
    @Setter
    private String content;
}