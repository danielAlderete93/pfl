package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.dtos.req.ReactionRequestDTO;
import com.danielalderete.fashionlike.dtos.res.ReactionResponseDTO;
import com.danielalderete.fashionlike.usecases.ReactionUseCases;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reactions")
@AllArgsConstructor
public class ReactionController {

    private ReactionUseCases useCase;


    @PostMapping(path = "/new", produces = "application/json")
    public ResponseEntity<ReactionResponseDTO> createPostType(@RequestBody ReactionRequestDTO reactionRequestDTO) {
        ReactionResponseDTO reactionCreated = useCase.create(reactionRequestDTO);
        return ResponseEntity.ok(reactionCreated);
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<ReactionResponseDTO> updatePostType(@PathVariable Long id, @RequestBody ReactionRequestDTO reactionRequestDTO) {
        ReactionResponseDTO reactionUpdated = useCase.update(reactionRequestDTO, id);
        return ResponseEntity.ok(reactionUpdated);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<ReactionResponseDTO>> getAllPostTypes() {
        List<ReactionResponseDTO> reactionList = useCase.findAll();
        return ResponseEntity.ok(reactionList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<ReactionResponseDTO> getPostTypeById(@PathVariable Long id) {
        ReactionResponseDTO reactionFound = useCase.findById(id);
        return ResponseEntity.ok(reactionFound);
    }


    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePostType(@PathVariable Long id) {
        boolean isDeleted = useCase.delete(id);
        return ResponseEntity.ok(isDeleted);
    }


}
