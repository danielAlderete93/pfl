package com.danielalderete.fashionlike.api.mappers.req;

import com.danielalderete.fashionlike.api.dtos.req.PostRequestDTO;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.Post;
import com.danielalderete.fashionlike.core.model.PostType;
import com.danielalderete.fashionlike.core.model.User;
import com.danielalderete.fashionlike.core.service.PostTypeService;
import com.danielalderete.fashionlike.core.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PostRequestMapper implements Mapper<Post, PostRequestDTO> {
    private UserService userService;
    private PostTypeService postTypeService;

    @Override
    public PostRequestDTO toDTO(Post post) {

        Long authorID = post.getAuthor().getId();
        List<Long> typesID = post.getPostType().stream()
                .map(PostType::getId)
                .toList();

        return new PostRequestDTO(
                post.getId(),
                post.getTitle(),
                post.getDescription(),
                post.getImagePath(),
                post.getCreatedDate(),
                post.getUpdatedDate(),
                post.getActive(),
                authorID,
                typesID
        );

    }

    @Override
    public Post toModel(PostRequestDTO postRequestDTO) {
        User author = userService.getById(postRequestDTO.authorId());

        List<PostType> postType = postRequestDTO.postTypeId().stream()
                .map(id -> postTypeService.getById(id))
                .toList();

        return Post.builder()
                .id(postRequestDTO.id())
                .title(postRequestDTO.title())
                .description(postRequestDTO.description())
                .active(postRequestDTO.active())
                .createdDate(postRequestDTO.createdDate())
                .updatedDate(postRequestDTO.updatedDate())
                .author(author)
                .imagePath(postRequestDTO.imagePath())
                .postType(postType)
                .build();
    }
}
