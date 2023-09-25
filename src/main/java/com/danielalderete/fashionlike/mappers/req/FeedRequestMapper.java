package com.danielalderete.fashionlike.mappers.req;

import com.danielalderete.fashionlike.dtos.req.ReactionRequestDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Reaction;
import org.springframework.stereotype.Component;

@Component
public class FeedRequestMapper implements Mapper<Reaction, ReactionRequestDTO> {
    @Override
    public ReactionRequestDTO toDTO(Reaction reaction) {
        return new ReactionRequestDTO(
                reaction.getUser().getId(),
                reaction.getLike(),
                reaction.getDescription(),
                reaction.getCreatedDate(),
                reaction.getUpdatedDate()
        );
    }

    @Override
    public Reaction toModel(ReactionRequestDTO feedDTO) {
        throw new UnsupportedOperationException();
    }
}
