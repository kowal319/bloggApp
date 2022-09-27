package com.example.blogg.controllers;

import com.example.blogg.models.Comment;
import com.example.blogg.services.CommentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService){
        super();
        this.commentService = commentService;
    }

    @GetMapping("/comments")
        public String getComments(Model model, Comment comment){
            List<Comment> comments = commentService.getAllComments(comment);
            model.addAttribute("comments", comments);
            return "comments";
        }


}
