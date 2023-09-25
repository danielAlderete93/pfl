package com.danielalderete.fashionlike.dtos.res;

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
