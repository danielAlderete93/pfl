package com.danielalderete.fashionlike.api.mappers.res;

import com.danielalderete.fashionlike.api.dtos.res.PostTypeResponseDTO;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.PostType;
import org.springframework.stereotype.Component;

@Component
public class PostTypeResponseMapper implements Mapper<PostType, PostTypeResponseDTO> {

    @Override
    public PostTypeResponseDTO toDTO(PostType postType) {
        return new PostTypeResponseDTO(
                postType.getId(),
                postType.getName(),
                postType.getDescription()
        );
    }

    @Override
    public PostType toModel(PostTypeResponseDTO postTypeRequestDTO) {
        throw new UnsupportedOperationException();
    }
}
