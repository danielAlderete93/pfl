package com.danielalderete.fashionlike.usecases.impl;

import com.danielalderete.fashionlike.dtos.req.PostDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Post;
import com.danielalderete.fashionlike.service.PostService;
import com.danielalderete.fashionlike.usecases.PostUseCases;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PostUseCaseImpl extends AbstractGenericCrudUseCases<PostService, Post, PostDTO, Long> implements PostUseCases {

    private PostService service;
    private Mapper<Post, PostDTO> mapper;

    @Override
    protected Mapper<Post, PostDTO> getMapper() {
        return mapper;
    }

    @Override
    protected PostService getService() {
        return service;
    }
}
