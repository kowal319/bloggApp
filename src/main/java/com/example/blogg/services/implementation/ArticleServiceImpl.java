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

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public Article updateArticle(Article article) {
        return null;
    }

    @Override
    public void deleteArticleById(Long id) {

    }
}

