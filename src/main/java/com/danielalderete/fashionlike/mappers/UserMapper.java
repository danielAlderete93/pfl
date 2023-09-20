package com.danielalderete.fashionlike.mappers;

import com.danielalderete.fashionlike.dtos.UserDTO;
import com.danielalderete.fashionlike.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<User, UserDTO>{
    @Override
    public UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName()
        );
    }

    @Override
    public User toModel(UserDTO userDTO) {
        return User.builder()
                .id(userDTO.id())
                .firstName(userDTO.firstName())
                .lastName(userDTO.lastName())
                .build();
    }
}
