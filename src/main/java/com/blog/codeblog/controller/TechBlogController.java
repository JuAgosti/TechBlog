package com.blog.codeblog.controller;

import com.blog.codeblog.model.Post;
import com.blog.codeblog.service.TechBlogService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TechBlogController {
    @Autowired
    TechBlogService techBlogService;

    @GetMapping("/")
    public String home() {
        return "redirect:/posts";
    }

    @GetMapping(value = "/posts")
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = techBlogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @GetMapping(value = "/posts/{id}")
    public ModelAndView getPostDetails(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("postDetails");
        Post post  = techBlogService.findById(id);
        mv.addObject("post", post);
        return mv;
    }

    @GetMapping(value = "/newpost")
    public String getPostForm(){
        return "postForm";
    }

    @PostMapping(value = "/newpost")
    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes){

        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem","Verifique se os campos obrigatórios foram preenchidos");
            return "redirect:/newpost";
        }

        post.setDataPostagem(LocalDate.now());
        techBlogService.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable Long id){
        techBlogService.delete(id);
        return "redirect:/posts";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editPost(@PathVariable("id")Long id){
        ModelAndView mv = new ModelAndView("PostForm");

        Post post = techBlogService.findById(id);

        mv.addObject("post", post);

        return mv;
    }
}
