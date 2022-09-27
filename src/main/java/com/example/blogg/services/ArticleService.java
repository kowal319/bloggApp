package com.example.blogg.services;

import com.example.blogg.models.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles(Article article);
    Article saveArticle(Article article);
    Article getArticleById(Long id);
    Article updateArticle(Article article);
    void deleteArticleById(Long id);
}
