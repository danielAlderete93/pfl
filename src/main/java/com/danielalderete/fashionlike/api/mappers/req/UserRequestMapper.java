package com.danielalderete.fashionlike.api.mappers.req;

import com.danielalderete.fashionlike.api.dtos.req.UserRequestDTO;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserRequestMapper implements Mapper<User, UserRequestDTO> {
    @Override
    public UserRequestDTO toDTO(User user) {
        return new UserRequestDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName()
        );
    }

    @Override
    public User toModel(UserRequestDTO userRequestDTO) {

        return User.builder()
                .id(userRequestDTO.id())
                .firstName(userRequestDTO.firstName())
                .lastName(userRequestDTO.lastName())
                .build();
    }
}
