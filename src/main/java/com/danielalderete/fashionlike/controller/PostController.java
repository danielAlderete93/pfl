package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.dtos.PostDTO;
import com.danielalderete.fashionlike.usecases.PostUseCases;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/posts")
@AllArgsConstructor
public class PostController {
    private PostUseCases postUseCases;


    @PostMapping(path = "/new", produces = "application/json")
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO) {
        PostDTO newPost = postUseCases.create(postDTO);
        return ResponseEntity.ok(newPost);
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<PostDTO> updatePost(@PathVariable Long id, @RequestBody PostDTO postDTO) {
        PostDTO newPost = postUseCases.update(postDTO, id);
        return ResponseEntity.ok(newPost);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        List<PostDTO> postList = postUseCases.findAll();
        return ResponseEntity.ok(postList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<PostDTO> getPostById(@PathVariable Long id) {
        PostDTO post = postUseCases.findById(id);
        return ResponseEntity.ok(post);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePost(@PathVariable Long id) {
        Boolean isDeleted = postUseCases.delete(id);
        return ResponseEntity.ok(isDeleted);
    }

}
