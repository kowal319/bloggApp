package com.example.blogg.services;


import com.example.blogg.models.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAllComments(Comment comment);
}
