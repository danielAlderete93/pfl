package com.danielalderete.fashionlike.usecases.impl;

import com.danielalderete.fashionlike.dtos.req.ReactionDTO;
import com.danielalderete.fashionlike.mappers.Mapper;
import com.danielalderete.fashionlike.model.Reaction;
import com.danielalderete.fashionlike.service.ReactionService;
import com.danielalderete.fashionlike.usecases.ReactionUseCases;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReactionUseCasesImpl extends AbstractGenericCrudUseCases<ReactionService, Reaction, ReactionDTO, Long> implements ReactionUseCases {
    private Mapper<Reaction, ReactionDTO> mapper;
    private ReactionService service;

    @Override
    protected Mapper<Reaction, ReactionDTO> getMapper() {
        return mapper;
    }

    @Override
    protected ReactionService getService() {
        return service;
    }
}
