package com.danielalderete.fashionlike.api.dtos.res;

import java.util.Date;

public record UserResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String imagePath,
        Date updatedDate,
        Date createdDate,
        Boolean active
) {
}
