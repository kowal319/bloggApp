package com.example.blogg.controllers;



import com.example.blogg.models.Comment;
import com.example.blogg.services.ArticleService;
import com.example.blogg.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class CommentController {
@Autowired
    private ArticleService articleService;
@Autowired
    private CommentService commentService;

    public CommentController(CommentService commentService){
        super();
        this.commentService = commentService;
    }
    @GetMapping("article{id}")
    public String getAllComments(Model model, Comment comment) {
        List<Comment> comments = commentService.getAllComments(comment);
        model.addAttribute("comments", comments);
        return "article";
    }


}
