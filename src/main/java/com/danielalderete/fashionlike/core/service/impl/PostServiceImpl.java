package com.danielalderete.fashionlike.core.service.impl;

import com.danielalderete.fashionlike.core.service.PostService;
import com.danielalderete.fashionlike.core.model.Post;
import com.danielalderete.fashionlike.infra.repository.GenericRepository;
import com.danielalderete.fashionlike.infra.repository.PostRepository;
import com.danielalderete.fashionlike.core.validators.Validator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl extends AbstractGenericTrackableService<Post, Long> implements PostService {
    private PostRepository postRepository;
    private Validator<Post> postValidator;

    @Override
    protected GenericRepository<Post, Long> getRepository() {
        return postRepository;
    }

    @Override
    protected Validator<Post> getValidator() {
        return postValidator;
    }
}
