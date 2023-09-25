package com.danielalderete.fashionlike.mappers.res;

import com.danielalderete.fashionlike.dtos.res.PostTypeResponseDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.PostType;
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
