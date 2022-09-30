package com.example.blogg.controllers;

import com.example.blogg.models.Article;
import com.example.blogg.services.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService){
        super();
        this.articleService = articleService;
    }

    @GetMapping("/article/{id}")
    @ResponseBody
    public Article getArticle(@PathVariable Long id){
        return articleService.getArticleById(id);
    }

    @GetMapping("article/details/{id}")
    public String detailsArticle(@PathVariable Long id, Model model){
        Article article = articleService.getArticleById(id);
        model.addAttribute("article", article);
        return "article";
    }
}
