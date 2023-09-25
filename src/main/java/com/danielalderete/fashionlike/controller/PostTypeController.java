package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.dtos.req.PostTypeRequestDTO;
import com.danielalderete.fashionlike.dtos.res.PostTypeResponseDTO;
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
    public ResponseEntity<PostTypeResponseDTO> createPostType(@RequestBody PostTypeRequestDTO postTypeRequestDTO) {
        PostTypeResponseDTO postTypeCreated = useCase.create(postTypeRequestDTO);
        return ResponseEntity.ok(postTypeCreated);
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<PostTypeResponseDTO> updatePostType(@PathVariable Long id, @RequestBody PostTypeRequestDTO postTypeRequestDTO) {
        PostTypeResponseDTO postTypeUpdated = useCase.update(postTypeRequestDTO, id);
        return ResponseEntity.ok(postTypeUpdated);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<PostTypeResponseDTO>> getAllPostTypes() {
        List<PostTypeResponseDTO> postTypeList = useCase.findAll();
        return ResponseEntity.ok(postTypeList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<PostTypeResponseDTO> getPostTypeById(@PathVariable Long id) {
        PostTypeResponseDTO postType = useCase.findById(id);
        return ResponseEntity.ok(postType);
    }


    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePostType(@PathVariable Long id) {
        return ResponseEntity.ok(useCase.delete(id));
    }

}
