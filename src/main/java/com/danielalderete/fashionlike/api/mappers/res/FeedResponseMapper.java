package com.danielalderete.fashionlike.api.mappers.res;

import com.danielalderete.fashionlike.api.dtos.res.ReactionResponseDTO;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.Reaction;
import org.springframework.stereotype.Component;

@Component
public class FeedResponseMapper implements Mapper<Reaction, ReactionResponseDTO> {
    @Override
    public ReactionResponseDTO toDTO(Reaction reaction) {
        return new ReactionResponseDTO(
                reaction.getUser().getId(),
                reaction.getLike(),
                reaction.getDescription(),
                reaction.getCreatedDate(),
                reaction.getUpdatedDate()
        );
    }

    @Override
    public Reaction toModel(ReactionResponseDTO feedDTO) {
        throw new UnsupportedOperationException();
    }
}
