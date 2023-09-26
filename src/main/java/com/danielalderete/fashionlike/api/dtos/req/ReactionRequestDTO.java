package com.danielalderete.fashionlike.api.dtos.req;

import java.util.Date;

public record ReactionRequestDTO(
        Long userId,
        Boolean like,
        String description,
        Date createdDate,
        Date updatedDate
) {
}
