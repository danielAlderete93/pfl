package com.danielalderete.fashionlike.mappers.res;

import com.danielalderete.fashionlike.dtos.res.ReactionResponseDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Reaction;
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
