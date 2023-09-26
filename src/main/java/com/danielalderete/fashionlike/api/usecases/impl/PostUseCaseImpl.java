package com.danielalderete.fashionlike.api.usecases.impl;

import com.danielalderete.fashionlike.api.dtos.req.PostRequestDTO;
import com.danielalderete.fashionlike.api.dtos.res.PostResponseDTO;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.Post;
import com.danielalderete.fashionlike.core.service.PostService;
import com.danielalderete.fashionlike.api.usecases.PostUseCases;
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
