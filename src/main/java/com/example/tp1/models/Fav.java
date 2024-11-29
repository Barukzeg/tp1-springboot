package com.example.tp1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fav {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer userId;
    private Integer articleId;
    private Boolean liked;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() { return articleId; }
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Boolean getLiked() {
        return liked;
    }
    public void setLiked(Boolean liked) {
        this.liked = liked;
    }
}
