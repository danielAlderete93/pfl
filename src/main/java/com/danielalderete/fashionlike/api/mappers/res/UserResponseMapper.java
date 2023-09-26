package com.danielalderete.fashionlike.api.mappers.res;

import com.danielalderete.fashionlike.api.dtos.res.UserResponseDTO;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserResponseMapper implements Mapper<User, UserResponseDTO> {
    @Override
    public UserResponseDTO toDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getImagePath(),
                user.getCreatedDate(),
                user.getUpdatedDate(),
                user.getActive()
        );
    }

    @Override
    public User toModel(UserResponseDTO userRequestDTO) {
        throw new UnsupportedOperationException();
    }

}
