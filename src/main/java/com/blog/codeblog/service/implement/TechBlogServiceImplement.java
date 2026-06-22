package com.blog.codeblog.service.implement;

import com.blog.codeblog.model.Post;
import com.blog.codeblog.repository.TechBlogRepository;
import com.blog.codeblog.service.TechBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechBlogServiceImplement implements TechBlogService {

    @Autowired
    TechBlogRepository techBlogRepository;

    @Override
    public List<Post> findAll() {
        return techBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return techBlogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post não encontrado"));
    }

    @Override
    public Post save(Post post) {
        return techBlogRepository.save(post);
    }

    @Override
    public void delete(long id){
        techBlogRepository.deleteById(id);
    }
}
