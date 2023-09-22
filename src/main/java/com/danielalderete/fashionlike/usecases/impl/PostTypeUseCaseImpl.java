package com.danielalderete.fashionlike.usecases.impl;

import com.danielalderete.fashionlike.dtos.req.PostTypeDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.PostType;
import com.danielalderete.fashionlike.service.PostTypeService;
import com.danielalderete.fashionlike.usecases.PostTypeUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PostTypeUseCaseImpl extends AbstractGenericCrudUseCases<PostTypeService, PostType, PostTypeDTO, Long> implements PostTypeUseCase {

    private Mapper<PostType, PostTypeDTO> mapper;
    private PostTypeService service;

    @Override
    protected Mapper<PostType, PostTypeDTO> getMapper() {
        return mapper;
    }

    @Override
    protected PostTypeService getService() {
        return service;
    }
}
