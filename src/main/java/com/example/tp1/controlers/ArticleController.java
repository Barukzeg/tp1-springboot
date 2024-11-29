package com.example.tp1.controlers;

import com.example.tp1.models.Article;
import com.example.tp1.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/articles")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewArticle (@RequestBody Article article) {
        articleRepository.save(article);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @GetMapping(path="/remove")
    public @ResponseBody String removeArticle(@RequestParam int id) {
        articleRepository.deleteById(id);
        return "Deleted";
    }
}