package com.danielalderete.fashionlike.dtos.res;

import java.util.Date;

public record ReactionResponseDTO(
        Long userId,
        Boolean like,
        String description,
        Date createdDate,
        Date updatedDate
) {
}
