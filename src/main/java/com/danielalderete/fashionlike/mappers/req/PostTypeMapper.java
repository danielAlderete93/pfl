package com.danielalderete.fashionlike.mappers.req;

import com.danielalderete.fashionlike.dtos.req.PostTypeDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.PostType;
import org.springframework.stereotype.Component;

@Component
public class PostTypeMapper implements Mapper<PostType, PostTypeDTO> {

    @Override
    public PostTypeDTO toDTO(PostType postType) {
        return new PostTypeDTO(
                postType.getId(),
                postType.getName(),
                postType.getDescription()
        );
    }

    @Override
    public PostType toModel(PostTypeDTO postTypeDTO) {
        return PostType.builder()
                .id(postTypeDTO.id())
                .description(postTypeDTO.description())
                .name(postTypeDTO.name())
                .build();
    }
}
