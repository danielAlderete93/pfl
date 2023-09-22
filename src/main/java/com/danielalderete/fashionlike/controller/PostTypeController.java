package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.dtos.req.PostTypeDTO;
import com.danielalderete.fashionlike.usecases.PostTypeUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/post/type")
public class PostTypeController {
    private PostTypeUseCase useCase;


    @PostMapping(path = "/new", produces = "application/json")
    public ResponseEntity<PostTypeDTO> createPostType(@RequestBody PostTypeDTO postTypeDTO) {
        return ResponseEntity.ok(useCase.create(postTypeDTO));
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<PostTypeDTO> updatePostType(@PathVariable Long id, @RequestBody PostTypeDTO postTypeDTO) {
        return ResponseEntity.ok(useCase.update(postTypeDTO, id));
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<PostTypeDTO>> getAllPostTypes() {
        return ResponseEntity.ok(useCase.findAll());
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<PostTypeDTO> getPostTypeById(@PathVariable Long id) {
        return ResponseEntity.ok(useCase.findById(id));
    }


    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePostType(@PathVariable Long id) {
        return ResponseEntity.ok(useCase.delete(id));
    }

}
