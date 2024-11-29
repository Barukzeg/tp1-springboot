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

    @GetMapping(path="/get")
    public @ResponseBody Article getArticle(@RequestParam int id) {
        if (articleRepository.findById(id).isPresent()){
            return articleRepository.findById(id).get();
        }
        return null;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewArticle (@RequestBody Article article) {
        articleRepository.save(article);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @DeleteMapping(path="/remove")
    public @ResponseBody String removeArticle(@RequestParam int id) {
        articleRepository.deleteById(id);
        return "Deleted";
    }

    @PatchMapping(path="/update")
    public @ResponseBody String updateArticle(@RequestBody Article article) {
        articleRepository.save(article);
        return "Updated";
    }
}