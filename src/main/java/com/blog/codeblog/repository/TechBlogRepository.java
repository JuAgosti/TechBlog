package com.blog.codeblog.repository;

import com.blog.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechBlogRepository extends JpaRepository<Post, Long> {
}
