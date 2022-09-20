package com.example.blogg.services.implementation;

import com.example.blogg.models.Article;
import com.example.blogg.repositories.ArticleRepository;
import com.example.blogg.services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository){
        super();
        this.articleRepository = articleRepository;
    }
     @Override
    public List<Article> getAllArticles(Article article) {
            return articleRepository.findAll();
        }
     }

