package com.danielalderete.fashionlike.core.service.impl;

import com.danielalderete.fashionlike.core.model.PostType;
import com.danielalderete.fashionlike.infra.repository.GenericRepository;
import com.danielalderete.fashionlike.infra.repository.PostTypeRepository;
import com.danielalderete.fashionlike.core.service.PostTypeService;
import com.danielalderete.fashionlike.core.validators.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostTypeServiceImpl extends AbstractGenericService<PostType, Long> implements PostTypeService {

    private final PostTypeRepository postTypeRepository;

    private final Validator<PostType> postTypeValidator;


    @Override
    protected GenericRepository<PostType, Long> getRepository() {
        return postTypeRepository;
    }

    @Override
    protected Validator<PostType> getValidator() {
        return postTypeValidator;
    }
}
