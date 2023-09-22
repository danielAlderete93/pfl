package com.danielalderete.fashionlike.service.impl;

import com.danielalderete.fashionlike.model.Reaction;
import com.danielalderete.fashionlike.repository.ReactionRepository;
import com.danielalderete.fashionlike.repository.GenericRepository;
import com.danielalderete.fashionlike.service.ReactionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReactionServiceImpl extends AbstractGenericTrackableService<Reaction, Long> implements ReactionService {
    private ReactionRepository repository;

    @Override
    protected GenericRepository<Reaction, Long> getRepository() {
        return repository;
    }
}
