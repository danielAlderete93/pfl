package com.danielalderete.fashionlike.dtos.res;

import java.util.Date;
import java.util.List;

public record PostResponseDTO(
        Long id,
        String title,
        String description,
        String imagePath,
        Date createdDate,
        Date updatedDate,
        Boolean active,
        UserResponseDTO author,
        List<PostTypeResponseDTO> postType
) {
}
