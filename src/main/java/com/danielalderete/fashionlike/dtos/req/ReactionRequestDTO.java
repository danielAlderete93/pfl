package com.danielalderete.fashionlike.dtos.req;

import java.util.Date;

public record ReactionRequestDTO(
        Long userId,
        Boolean like,
        String description,
        Date createdDate,
        Date updatedDate
) {
}
