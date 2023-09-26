package com.danielalderete.fashionlike.api.usecases.impl;

import com.danielalderete.fashionlike.api.dtos.req.PostTypeRequestDTO;
import com.danielalderete.fashionlike.api.dtos.res.PostTypeResponseDTO;
import com.danielalderete.fashionlike.api.usecases.PostTypeUseCase;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.PostType;
import com.danielalderete.fashionlike.core.service.PostTypeService;
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
