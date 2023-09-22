package com.danielalderete.fashionlike.service.impl;

import com.danielalderete.fashionlike.model.Post;
import com.danielalderete.fashionlike.repository.GenericRepository;
import com.danielalderete.fashionlike.repository.PostRepository;
import com.danielalderete.fashionlike.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl extends AbstractGenericTrackableService<Post, Long> implements PostService {
    private PostRepository postRepository;

    @Override
    protected GenericRepository<Post, Long> getRepository() {
        return postRepository;
    }
}
