package com.danielalderete.fashionlike.core.service.impl;

import com.danielalderete.fashionlike.core.model.Reaction;
import com.danielalderete.fashionlike.infra.repository.ReactionRepository;
import com.danielalderete.fashionlike.core.service.ReactionService;
import com.danielalderete.fashionlike.infra.repository.GenericRepository;
import com.danielalderete.fashionlike.core.validators.Validator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReactionServiceImpl extends AbstractGenericTrackableService<Reaction, Long> implements ReactionService {
    private final ReactionRepository repository;
    private final Validator<Reaction> reactionValidator;

    @Override
    protected GenericRepository<Reaction, Long> getRepository() {
        return repository;
    }

    @Override
    protected Validator<Reaction> getValidator() {
        return reactionValidator;
    }
}
