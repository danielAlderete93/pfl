package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.model.Post;
import com.danielalderete.fashionlike.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/posts")
@AllArgsConstructor
public class PostController {
    private PostService postService;


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> postList = postService.getAll();
        return ResponseEntity.ok(postList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        Post post = postService.getById(id);
        return ResponseEntity.ok(post);
    }

}
