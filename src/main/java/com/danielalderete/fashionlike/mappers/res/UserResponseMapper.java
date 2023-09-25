package com.danielalderete.fashionlike.mappers.res;

import com.danielalderete.fashionlike.dtos.res.UserResponseDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.User;
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
