package com.danielalderete.fashionlike.controller;

import com.danielalderete.fashionlike.dtos.req.UserRequestDTO;
import com.danielalderete.fashionlike.dtos.res.UserResponseDTO;
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
    public ResponseEntity<UserResponseDTO> createPostType(@RequestBody UserRequestDTO userRequestDTO) {
        UserResponseDTO userCreated = useCase.create(userRequestDTO);
        return ResponseEntity.ok(userCreated);
    }

    @PutMapping(path = "/update/{id}", produces = "application/json")
    public ResponseEntity<UserResponseDTO> updatePostType(@PathVariable Long id, @RequestBody UserRequestDTO userRequestDTO) {
        UserResponseDTO userUpdated = useCase.update(userRequestDTO, id);
        return ResponseEntity.ok(userUpdated);
    }


    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<UserResponseDTO>> getAllPostTypes() {
        List<UserResponseDTO> userList = useCase.findAll();
        return ResponseEntity.ok(userList);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<UserResponseDTO> getPostTypeById(@PathVariable Long id) {
        UserResponseDTO userFound = useCase.findById(id);
        return ResponseEntity.ok(userFound);
    }


    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Boolean> deletePostType(@PathVariable Long id) {
        boolean isDeleted = useCase.delete(id);
        return ResponseEntity.ok(isDeleted);
    }
}
