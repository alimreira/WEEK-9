package com.feyi.roadtransport.repositories;

import com.feyi.roadtransport.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
