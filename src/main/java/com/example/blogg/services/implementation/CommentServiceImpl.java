package com.example.blogg.services.implementation;

import com.example.blogg.models.Comment;
import com.example.blogg.repositories.CommentRepository;
import com.example.blogg.services.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository){
        super();
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getAllComments(Comment commment){
        return commentRepository.findAll();
    }

}
