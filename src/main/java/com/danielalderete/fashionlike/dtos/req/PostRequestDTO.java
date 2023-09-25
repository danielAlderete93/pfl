package com.danielalderete.fashionlike.dtos.req;

import java.util.Date;
import java.util.List;

public record PostRequestDTO(
        Long id,
        String title,
        String description,
        String imagePath,
        Date createdDate,
        Date updatedDate,
        Boolean active,
        Long authorId,
        List<Long> postTypeId
) {
}
