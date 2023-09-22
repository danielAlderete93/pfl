package com.danielalderete.fashionlike.mappers.req;

import com.danielalderete.fashionlike.dtos.req.PostDTO;
import com.danielalderete.fashionlike.dtos.req.PostTypeDTO;
import com.danielalderete.fashionlike.dtos.req.UserDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Post;
import com.danielalderete.fashionlike.model.PostType;
import com.danielalderete.fashionlike.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PostMapper implements Mapper<Post, PostDTO> {
    private Mapper<PostType, PostTypeDTO> postTypeMapper;
    private Mapper<User, UserDTO> userMapper;

    @Override
    public PostDTO toDTO(Post post) {
        UserDTO author = userMapper.toDTO(post.getAuthor());
        List<PostTypeDTO> types = post.getPostType().stream().map(postType -> postTypeMapper.toDTO(postType)).toList();
        return new PostDTO(
                post.getId(),
                post.getTitle(),
                post.getDescription(),
                post.getImagePath(),
                post.getCreatedDate(),
                post.getUpdatedDate(),
                post.getActive(),
                author,
                types
        );
    }

    @Override
    public Post toModel(PostDTO postDTO) {
        User author = userMapper.toModel(postDTO.author());
        List<PostType> postType = postDTO.postType().stream().map(postTypeDTO -> postTypeMapper.toModel(postTypeDTO)).toList();
        return Post.builder()
                .id(postDTO.id())
                .title(postDTO.title())
                .description(postDTO.description())
                .active(postDTO.active())
                .createdDate(postDTO.createdDate())
                .updatedDate(postDTO.updatedDate())
                .author(author)
                .imagePath(postDTO.imagePath())
                .postType(postType)
                .build();
    }
}
