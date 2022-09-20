package com.example.blogg.controllers;

import com.example.blogg.models.Article;
import com.example.blogg.services.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService){
        super();
        this.articleService = articleService;
    }

    @GetMapping("/articles")
    public String getArticles(Model model, Article article){
        List<Article> articles = articleService.getAllArticles(article);
        model.addAttribute("articles", articles);
        return "articles";
    }
}
