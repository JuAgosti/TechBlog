package com.blog.codeblog.service;

import com.blog.codeblog.model.Post;

import java.util.List;

public interface TechBlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save (Post post);
    void delete(long id);
}
