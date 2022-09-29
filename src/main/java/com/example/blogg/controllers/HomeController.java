package com.example.blogg.controllers;

import com.example.blogg.models.Article;
import com.example.blogg.services.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/Home/addArticle")
    public String addArticle(Model model){
        Article article = new Article();
        model.addAttribute("article", article);
        return "addArticle";
    }

     @PostMapping("/Home")
     public String saveArticle(@ModelAttribute("articles")Article article){
     articleService.saveArticle(article);
     return "redirects:/Home";
}

}
