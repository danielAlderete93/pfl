package com.danielalderete.fashionlike.mappers;

import com.danielalderete.fashionlike.dtos.FeedDTO;
import com.danielalderete.fashionlike.model.Feed;
import org.springframework.stereotype.Component;

@Component
public class FeedMapper implements Mapper<Feed, FeedDTO> {
    @Override
    public FeedDTO toDTO(Feed feed) {
        return new FeedDTO(
                feed.getUserId(),
                feed.getLike(),
                feed.getViewed(),
                feed.getDescription(),
                feed.getCreatedDate(),
                feed.getUpdatedDate()
        );
    }

    @Override
    public Feed toModel(FeedDTO feedDTO) {
        throw new UnsupportedOperationException();
    }
}
