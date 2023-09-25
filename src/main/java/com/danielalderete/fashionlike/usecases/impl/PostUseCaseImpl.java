package com.danielalderete.fashionlike.usecases.impl;

import com.danielalderete.fashionlike.dtos.req.PostRequestDTO;
import com.danielalderete.fashionlike.dtos.res.PostResponseDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Post;
import com.danielalderete.fashionlike.service.PostService;
import com.danielalderete.fashionlike.usecases.PostUseCases;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PostUseCaseImpl extends AbstractGenericCrudUseCases<PostService, Post, PostRequestDTO, PostResponseDTO, Long> implements PostUseCases {

    private Mapper<Post, PostRequestDTO> mapperRequest;
    private Mapper<Post, PostResponseDTO> mapperResponse;
    private PostService service;

    @Override
    protected Mapper<Post, PostRequestDTO> getMapperRequest() {
        return mapperRequest;
    }

    @Override
    protected Mapper<Post, PostResponseDTO> getMapperResponse() {
        return mapperResponse;
    }

    @Override
    protected PostService getService() {
        return service;
    }
}
