package com.feyi.roadtransport.service;

import com.feyi.roadtransport.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CommentService {

    void saveComment(Comment comment);

    void deleteCommentById(Long Id);

    Optional<Comment> getCommentById(Long Id);

    List<Comment> getAllComments();

    Comment EditComment(Long Id, Comment comment);
}
