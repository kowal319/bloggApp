package com.example.blogg.controllers;

import com.example.blogg.models.Article;
import com.example.blogg.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class HomeController{


    private ArticleService articleService;

    public HomeController(ArticleService articleService){
        super();
        this.articleService = articleService;
    }
    @GetMapping("/Home")
    public String getArticles(Model model, Article article){
        List<Article> articles = articleService.getAllArticles(article);
        model.addAttribute("articles", articles);
        return "Home";
    }
    @GetMapping("/blank")
    public String getPosts(){
        return "blank";
    }
}
