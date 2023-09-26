package com.danielalderete.fashionlike.api.controller;

import com.danielalderete.fashionlike.api.dtos.req.PostRequestDTO;
import com.danielalderete.fashionlike.api.dtos.res.PostResponseDTO;
import com.danielalderete.fashionlike.api.usecases.PostUseCases;
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
    public ResponseEntity<PostResponseDTO> createPost(@RequestBody PostRequestDTO postRequestDTO) {
        PostResponseDTO postCreated = postUseCases.create(postRequestDTO);
        return ResponseEntity.ok(postCreated);
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<PostResponseDTO> updatePost(@PathVariable Long id, @RequestBody PostRequestDTO postRequestDTO) {
        PostResponseDTO postUpdated = postUseCases.update(postRequestDTO, id);
        return ResponseEntity.ok(postUpdated);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<PostResponseDTO>> getAllPosts() {
        List<PostResponseDTO> postList = postUseCases.findAll();
        return ResponseEntity.ok(postList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<PostResponseDTO> getPostById(@PathVariable Long id) {
        PostResponseDTO postFounded = postUseCases.findById(id);
        return ResponseEntity.ok(postFounded);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePost(@PathVariable Long id) {
        Boolean isDeleted = postUseCases.delete(id);
        return ResponseEntity.ok(isDeleted);
    }

}
