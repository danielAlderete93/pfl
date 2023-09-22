package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.dtos.req.UserDTO;
import com.danielalderete.fashionlike.usecases.UserUseCases;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {

    private UserUseCases useCase;


    @PostMapping(path = "/new", produces = "application/json")
    public ResponseEntity<UserDTO> createPostType(@RequestBody UserDTO userDTO) {
        UserDTO userCreated = useCase.create(userDTO);
        return ResponseEntity.ok(userCreated);
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<UserDTO> updatePostType(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        UserDTO userUpdated = useCase.update(userDTO, id);
        return ResponseEntity.ok(userUpdated);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<UserDTO>> getAllPostTypes() {
        List<UserDTO> userList = useCase.findAll();
        return ResponseEntity.ok(userList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<UserDTO> getPostTypeById(@PathVariable Long id) {
        UserDTO userFound = useCase.findById(id);
        return ResponseEntity.ok(userFound);
    }


    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePostType(@PathVariable Long id) {
        boolean isDeleted = useCase.delete(id);
        return ResponseEntity.ok(isDeleted);
    }
}
