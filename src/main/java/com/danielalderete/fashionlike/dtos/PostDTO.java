package com.danielalderete.fashionlike.dtos;

import java.util.Date;
import java.util.List;

public record PostDTO(
        Long id,
        String title,
        String description,
        String imagePath,
        Date createdDate,
        Date updatedDate,
        Boolean active,
        UserDTO author,
        List<PostTypeDTO> postType
) {
}
