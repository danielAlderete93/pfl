package com.danielalderete.fashionlike.dtos;

import java.util.Date;

public record FeedDTO(
        Long userId,
        Boolean like,
        Boolean viewed,
        String description,
        Date createdDate,
        Date updatedDate
) {
}
