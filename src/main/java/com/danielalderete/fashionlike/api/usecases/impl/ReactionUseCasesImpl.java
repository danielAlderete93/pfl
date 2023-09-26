package com.danielalderete.fashionlike.api.usecases.impl;

import com.danielalderete.fashionlike.api.dtos.req.ReactionRequestDTO;
import com.danielalderete.fashionlike.api.dtos.res.ReactionResponseDTO;
import com.danielalderete.fashionlike.api.mappers.Mapper;
import com.danielalderete.fashionlike.core.model.Reaction;
import com.danielalderete.fashionlike.core.service.ReactionService;
import com.danielalderete.fashionlike.api.usecases.ReactionUseCases;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReactionUseCasesImpl extends AbstractGenericCrudUseCases<ReactionService, Reaction, ReactionRequestDTO, ReactionResponseDTO, Long> implements ReactionUseCases {

    private Mapper<Reaction, ReactionRequestDTO> mapperRequest;
    private Mapper<Reaction, ReactionResponseDTO> mapperResponse;
    private ReactionService service;

    @Override
    protected Mapper<Reaction, ReactionRequestDTO> getMapperRequest() {
        return mapperRequest;
    }

    @Override
    protected Mapper<Reaction, ReactionResponseDTO> getMapperResponse() {
        return mapperResponse;
    }

    @Override
    protected ReactionService getService() {
        return service;
    }
}
