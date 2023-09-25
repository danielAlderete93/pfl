package com.danielalderete.fashionlike.mappers.res;

import com.danielalderete.fashionlike.dtos.res.PostResponseDTO;
import com.danielalderete.fashionlike.dtos.res.PostTypeResponseDTO;
import com.danielalderete.fashionlike.dtos.res.UserResponseDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Post;
import com.danielalderete.fashionlike.model.PostType;
import com.danielalderete.fashionlike.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PostResponseMapper implements Mapper<Post, PostResponseDTO> {
    private Mapper<PostType, PostTypeResponseDTO> postTypeMapper;
    private Mapper<User, UserResponseDTO> userMapper;

    @Override
    public PostResponseDTO toDTO(Post post) {

        UserResponseDTO authorDTO = userMapper.toDTO(post.getAuthor());
        List<PostTypeResponseDTO> postTypeListDTO = post.getPostType().stream()
                .map(postType -> postTypeMapper.toDTO(postType))
                .toList();

        return new PostResponseDTO(
                post.getId(),
                post.getTitle(),
                post.getDescription(),
                post.getImagePath(),
                post.getCreatedDate(),
                post.getUpdatedDate(),
                post.getActive(),
                authorDTO,
                postTypeListDTO
        );

    }

    @Override
    public Post toModel(PostResponseDTO postRequestDTO) {
        throw new UnsupportedOperationException();
    }
}
