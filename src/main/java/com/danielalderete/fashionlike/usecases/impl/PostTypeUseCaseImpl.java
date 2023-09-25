package com.danielalderete.fashionlike.usecases.impl;

import com.danielalderete.fashionlike.dtos.req.PostTypeRequestDTO;
import com.danielalderete.fashionlike.dtos.res.PostTypeResponseDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.PostType;
import com.danielalderete.fashionlike.service.PostTypeService;
import com.danielalderete.fashionlike.usecases.PostTypeUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PostTypeUseCaseImpl extends AbstractGenericCrudUseCases<PostTypeService, PostType, PostTypeRequestDTO, PostTypeResponseDTO, Long> implements PostTypeUseCase {

    private Mapper<PostType, PostTypeRequestDTO> mapperRequestDTO;
    private Mapper<PostType, PostTypeResponseDTO> mapperResponseDTO;
    private PostTypeService service;

    @Override
    protected Mapper<PostType, PostTypeRequestDTO> getMapperRequest() {
        return mapperRequestDTO;
    }

    @Override
    protected Mapper<PostType, PostTypeResponseDTO> getMapperResponse() {
        return mapperResponseDTO;
    }

    @Override
    protected PostTypeService getService() {
        return service;
    }
}
