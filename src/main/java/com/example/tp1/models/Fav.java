package com.example.tp1.models;

import jakarta.persistence.*;

@Entity
public class Fav {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToOne
    @JoinColumn(name = "articleId")
    private Article article;

    private Boolean liked;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() { return user; }
    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() { return article; }
    public void setArticle(Article article) {
        this.article = article;
    }

    public Boolean getLiked() {
        return liked;
    }
    public void setLiked(Boolean liked) {
        this.liked = liked;
    }
}
