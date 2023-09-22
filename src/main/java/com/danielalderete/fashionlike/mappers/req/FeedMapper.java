package com.danielalderete.fashionlike.mappers.req;

import com.danielalderete.fashionlike.dtos.req.ReactionDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Reaction;
import org.springframework.stereotype.Component;

@Component
public class FeedMapper implements Mapper<Reaction, ReactionDTO> {
    @Override
    public ReactionDTO toDTO(Reaction reaction) {
        return new ReactionDTO(
                reaction.getUser().getId(),
                reaction.getLike(),
                reaction.getDescription(),
                reaction.getCreatedDate(),
                reaction.getUpdatedDate()
        );
    }

    @Override
    public Reaction toModel(ReactionDTO feedDTO) {
        throw new UnsupportedOperationException();
    }
}
