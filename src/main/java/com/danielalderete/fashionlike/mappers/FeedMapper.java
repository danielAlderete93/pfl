package com.danielalderete.fashionlike.mappers;

import com.danielalderete.fashionlike.dtos.FeedDTO;
import com.danielalderete.fashionlike.model.Reaction;
import org.springframework.stereotype.Component;

@Component
public class FeedMapper implements Mapper<Reaction, FeedDTO> {
    @Override
    public FeedDTO toDTO(Reaction reaction) {
        return new FeedDTO(
                reaction.getUser().getId(),
                reaction.getLike(),
                reaction.getDescription(),
                reaction.getCreatedDate(),
                reaction.getUpdatedDate()
        );
    }

    @Override
    public Reaction toModel(FeedDTO feedDTO) {
        throw new UnsupportedOperationException();
    }
}
