package com.danielalderete.fashionlike.api.dtos.res;

import java.util.Date;

public record ReactionResponseDTO(
        Long userId,
        Boolean like,
        String description,
        Date createdDate,
        Date updatedDate
) {
}
