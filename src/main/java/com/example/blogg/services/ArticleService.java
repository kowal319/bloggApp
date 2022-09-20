package com.example.blogg.services;

import com.example.blogg.models.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles(Article article);
}
