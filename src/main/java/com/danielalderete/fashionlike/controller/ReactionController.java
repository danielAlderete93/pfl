package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.dtos.ReactionDTO;
import com.danielalderete.fashionlike.usecases.ReactionUseCases;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reactions")
public class ReactionController {

    private ReactionUseCases useCase;


    @PostMapping(path = "/new", produces = "application/json")
    public ResponseEntity<ReactionDTO> createPostType(@RequestBody ReactionDTO reactionDTO) {
        ReactionDTO reactionCreated = useCase.create(reactionDTO);
        return ResponseEntity.ok(reactionCreated);
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<ReactionDTO> updatePostType(@PathVariable Long id, @RequestBody ReactionDTO reactionDTO) {
        ReactionDTO reactionUpdated = useCase.update(reactionDTO, id);
        return ResponseEntity.ok(reactionUpdated);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<ReactionDTO>> getAllPostTypes() {
        List<ReactionDTO> reactionList = useCase.findAll();
        return ResponseEntity.ok(reactionList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<ReactionDTO> getPostTypeById(@PathVariable Long id) {
        ReactionDTO reactionFound = useCase.findById(id);
        return ResponseEntity.ok(reactionFound);
    }


    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePostType(@PathVariable Long id) {
        boolean isDeleted = useCase.delete(id);
        return ResponseEntity.ok(isDeleted);
    }


}
