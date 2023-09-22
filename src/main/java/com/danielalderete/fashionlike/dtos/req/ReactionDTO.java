package com.danielalderete.fashionlike.dtos.req;

import java.util.Date;

public record ReactionDTO(
        Long userId,
        Boolean like,
        String description,
        Date createdDate,
        Date updatedDate
) {
}
