package com.danielalderete.fashionlike.mappers.req;

import com.danielalderete.fashionlike.dtos.req.PostTypeRequestDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.PostType;
import org.springframework.stereotype.Component;

@Component
public class PostTypeRequestMapper implements Mapper<PostType, PostTypeRequestDTO> {

    @Override
    public PostTypeRequestDTO toDTO(PostType postType) {
        return new PostTypeRequestDTO(
                postType.getId(),
                postType.getName(),
                postType.getDescription()
        );
    }

    @Override
    public PostType toModel(PostTypeRequestDTO postTypeRequestDTO) {
        return PostType.builder()
                .id(postTypeRequestDTO.id())
                .description(postTypeRequestDTO.description())
                .name(postTypeRequestDTO.name())
                .build();
    }
}
