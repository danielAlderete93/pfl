package com.danielalderete.fashionlike.service.impl;

import com.danielalderete.fashionlike.model.PostType;
import com.danielalderete.fashionlike.repository.GenericRepository;
import com.danielalderete.fashionlike.repository.PostTypeRepository;
import com.danielalderete.fashionlike.service.PostTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostTypeServiceImpl extends AbstractGenericService<PostType, Long> implements PostTypeService {

    private final PostTypeRepository postTypeRepository;


    @Override
    protected GenericRepository<PostType, Long> getRepository() {
        return postTypeRepository;
    }
}
