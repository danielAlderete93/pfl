package com.danielalderete.fashionlike.service.impl;

import com.danielalderete.fashionlike.model.Feed;
import com.danielalderete.fashionlike.model.PostUserKey;
import com.danielalderete.fashionlike.repository.FeedRepository;
import com.danielalderete.fashionlike.repository.GenericRepository;
import com.danielalderete.fashionlike.service.FeedService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FeedServiceImpl extends AbstractGenericService<Feed, PostUserKey> implements FeedService {
    private FeedRepository repository;

    @Override
    protected GenericRepository<Feed, PostUserKey> getRepository() {
        return repository;
    }
}
